package Morse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välj ett av valen:");
        System.out.println("1. Konvertera Morse kod till Engelska");
        System.out.println("2. Konvertera Engelska till Morse kod");

        int val = scanner.nextInt();
        scanner.nextLine();

        switch (val) {
            case 1:
                System.out.print("Skriv in Morse kod: ");
                String morseKod = scanner.nextLine();
                System.out.println("Engelska: " + MorseKodAndring.morseTillEngelska(morseKod));
                break;
            case 2:
                System.out.print("Skriv in Engelsk text: ");
                String engelskText = scanner.nextLine();
                System.out.println("Morse kod: " + MorseKodAndring.engelskaTillMorse(engelskText));
                break;
            default:
                System.out.println("Otillåtet val.");
        }

        scanner.close();
    }
}
