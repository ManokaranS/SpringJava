package Servion.MavenProject;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient {
	public static void main(String[] args) {
		try{
		ConfigurableApplicationContext ctx=new FileSystemXmlApplicationContext("config.xml");
		Seller shop=(Seller)ctx.getBean("advisedshop",Seller.class);
		SpringFramwork frame=new SpringFramwork();
		ShoeShop shop1=frame.getShop();
		Customer customer=new Customer();
		customer.setName("Manokaran");
		System.out.println(shop.SellShoe(customer)); 
		System.out.println(shop.SellShoe(customer)); 
	}catch(Exception e){
		
	}
	}
}