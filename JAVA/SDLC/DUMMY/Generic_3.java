package week2_Day3;

public class Generic_3 {

	public static void main(String args[]) {
		
		GenericsClass<Integer>intObj=new GenericsClass<>(5);
		System.out.println("Generics Class return:"+intObj.getData());
		
		GenericsClass<String>StringObj=new GenericsClass<>("Java Programming");
		System.out.println("Generics Class return:"+StringObj.getData());
		
	}
}

class GenericsClass<T>{
	
	private T data;
	
	public GenericsClass(T data) {
		this.data=data;
		
	}
	public T getData() {
		return this.data;
	}
}
 
