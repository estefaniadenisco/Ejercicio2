public class SumaNRecursivo{
	public static void main(String[]args){
		int limite=Integer.parseInt(args[0]);
		System.out.println("La suma es " +sumaRecursiva(limite));
	
	}
	
	public static int sumaRecursiva(int n){
		if (n==0){
			return 0;
		}
		else{
			return n+sumaRecursiva(n-1);
	
		}
	


	}
	




}
