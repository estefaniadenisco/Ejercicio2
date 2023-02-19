public class PrimerosNumerosParesIterativo{
	public static void main(String[]args){
		int limite=Integer.parseInt(args[0]);
		int i;
		String lista= "[";
		for(i=2;i<= limite;i+=2){
			lista+= i;
			lista+= " ";




		}
		lista+= "]";
	
		System.out.println(lista);
	}


}
