/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicenesaexauno.service;

import edu.mx.tecnm.oaxaca.servicenesaexauno.model.AlumnoModel;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nallely santiago
 */
public interface AlumnoService {
    public Map<String, String> calcularIca(AlumnoModel alumno);
    
    
}