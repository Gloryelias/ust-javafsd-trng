package week2_Day3;

public class Generic_1 <T>{
	
	T t;
	public T get() {
		return t;
	}
	
	public void set(T t)
	{
		this.t=t;
		
	}
	
	public static void main(String args[]) {
		
		Generic_1<String> g=new Generic_1<>();
		g.set("Hi");
         System.out.println(g.get());
         
         Generic_1<Integer> gi=new Generic_1();
         gi.set(100);
         System.out.println(gi.get());
         
        }

}
