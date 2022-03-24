/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicenesaexauno.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**s
 *
 * @author nallely santiago
 */
@Entity
@Table(name = "alumno")
public class AlumnoModel implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAlumno;
    private String numControl;
    private Character genero;
    private Integer medCintura;
    private Integer medAltura;

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public Integer getMedCintura() {
        return medCintura;
    }

    public void setMedCintura(Integer medCintura) {
        this.medCintura = medCintura;
    }

    public Integer getMedAltura() {
        return medAltura;
    }

    public void setMedAltura(Integer medAltura) {
        this.medAltura = medAltura;
    }
    
    
    
}
    