package org.generation;

public class Mian {
//https://github.com/VeroBedolla/FigurasGeometricasInterface/tree/main/src
	
	
	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo ("Bermudas", 20,10,15);
		Triangulo t = new Triangulo ("TrianguloTE", 250,175,145);
		Cuadrado  lot = new Cuadrado ("Cuadrado lot", 10);
		Rectangulo  verde = new Rectangulo("Rectangulo verde", 10, 15);
		Rombo  cafe = new Rombo("Rombo cafe", 10, 10, 15);
		Romboide fourLados = new Romboide("Rombo fourLados", 13, 20, 15);
		Trapecio amarillo = new Trapecio("Trapecio amarillo", 9, 15, 12, 25);
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(lot);
		imprimirCalculo(verde);
		imprimirCalculo(cafe);
		imprimirCalculo(fourLados);
		imprimirCalculo(amarillo);
		
		

	}//main 
public static void imprimirCalculo(InterfaceFiguras fig) {
	System.out.println(fig.toString());
	System.out.println("+=======================================");
	System.out.println("|EL área de [ " + fig.getNombre()
	   +" ] es : " + fig.calcularArea());
	System.out.println("| El perimetro de [ " + fig.getNombre()
			+ " ] es : " + fig.calcularPerimetro());
	System.out.println("+=======================================");
	
	
}
}//classmain

