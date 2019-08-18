package pl.n2god;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiary S,M,L lub XL");
        String shortSize = scanner.nextLine();
        String size;

        switch (shortSize){
            case "S":
                size = "mały";
                break;
            case "M":
                size = "średni";
                break;
            case "L":
                size = "duży";
                break;
            case "XL":
                size = "ogromny!";
                break;
            default:
                throw new IllegalArgumentException("Nieznany rozmiar");
        }

        System.out.println("Wybrano rozmiar: " + size);
    }
}
