package mysort;

import mysort.sort.BubbleSort;
import mysort.sort.InsertionSort;
import mysort.sort.MergeSort;
import mysort.sort.QuickSort;
import mysort.sort.Sort;

public class SortClassTest {

	public static void main(String[] args) {
		int[] dataList = {5, 21, 14, 3, 31, 8, 27, 15}; // 정렬 알고리즘을 동작시키기 위해 임의로 만든 배열 데이터들
		sortData(dataList); // 데이터 정렬
	}
	
	static void sortData(int[] dataList) {
		Sort sort;
		
		// sort = new SelectionSort();
		// sort = new InsertionSort();
		// sort = new BubbleSort();
		// sort = new MergeSort();
		 sort = new QuickSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
	}
}
