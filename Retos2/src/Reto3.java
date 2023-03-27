import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        int T=3;
        int repetidos=0;
        Scanner lectura=new Scanner (System.in);
        String [][] palabras=new String [3][3];
        for (int i = 0; i <T; i++) {
            for (int j = 0; j <T; j++) {
                System.out.println("Ingrese la palabra en la posicion "+i+j);
                palabras[i][j]=lectura.next();

            }
            
        }
        for (int i = 0; i <T; i++) {
            for (int j = 0; j < T; j++) {
                System.out.print(palabras[i][j]+ "\t" +"\t");
            }
            System.out.println();

        
        }
        for (int i = 0; i <palabras.length; i++) {
            for (int j = 0; j <palabras.length; j++) {
               if (palabras[i]==palabras[j]) {
                repetidos++;
               

               }
            }
        
        }
        lectura.close();
    }
}
