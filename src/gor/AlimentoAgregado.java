/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gor;

/**
 *
 * @author TAYSON
 */
public class AlimentoAgregado extends Alimento{
 protected int calorias;

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
 public int calcularCalorias(int i, int percentagem){
     
     
 return this.calorias = i*percentagem;
 
 } 
    
}
