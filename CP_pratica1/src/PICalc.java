import java.util.Random;

public class PICalc {

	private int simulationNumber;
	
	public PICalc(){
		
	}
	
	/*class Output{
		
		private int total;
		private int pointsIn;
		private int pi;
		
		public Output(int total, int pointsIn, int pi){
			this.total = total;
			this.pointsIn = pointsIn;
			this.pi = pi;
		}
	}*/
	
	public static boolean isInside (double x, double y){
		double h = Math.sqrt(x * x + y * y);
		if(h<1) {
		}
			return (h<1);
	}
	
	
	public static double calcPI( int total){
		
		Random r = new Random();
		int insidePoints = 0;
		double PI = 0;
		
		for( int i = 0; i < total; i++){
			double x = (r.nextDouble()) *2-1.0;
			double y = (r.nextDouble())*2-1.0;
			
			//double h = Math.sqrt(x * x + y * y);
			
			if (isInside(x,y)) {
				insidePoints++;
			}
		
			PI = (4*((double)insidePoints/(double)total));
			
			
		}
		return PI;		
	}
	
}
