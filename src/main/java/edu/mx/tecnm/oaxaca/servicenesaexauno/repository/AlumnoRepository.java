/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicenesaexauno.repository;

import edu.mx.tecnm.oaxaca.servicenesaexauno.model.AlumnoModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nallely santiago
 */
@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoModel, Integer> {
    public AlumnoModel findByNumControl(String numControl);
    
}
