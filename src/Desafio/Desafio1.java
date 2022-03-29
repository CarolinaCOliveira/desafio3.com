package Desafio;

import java.io.IOException;
import java.util.ArrayList; //sera necessario usar uma lista array Inteiro
import java.util.Comparator; //para comparar se o numero par ou impar e ordenar
import java.util.List; //para filtrar os numeros em par ou impar
import java.util.Scanner;


public class Desafio1 {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int testes = sc.nextInt();
            List<Integer> listNumbers = new ArrayList<Integer>();
            for (int i=0;i<testes;i++)
                listNumbers.add(sc.nextInt());
            listNumbers.stream()
                    .filter(n->n%2==0)
                    .sorted()
                    .forEach(System.out::println);
            listNumbers.stream()
                    .filter(n->n%2!=0)
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);
            sc.close();
        }
}
