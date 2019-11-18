package br.com.prova.model;

/**
 * @author Shayna Bauer
 * @since 17/11/2019
 */
public class Cliente {

	private String id;
	
	private String nome;
	
	private String email;
	
	private String telefone;

	public Cliente() {
		super();
	}

	public Cliente(String id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", email=" + email + ", telefone=" + telefone;
	}

}