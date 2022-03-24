/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicenesaexauno.implement.service;

import edu.mx.tecnm.oaxaca.servicenesaexauno.model.AlumnoModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.mx.tecnm.oaxaca.servicenesaexauno.service.AlumnoService;
import edu.mx.tecnm.oaxaca.servicenesaexauno.repository.AlumnoRepository;
import edu.mx.tecnm.oaxaca.servicenesaexauno.utils.Calcular;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nallely santiago
 */
@Service
public class AlumnoServiceImplement implements AlumnoService {
    
    @Autowired
    private AlumnoRepository alumnoRepository;
    

    @Override
    public Map<String, String> calcularIca(AlumnoModel alumno) {
        Map<String, String> hm = new HashMap<String, String>();
        if(alumno.getMedCintura()== null || alumno.getMedAltura()==null){
            String numControl = alumno.getNumControl();
            AlumnoModel obtener = alumnoRepository.findByNumControl(numControl); 
            
            if(obtener==null){
                hm.put("error","datos insuficientes");
                
            }else{
                Calcular calcular = new Calcular();
                calcular.setGenero(obtener.getGenero());
                calcular.setMedCintura(obtener.getMedCintura());
                calcular.setMedAltura(obtener.getMedAltura());
                
                hm.put("ica", calcular.calcularIca());
                hm.put("nivel", calcular.obtenerICA());
                
            }
            
        } else{
                alumnoRepository.save(alumno);
                 Calcular calcular = new Calcular();
                 calcular.setGenero(alumno.getGenero());
                 calcular.setMedCintura(alumno.getMedCintura());
                 calcular.setMedAltura(alumno.getMedAltura());

                 hm.put("ica", calcular.calcularIca());
                 hm.put("nivel", calcular.obtenerICA());
        }
        return hm; 
    }

      
}