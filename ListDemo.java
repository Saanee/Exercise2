package secondLesson.sanaz;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<>();
		String fruit1 = "pear", fruit2 = "banana", fruit3 = "tangerine", fruit4 = "strawberry", fruit5 = "blackberry";
		myList.add(fruit1);
		myList.add(fruit2);
		myList.add(fruit3);
		myList.add(fruit4);
		myList.add(fruit5);
		
		// Display elements in the order of insertion using iterator
		System.out.println("myList now contains:");
		Iterator<String> iterator = myList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// Display elements in reverse order using iterator
		System.out.println("myList elemnts in reverse order:");
		ListIterator<String> listIterator = myList.listIterator(myList.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		myList.add(3, "banana");
		System.out.println(myList);
	}

}
