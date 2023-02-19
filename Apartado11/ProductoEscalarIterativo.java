
public class ProductoEscalarIterativo{
	public static void main(String[]args){
		int mitad= args.length/2;
		int i= 0;
		double numeroFinal=0;
		for (i=0; i<mitad; i++){
			numeroFinal += (Double.parseDouble(args[i])*Double.parseDouble(args[i+mitad]));

		}

		System.out.println(numeroFinal);
	}


}
