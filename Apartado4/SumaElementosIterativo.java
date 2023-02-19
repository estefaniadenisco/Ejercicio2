
public class SumaElementosIterativo{
	public static void main(String[]args){

		
		double numeroFinal=0;
		for (String numero : args){
			numeroFinal += Double.parseDouble(numero);

		}

		System.out.println(numeroFinal);
	}


}
