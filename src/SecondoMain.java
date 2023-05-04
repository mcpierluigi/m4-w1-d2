
public class SecondoMain {

	public static void main(String[] args) {
		CartaSim mySim = new CartaSim("+39 0000229000");
		mySim.setCredit(15.50);
		
		Chiamata call = new Chiamata("+39 1234567890", 1.23);
		mySim.getCallList()[0] = call;
		call = new Chiamata("+39 0987654321", 2.34);
		mySim.getCallList()[3] = call;
		call = new Chiamata("+ 39 3746253948", 0.25);
		mySim.getCallList()[1] = call;
		
		mySim.printSim();
	}
}
