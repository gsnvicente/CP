

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = Integer.parseInt(args[0]);
		PICalc p = new PICalc(n);
		PICalc.Output result = p.calc();
		
		
		System.out.println("Total Number of Points:" );
		System.out.println("Points within circle:");
		System.out.println("Pi estimation");
	}

}
