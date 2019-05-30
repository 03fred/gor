package gor;

public class ValidacaoCamposEntrada {

	public boolean validacaoString(String valor) {
		//retorna true se o valor não for vazio e for diferente de nulo
		return valor.isEmpty() && valor != null ? true :false;	
			}

	public boolean validacaoDouble(String num) {
		//verifica se o valor contém letras
		try {
			Double.parseDouble(num);
			return true;
		}catch(NumberFormatException nb) {
			return false;
		}
		
		
	}
}
