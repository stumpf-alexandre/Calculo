package Calculo;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;

/**
 * Created by als on 08/08/2017.
 */
public class Math {
    public int calcular(int A, int B, String sinais){
        int t = 0;
        if (sinais.toUpperCase().equals("SOMA")){
            t=A+B;
        }
        else if (sinais.toUpperCase().equals("SUBTRAÇÂO")){
            t=A-B;
        }
        else if (sinais.toUpperCase().equals("DIVISÃO")){
            t=(A+B)/2;
        }
        else if (sinais.toUpperCase().equals("MULTIPLICAÇÃO")){
            t=A*B;
        }
        System.out.println(t);
        return t;
    }
}
