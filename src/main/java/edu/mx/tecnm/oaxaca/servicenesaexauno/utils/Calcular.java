/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicenesaexauno.utils;

/**
 *
 * @author nallely santiago
 */
public class Calcular {
    private char genero;
    private int medCintura;
    private int medAltura;
    

    public Calcular() {
    }
    public String calcularIca(){
       return "" + ((double)medCintura/(double)medAltura); 
    }
    public String obtenerICA(){
        
        double ica =  (double)medCintura/(double)medAltura;
        if (genero == 'H'){
            if(ica <= 0.34){
                return "Delgadez severa";
            }else if(ica >= 0.35 && ica <= 0.42){
                return "Delgadez leve";
            } else if(ica >= 0.43 && ica <= 0.52){
                return "Peso normal";
            } else if(ica >= 0.53 && ica <= 0.57){
                return "Sobrepeso";
            } else if(ica >= 0.58 && ica <= 0.62){
                return "Sobrepeso elevado";
            } else if(ica >= 0.63){
                return "Obesidad mórbida";
            } 
            
        } else {
            if(ica <= 0.34){
                return "Delgadez severa";
            }else if(ica >= 0.35 && ica <= 0.41){
                return "Delgadez leve";
            } else if(ica >= 0.42 && ica <= 0.48){
                return "Peso normal";
            } else if(ica >= 0.49 && ica <= 0.53){
                return "Sobrepeso";
            } else if(ica >= 0.54 && ica <= 0.57){
                return "Sobrepeso elevado";
            } else if(ica >= 0.58){
                return "Obesidad mórbida";
            } 
            
            
        }
        return "No calculado";
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getMedCintura() {
        return medCintura;
    }

    public void setMedCintura(int medCintura) {
        this.medCintura = medCintura;
    }

    public int getMedAltura() {
        return medAltura;
    }

    public void setMedAltura(int medAltura) {
        this.medAltura = medAltura;
    }
    
    
}
