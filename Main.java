// accedere a dati di tipo private
class Human{
    private int age;
    private String name;

    // default constructor
    public Human(){
        age = 12;
        name = "John";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // parameterized constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String a[]){
        // default
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
        // parameterized

    }
}