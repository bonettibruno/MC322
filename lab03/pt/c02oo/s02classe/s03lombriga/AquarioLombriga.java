package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
	int tamanho_lombriga, tamanho_aquario, posicao, esq_ou_dir;

	public AquarioLombriga(int tamanho_lombriga, int tamanho_aquario, int posicao) {
	this.tamanho_lombriga = tamanho_lombriga;
	this.tamanho_aquario = tamanho_aquario;
	this.posicao = posicao;
	this.esq_ou_dir = 1;
	}

	public void crescer() {
	if (tamanho_lombriga < tamanho_aquario)
	tamanho_lombriga = tamanho_lombriga + 1;
	}

	public void mover() {
	if (posicao > 0 && posicao < tamanho_aquario) {

	}
	}

}
