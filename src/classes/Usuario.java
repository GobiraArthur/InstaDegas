package classes;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private ArrayList<String> lista_postagens;
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.lista_postagens = new ArrayList<String>();
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
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void novaPostagem(String postagem) {
		this.lista_postagens.add(postagem);
	}
	
	public void listaPostagens() {
		for (int i = 0; i < this.lista_postagens.size(); i++) {
			System.out.println("Postagem " + (i + 1) + ": " + this.lista_postagens.get(i));
		}
	}
}
