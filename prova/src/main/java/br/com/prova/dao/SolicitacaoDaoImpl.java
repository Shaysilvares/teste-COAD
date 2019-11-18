package br.com.prova.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import br.com.prova.model.Cliente;
import br.com.prova.model.Solicitacao;
import br.com.prova.model.StatusSolicitacao;
import br.com.prova.model.TipoSolicitacao;

@Repository
public class SolicitacaoDaoImpl implements SolicitacaoDao {

	private List<Solicitacao> listaSolicitacao = new ArrayList<Solicitacao>();

	public SolicitacaoDaoImpl() {
		criarSolicitacao();
	}

	public List<Solicitacao> criarSolicitacao() {
		listaSolicitacao.add(new Solicitacao("1", "Cálculo de férias", "Revisão do calcúlo de férias do fucionário",
				new Date(), new Cliente("1", "Shayna Bauer", "shaynasilvares2@hotmail.com", "21 99999-9999"),
				TipoSolicitacao.TRABALHISTA, StatusSolicitacao.ATENDIDA));
		return listaSolicitacao;
	}

	@Override
	public void salvar(Solicitacao solicitacao) {
		Random rand = new Random();
		solicitacao.setId(rand.doubles().toString());
		listaSolicitacao.add(solicitacao);
	}

	@Override
	public List<Solicitacao> getSolicitacoes() {
		return listaSolicitacao;
	}

}
