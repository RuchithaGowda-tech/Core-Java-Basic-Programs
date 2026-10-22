// Scenario: Online shopping
package Inheritance;
class Product
{
	int productId=1001;
	
	void showProduct() {
		System.out.println("ProductID:"+ productId);
	}
}
class ElectronicProduct extends Product {
	int warranty=2;
	
	void showWarranty() {
		System.out.println("Warranty:"+ warranty + " Years");	
	}	
}
class Smartphone extends ElectronicProduct {
	int ram=8;
	int storage=128;
	
	void showPhone() {
		System.out.println("Ram:"+ ram + " GB");
		System.out.println("Storage:"+ storage + " GB");
	}
}

public class MultilevelInheritace {

	public static void main(String[] args) {
		Smartphone phone = new Smartphone();
		System.out.println("=== SmartPhone Details ===");
		phone.showProduct();
		phone.showWarranty();
		phone.showPhone();
	}
}
