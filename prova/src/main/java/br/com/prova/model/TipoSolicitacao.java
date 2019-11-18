package br.com.prova.model;

/**
 * @author Shayna Bauer
 * @since 17/11/2019
 */

public enum TipoSolicitacao {

	CONTABIL("Cont�bil"), JURIDICA("Jur�dica"), TRABALHISTA("Trabalhista"), OUTROS("Outros");
	
	private String descricao;

	TipoSolicitacao (String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}