// accetta un solo metodo s ene metto due da un errore
@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("in A show");
//     }
// }

public class Main {
    public static void main(String a[]){
        A obj = new A() {
            public void show(){
                System.out.println("in A show");
            }
        };

        obj.show();
    }
}