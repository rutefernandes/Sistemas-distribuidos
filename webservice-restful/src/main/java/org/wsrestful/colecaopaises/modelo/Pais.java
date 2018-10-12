package org.wsrestful.colecaopaises.modelo;

public class Pais{
	int id;
	String nome;	
	long populacao;
	
	public Pais() {
		super();
	}
	public Pais(int id, String nome, long populacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.populacao=populacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public long getpopulacao() {
		return populacao;
	}
	public void setpopulacao(long populacao) {
		this.populacao = populacao;
	}	
	
}