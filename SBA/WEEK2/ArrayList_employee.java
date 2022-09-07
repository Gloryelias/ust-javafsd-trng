package week2_Day3;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayList_employee {

  public static void main(String args[])
  {
	
     ArrayList<Integer>emid=new ArrayList<>();
     ArrayList<String>ename=new ArrayList<>();
     
     emid.add(1);
     emid.add(2);
     emid.add(3); 
    emid.add(4);
    emid.add(5);
    emid.add(6);
    emid.add(7);
    emid.add(8);
    emid.add(9);
    emid.add(10);
    emid.add(11);
    emid.add(12);
    emid.add(13);
    emid.add(14);
    emid.add(15);
    emid.add(16);
    emid.add(10);
    emid.add(17); 
    emid.add(18);
    emid.add(19);
    emid.add(20);
    
    ename.add("Glory");
    ename.add("Elizabeth");
    ename.add("Elias");
    ename.add("Shyby");
    ename.add("Jyothy");
    ename.add("Maria");
    ename.add("Aiswarya");
    ename.add("Julit");
    ename.add("Layamma");
    ename.add("poulous");
    ename.add("Sindhu");
    ename.add("Varghese");
    ename.add("Meghana");
    ename.add("Laya");
    ename.add("Susan");
    ename.add("iza");
    ename.add("Christy");
    ename.add("akachi");
    ename.add("Chippy");
    ename.add("ambli");
    ename.add("vava");
    
  
    
    Iterator<Integer>iterator=emid.iterator();
    Iterator<String>itr=ename.iterator();
    
    while(iterator.hasNext())
    {
    	System.out.println("Employee" +iterator.next()+" "+itr.next());
    }
   
  }
}
   
    
     
     
  