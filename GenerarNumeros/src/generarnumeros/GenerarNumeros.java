/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generarnumeros;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Juan A
 */
public class GenerarNumeros {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String entradatexto = pedirCantidad();
        int[] numerosgenerados = generarNumeros(entradatexto);
        System.out.println(Arrays.toString(numerosgenerados));
       
    }

    public static String pedirCantidad() {
        // TODO code application logic here
        System.out.println("Introduzca el numero de digitos que desea generar");
        Scanner scanner = new Scanner(System.in);
        String entradatexto = scanner.nextLine();
        return entradatexto;
    }

    private static int[] generarNumeros(String entradatexto) {
        int[] numerosgenerados = new int[Integer.parseInt(entradatexto)];
            for (int i = 0; i < numerosgenerados.length  ; i++) {
                int numerogenerado = -778;
                while(numerogenerado < -777 || numerogenerado > 777){
                    numerogenerado = (int) (Math.random()*100);
                    System.out.println(numerogenerado);
                }
                numerosgenerados[i] = numerogenerado;

            }
        return numerosgenerados;
    }
    
}
