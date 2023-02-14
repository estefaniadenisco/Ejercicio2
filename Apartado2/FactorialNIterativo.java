public class FactorialNIterativo{
	public static void main (String[]args){

		int limite=Integer.parseInt(args[0]);
		int factorial=1;
		int i;
		for(i=1;i<= limite;i++){
			factorial=factorial*i;



		}
	
		System.out.println("El factorial es "+factorial);
	}



}
