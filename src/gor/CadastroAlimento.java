package gor;

import java.util.ArrayList;
import java.util.List;

public class CadastroAlimento {
    List<Alimento> alimentos = new ArrayList<>();

	public void cadastroAlimento(Alimento alimento) {
		//adiciona o alimento na lista
		alimentos.add(alimento);
	}

	//retorna a lista
	public List<Alimento> getAlimentos() {
		return alimentos;
	}

}
