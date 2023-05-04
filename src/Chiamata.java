
public class Chiamata {
	String numberCalled;
	double durationCall;
	
	Chiamata(String n, double d) {
		this.numberCalled = n;
		this.durationCall = d;
	}
	
	String getNumberCalled() {
		return numberCalled;
	}
	
	double getDurationCall () {
		return durationCall;
	}
}
