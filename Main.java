class Student{
    int rollno;
    String name;
    int marks;
}

public class Main {
    public static void main(String a[]){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Lorenzo";
        s1.marks = 10;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Matteo";
        s2.marks = 9;

        Student students[] = new Student[2];
        students[0] = s1;
        students[1] = s2;
    }
}