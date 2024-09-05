// user input from terminal

import java.util.Scanner;

public class Main {
    public static void main(String[] a){
        Scanner scanner = new Scanner(System.in);

        // stampo in console la richeista del nome
        System.out.println("Inserisci il tuo nome: ");
        // in questo modo scannerizzo la riga sotto il println
        String nome = scanner.nextLine();

        // stampo in console la richeista del cognome
        System.out.println("Inserisci il tuo cognome: ");
        // in questo modo scannerizzo la riga sotto il println
        String cognome = scanner.nextLine();

        // stampo in console la richeista dell'età
        System.out.println("Inserisci la tua età: ");
        // in questo modo scannerizzo la riga sotto il println
        int eta = scanner.nextInt();
        scanner.nextLine();

        // stampo in console la richeista della città
        System.out.println("Inserisci la città dove vivi: ");
        // in questo modo scannerizzo la riga sotto il println
        String citta = scanner.nextLine();

        // stampo un saluto al nome inserito prima
        System.out.println("Ciao " + nome + " " + cognome + " " + "Hai: " + eta + " anni " + "Vivi: " + citta);
    }
}