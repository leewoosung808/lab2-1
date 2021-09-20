package fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fl = new ArrayList<Fruit>();
		fl.add(new Fruit(101,"Apple", 1000));
		fl.add(new Fruit(102,"Orange", 1500));
		fl.add(new Fruit(103,"Kiwi", 2000));
		fl.add(new Fruit(104,"Mango", 3000));
		fl.add(new Fruit(105,"Pear", 1700));
		fl.add(new Fruit(106,"Melon", 3700));
		fl.add(new Fruit(107,"Grape", 2500));
		fl.add(new Fruit(108,"Tomato", 1000));
		fl.add(new Fruit(109,"Peach", 4000));
		fl.add(new Fruit(110,"Banana", 3000));
		
		Collections.sort(fl, new FruitComparator());
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for(int i=0; i<fl.size();i++) {
			System.out.println(fl.get(i).toString());
		}
		
	}

}
