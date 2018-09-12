import java.util.Random;

public class PICalc {

	private int simulationNumber;
	
	public PICalc(int simulationNumber){
		this.simulationNumber = simulationNumber;
	}
	
	class Output{
		
		private int total;
		private int pointsIn;
		private int pi;
		
		public Output(int total, int pointsIn, int pi){
			this.total = total;
			this.pointsIn = pointsIn;
			this.pi = pi;
		}
	}
	
	
	
	
	public Output calc(){
		Random r = new Random();
		int in = 0;
		
		for( int i = 0; i < total; i++){
			double x = r.nextDouble();
			double y = r.nextDouble();
			
			double h = Math.sqrt(x * x + y * y);
			
			if (h <= 1){
				in++;
			}
		}
		
		double totalDouble = (double)total;
		duble pi = in*4/totalDouble;
	}
}
