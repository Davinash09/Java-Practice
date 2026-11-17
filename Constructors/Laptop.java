package Constructor;

public class Laptop {
	String brand;
	String model;
	int price;
	Laptop(String brand , String model , int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	Laptop(Laptop l){
		this.brand = l.brand;
		this.model = l.model;
		this.price = l.price;
	}
	void display() {
		System.out.println("Brand : "+brand);
		System.out.println("model : "+model);
		System.out.println("price : "+price);
	}
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell","Inspiron 15",6000);
		Laptop l2 = new Laptop(l1);
		
		System.out.println("Laptop 1");
		System.out.println();
		l1.display();
		System.out.println();
		System.out.println("Laptop 2");
		System.out.println();
		l2.display();
	}
}
