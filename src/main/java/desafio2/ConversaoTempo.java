package desafio2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConversaoTempo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("CONVERSÃO DE TEMPO" +
                "\nDigite um valor: ");
        long segundos = scanner.nextInt();

        Date data = new Date(segundos * 1000);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        formato.setDateFormatSymbols(new java.text.DateFormatSymbols(java.util.Locale.ENGLISH));

        String dataFormatada = formato.format(data);

        System.out.println(dataFormatada);

    }
}
