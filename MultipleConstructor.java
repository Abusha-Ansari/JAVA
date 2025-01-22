class Person{
    String name;
    int age;

	Person(){
        	this.name="abusha";
    	}

	Person(String n){
        	this.name=n;
    	}

	Person(String n , int a){
        	this.name=n;
		this.age=a;
    	}

    public void DisplayName(){
        System.out.println("Name Given is: "+ name +" and the age is "+age);
    }
}

public class ConstructorOverloading{
    public static void main(String[] args){
        Person p1 = new Person("Abu" ,20);
        p1.DisplayName();
    }
}