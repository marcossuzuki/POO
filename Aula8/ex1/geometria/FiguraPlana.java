package geometria;

public class FiguraPlana {
	protected String tipo = "?";

	public double perimetro() {
		return 0;
	}
	
	public double area() {
		return 0;
	}
	
	public String toString() {
		String txt = tipo+ ", area:" + area() + ", perimetro: " + perimetro();
		return txt;
	}


}
