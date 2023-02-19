
public class DesviacionTipicaIterativa{
	public static void main(String[]args){

		double aux;
		double media=0;
		double desviacionTipica=0;
		for (String numero : args){
			media += Double.parseDouble(numero)/args.length;

		}
		for (String numero : args){
			aux= Double.parseDouble(numero)- media; //numero-media
			aux= aux*aux;//lo elevamos al cuadrado
			desviacionTipica += aux/args.length; // Lo sumamos y lo dividimos por la n 


		}
		desviacionTipica= Math.sqrt (desviacionTipica);

		System.out.println(desviacionTipica);
	}


}
