
public class MediaAritmeticaRecursiva{
	public static void main(String[]args){

		

		

		System.out.println(mediaAritmeticaRecursiva(args,0));
	}
	public static double mediaAritmeticaRecursiva(String[]numeros,int posicion){

		if (posicion==numeros.length){

			return 0;
		
		}else{ 
			return Double.parseDouble(numeros[posicion])/numeros.length +mediaAritmeticaRecursiva(numeros, posicion+1);
		}
	}




}
