/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.ejbs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mx.edu.ittepic.entidades.Comentario;
import mx.edu.ittepic.entidades.Usuario;

/**
 *
 * @author Erick Everaldo
 */
@Stateless
public class ComentariosOperaciones {

    @PersistenceContext
    EntityManager em;

    public String nuevoComentario(String comentario, String nombreusuarioforaneo, String nombreactividadforaneo, String fechacomentario) {

        Comentario c = new Comentario();

        c.setComentario(comentario);
        c.setNombreusuarioforaneo(nombreusuarioforaneo);
        c.setNombreactividadforaneo(nombreactividadforaneo);
        c.setFechacomentario(fechacomentario);

        String msj;

        try {
            em.persist(c);

            msj = "{\"code\":200, \"msj\"La operacion se realizo correctamente\"}";

        } catch (Exception e) {
            msj = "{\"code\":400, \"msj\"Error en los tipos de parametros\"}";
        }
        return msj;
    }

    public String consultaComentario() {
        try {
            Query q;
            List<Comentario> listaComentario;
            q = em.createNamedQuery("Comentario.findAll");
            listaComentario = q.getResultList(); //Ejecutar consulta.

            //Convertir la lista a objetos JSON
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            return gson.toJson(listaComentario);

        } catch (Exception e) {
            return "{msg:'Error'}";

        }
    } //fin consultaRol

    public String actualizarComentario(int idcomentario, String comentario, String nombreusuarioforaneo, String nombreactividadforaneo, String fechacomentario) {

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String msj;
        Comentario c = new Comentario();

        msj = "{\"code\":200, \"msj\"La operacion se realizo correctamente\"}";

        try {

            c = em.find(Comentario.class, idcomentario); //Buscar por rolid

            c.setComentario(comentario);
            c.setNombreusuarioforaneo(nombreusuarioforaneo);
            c.setNombreactividadforaneo(nombreactividadforaneo);
            c.setFechacomentario(fechacomentario);

            em.merge(c);

            msj = "{\"code\":400, \"msj\"Error en los tipos de parametros\"}";
        } catch (NumberFormatException e) {

        }//Fin de try

        return msj;

    }
    
     public String eliminarComentario (int idcomentario){
        
        Comentario c = new Comentario();
        String msj;
        
        try{
            c = (Comentario) em.createNamedQuery("Comentario.findByIdcomentario").setParameter("idcomentario",idcomentario).getSingleResult();
            em.remove(em.merge(c));
            
            msj = "{\"code\":200, \"msj\"La operacion se realizo correctamente\"}";
        } catch (NumberFormatException e){
            
            msj = "{\"code\":400, \"msj\"Error en los tipos de parametros\"}";            
        }
        return msj;
    }

}
