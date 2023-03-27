import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        int p=4;
        Scanner lectura=new Scanner(System.in);
        String [][] productos=new String[p][p];
        int [][] precios=new int [p][p];
        for (int i = 0; i <p; i++) {
            for (int j = 0; j < p; j++) {
                System.out.println("Ingrese el producto en la posicion"+i+j);
                productos[i][j]=lectura.next();
            }
            
        }
        for (int k = 0; k <p; k++) {
            for (int l = 0; l < p; l++) {
                System.out.println("Ingrese el precio en la posicion"+k+l);
                precios[k][l]=lectura.nextInt();
            
            
                
            }
    
        }
        System.out.println("CATALOGO DE PRODUCTOS");
        for (int i = 0; i <p; i++) {
            for (int j = 0; j < p; j++) {
               
                System.out.print(productos[i][j]+ "\t"+"\t");
                System.out.print(precios[i][j]+ "\t");
            
                
            }
            System.out.println();
    
        }
        lectura.close();
    }
    
}
