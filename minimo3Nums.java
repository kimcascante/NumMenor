package Semana10;
/**
 * Nombre del programa: 
 * Descripcion: Haga una función que calcule el mínimo de 3 números reales. Pruébela en un main.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej3w10 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main(String[] args) throws IOException{ 

        int num1 = leerNum1();
        int num2 = leerNum2();
        int num3 = leerNum3();

        calculoNumMinimo(num1, num2, num3);
    }

    public static int leerNum1() throws IOException{
        int num1;

        out.println("Digite el primer numero:");
        num1 = Integer.parseInt(in.readLine());

        return num1;
    }

    public static int leerNum2() throws IOException{
        int num2;

        out.println("Digite el segundo numero:");
        num2 = Integer.parseInt(in.readLine());

        return num2;
    }

    public static int leerNum3() throws IOException{
        int num3;

        out.println("Digite el tercer numero:");
        num3 = Integer.parseInt(in.readLine());

        return num3;
    }

    public static String calculoNumMinimo(int pNum1, int pNum2, int pNum3){
        String numMinimo="";

        if(pNum1 < pNum2 && pNum1 < pNum3){
            numMinimo = "El numero minimo es: " +pNum1;
        } else if  (pNum2 < pNum1 && pNum2 < pNum3){
            numMinimo = "El numero minimo es: " +pNum2;
        } else {
            numMinimo = "El numero minimo es: " +pNum3;
        }

        out.println(numMinimo);

        return numMinimo;
    }
}