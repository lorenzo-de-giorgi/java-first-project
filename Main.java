public class Main {
    public static void main(String[] a){
        
        // stampo un Hello Word!
        System.out.println("Hello Word!");

        // creo una funzione per verificare che il numero sia pari

        // definisco num come inter che in qunesto caso è 10
        int num = 10;

        // controllo che il resto della divisione per 2 sia uguale a 0 in caso positivo il numero è pari
        if (num % 2 == 0) {
            System.out.println("Il numero: " + num + " è paro!");
        } else {
            System.out.println("Il numero: " + num + " è disparo!");
        }
    }
}