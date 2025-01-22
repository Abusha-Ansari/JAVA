class Product{
	String productID;
	String name;
	int price;
	int quantity;

	Product(String i, String n, int p, int q){
		this.productID = i;
		this.name = n;
		this.price = p;
		this.quantity = q;
	}

	public void displayDetails(){
		System.out.println("Your final product list is: "+ productID +" "+ name +" "+ price +" "+ quantity);
	}
}

public class Catalog{
    public static void main(String[] args){
        Product m1 = new Product("10N11","Pan",1200,5);
        m1.displayDetails();
    }
}