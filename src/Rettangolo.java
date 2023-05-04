
public class Rettangolo {
	
	//AttributiRettangolo
	double altezza;
	double base;
	
	//CostruttoreRettangolo
	public Rettangolo (double h, double b ) {
		this.altezza = h;
		this.base = b;
	}
	
	//MetodiRettangolo
	public double Area() {
		double a = this.altezza * this.base;
		return a;
	}
	public double Perimetro() {
		double p = 2 * (this.altezza + this.base);
		return p;
	}
	void stampaRettangolo() {
		System.out.println("Questo rettangolo ha: " +
				"p = " + this.Perimetro() + " e " +
				"a = " + this.Area()
				);
	}
	
}
