package secondLesson.sanaz;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> mySet = new HashSet<>();
		String fruit1 = "pear", fruit2 = "banana", fruit3 = "tangerine", fruit4 = "strawberry", fruit5 = "blackberry";
		mySet.add(fruit1);
		mySet.add(fruit2);
		mySet.add(fruit3);
		mySet.add(fruit4);
		mySet.add(fruit5);
		System.out.println("mySet now contains:");
		System.out.println(mySet);
		// print cardinality for mySet
		System.out.println("The number of elements in mySet is " + mySet.size());
		// remove elements from mySey
		mySet.remove(fruit4);
		mySet.remove(fruit5);
		System.out.println("mySet now contains:");
		System.out.println(mySet);
		mySet.removeAll(mySet);
		if( mySet.isEmpty()){
		System.out.println("mySet is now empty");
		}

	}

}
