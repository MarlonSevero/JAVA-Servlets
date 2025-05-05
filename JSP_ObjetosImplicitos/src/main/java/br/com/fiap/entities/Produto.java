package br.com.fiap.entities;

import java.io.Serializable;

public class Produto implements Serializable{

	private String nome;
	private float valor;
	
	public Produto() {
		super();
	}
	
	public Produto(String nome, float valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
}
