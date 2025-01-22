class Person{
    String name;

    Person(String n){
        this.name=n;
    }

    public void DisplayName(){
        System.out.println("Name Given is: "+ name);
    }
}

public class ParamConstructor{
    public static void main(String[] args){
        Person p1 = new Person("Abu");
        p1.DisplayName();
    }
}