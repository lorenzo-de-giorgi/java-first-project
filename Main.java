
class A {
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    @Override
    public void show(){
        System.out.println("in B show");
    }
}

public class Main {
    public static void main(String a[]){
        B obj = new B();
        obj.show();
    }
}