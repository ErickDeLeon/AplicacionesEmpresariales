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
@Table(name = "comentario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentario.findAll", query = "SELECT c FROM Comentario c")
    , @NamedQuery(name = "Comentario.findByIdcomentario", query = "SELECT c FROM Comentario c WHERE c.idcomentario = :idcomentario")
    , @NamedQuery(name = "Comentario.findByComentario", query = "SELECT c FROM Comentario c WHERE c.comentario = :comentario")
    , @NamedQuery(name = "Comentario.findByNombreusuarioforaneo", query = "SELECT c FROM Comentario c WHERE c.nombreusuarioforaneo = :nombreusuarioforaneo")
    , @NamedQuery(name = "Comentario.findByNombreactividadforaneo", query = "SELECT c FROM Comentario c WHERE c.nombreactividadforaneo = :nombreactividadforaneo")
    , @NamedQuery(name = "Comentario.findByFechacomentario", query = "SELECT c FROM Comentario c WHERE c.fechacomentario = :fechacomentario")})
public class Comentario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcomentario")
    private Integer idcomentario;
    @Size(max = 1000)
    @Column(name = "comentario")
    private String comentario;
    @Size(max = 50)
    @Column(name = "nombreusuarioforaneo")
    private String nombreusuarioforaneo;
    @Size(max = 100)
    @Column(name = "nombreactividadforaneo")
    private String nombreactividadforaneo;
    @Size(max = 200)
    @Column(name = "fechacomentario")
    private String fechacomentario;

    public Comentario() {
    }

    public Comentario(Integer idcomentario) {
        this.idcomentario = idcomentario;
    }

    public Integer getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(Integer idcomentario) {
        this.idcomentario = idcomentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getNombreusuarioforaneo() {
        return nombreusuarioforaneo;
    }

    public void setNombreusuarioforaneo(String nombreusuarioforaneo) {
        this.nombreusuarioforaneo = nombreusuarioforaneo;
    }

    public String getNombreactividadforaneo() {
        return nombreactividadforaneo;
    }

    public void setNombreactividadforaneo(String nombreactividadforaneo) {
        this.nombreactividadforaneo = nombreactividadforaneo;
    }

    public String getFechacomentario() {
        return fechacomentario;
    }

    public void setFechacomentario(String fechacomentario) {
        this.fechacomentario = fechacomentario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomentario != null ? idcomentario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comentario)) {
            return false;
        }
        Comentario other = (Comentario) object;
        if ((this.idcomentario == null && other.idcomentario != null) || (this.idcomentario != null && !this.idcomentario.equals(other.idcomentario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ittepic.entidades.Comentario[ idcomentario=" + idcomentario + " ]";
    }
    
}
