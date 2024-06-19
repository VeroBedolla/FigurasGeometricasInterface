package org.generation;


	public class  FigurasCompletas{
		private String nombre;
		private double lado1;
		private double lado2;
		private double lado3;
		private double lado4;
		public void cuadrado (String nombre, double lado1, double lado2,  double lado3,  double lado4) {
			this.nombre = nombre;
			this.lado1 = lado1;
			this.lado2 = lado2;
		}
		public double calcularArea() {
			return (lado1 * lado2)*2;
		}//calcular area
		public double calcularPerimetro() {
			return (lado1+lado1+lado1+lado1);
		}//calcularPerimetro
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getLado1() {
			return lado1;
		}
		public void setLado1(double lado1) {
			this.lado1 = lado1;
		}
		public double getLado2() {
			return lado2;
		}
		public void setLado2(double lado2) {
			this.lado2 = lado2;
		}
		@Override
		public String toString() {
			return "FigurasCompletas [lado1=" + lado1 + ", lado2=" + lado2 + "]";
		}
	
} 
