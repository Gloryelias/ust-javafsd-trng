package week2_Day3;

public class GenericsMethod {
	
	public static<T>boolean isEqual(GenericsType<T>g1,Generics<T>g2){
		
		return g1.get().equal(g2.get());
	}
	
	public static void main(String args[]) {
		GenericsType<String>g1=newGenericsType<>();
		g1.set("Pankaj");
		
		GenericsType<String>g2=newGenericsType<>();
		g2.set("Pankaj");
		
		boolean isEqual=GenericsMethod.<String>isEqual(g1,g2);
		
		isEqual=Generics=GenericsMethods.isEqual(g1,g2);
		
	}

}
