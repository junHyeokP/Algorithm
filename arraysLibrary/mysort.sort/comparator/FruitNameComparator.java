package comparator;

import java.util.Comparator;

public class FruitNameComparator implements Comparator <Fruit> {

	@Override
	public int compare(Fruit fruit1, Fruit fruit2) {
		return fruit1.name.compareTo(fruit2.name);
	}

}
