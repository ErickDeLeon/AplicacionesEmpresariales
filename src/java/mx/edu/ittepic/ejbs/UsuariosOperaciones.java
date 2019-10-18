/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.ejbs;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Query;
import mx.edu.ittepic.entidades.Usuario;

//import mx.edu.ittepic.entidades.Roldos;

/**
 *
 * @author Erick Everaldo
 */

@Stateless
public class UsuariosOperaciones {
    
    @PersistenceContext
    EntityManager em;

    public String nuevoUsuario (String nombreusuario, String correousuario, String contrasenausuario) {
        
        Usuario u = new Usuario();

        u.setNombreusuario(nombreusuario);
        u.setCorreousuario(correousuario);
        u.setContrasenausuario(contrasenausuario);
       
        String msj;

        try {
            em.persist(u);

            msj = "{\"code\":200, \"msj\"La operacion se realizo correctamente\"}";

        } catch (Exception e) {
            msj = "{\"code\":400, \"msj\"Error en los tipos de parametros\"}";
        }
        return msj;
    }

    public String consultaUsuario() {
        try {
            Query q;
            List<Usuario> listaUsuario;
            q = em.createNamedQuery("Usuario.findAll");
            listaUsuario = q.getResultList(); //Ejecutar consulta.

            //Convertir la lista a objetos JSON
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            return gson.toJson(listaUsuario);

        } catch (Exception e) {
            return "{msg:'Error'}";

        }
    } //fin consultaRol

   
    public String actualizarUsuario(int idusuario, String nombreusuario, String correousuario, String contrasenausuario) {
        
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String msj;
        Usuario usuario = new Usuario();
        
        msj = "{\"code\":200, \"msj\"La operacion se realizo correctamente\"}";
        
        try {
            
            usuario = em.find(Usuario.class, idusuario); //Buscar por rolid
                        
            usuario.setNombreusuario(nombreusuario);
            usuario.setCorreousuario(correousuario);
            usuario.setContrasenausuario(contrasenausuario);
            
            em.merge(usuario);
            
             msj = "{\"code\":400, \"msj\"Error en los tipos de parametros\"}";
        }catch(NumberFormatException e){
            
        }//Fin de try
        
        return msj;

    }//fin actualizar rol
    
    
    public String eliminarUsuario (int idusuario){
        
        Usuario usuario = new Usuario();
        String msj;
        
        try{
            usuario = (Usuario) em.createNamedQuery("Usuario.findByIdusuario").setParameter("idusuario",idusuario).getSingleResult();
            em.remove(em.merge(usuario));
            
            msj = "{\"code\":200, \"msj\"La operacion se realizo correctamente\"}";
        } catch (NumberFormatException e){
            
            msj = "{\"code\":400, \"msj\"Error en los tipos de parametros\"}";            
        }
        return msj;
    }
}
