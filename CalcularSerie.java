/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular.serie;

/**
 *
 * @author rordonez
 */
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class CalcularSerie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        int cantidad = 200;
        System.out.println("Los " + cantidad + " números de la serie son: ");
        PrintStream originalOut = System.out;
        PrintStream Salida = new PrintStream("./Serie_Resultante.txt");

        System.setOut(Salida);

        int n, a = 1, b = 0, c;

        Salida.print("Los " + cantidad + " números de la serie son: \n");
        for (n = 1; n <= cantidad; n++) {
            c = a + 2 * b;
            Salida.print(c + "\n");
            a = b;
            b = c;
        }
    }

}
