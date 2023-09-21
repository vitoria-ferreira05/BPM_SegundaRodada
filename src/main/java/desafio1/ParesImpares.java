package desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números deseja digitar?");
        int quantidadeNumeros = scanner.nextInt();

        System.out.println("Digite os números:");
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero = scanner.nextInt();

                if (numero < 0){
                    throw new Exception("Digite número inteiros não negativos");
                }

            numeros.add(numero);
        }

        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
                Collections.sort(numerosPares);
            } else {
                numerosImpares.add(numero);
                Collections.sort(numerosImpares, Collections.reverseOrder());
            }
        }

        if (!numerosPares.isEmpty()) {
            System.out.println("Números pares: " + numerosPares);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

        if (!numerosImpares.isEmpty()) {
            System.out.println("Números ímpares: " + numerosImpares);
        } else {
            System.out.println("Nenhum número ímpar foi digitado.");
        }

    }
}