/**
 * 
 * @author JAVIER VICENTE MACIÁ
 * @version 1.1
 *
 */
public class Triangulo_JVM extends FiguraGeometrica_JVM {
	private double lado1;
	private double lado2;
	private double lado3;
/**
 * 	
 * @param tipoFigura
 * @param lado1
 * @param lado2
 * @param lado3
 */
	public Triangulo_JVM(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		lado1 = lado1;
		lado2 = lado2;
		lado3 = lado3;
	}

	
	/**
	 * Devuelve la suma de todos los lados del triangulo.
	 */
	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	/**
	 * calcula el area del triangulo
	 */
	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	
	
}
