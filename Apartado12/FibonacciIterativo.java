public class FibonacciIterativo{
	public static void main(String[]args){
		int limite=Integer.parseInt(args[0]);
		int suma=1;
		int i;
		int aux=1;
		int temp;
		for(i=2;i< limite;i++){
			temp= suma;
			suma=suma+aux;
			aux= temp;


		}
	
		System.out.println("El termino es "+suma);
	}


}
