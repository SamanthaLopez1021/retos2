//arrays
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        int n,residuo,mult=0;
        Scanner lectura=new Scanner(System.in);
        
    System.out.println("Ingrese cuantos numeros desea registrar");
    n=lectura.nextInt();
    int [] numero=new int [n];
    for (int i = 0; i <n; i++) {
       
        System.out.println("Ingrese el numero en la posicion "+(i+1));
        numero[i]=lectura.nextInt();
        residuo=numero[i]%2;
        if (residuo==0) {
            mult=mult+1;
        }
    }
    
    if (mult==0) {
        System.out.println("no hay multiplos de 2 en los valores ingresados");
    }
    else {
        System.out.println("hay "+mult+" multiplos en los valores ingresados");
    }
        
    lectura.close();

    }
    
}
