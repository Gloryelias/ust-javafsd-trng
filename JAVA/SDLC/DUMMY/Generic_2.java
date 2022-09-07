package week2_Day3;

class Test<T> {

	T obj;
	Test(T obj){
		this.obj=obj;}
	public T getObject() {return this.obj;}
	
	}
class Generic_2
{
	public static void main(String args[]) {
		
		Test<Integer>iObj=new Test<Integer>(15);
		
		System.out.println(iObj.getObject());
		
		Test<String>sObj=new Test<String>("GreeksForGreeks");
		System.out.println(sObj.getObject());
		//iObj=sObj;     ERROR
	}
}
