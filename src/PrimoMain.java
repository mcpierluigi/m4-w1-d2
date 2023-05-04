
public class PrimoMain {

	public static void main(String[] args) {
		Rettangolo first = new Rettangolo(5 , 8);
		Rettangolo second = new Rettangolo(10, 2);
		
		System.out.println(first.Area());
		System.out.println(second.Perimetro());
		
		first.stampaRettangolo();
		second.stampaRettangolo();
		
		stampaDueRettangoli(first, second);
	}
	
	public static void stampaDueRettangoli(Rettangolo a, Rettangolo b) {
		System.out.println ("Il triangolo a ha: " +
				"a = " + a.Area() + " e p = " + a.Perimetro() + 
				" il triangolo b ha: " +
				"a = " + b.Area() + " e p = " + b.Perimetro());
	}
}
