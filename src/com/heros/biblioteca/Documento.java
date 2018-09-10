package com.heros.biblioteca;

public class Documento {

	int codigo;
	String titulo;

	public Documento(int codigo, String titulo) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
