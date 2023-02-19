
public class SumaParesEnterosIterativa{
	public static void main(String[]args){

		int aux; 
		int numeroFinal=0;
		for (String numero : args){
			aux = Integer.parseInt(numero);
			if (aux%2==0){
				numeroFinal+= aux;
			}

		}

		System.out.println(numeroFinal);
	}


}
