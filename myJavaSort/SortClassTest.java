package mysort;

import mysort.sort.BubbleSort; // sort 패키지에서 배열 정리 알고리즘을 구현한 자바 파일들을 불러옴, 버블 정렬
import mysort.sort.InsertionSort; // 삽입 정렬
import mysort.sort.MergeSort; // 병합 정렬
import mysort.sort.QuickSort; // 빠른 정렬
import mysort.sort.SelectionSort; // 선택 정렬
import mysort.sort.Sort; // sort 패키지의 Sort를 불러옴 (일반 정렬)

public class SortClassTest { // 각각 구현한 배열 정리를 시험해보는 메인 클래스.

	public static void main(String[] args) { 
		//Integer[] dataList = {5, 21, 14, 3, 31, 8, 27, 15}; // 정렬 알고리즘을 동작시키기 위해 임의로 만든 배열 데이터들
		String[] dataList = {"abc", "z", "world", "hello"}; // 배열에 넣을 데이터들,타입을 문자열형으로 지정했으니 제네릭 타입을 <String>으로 지정한거나 다름없다
		sortData(dataList); // 데이터 정렬
	}
	
	// <데이터 타입>으로만 제한하도록 명시된 제네릭 타입 배열 사용
	static <T> void sortData(T[] dataList) { // 접근 제한자 옆, 리턴타입을 정의하기 전에 <T> (Type) 제네릭 메소드 명시,
											 // T 제네릭 타입의 배열 dataList룰 메소드의 매개 변수로 불러오기  
		
		Sort sort; // Sort를 참조하는 인스턴스 sort 초기화
		
		// 배열을 정렬할 알고리즘들이다 (한개씩만 구동 가능)
		// sort = new SelectionSort(); SelectionSort 객체를 참조하여 sort 메서드로 정렬 실행
		// sort = new InsertionSort();
		// sort = new BubbleSort();
		 sort = new MergeSort(); // MergeSort 인스턴스를 참조, 결과 값을 sort에 저장
		 //sort = new QuickSort();
		sort.sort(dataList); // T타입 배열을 매개변수로 지정하고, sort 인스턴스로 Sort 클래스의 sort메서드를 호출
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData()); // 정렬 결과를 printf로 표시, 포멧으로 결과값 조정 후 출력, sort에서 정렬되기 전의 배열을 가지고 있는 메서드 호출
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData()); // 위와 같게 포멧 지정 뒤 정렬 방법과 정렬된 데이터 출력
		System.out.println();
	}
}
