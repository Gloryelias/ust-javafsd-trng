package WEEKDAY4;

import java.util.ArrayList;
import java.util.List;

class Product1{
	int id;
	String name;
	float price;
	public Product1(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Stream_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product1> productsList=new ArrayList<Product1>();
		

		productsList.add(new Product1(1,"HP Laptop",25000f));
		productsList.add(new Product1(2,"Dell Laptop",30000f));
		productsList.add(new Product1(3,"Sony Laptop",28000f));
		float totalPrice=productsList.stream().map(product->product.price).reduce(0.0f,(sum,price)->sum+price);
		
		System.out.println(totalPrice);
		float totalPrice2=productsList.stream().map(product->product.price).reduce(0.0f, Float::sum);
		//List<Float>productPriceList2=productsList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
	     System.out.println(totalPrice2);
	}

}