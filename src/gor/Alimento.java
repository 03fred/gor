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
public class Alimento {
    protected String nome;
    protected int percentagem;
    protected String tipoAlimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPercentagem() {
        return percentagem;
    }

    public void setPercentagem(int percentagem) {
        this.percentagem = percentagem;
    }
    public boolean validarAlimento(String tipoAlimento){
    
        if(tipoAlimento.equalsIgnoreCase("simples")|| tipoAlimento.equalsIgnoreCase("Agregado"))
            return true;
        return false;
    
    
    
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
    
    
}
