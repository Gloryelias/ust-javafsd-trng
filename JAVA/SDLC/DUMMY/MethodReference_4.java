package Week4Day2;

public class MethodReference_4 {
	public void printlnMsg() {
		System.out.println("Hello,this is static method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2=new Thread(new MethodReference_4()::printlnMsg);
        t2.start();
	}

}
