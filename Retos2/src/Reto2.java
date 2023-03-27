import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        int CP=4;
        int p1=0,p2=0,p3=0;
        Scanner lectura=new Scanner(System.in);
        System.out.println();
        double[] tiempo=new double[CP];
        System.out.println("la cantidad maxima de participantes es 4");
        for (int i = 0; i <CP; i++) {

            System.out.println("ingrese el tiempo del participante en la posicion"+(i+1));
            tiempo[i]=lectura.nextDouble();
            
        }
        for (int i = 0; i <CP; i++) {

            if (tiempo[i]>tiempo[p1] ) {
                System.out.println("el participante"+p1+"con el tiempo"+tiempo[i]+ "esta en primer lugar");
                p1=i;
            }

        }
        for (int i = 0; i <CP; i++) {
            if (tiempo[i]>tiempo[p2] && tiempo[p2]<tiempo[p1]) {
                System.out.println("el participante"+p2+"con el tiempo"+tiempo[i]+"esta en segundo lugar"); 
                p2=i; 
            }
        }

        for (int i = 0; i <CP; i++) {
            if (tiempo[i]>tiempo[p3] && tiempo[p1]>tiempo[p3]) {
                if (tiempo[p3]>tiempo[p2]) {
                    System.out.println("el participante"+p3+"con el tiempo"+tiempo[i]+"esta en tercer lugar");  
                p3=1;
            }
        }
             
        }

    lectura.close();
          
    }
}
        
    
    
        
        
       
        
    

