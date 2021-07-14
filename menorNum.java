package Adicional;

/**
 * Nombre del programa: 
 * Descripcion: Encontrar el menor de tres números
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp3w2 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        int numeroUno;
        int numeroDos;
        int numeroTres;
        String numeroMenor;

        escribir.println("Digite el primer numero");
        numeroUno = Integer.parseInt(leer.readLine());

        escribir.println("Digite el segundo numero");
        numeroDos = Integer.parseInt(leer.readLine());

        escribir.println("Digite el tercer numero");
        numeroTres = Integer.parseInt(leer.readLine());

        numeroMenor = leer.readLine();

        if (numeroUno == numeroDos && numeroDos == numeroTres){
            numeroMenor = "No hay numero menor, los 3 numeros son iguales " + numeroDos;

        } else if (numeroUno < numeroDos && numeroUno < numeroTres){
            numeroMenor = "El numero menor es " + numeroUno;

        } else if (numeroDos < numeroUno && numeroDos < numeroTres){
            numeroMenor = "El numero menor es " + numeroDos;

        } else {
            numeroMenor = "El numero menor es " + numeroTres;
        }

        escribir.println(numeroMenor);
        
    }
}