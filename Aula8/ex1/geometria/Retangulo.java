package geometria;

public class Retangulo extends Poligono{

	public Retangulo (double ladoA, double ladoB) {
		super(new double[] {ladoA, ladoB, ladoA, ladoB });
		tipo = "Retângulo";
		
	}
	
	@Override
	public double area() {
		return lados[0]*lados[1];
	}

}
