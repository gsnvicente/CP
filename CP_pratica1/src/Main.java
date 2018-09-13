import java.util.Scanner;

public class Main {

	private static Scanner reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		reader = new Scanner(System.in);
		
		int total = reader.nextInt();
		System.out.println("Total Number of Points: " + total);
		//System.out.println("Points within circle:" + PICalc.inside(x, y));
		double PI =  PICalc.calcPI(total);
		System.out.println("Pi estimation: " + PI);
		
	}

}
