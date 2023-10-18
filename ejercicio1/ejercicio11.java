
package ejercicio1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumaf = 0, sumac = 0;

        int f = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de columnas: "));

        int matriz[][] = new int[f][c];

        for (int i = 0; i < (f); i++) {
            for (int j = 0; j < (c); j++) {

                System.out.print(" Digita un numero en [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();

            }
        } 
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j]+"");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < f; i++) {
            sumaf=0;
            for (int j = 0; j < c; j++) {
             sumaf+=matriz[i][j];   
            }
           System.out.println("La suma de la fila ["+i+"] es: "+sumaf);
        }
        for (int j = 0; j < f; j++) {
            sumac=0;
            for (int i = 0; i < c; i++) {
             sumac+=matriz[i][j];   
            }
           System.out.println("La suma de la columna ["+j+"] es: "+sumac);
           System.out.println("hola mundo");
        }
    }
}