import geometria.*;

public class Principal {

	public static void main (String args[]) {
		
		FiguraPlana r = new Retangulo(2.0, 3.0);
		FiguraPlana c = new Circulo(2.0);
		FiguraPlana q = new Quadrado(5.0);
		FiguraPlana t = new Triangulo(5.0, 6.0, 7.0);
		
		System.out.println(r);
		System.out.println(c);
		System.out.println(q);
		System.out.println(t);
	}

}
