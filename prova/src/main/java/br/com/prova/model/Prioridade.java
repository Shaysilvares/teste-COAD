package br.com.prova.model;

/**
 * @author Shayna Bauer
 * @since 17/11/2019
 */
public enum Prioridade {

	BAIXA("Baixa"), MEDIA("Média"), ALTA("Alta");

	private String descricao;

	Prioridade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}