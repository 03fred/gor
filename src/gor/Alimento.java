/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gor;

import java.util.ArrayList;

/**
 *
 * @author TAYSON
 */
public class Alimento {
    protected String nome;
    protected float percentagem;
    protected String tipoAlimento;
    protected float calorias;
    protected String nomeagregado;
    protected String Constituente;

    public String getConstituente() {
        return Constituente;
    }

    public void setConstituente(String Constituente) {
        this.Constituente = Constituente;
    }

    public String getNomeagregado() {
        return nomeagregado;
    }

    public void setNomeagregado(String nomeagregado) {
        this.nomeagregado = nomeagregado;
    }
  ArrayList <Alimento> alimentos = new ArrayList<Alimento>();
public void isereAlimento(Alimento alimento){
alimentos.add(alimento);
}

public String listarAlimento(){
        if (alimentos.size()==0){
        
            System.out.println("Lista Vazia, por favor Cadastre Clientes\n");
        }else{
    for(Alimento view: alimentos){
        
    System.out.println(view.getTipoAlimento() + "|" + view.getNome() + "|" + view.getCalorias());
    }
        }
    return "oi";
    }
    public float getCalorias() {
        return calorias;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }

  
  public boolean tipoAlimento(String tipoAli){
           
             if (tipoAli.equalsIgnoreCase ("VEGETARIAN")||tipoAli.equalsIgnoreCase("OMNIVOROUS"))
         
                       return true;
             return false;
               
        }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPercentagem() {
        return percentagem;
    }

    public void setPercentagem(int percentagem) {
        this.percentagem = percentagem;
    }
    public boolean validarAlimento(String tipoAlimento){
    
        if(tipoAlimento.equalsIgnoreCase("simples")|| tipoAlimento.equalsIgnoreCase("Agregado"))
            
                    return true;
           if(tipoAlimento.equals("Simples")){
           
           
           }
    
        return false;
    
    
    
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    void setPercentagem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
