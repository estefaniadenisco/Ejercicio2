public class PotenciaNIterativo{
	public static void main (String[]args){

		int base= Integer.parseInt(args[0]);
		int exponente=Integer.parseInt(args[1]);
		int potencia=1;
		int i;
		for(i=1;i<= exponente;i++){
			potencia=potencia*base;



		}
	
		System.out.println("La potencia es "+potencia);
	}



}
