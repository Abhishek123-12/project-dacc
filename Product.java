package localClass;


//anonymous class --> method local class without name 
//its object is created when class is created 
public class Product {

	
	void addProduct()
	{
		//here we are creating anonymous class that is local class which donot have name 
		//here a class will be created that is inheriting Inventory and
		//overriding its abstract method 
		 
		
		Inventory p = new Inventory()
		{
		 
			public void addInventory() {
				 
				System.out.println(" add inventory method in local class ");
			}
		};
		p.addInventory();
	}
	
	
	
	public static void main(String[] args) {
		Product m= new Product();
		m.addProduct();

	}

}
