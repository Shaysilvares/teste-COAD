package br.com.prova.dao;

import java.util.List;

import br.com.prova.model.Solicitacao;

/**
 * @author Shayna Bauer
 * @since 17/11/2019
 */
public interface SolicitacaoDao {
	void salvar(Solicitacao solicitacao);
	List<Solicitacao> getSolicitacoes();
}