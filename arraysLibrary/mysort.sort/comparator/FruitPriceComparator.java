package comparator;

import java.util.Comparator;

public class FruitPriceComparator implements Comparator<Fruit> {

		@Override
		public int compare(Fruit fruit1, Fruit fruit2) {
			
			if (fruit1.price > fruit2.price) return 1;
			if (fruit1.price == fruit2.price) return 0;
			return -1;

			//return Integer.compare(fruit1.price, fruit2.price);
		}
}
