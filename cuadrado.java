import java.util.Scanner;

public class cuadrado {

    public static void main(String[] args) {
        //(a+d)2=a2+b2+2ab
        Scanner entrada = new Scanner(System.in);
        double a, b, resp, r;
        System.out.println("Ingrese el primer numero: ");
        a= entrada.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        b= entrada.nextDouble();

        double exponente=2;
        double re= Math.pow(a, exponente);
        double res=Math.pow(b, exponente);
        
        r=2*(a+b);
        resp=re+res+r;
        System.out.println("El cuadrado de la suma es: "+resp);
    }
}