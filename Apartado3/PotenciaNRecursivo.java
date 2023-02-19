public class PotenciaNRecursivo{
	public static void main(String[]args){
		int base=Integer.parseInt(args[0]);
		int exponente=Integer.parseInt(args[1]);
		System.out.println("El potencial es " +potencialRecursivo(base, exponente));
	
	}
	
	public static int potencialRecursivo(int b, int e){
		if (e==0){
			return 1;
		}
		else{
			return b*potencialRecursivo(b,e-1);
	
		}
	}
}
