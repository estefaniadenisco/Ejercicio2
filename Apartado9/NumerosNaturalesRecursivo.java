
public class NumerosNaturalesRecursivo{

	public static void main(String[]args){

		

		

		System.out.println("[" + listaRecursiva(args,0));
	}
	public static String listaRecursiva(String[]numeros,int posicion){

		if (posicion==numeros.length){

			return "]";
		
		}else{
			int aux= Integer.parseInt(numeros[posicion]);
			if (aux%2==0){
			
				return aux + " " + listaRecursiva(numeros, posicion+1);
			}else{
				return listaRecursiva(numeros, posicion+1);
			}
			

		} 
	}




}
