class Person{
    String name;

    Person(){
        this.name="Abusha";
    }

    public void DisplayName(){
        System.out.println("Name: "+ name);
    }
}

public class DefaultConstructor{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.DisplayName();
    }
}