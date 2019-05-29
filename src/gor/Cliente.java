
package gor;

/**
 *
 * @author TAYSON
 */
import java.util.ArrayList;
import java.util.regex.*;
public class Cliente {
    protected String email;
    protected  String nome;
    protected String tipoClient;
    protected int numEncomenda;
    protected int numPratodia;
    protected int totalgasto;
ArrayList<Cliente> clientes =new ArrayList<>();

public void inserePessoa(Cliente cliente) {
    clientes.add(cliente);
}
    public String listarCliente(){
    for(Cliente view: clientes){
        
    System.out.println(view.getTipoClient() + "|" + view.getNome() + "|" + view.getEmail());
    }
    return "oi";
    }
 /* public void alterarTipo(int indice){

    if(indice >= 0 && indice < clientes.size()){

        clientes.set(indice, tipoClient);
    } 
}*/
    
  public String alterarTipo() {

	int posicaoAModificar=0;
	if (0 >= posicaoAModificar
			&& posicaoAModificar <+ clientes.size()) {
		Cliente cliente = clientes.get(posicaoAModificar);
		cliente.setTipoClient(getTipoClient());// nao retorna nada

		clientes.set(posicaoAModificar, cliente);
	}
	return null;
}
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoClient() {
        return tipoClient;
    }

    public void setTipoClient(String tipoClient) {
       /*if (this.tipoClienti."Omnivoros"== "omnivoros" =="vetariano" == "Vegetariano"){
       }*/
       
       this.tipoClient = tipoClient;
      
    }

    public int getNumEncomenda() {
        return numEncomenda;
    }

    public void setNumEncomenda(int numEncomenda) {
        this.numEncomenda = numEncomenda;
    }

    public int getNumPratodia() {
        return numPratodia;
    }

    public void setNumPratodia(int numPratodia) {
        this.numPratodia = numPratodia;
    }

    public int getTotalgasto() {
        return totalgasto;
    }

    public void setTotalgasto(int totalgasto) {
        this.totalgasto = totalgasto;
    }
    // validacoes
    public boolean tipoCliente(String tipoCli){
           
             if (tipoCli.equalsIgnoreCase ("VEGETARIAN")||tipoCli.equalsIgnoreCase("OMNIVOROUS"))
         
                       return true;
             return false;
               
        }
     public boolean validEmail(String email) {
    System.out.println(" Validacao de email");
    Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"); 
    Matcher m = p.matcher(email); 
    if (m.find()){
      System.out.println("O email "+email+" e valido");
      return true;
    }
    else{
      System.out.println("O E-mail "+email+" é inválido");
      return false;
    }  
 }
    @Override
    public String toString(){
return getTipoClient()+" | " + getNome() +" | " + getEmail();

}
    public Cliente() {
        this.email = email;
        this.nome = nome;
        this.tipoClient = tipoClient;
        this.numEncomenda = numEncomenda;
        this.numPratodia = numPratodia;
        this.totalgasto = totalgasto;
    }
    
    
    
}
