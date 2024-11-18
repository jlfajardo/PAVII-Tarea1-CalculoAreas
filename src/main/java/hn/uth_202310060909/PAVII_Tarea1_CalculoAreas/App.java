package hn.uth_202310060909.PAVII_Tarea1_CalculoAreas;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	int seleccion;
    	Scanner lector = new Scanner(System.in);
    	String seguir = null;
    	
    	do {
    		System.out.println( "Bienvenido al sistema de Calculo de Areas" );
    		System.out.println( "Por favor elige una opcion: " );
    		System.out.println( "1. Calculo de Area de un Circulo" );
    		System.out.println( "2. Calculo de Area de un Cuadrado" );
    		System.out.println( "3. Calculo de Area de un Triangulo" );
    		System.out.println( "4. Calculo de Area de un Rectangulo" );
    		seleccion = lector.nextInt();
    		
    		
    		
    		if(seleccion == 1) {
    			double r;
    			boolean repetir;
    			do {
    				System.out.println("Ingrese el radio del Circulo: ");
        			try {
        				r = lector.nextDouble();
        				if (r > 0) {
            				double area = Circulo(r);
                			System.out.print("El area del circulo es: " + area);
                			System.out.println("");
                			System.out.println("Desea hacer otra operacion?  (Y/N)");
            			}
            			else {
            				System.out.println("El radio no puede ser negativo");
            				System.out.println("Desea hacer otra operacion?  (Y/N)");
            			}
        			}catch (Exception e) {
        				System.out.println("Solo debe ingresar numeros");
        			}
            		seguir = lector.next();
            		if (seguir != null) {
            			if(seguir.toString() == "Y" || seguir.toString() == "Y")
            				repetir = true;
            			else {
            				if(seguir.toString() == "N" || seguir.toString() == "n")
            					repetir = false;
            				else System.out.println("Ingrese Y/y para si, N/n para no");
            				repetir = false;
            			}
            		}
            		else repetir = false;
    			} while (repetir == true);
    			
    		}
    		
    		if(seleccion == 2) {
    			System.out.println("Ingrese un lado del Cuadrado: ");
    			double l = lector.nextDouble();
    			double area = Cuadrado(l);
    			System.out.print("El area del Cuadrado es: " + area);
    			System.out.println("");
        		System.out.println("Desea hacer otra operacion?  (Y/N)");
        		seguir = lector.next();
        		System.out.flush();
    		}
    		
    		if(seleccion == 3) {
    			System.out.println("Ingrese la base del Triangulo: ");
    			double b = lector.nextDouble();
    			System.out.println("Ingrese la altura del Triangulo: ");
    			double h = lector.nextDouble();
    			double area = Triangulo(b, h);
    			System.out.print("El area del Triangulo es: " + area);
    			System.out.println("");
        		System.out.println("Desea hacer otra operacion?  (Y/N)");
        		seguir = lector.next();
        		System.out.flush();
    		}
    		
    		if(seleccion == 4) {
    			System.out.println("Ingrese la base del Rectangulo: ");
    			double b = lector.nextDouble();
    			System.out.println("Ingrese la altura del Rectangulo: ");
    			double h = lector.nextDouble();
    			double area = Rectangulo(b, h);
    			System.out.print("El area del Rectangulo es: " + area);
    			System.out.println("");
        		System.out.println("Desea hacer otra operacion?  (Y/N)");
        		seguir = lector.next();
        		System.out.flush();
    		}

    	} while (seguir == "y");
    }

	public static double Circulo(double r) {
		return Math.PI * Math.pow(r, 2);
	}
	
	public static double Cuadrado(double l) {
		return l * l;
	}
	
	public static double Triangulo(double b, double h) {
		return (b * h) / 2;
	}
	
	public static double Rectangulo(double b, double h) {
		return b * h;
	}
}
