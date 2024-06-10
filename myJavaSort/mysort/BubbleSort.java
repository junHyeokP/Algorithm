package mysort.sort;
						
public class BubbleSort<T extends Comparable> extends Sort<T> { // 정렬된 데이터를 제외한 배열의 끝에 있는 부분부터 배열의 두 요소들을 비교하여 정렬하는 알고리즘

	@Override
	public void sort(T[] dataList) { // 추상 부모 메서드 오버라이드
		setData(dataList); // 부모 메서드 호출
		for (int last = sortedData.length - 1; last >= 1; last--) { // 배열의 마지막 부분부터 첫번째 요소가 있는 자리까지 탐색, 밑에 for문이 끝나면 last에 있는 데이터는 "정렬된 데이터"이므로, 포인터 위치를 앞으로 이동시킴
			for (int i = 0; i <= last - 1; i++) {    // 첫번째 부터 시작하여 먼저 탐색중인 last - 1보다 높거나 값이 같아질 때 까지 탐색 
				if (sortedData[i].compareTo(sortedData[i+1]) >= 1) // 비교한 두 요소, 앞에 있는 요소가 뒤에 있는 요소보다 클 경우 자리 변경
					swap(sortedData, i, i+1); 	     // 자리를 변경해주는 역할인 부모 메서드 호출
			}
		}
	}
}
