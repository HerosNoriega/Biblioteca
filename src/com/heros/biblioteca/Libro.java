package com.heros.biblioteca;

public class Libro extends Documento implements Prestable{
	
	private String autor;
	private int edicion;
	private boolean disponible;
	private String prestado;
	
	
	public Libro(int codigo, String titulo, String autor, int edicion) {
		super(codigo, titulo);
		this.autor = autor;
		this.edicion = edicion;
	}

	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getEdicion() {
		return this.edicion;
	}
	
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	
	public String getPrestado() {
		return this.prestado;
	}

	public void setPrestado(String prestado) {
		this.prestado = prestado;
	}

	@Override
	public boolean prestar(String nombre) {
		boolean prestable;
		if(disponible) {
			prestable = true;
			this.setPrestado(nombre);
			
		} else {
			prestable = false;
		}
		return prestable;
	}		
}