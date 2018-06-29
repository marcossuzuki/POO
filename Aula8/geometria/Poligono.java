package geometria;

public class Poligono extends FiguraPlana {

	protected double lados[];
	
	public Poligono (double lados[]) {
		this.lados = new double[lados.length];
		tipo = "Poligono";
		for(int i=0; i<lados.length; i++) {
			//this.lados[i] = new double();
			this.lados[i] = lados[i];
		}
	}
	
	@Override
	public double perimetro () {
		double perimetro = 0.0;
		for(int i=0; i<lados.length; i++) 
			perimetro += lados[i];
		return perimetro;
	}
}
