package br.com.prova.model;

import java.util.Calendar;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * @author Shayna Bauer
 * @since 17/11/2019
 */
public class Solicitacao {
	private String id;
	
	private String titulo;
	
	private String descricao;
	
	@DateTimeFormat(iso = ISO.DATE)
	private Date data;
	
	private Cliente cliente;
	
	private TipoSolicitacao tipo;
	
	private StatusSolicitacao status;
	
	public Solicitacao() {
		super();
	}

	public Solicitacao(String id, String titulo, String descricao, Date data, Cliente cliente, TipoSolicitacao tipo,
			StatusSolicitacao status) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoSolicitacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoSolicitacao tipo) {
		this.tipo = tipo;
	}

	public StatusSolicitacao getStatus() {
		return status;
	}

	public void setStatus(StatusSolicitacao status) {
		this.status = status;
	}
	
	public String getPrioridade() {
		Integer dtCadastro = getData().getDate();
		
		Calendar calendar = Calendar.getInstance();
		Integer hoje = calendar.getTime().getDate();
		
		calendar.add(Calendar.DATE, -2);
		Integer anteontem = calendar.getTime().getDate();
		
		if(dtCadastro == anteontem) {
			return Prioridade.MEDIA.getDescricao();
		} else if(dtCadastro < hoje) {
			return Prioridade.ALTA.getDescricao();
		} else {
			return Prioridade.BAIXA.getDescricao();
		}
	}

	@Override
	public String toString() {
		return "Solicitacao [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", data=" + data
				+ ", cliente=" + cliente + ", tipo=" + tipo + ", status=" + status + "]";
	}
}