
public class MediaAritmeticaIterativa{
	public static void main(String[]args){

		
		double numeroFinal=0;
		for (String numero : args){
			numeroFinal += Double.parseDouble(numero)/args.length;

		}

		System.out.println(numeroFinal);
	}


}
