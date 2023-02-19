public class SumaParesNRecursivo{
	public static void main(String[]args){
		int limite=Integer.parseInt(args[0]);
		System.out.println("La suma es " +sumaRecursiva(limite));
	
	}
	
	public static int sumaRecursiva(int n){
		if (n==2){
			return 2;
		} 
	
		else{
			if (n%2==0){
				return n+sumaRecursiva(n-1);
			}else{
				return sumaRecursiva(n-1);

			}
		}
	


	}
	




}
