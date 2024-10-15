enum Status{
    Running, Failed, Pending, Success;
}

public class Main {
    public static void main(String[] args){
        // stamapre tutti i satus insieme
        Status[] ss = Status.values();
        System.out.println(ss);

        for(Status s:ss){
            System.out.println(s);
            System.out.println(s+ " : "+s.ordinal());
        }
    }
}