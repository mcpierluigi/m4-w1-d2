
public class CartaSim {
	
	//AttributiSim
	String phoneNumber;
	double availableCredit;
	Chiamata[] last5Calls;
	
	//CostruttoreSim
	public CartaSim(String n) {
		this.phoneNumber = n;
		this.availableCredit = 0;
		this.last5Calls = new Chiamata[5];
	}
		
	
	//MetodiSim
	void setCredit (double credit) {
		this.availableCredit = credit;
	}
	
	Chiamata[] getCallList() {
		return last5Calls;
	}
	
	void printSim() {
		System.out.println("Questa SIM ha: " +
				"numero = " + this.phoneNumber + ", " +
				"credito = " + this.availableCredit + ", " +
				"ultime 5 chiamate = " + this.last5Calls
				);
		
		if (last5Calls[0] != null) {
			System.out.println("- Chiamata 1: " + last5Calls[0].getNumberCalled() + " - Durata minuti: " + last5Calls[0].getDurationCall());
		}
		
		if (last5Calls[1] != null) {
			System.out.println("- Chiamata 2: " + last5Calls[1].getNumberCalled() + " - Durata minuti: " + last5Calls[1].getDurationCall());
		}
		
		if (last5Calls[2] != null) {
			System.out.println("- Chiamata 3: " + last5Calls[2].getNumberCalled() + " - Durata minuti: " + last5Calls[2].getDurationCall());
		}
		
		if (last5Calls[3] != null) {
			System.out.println("- Chiamata 4: " + last5Calls[3].getNumberCalled() + " - Durata minuti: " + last5Calls[3].getDurationCall());
		}
		
		if (last5Calls[4] != null) {
			System.out.println("- Chiamata 5: " + last5Calls[4].getNumberCalled() + " - Durata minuti: " + last5Calls[4].getDurationCall());
		}
	}
}
