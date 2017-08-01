package br.com.alura.reflection.modelo;

public class Produto {

	public String nome, marca, modelo, decricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}

	public Produto(String nome, String marca, String modelo, String decricao) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.decricao = decricao;
	}
	
	
	
}
