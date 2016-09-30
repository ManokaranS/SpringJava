package Servion.MavenProject;

public class CustomerClient {
public static void main(String[] args) {
	ShoeFactory factory=new BSF();
	ShoeShop seller=new RamuShoeShop();
	seller.setFactory(factory);
	
	Customer customer=new Customer();
	customer.setName("rani");
	System.out.println(seller.SellShoe(customer));
		
	}
}
