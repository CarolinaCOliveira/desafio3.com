package Desafio;

import java.util.Scanner;
import java.io.IOException;

public class Desafio2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N;
        while (sc.hasNext()) {
            N = sc.nextInt();
            System.out.println((int)(Math.log(N)/Math.log(2)));
        }
        sc.close();
    }
}
