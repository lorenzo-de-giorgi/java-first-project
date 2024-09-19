// accedere a dati di tipo private
class Human{
    private int age;
    private String name;

    // default constructor
    public Human(){
        age = 12;
        name = "John";
    }

    // parameterized constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void seAge(int age){
        this.age = age;
    }
}

public class Main {
    public static void main(String a[]){
        // default
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
        // parameterized
        Human obj1 = new Human(18, "Lorenzo");
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}