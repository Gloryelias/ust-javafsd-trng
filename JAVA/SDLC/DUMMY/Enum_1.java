package Week3Day2;

//import jdk.internal.org.jline.terminal.Terminal.Signal;
enum signal
{
	Red(5),white(10),yellow(15);
	private int x;
	private signal(int x) {
		this.x=x;
	}
	
	
	int getIndex() 
	{
		return x;
	}
	
}

public class Enum_1 {
	//enum signal{Red,white,yellow}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       signal s=signal.Red;
       System.out.println("value of Red :"+signal.Red.getIndex());
       System.out.println("Position of Red: "+s.ordinal());
       System.out.println("Name: "+s.name());
       //System.out.println(s.valueOf("yellow"));
	}

}
