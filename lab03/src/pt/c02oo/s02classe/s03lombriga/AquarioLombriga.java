package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
	int tamanho_lombriga, tamanho_aquario, posicao, para_esquerda;

	public AquarioLombriga(int tamanho_lombriga, int tamanho_aquario, int posicao) {
		if (tamanho_lombriga > tamanho_aquario)
			this.tamanho_lombriga = tamanho_aquario;
		else 
			this.tamanho_lombriga = tamanho_lombriga;

		this.tamanho_aquario = tamanho_aquario;

		if (posicao > tamanho_aquario)
			this.posicao = 1;
		else if (posicao < 1)
			this.posicao = 1;
		else if (posicao + tamanho_lombriga - 1 > tamanho_aquario)
			this.posicao = 1;
		else if (posicao - tamanho_lombriga < 1)
			this.posicao = 1;
		else
			this.posicao = posicao+1;
		
		this.para_esquerda = 1;
	}

	public void crescer() {
		if (tamanho_lombriga < tamanho_aquario)
			tamanho_lombriga = tamanho_lombriga + 1;
		}
	
	public void virar() {
		if (para_esquerda == 1) {
			para_esquerda = 0;
			posicao = posicao + tamanho_lombriga - 1;
		}
		else {
			para_esquerda = 1;
			posicao = posicao - tamanho_lombriga + 1;
		}
	}
	

	public void mover() {
	if (para_esquerda == 1) {
		if (posicao != 1)
			posicao = posicao - 1;
		else
			virar();
	} else {
		if (posicao != tamanho_aquario)
			posicao = posicao + 1;
		else
			virar();
		}
	}
	
	public String apresenta() {
		String lomb_no_aq = "";
		for (int i = 1; i <= tamanho_aquario; i++) {
			if (para_esquerda == 0) {
				if (i == posicao)
					lomb_no_aq += "O";
				else if (i < posicao && i >= (posicao - tamanho_lombriga + 1))
					lomb_no_aq += "@";
				else
					lomb_no_aq += "#";
			} else {
				if (i == posicao)
					lomb_no_aq += "O";
				else if (i > posicao && i <= (posicao + tamanho_lombriga -1))
					lomb_no_aq += "@";
				else
					lomb_no_aq += "#";
			}
		}
		return lomb_no_aq;
	}
	
}