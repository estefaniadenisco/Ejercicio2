
public class ProductoEscalarRecursivo{
	public static void main(String[]args){

		

		int mitad=args.length/2;
		double []lista1= new double [mitad];
		double []lista2= new double [mitad];
		int i;

		for (i=0; i<mitad; i++){
			lista1 [i]= Double.parseDouble(args[i]);
			lista2 [i]= Double.parseDouble(args[i+mitad]);
		}
		System.out.println(productoEscalarRecursivo(lista1,lista2,0));
	}
	public static double productoEscalarRecursivo(double[]lista1,double[]lista2,int posicion){

		if (posicion==lista1.length){

			return 0;
		
		}else{ 
			return (lista1[posicion]*lista2[posicion])+ productoEscalarRecursivo(lista1,lista2,posicion+1);
		}
	}




}
