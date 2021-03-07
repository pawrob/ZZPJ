package pl.java.zzpj;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    String name;
    String surname;

    public Person(String name,String surname){
        this.name = name;
        this.surname = surname;

    }



}