/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erick Everaldo
 */
@Entity
@Table(name = "actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a")
    , @NamedQuery(name = "Actividad.findByIdactividad", query = "SELECT a FROM Actividad a WHERE a.idactividad = :idactividad")
    , @NamedQuery(name = "Actividad.findByNombreactividad", query = "SELECT a FROM Actividad a WHERE a.nombreactividad = :nombreactividad")
    , @NamedQuery(name = "Actividad.findByImgactividad", query = "SELECT a FROM Actividad a WHERE a.imgactividad = :imgactividad")
    , @NamedQuery(name = "Actividad.findByDescriactividad", query = "SELECT a FROM Actividad a WHERE a.descriactividad = :descriactividad")
    , @NamedQuery(name = "Actividad.findByTiempoactividad", query = "SELECT a FROM Actividad a WHERE a.tiempoactividad = :tiempoactividad")
    , @NamedQuery(name = "Actividad.findByTransporteactividad", query = "SELECT a FROM Actividad a WHERE a.transporteactividad = :transporteactividad")
    , @NamedQuery(name = "Actividad.findByEntradaactividad", query = "SELECT a FROM Actividad a WHERE a.entradaactividad = :entradaactividad")
    , @NamedQuery(name = "Actividad.findByIntinerarioactividad", query = "SELECT a FROM Actividad a WHERE a.intinerarioactividad = :intinerarioactividad")
    , @NamedQuery(name = "Actividad.findByAudioguiaactividad", query = "SELECT a FROM Actividad a WHERE a.audioguiaactividad = :audioguiaactividad")
    , @NamedQuery(name = "Actividad.findByToursinentradaactividad", query = "SELECT a FROM Actividad a WHERE a.toursinentradaactividad = :toursinentradaactividad")
    , @NamedQuery(name = "Actividad.findByImportanteactividad", query = "SELECT a FROM Actividad a WHERE a.importanteactividad = :importanteactividad")
    , @NamedQuery(name = "Actividad.findByAccesibilidadactividad", query = "SELECT a FROM Actividad a WHERE a.accesibilidadactividad = :accesibilidadactividad")
    , @NamedQuery(name = "Actividad.findByPrecioadutoactiviadad", query = "SELECT a FROM Actividad a WHERE a.precioadutoactiviadad = :precioadutoactiviadad")
    , @NamedQuery(name = "Actividad.findByPrecioninoactividad", query = "SELECT a FROM Actividad a WHERE a.precioninoactividad = :precioninoactividad")
    , @NamedQuery(name = "Actividad.findByPuntoactividad", query = "SELECT a FROM Actividad a WHERE a.puntoactividad = :puntoactividad")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idactividad")
    private Integer idactividad;
    @Size(max = 100)
    @Column(name = "nombreactividad")
    private String nombreactividad;
    @Size(max = 100)
    @Column(name = "imgactividad")
    private String imgactividad;
    @Size(max = 1000)
    @Column(name = "descriactividad")
    private String descriactividad;
    @Size(max = 20)
    @Column(name = "tiempoactividad")
    private String tiempoactividad;
    @Size(max = 20)
    @Column(name = "transporteactividad")
    private String transporteactividad;
    @Size(max = 20)
    @Column(name = "entradaactividad")
    private String entradaactividad;
    @Size(max = 1000)
    @Column(name = "intinerarioactividad")
    private String intinerarioactividad;
    @Size(max = 500)
    @Column(name = "audioguiaactividad")
    private String audioguiaactividad;
    @Size(max = 500)
    @Column(name = "toursinentradaactividad")
    private String toursinentradaactividad;
    @Size(max = 200)
    @Column(name = "importanteactividad")
    private String importanteactividad;
    @Size(max = 200)
    @Column(name = "accesibilidadactividad")
    private String accesibilidadactividad;
    @Size(max = 20)
    @Column(name = "precioadutoactiviadad")
    private String precioadutoactiviadad;
    @Size(max = 20)
    @Column(name = "precioninoactividad")
    private String precioninoactividad;
    @Size(max = 100)
    @Column(name = "puntoactividad")
    private String puntoactividad;

    public Actividad() {
    }

    public Actividad(Integer idactividad) {
        this.idactividad = idactividad;
    }

    public Integer getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(Integer idactividad) {
        this.idactividad = idactividad;
    }

    public String getNombreactividad() {
        return nombreactividad;
    }

    public void setNombreactividad(String nombreactividad) {
        this.nombreactividad = nombreactividad;
    }

    public String getImgactividad() {
        return imgactividad;
    }

    public void setImgactividad(String imgactividad) {
        this.imgactividad = imgactividad;
    }

    public String getDescriactividad() {
        return descriactividad;
    }

    public void setDescriactividad(String descriactividad) {
        this.descriactividad = descriactividad;
    }

    public String getTiempoactividad() {
        return tiempoactividad;
    }

    public void setTiempoactividad(String tiempoactividad) {
        this.tiempoactividad = tiempoactividad;
    }

    public String getTransporteactividad() {
        return transporteactividad;
    }

    public void setTransporteactividad(String transporteactividad) {
        this.transporteactividad = transporteactividad;
    }

    public String getEntradaactividad() {
        return entradaactividad;
    }

    public void setEntradaactividad(String entradaactividad) {
        this.entradaactividad = entradaactividad;
    }

    public String getIntinerarioactividad() {
        return intinerarioactividad;
    }

    public void setIntinerarioactividad(String intinerarioactividad) {
        this.intinerarioactividad = intinerarioactividad;
    }

    public String getAudioguiaactividad() {
        return audioguiaactividad;
    }

    public void setAudioguiaactividad(String audioguiaactividad) {
        this.audioguiaactividad = audioguiaactividad;
    }

    public String getToursinentradaactividad() {
        return toursinentradaactividad;
    }

    public void setToursinentradaactividad(String toursinentradaactividad) {
        this.toursinentradaactividad = toursinentradaactividad;
    }

    public String getImportanteactividad() {
        return importanteactividad;
    }

    public void setImportanteactividad(String importanteactividad) {
        this.importanteactividad = importanteactividad;
    }

    public String getAccesibilidadactividad() {
        return accesibilidadactividad;
    }

    public void setAccesibilidadactividad(String accesibilidadactividad) {
        this.accesibilidadactividad = accesibilidadactividad;
    }

    public String getPrecioadutoactiviadad() {
        return precioadutoactiviadad;
    }

    public void setPrecioadutoactiviadad(String precioadutoactiviadad) {
        this.precioadutoactiviadad = precioadutoactiviadad;
    }

    public String getPrecioninoactividad() {
        return precioninoactividad;
    }

    public void setPrecioninoactividad(String precioninoactividad) {
        this.precioninoactividad = precioninoactividad;
    }

    public String getPuntoactividad() {
        return puntoactividad;
    }

    public void setPuntoactividad(String puntoactividad) {
        this.puntoactividad = puntoactividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactividad != null ? idactividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.idactividad == null && other.idactividad != null) || (this.idactividad != null && !this.idactividad.equals(other.idactividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ittepic.entidades.Actividad[ idactividad=" + idactividad + " ]";
    }
    
}
