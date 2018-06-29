package geometria;

public class Circulo extends FiguraPlana{
	private double raio;
	
	public Circulo (double raio) {
		tipo="Circulo";
		this.raio = raio;
		
	}

	@Override
	public double area () {
		return raio*raio*3.14;
	}
	
	@Override
	public double perimetro () {
		return raio*2.0*3.14;
	}

	
}
