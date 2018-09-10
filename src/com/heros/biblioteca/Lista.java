package com.heros.biblioteca;

public class Lista {
	private Nodo cabeza;
	private int longitud;
	
	public Lista() {
		this.cabeza = null;
		this.longitud = 0;
	}
	
	public void agregar(Libro libro) {
		Nodo nuevoNodo = new Nodo();
		
		nuevoNodo.data = libro;
		nuevoNodo.siguiente = null;
		
		if(longitud == 0) {
			cabeza = nuevoNodo;
		} else {
			
			nuevoNodo.siguiente = cabeza;
			cabeza = nuevoNodo;
		}
		longitud++;
	}
	
	public void listar() {
		if(longitud == 0) {
			System.out.println("Esta Vacia!");
		} else {
			Nodo nodoActual = cabeza;
			int contador = 1;
			
			while(nodoActual.siguiente != null) {
				System.out.println(contador + " : " + nodoActual.data.titulo);
				nodoActual = nodoActual.siguiente;
				contador++;
			}
			System.out.println(contador + " : " + nodoActual.data.titulo);
		}
	}
	
	public void ordenarZ_a_A() {
		if(longitud == 0) {
			System.out.println("No hay datos");
			
		} else if(longitud == 1) {
			System.out.println("No hay datos que ordenar");
			
		} else if (longitud > 1){
			
			Nodo auxiliar = cabeza;

		    for(int i = 0; i < longitud; i ++){
		      
		      Nodo menor = auxiliar;
		      Nodo auxiliarComparacion = auxiliar.siguiente;

		      for(int j = 1; j < longitud; j++){

		        if(auxiliarComparacion == null){
		          break;
		        }

		        if(menor.data.titulo.compareTo(auxiliarComparacion.data.titulo) < 0){
		          menor = auxiliarComparacion;
		        }
		        auxiliarComparacion = auxiliarComparacion.siguiente;
		      }

		      Libro temporal = auxiliar.data;
		      auxiliar.data = menor.data;
		      menor.data = temporal;

		      auxiliar = auxiliar.siguiente;
		    }
		}
	}
}