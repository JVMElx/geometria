/**
 * 
 * @author JAVIER
 *
 */
public class Circulo_JVM extends FiguraGeometrica_JVM {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	/**
	 * 
	 * @param r
	 * @param tipoFigura
	 */
	public Circulo_JVM(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
