package calculoserie;

import java.io.PrintStream;
import java.io.FileNotFoundException;
/**
 * @author rordonez
 */
public class CalculoSerie {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
      // TODO code application logic here
        int cantidad = 200;
        System.out.println("Se ha generado el Archivo Serie_Resultante.txt con los " + cantidad + " primeros numeros \nRevise el archivo ");
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
