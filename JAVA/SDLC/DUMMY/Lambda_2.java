package Week4Day2;

interface Drawable
{
	public void draw();
}
public class Lambda_2
{
	public static void main(String[] args) {
		int width=10;
		
		Drawable d2=()->{System.out.println("Drawing: "+width);
	};
	d2.draw();
	}

}
