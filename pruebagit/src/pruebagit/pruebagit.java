package pruebagit;


import java.util.Scanner;
public class pruebagit {

public static void main(String[] args){
	int numero=0;
	Scanner teclado=new Scanner(System.in);
	System.out.println("Escribir un número");
	numero=teclado.nextInt();
	System.out.println("El cuadrado del número"+numero+"es: "+numero*numero);
}
}