package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int broj=in.nextInt();
        for(int i=1; i<broj; i++) {
            if(i%sumaCifara(i)==0) {
                System.out.println(i);
            }
        }
    }

    private static int sumaCifara(int i) {
        int suma=0;
        while(i!=0) {
            suma=i%10+suma;
            i=i/10;
        }
        return suma;
    }
}
