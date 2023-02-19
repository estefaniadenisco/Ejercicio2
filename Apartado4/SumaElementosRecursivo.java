
public class SumaElementosRecursivo{
	public static void main(String[]args){

		

		

		System.out.println(sumaRecursiva(args,0));
	}
	public static double sumaRecursiva(String[]numeros,int posicion){

		if (posicion==numeros.length){

			return 0;
		
		}else{ 
			return Double.parseDouble(numeros[posicion])+sumaRecursiva(numeros, posicion+1);
		}
	}




}
