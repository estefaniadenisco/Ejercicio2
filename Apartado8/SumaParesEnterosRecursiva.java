
public class SumaParesEnterosRecursiva{

	public static void main(String[]args){

		

		

		System.out.println(sumaRecursiva(args,0));
	}
	public static int sumaRecursiva(String[]numeros,int posicion){

		if (posicion==numeros.length){

			return 0;
		
		}else{
			int aux= Integer.parseInt(numeros[posicion]);
			if (aux%2==0){
			
				return aux +sumaRecursiva(numeros, posicion+1);
			}else{
				return sumaRecursiva(numeros, posicion+1);
			}
			

		} 
	}




}
