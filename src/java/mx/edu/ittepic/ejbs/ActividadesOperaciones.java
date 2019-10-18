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
import mx.edu.ittepic.entidades.Actividad;

/**
 *
 * @author Erick Everaldo
 */

@Stateless
public class ActividadesOperaciones {

    @PersistenceContext
    EntityManager em;

    public String nuevaActividad(String nombreactividad, String imgactividad, String descriactividad, String tiempoactividad, String transporteactividad, String entradaactividad, String intinerarioactividad, String audioguiaactividad, String toursinentradaactividad, String importanteactividad, String accesibilidadactividad, String precioadutoactiviadad, String precioninoactividad, String puntoactividad) {

        Actividad a = new Actividad();

        a.setNombreactividad(nombreactividad);
        a.setImgactividad(imgactividad);
        a.setDescriactividad(descriactividad);
        a.setTiempoactividad(tiempoactividad);
        a.setTransporteactividad(transporteactividad);
        a.setEntradaactividad(entradaactividad);
        a.setIntinerarioactividad(intinerarioactividad);
        a.setAudioguiaactividad(audioguiaactividad);
        a.setToursinentradaactividad(toursinentradaactividad);
        a.setImportanteactividad(importanteactividad);
        a.setAccesibilidadactividad(accesibilidadactividad);
        a.setPrecioadutoactiviadad(precioadutoactiviadad);
        a.setPrecioninoactividad(precioninoactividad);
        a.setPuntoactividad(puntoactividad);

        String msj;

        try {
            em.persist(a);
            msj = "{\"code\":200, \"msj\"La operacion se realizo correctamente\"}";

        } catch (Exception e) {
            msj = "{\"code\":400, \"msj\"Error en los tipos de parametros\"}";
        }
        return msj;
    }

    public String consultaActividad() {
        try {
            Query q;
            List<Actividad> listaActividad;
            q = em.createNamedQuery("Actividad.findAll");
            listaActividad = q.getResultList(); //Ejecutar consulta.

            //Convertir la lista a objetos JSON
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            return gson.toJson(listaActividad);

        } catch (Exception e) {
            return "{msg:'Error'}";

        }
    } //fin consultaRol

    public String eliminarActividad(int idactividad) {

        Actividad act = new Actividad();
        String msj;

        try {
            act = (Actividad) em.createNamedQuery("Actividad.findByIdactividad").setParameter("idactividad", idactividad).getSingleResult();
            em.remove(em.merge(act));

            msj = "{\"code\":200, \"msj\"La operacion se realizo correctamente\"}";
        } catch (NumberFormatException e) {

            msj = "{\"code\":400, \"msj\"Error en los tipos de parametros\"}";
        }
        return msj;
    }

    public String actualizarActividad(int idactividad, String nombreactividad, String imgactividad, String descriactividad, String tiempoactividad, String transporteactividad, String entradaactividad, String intinerarioactividad, String audioguiaactividad, String toursinentradaactividad, String importanteactividad, String accesibilidadactividad, String precioadutoactiviadad, String precioninoactividad, String puntoactividad) {

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        String msj;

        Actividad act = new Actividad();

        msj = "{\"code\":200, \"msj\"La operacion se realizo correctamente\"}";

        try {

            act = em.find(Actividad.class, idactividad); //Buscar por rolid

            act.setNombreactividad(nombreactividad);
            act.setImgactividad(imgactividad);
            act.setDescriactividad(descriactividad);
            act.setTiempoactividad(tiempoactividad);
            act.setTransporteactividad(transporteactividad);
            act.setEntradaactividad(entradaactividad);
            act.setIntinerarioactividad(intinerarioactividad);
            act.setAudioguiaactividad(audioguiaactividad);
            act.setToursinentradaactividad(toursinentradaactividad);
            act.setImportanteactividad(importanteactividad);
            act.setAccesibilidadactividad(accesibilidadactividad);
            act.setPrecioadutoactiviadad(precioadutoactiviadad);
            act.setPrecioninoactividad(precioninoactividad);
            act.setPuntoactividad(puntoactividad);

            em.merge(act);

            msj = "{\"code\":400, \"msj\"Error en los tipos de parametros\"}";
            
        } catch (NumberFormatException e) {

        }//Fin de try

        return msj;

    }//fin actualizar rol

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
