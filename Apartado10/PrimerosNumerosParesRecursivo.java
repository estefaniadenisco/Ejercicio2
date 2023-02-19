public class PrimerosNumerosParesRecursivo{
	public static void main(String[]args){
		int limite=Integer.parseInt(args[0]);
		System.out.println( "[" +listaRecursiva(limite)+ "]");
	
	}
	
	public static String listaRecursiva(int n){
		if (n==2){
			return "2 ";
		} 
	
		else{
			if (n%2==0){
				return n+ " " +listaRecursiva(n-1);
			}else{
				return listaRecursiva(n-1);

			}
		}
	


	}
	




}
