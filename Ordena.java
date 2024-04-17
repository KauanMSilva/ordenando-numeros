// Importa a biblioteca utilitaria rrays
import java.util.Arrays;
public class Ordena {

   public static void main(String args[]) {
     
     // Cria um Array chamando valores com 9 valores
     int[] valores = new int[]{10, 8, 30, 14, 23, 43, 1, 3, 4};

     // Atribui os valores passados como argumento do programa ao vetor valores
     for(int i = 0; i < args.length; i++) {
        valores[i] = Integer.parseInt(args[i]);
     }
     
     // Ordena o vetor valores em order crescente
      Arrays.sort(valores);
     
     // Exibi os valores do array valores
     for(int valor : valores){
     System.out.print(valor + " ");

      
     }

  }
}