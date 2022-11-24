import java.util.Scanner;

public class Mask {
    public double[] arreglo = new double[10];

    public static void main(String[] args) {
        Mask b = new Mask();
        b.getVal();
        b.getMask();
    }

    public void getVal(){        
        Scanner entrada = new Scanner(System.in);        
        int contador = 1;        
        System.out.println("Teclea la secuencia de numeros:");        
        for (int i=0;i <= 9;i++){            
        System.out.print(contador + " : ");            
        arreglo[i] = entrada.nextInt();            
        contador++;         }    
    }

    public void getMask(){        
        System.out.print("La mascara que le corresponde es:");        
        for (int a=0;a <=9;a++){            
            if(arreglo[a] < 0){                
                System.out.print(1);            
            }else{                
                System.out.print(0);            
            }        
        }
    }
}