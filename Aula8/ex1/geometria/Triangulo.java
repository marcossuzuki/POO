package geometria;

public class Triangulo extends Poligono{

	public Triangulo (double ladoA, double ladoB, double ladoC) {
		super(new double[] {ladoA, ladoB, ladoC});
		tipo = "Triangulo";
	}
	
	@Override
	public double area() {
		double p = perimetro();
		return Math.sqrt(p*(p-lados[0])*(p-lados[1])*(p-lados[2]));
	}

}
