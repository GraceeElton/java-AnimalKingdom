package kingdom;

import java.util.*;

public class Main 
{

	// private static List<AbstractClass> filteredList = new ArrayList<>();

	public static void filterAnimals(List<AbstractClass> animals, CheckA tester, boolean printit)
	{
		// filteredList.clear();

		for (AbstractClass a: animals)
		{
			if (tester.test(a))
			{
				if(printit)
				{
					System.out.println(a.getName());
				}
				// filteredList.add(a);
			}
		}
	}


	public static void main(String[] args)
	{
		System.out.println("Is this thing on?");


		// create animal list - using an array list 

		List<AbstractClass> animalList = new ArrayList<>();

		// mammals
		animalList.add(new Mammal("Panda", 1869));
		animalList.add(new Mammal("Zebra", 1778));
		animalList.add(new Mammal("Koala", 1816));
		animalList.add(new Mammal("Sloth", 1804));
		animalList.add(new Mammal("Armadillo", 1758));
		animalList.add(new Mammal("Raccoon", 1758));
		animalList.add(new Mammal("Bigfoot", 2021));

		// birds 
		animalList.add(new Bird("Pigeon", 1837));
		animalList.add(new Bird("Peacock", 1821));
		animalList.add(new Bird("Toucan", 1758));
		animalList.add(new Bird("Parrot", 1824));
		animalList.add(new Bird("Swan", 1758));

		// fish
		animalList.add(new Fish("Salmon", 1758));
		animalList.add(new Fish("Catfish", 1817));
		animalList.add(new Fish("Perch", 1758));

		for (AbstractClass a : animalList)
		{
			System.out.println(a);
		}

		// see if we can even print the list

		 // List all the animals in descending order by year named
		System.out.println("\n *** List all the animals in descending order by year named");

		animalList.sort(Comparator.comparing( o -> o.getYear(), Comparator.reverseOrder()));
		for (AbstractClass a : animalList)
		{
			System.out.println(a);
		}


		System.out.println("\n ***  List all the animals alphabetically");
		animalList.sort(Comparator.comparing( o -> o.getYear(), Comparator.reverseOrder()));
		for (AbstractClass a : animalList)
		{
			System.out.println(a);
		}

		System.out.println("\n ***  List all the animals order by how they move");
		 animalList.sort(Comparator.comparing(o -> o.move()));
		for (AbstractClass a : animalList) {
            System.out.print(a);
		} 

		 System.out.println("\n *** List only those animals the breath with lungs");
		 filterAnimals(animalList, a -> a.breath().equals("Lungs"), true);
		 	
		 
		 System.out.println("\n *** List only those animals that breath with lungs and were named in 1758");
		 filterAnimals(animalList, a -> a.breath().equals("Lungs") && a.getYear() == 1758, true);
		 // 
		 System.out.println("\n *** List only those animals that lay eggs and breath with lungs");
		 filterAnimals(animalList, a -> a.breath().equals("Lungs") && a.birth().equals("Eggs"), true);


		 //
		 System.out.println("\n ***  List alphabetically only those animals that were named in 1758");
		 animalList.sort(Comparator.comparing( o -> o.getName()));
		 filterAnimals(animalList, a -> a.getYear() == 1758, true);


	}

	
	
	

}