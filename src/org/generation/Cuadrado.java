package org.generation;

public class Cuadrado implements InterfaceFiguras {
		private String nombre;
		private double lado;
		public Cuadrado(String nombre, double lado) {
			
			this.nombre = nombre;
			this.lado = lado;
		}

		public double calcularArea() {
			return (lado*lado);
		}//calcular area
		public double calcularPerimetro() {
			return (lado)*4;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getLado() {
			return lado;
		}
		public void setLado(double lado) {
			this.lado = lado;
		}
		@Override
		public String toString() {
			return "Cuadrado [nombre=" + nombre + ", lado=" + lado + ", getNombre()=" + getNombre() + "]";
		}
		
}//class cuadrado
