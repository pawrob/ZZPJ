package pl.java.zzpj;

public class Main {

    public static void main( String[] args )
    {
        Person p = new Person("Jan", "Karabińczyk");
        System.out.print(p);
        p.setName("John");
        System.out.print(p);
    }
}
