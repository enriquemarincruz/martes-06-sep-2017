/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dados
        Random r1 = new Random();
        Scanner leer = new Scanner(System.in);
       int d1=r1.nextInt(6)+1;
       int d2=r1.nextInt(6)+1;
       int d3=r1.nextInt(6)+1;
       System.out.println("mostrar el dado"+d1);
       System.out.println("mostrar el dado"+d2);
       System.out.println("mostrar el dado"+d3);
       {
       int suma;
       suma =d1+d2+d3;
       System.out.println("la suma es"+suma);
        }
        //piramide.
        int num1=5;
        for (int i=1;i<=num1;i++){
          
            for(int j=1;j<=i;j++){
        System.out.print("*");
            }
            System.out.println();
        }
         int num=5;
        for (int i=num;i>=1;i--){
          
            for(int j=1;j<=i;j++){
        System.out.print("*");
            }
            System.out.println();
        }
//pares e impares ejercicio num#3
      int  ingresado=0;
      int  pares=0;
      int  suma=0;
while(pares<5)
{
ingresado = leer.nextInt();
if(ingresado%2==0)
{
pares++;
}
if(ingresado>=20)
{
suma=suma+ingresado;
}
}
//ejercicio #5 mayor, menor
int numero=0,adivinar=0;
 
numero = r1.nextInt(100)+1;
adivinar = leer.nextInt();
while (numero !=adivinar)
{
    if(adivinar<numero)
    {
System.out.println("ingresa el numero mayor");
    }
    else
    {
    System.out.println("ingresar un numero menor");
    }
     adivinar = leer.nextInt();
}
//ejercicio 6 #cuenta de banco
int deuda=0,interes=0;
int credito=0;
int total=0;
credito=leer.nextInt();


total=credito;
} 
}
