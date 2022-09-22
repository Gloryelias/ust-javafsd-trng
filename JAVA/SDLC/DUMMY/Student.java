package WEEKDAY4;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student1
{
	int id;
	String name;
	int age;
	public Student1(int id,String name,int age) {
		
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student1> studentlist=new ArrayList<Student1>();
		studentlist.add(new Student1(22,"steve",18));
		studentlist.add(new Student1(33,"lucy",22));
		studentlist.add(new Student1(11,"Jon",22));
		studentlist.add(new Student1(44,"Sansa",23));
		
		List<String>names=studentlist.stream().map(n->n.name).collect(Collectors.toList());
		System.out.println(names);
		
		

	}

}
