package Desafio;

import java.util.Scanner;
import java.io.IOException;


public class Desafio3 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= tests; i++) {
            StringBuilder result = new StringBuilder();
            String[] words = sc.nextLine().split(" ");

            int maxSize = Math.max (
                    words[0].length(),
                    words[1].length()
            );

            for(int data = 0; data < maxSize; data++) {
                if(data < words[0].length())
                    result.append(words[0].charAt(data));
                if(data < words[1].length())
                    result.append(words[1].charAt(data));
            }
            System.out.println(result.toString());
        }

        sc.close();
    }
}

