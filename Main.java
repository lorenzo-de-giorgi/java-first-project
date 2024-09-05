// user input from terminal

import java.util.Scanner;

public class Main {
    public static void main(String[] a){
        Scanner scanner = new Scanner(System.in);

        // stampo in console la richeista del nome
        System.out.println("Inserisci il tuo nome: ");
        // in questo modo scannerizzo la riga sotto il println
        String nome = scanner.nextLine();

        // stampo un saluto al nome inserito prima
        System.out.println("Ciao " + nome);
    }
}