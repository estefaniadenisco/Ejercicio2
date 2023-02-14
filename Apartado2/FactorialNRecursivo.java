public class FactorialNRecursivo{
	public static void main(String[]args){
		int limite=Integer.parseInt(args[0]);
		System.out.println("El factorial es " +factorialRecursivo(limite));
	
	}
	
	public static int factorialRecursivo(int n){
		if (n==0){
			return 1;
		}
		else{
			return n*factorialRecursivo(n-1);
	
		}
	


	}
	




}
