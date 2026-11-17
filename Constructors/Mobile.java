package Constructor;
public class Mobile {
	int mobileid;
	String brand;
	String model;
	double price;
	//default constructor
	Mobile(){
		mobileid = 1001;
		brand = "Samsung";
		model = "Galaxy A35";
		price = 28000;
	}
	//Parameterized constructor
	Mobile(int mobileid , String brand , String model , int price){
		this.mobileid = mobileid;
		this.brand = brand;
		this.brand = model;
		this.price = price;
	}
	//copy constructor
	Mobile(Mobile M){
		this.mobileid = M.mobileid;
		this.brand = M.brand;
		this.model = M.model;
		this.price = M.price;
	}
	void display() {
		System.out.println("Mobile ID: "+mobileid);
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args) {
		System.out.println("==========Mobile Details=========");
		System.out.println("Mobile 1 ");
		System.out.println("_________________________________");
		Mobile m1 = new Mobile();
		m1.display();
		System.out.println("_________________________________");
		System.out.println();
		System.out.println("Mobile 2");
		System.out.println("__________________________________");
		Mobile m2 = new Mobile(102,"Oneplus","Nord CE 5",24999);
		m2.display();
		System.out.println("_________________________________");
		System.out.println();
		System.out.println("Mobile 3");
		System.out.println("__________________________________");
		Mobile m3 = new Mobile(m2);
		m3.display();
		System.out.println("_________________________________");
		System.out.println();
		System.out.println("After updating price of Mobile 3");
		System.out.println("_________________________________");
		System.out.println();
		System.out.println("Mobile 2");
		System.out.println("___________________________________");
		m2.display();
		System.out.println("_________________________________");
		m3.price = 23000;
		System.out.println();
		System.out.println("Mobile 3");
		System.out.println("___________________________________");
		m3.display();
		System.out.println("_________________________________");
	}
}
