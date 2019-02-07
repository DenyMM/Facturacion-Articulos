package factura2;

import java.util.Scanner;

public class Main {
	 static String artiName;
	       static int artiCode;
	       static int pieces;
	       static int pricePi;
	       static int total;
	       static String other = null;
	  
	    public static void main(String[] args) {    	
	    Scanner entry = new Scanner (System.in);
	    
	     do {
	       System.out.print("Ingrese el codigo del articulo: ");
	    	artiCode = entry.nextInt();
	    	System.out.print("Ingrese el nombre del articulo: ");
			artiName = entry.next();
			System.out.print("Ingrese el numero de piezas: ");
			pieces = entry.nextInt();
			//se condiciona el numero de piezas y el precio
	        if(pieces<1){
	            System.out.println("Por favor digite un valor valido " );
	            pieces=entry.nextInt();
	        }
	        System.out.print("Ingrese el precio del articulo: ");
			pricePi = entry.nextInt();
	        if(pricePi<1){
	            System.out.println("Por favor digite un valor valido " );
	            pricePi=entry.nextInt();
	        }   	     
	            //se llaman las funciones 
               bill();
	 	       calculateAmount();
	 	       //se agrega la opcion de reiniciar el programa
	 	   	System.out.print("¿Quiere realizar otra factura?" );
           	System.out.print("Si / No" );
           	other = entry.next();
	       	    
	     }while (other.equals("si") || other.equals("Si") || other.equals("SI"));{
	        	
	        }
	    }
	     
	    // funcion para mostrar la factura
	    public static void bill(){	  
	    System.out.println("Los datos de su factura son " + "\n" +" nombre "  + artiName + "\n" + "Codigo " + artiCode + "\n" + "Numero de piezas " + pieces + "\n" + "Precio " + pricePi +"\n" );
	 }
	    //funcion para calcular el total de la compra
	    public static void calculateAmount(){
	         total = pricePi*pieces;
	        System.out.println("El total es: " + total);
	    }
	    
	    }
	    
