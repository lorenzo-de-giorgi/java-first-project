// accetta un solo metodo s ene metto due da un errore
@FunctionalInterface
interface A{
    void show(int i);
}

public class Main {
    public static void main(String a[]){
        A obj = (int i) -> System.out.println("in show" + i);
        obj.show(5);
    }
}