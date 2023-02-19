
public class NumerosNaturalesIterativo{
	public static void main(String[]args){

		int aux; 
		String lista= "[";
		for (String numero : args){
			aux = Integer.parseInt(numero);
			if (aux%2==0){
				lista+= aux;
				lista+= " ";
			}
			
		} 
		lista+= "]";

		System.out.println(lista);
	}


}
