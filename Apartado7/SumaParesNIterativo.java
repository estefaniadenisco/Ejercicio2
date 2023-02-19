public class SumaParesNIterativo{
	public static void main(String[]args){
		int limite=Integer.parseInt(args[0]);
		int suma=0;
		int i;
		for(i=2;i<= limite;i+=2){
			suma=suma+i;



		}
	
		System.out.println("La suma es "+suma);
	}


}
