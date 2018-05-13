/**
 * 
 * @author JAVIER
 *
 */
public abstract class FiguraGeometrica_JVM {

	protected String tipoFigura;
/**
 * 
 * @param tipoFigura
 */
	public FiguraGeometrica_JVM(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	
	/**
	 * @return no devuelve nada
	 */
	public abstract double area();
	
	
	/**
	 * @return no devuelve nada
	 */
	public abstract double perimetro();
/**
 * 
 * @return tipoFigura
 */
	public String getTipoFigura() {
		return tipoFigura;
	}
/**
 * 
 * @param tipoFigura
 */
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	/**
	 * 
	 * @return operacion perimetro
	 */
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}

}
