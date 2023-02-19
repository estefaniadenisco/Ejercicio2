
public class DesviacionTipicaRecursiva{
	public static void main(String[]args){

		double media= mediaAritmeticaRecursiva(args, 0);
		double desviacion= desviacionTipica(args, media, 0);
		
		System.out.println(Math.sqrt(desviacion));
	}
	public static double mediaAritmeticaRecursiva(String[]numeros,int posicion){

		if (posicion==numeros.length){

			return 0;
		
		}else{ 
			return Double.parseDouble(numeros[posicion])/numeros.length +mediaAritmeticaRecursiva(numeros, posicion+1);
		}
	}

	public static double desviacionTipica(String[]numeros, double media,int posicion){

		if (posicion==numeros.length){
			return 0;
		}else{
			double aux= Double.parseDouble(numeros[posicion])-media;
			aux= aux*aux;
			return aux/numeros.length+ desviacionTipica(numeros, media, posicion+1);
		}
	}





}
