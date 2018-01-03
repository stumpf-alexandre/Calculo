package Calculo;

import java.util.Scanner;

/**
 * Created by als on 08/08/2017.
 */
public class Resposta {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        Math m=new Math();
        int A;
        int B;
        String sinais;
        System.out.println("Digite um valor para A: ");
        A=tc.nextInt();
        System.out.println("Digite um valor para B: ");
        B=tc.nextInt();
        System.out.println("Digite um operador aritmetico: ");
        sinais=tc.next();

        m.calcular(A,B,sinais);
    }
}
