package Week_Day2;

interface polygon {
	void getarea();
	
	default void getSides() {
		System.out.println("I can get sides of a polygon");
	}

}

class Rectangle implements polygon{
	public void getarea() {
		int length=6;
		int breadth=5;
		int area=length*breadth;
		System.out.println("Tje area of the rectangle is"+area);
		
	}
	
	public void getSides() {
		System.out.println("I have 4 sides.");
	}
}

class Interface_polygon{
	public static void main(String args[]){
		Rectangle r1=new Rectangle();
		r1.getarea();
		r1.getSides();
	}
	
	}

