package pt.c02oo.s02classe.s03lombriga;

public class Animacao {
	
	public String[] anima(String dados) {
		char[] dados_char = new char[dados.length()];
		
		for(int i = 0; i < (dados.length()); i++){
            char c = dados.charAt(i);
            dados_char[i] = c; 
		}
		
		int tam_aq = Integer.valueOf(String.copyValueOf(dados_char, 0, 2));
		int tam_lo = Integer.valueOf(String.copyValueOf(dados_char, 2, 2));
		int pos_cab = Integer.valueOf(String.copyValueOf(dados_char, 4, 2));
		String[] estado_aquario = new String[dados.length() - 5];
		
		AquarioLombriga animacoes = new AquarioLombriga(tam_aq, tam_lo, pos_cab);
		
		for(int i = 6; i < dados.length(); i++) {
			   estado_aquario[i - 6] = animacoes.apresenta();
			   if (dados_char[i] == 'M') {
				   animacoes.mover();
			   } else if (dados_char[i] == 'C') {
				   animacoes.crescer();
			   } else {
				   animacoes.virar();
			   }
		 }
		
		estado_aquario[dados.length() - 6] = animacoes.apresenta();
		
		return estado_aquario;
	}
}
