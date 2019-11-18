package br.com.prova.model;

/**
 * @author Shayna Bauer
 * @since 17/11/2019
 */
public enum StatusSolicitacao {

	AGUARDANDO("Aguardando"),  ATENDIDA("Atendida");
	
	private String descricao;

	StatusSolicitacao (String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}