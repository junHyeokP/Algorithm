package mysort.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSortTest {

	public static void main(String[] args) {
		sortInteger();
		sortString();
		
	}
		static void sortInteger() {
			Integer[] dataList = {40, 15, 34, 21, 66, 53};
			System.out.println("원본 : " + Arrays.toString(dataList));
			
			Arrays.sort(dataList);
			System.out.println("오름차순 : " + Arrays.toString(dataList));
			
			Arrays.sort(dataList, Comparator.reverseOrder());
			System.out.println("내림차순 : " + Arrays.toString(dataList));
		}

		static void sortString() {
			String[] dataList = {"d", "A", "C", "F", "a"};
			System.out.println("원본 : " + Arrays.toString(dataList));
			
			Arrays.sort(dataList);
			System.out.println("오름차순 : " + Arrays.toString(dataList));
			
			Arrays.sort(dataList, Comparator.reverseOrder());
			System.out.println("내림차순 : " + Arrays.toString(dataList));
			
			Arrays.sort(dataList, String.CASE_INSENSITIVE_ORDER);
			System.out.println("대소문자무시 : " + Arrays.toString(dataList));
			
			Arrays.sort(dataList, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
			System.out.println("대소문자무시 내림차순 : " + Arrays.toString(dataList));
			
		}
}


