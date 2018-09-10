package com.heros.biblioteca;

public class PruebaBiblioteca {
	
	public static void main(String[] args) {
		Libro libro1 = new Libro(1, "Don Quijote de la Mancha", "Miguel de Cervantes", 1615);
		Libro libro2 = new Libro(1, "Romeo Y Julieta", "William Shakespeare", 1597);
		Libro libro3 = new Libro(1, "Alicia en el Pais de las Maravillas", "Lewis Carroll", 1865);
		Libro libro4 = new Libro(1, "Pedro y Angel", "Anonimo", 1992);
		Libro libro5 = new Libro(1, "Zulu", "Anonimo", 1998);
		
		Lista listaLibros = new Lista();
		
		listaLibros.agregar(libro1);
		listaLibros.agregar(libro2);
		listaLibros.agregar(libro3);
		listaLibros.agregar(libro4);
		listaLibros.agregar(libro5);
		
		
		listaLibros.listar();
		
		System.out.println("Ordenados Inversamente: ");
		
		listaLibros.ordenarZ_a_A();
		
		listaLibros.listar();
	}
}
