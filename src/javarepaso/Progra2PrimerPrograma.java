/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javarepaso;
import java.util.Scanner;
/**
 *
 * @author dgtur
 */
public class Progra2PrimerPrograma {
  
public static void main(String[] args) {

Scanner entrada=new Scanner (System.in);

   int opcion; 

    System.out.println("Saludos a Todos Ustedes!");

    System.out.println("Operadores Aritméticos");
System.out.println("A continuacion se detallan operaciones a ejecutar");

    System.out.println("1.Sumar enteros");

    System.out.println("2.Restar enteros");

    System.out.println("3.Multiplicar enteros");

    System.out.println("4.Dividir enteros");

    System.out.println("Escoja que opcion Arimetica desea realizar: ");

    opcion=entrada.nextInt();

     

    switch (opcion)

    {

      case 1:

        int num1, num2, suma;

        System.out.println("Ingrese el primer valor: ");

        num1=entrada.nextInt();

        System.out.println("Ingrese el segundo valor: ");

        num2=entrada.nextInt();

        suma=num1+num2;

        System.out.println("El total de la suma es: "+suma);

        break; 

      case 2: 

        int num11,num22,resta;

         System.out.println("Ingrese el primer valor: ");

        num1=entrada.nextInt();

        System.out.println("Ingrese el segundo valor: ");

        num2=entrada.nextInt();

        resta=num1-num2;

         System.out.println("El total de la resta es: "+resta);

        break; 

      case 3:

        int num31,num32,multi;

         System.out.println("Ingrese el primer valor: ");

        num1=entrada.nextInt();

        System.out.println("Ingrese el segundo valor: ");

        num2=entrada.nextInt();

        multi=num1*num2;

         System.out.println("El total de la multiplicacion es: "+multi);

        break; 

      case 4:

        double num41,num42,div;

         System.out.println("Ingrese el primer valor: ");

        num1=entrada.nextInt();

        System.out.println("Ingrese el segundo valor: ");

        num2=entrada.nextInt();

        div=num1/num2;

         System.out.println("El total de la division es: "+div);

        break;

      default: 

        System.out.print("Este Valor no se Reconoce");

        

        

    }

  }
}