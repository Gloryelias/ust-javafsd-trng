package Week4Day2;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> gamesList=new ArrayList<String>();
      gamesList.add("Fattball");
      gamesList.add("Cricket");
      gamesList.add("Chess");
      gamesList.add("Hockey");
      System.out.println("--------Iteratingby lambda Expression----");
      gamesList.forEach(games->System.out.println(games));
	}

}
