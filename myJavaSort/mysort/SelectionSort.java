package mysort.sort;

public class SelectionSort<T extends Comparable> extends Sort<T> { // 선택 정렬, 정렬 안된 부분에서 최대 값을 찾아서 정렬 안된 부분의 가장 오른쪽 혹은 왼쪽 데이터와 교환하는 알고리즘
	
	@Override
	public void sort(T[] dataList) { // 추상 부모 메서드 오버라이딩
		setData(dataList); 			   // 부모 메서드 호출
		for (int last = sortedData.length-1; last >= 1; last--) { // 맨 끝 지정, 데이터가 정렬이 완료될시 포인터를 하나씩 이동시킴
			int maxIndex = selectMax(sortedData, last);			  // 최대 값의 인덱스를 찾는 메서드 호출, 값은 변수에 저장하기
			if (maxIndex != last) 				  				  // 최대 값이 있는 위치가 맨 끝이 아닐경우
				swap(sortedData, maxIndex, last); 				  // 최대 값 인덱스와 맨 끝 인덱스를 메서드 매개변수로 지정해놓고 자리 변경
		}
	}
	
	int selectMax(T[] dataList, int last) { // 최대 값의 인덱스를 찾아 반환하는 메서드
		T max = dataList[0]; 				  // 최대 값을 넣을 변수
		int maxIndex = 0; 					  // 최대 값의 인덱스를 저장할 변수
		
		for (int i = 1 ; i <= last; i++) {    // 첫 번째 부분부터 배열의 맨 끝 부분까지 탐색
			// if (dataList[i] > max) {		  // i 번째에 있는 요소가 max에 저장되어 있는 값보다 크다면
			   if (dataList[i].compareTo(max) >= 1) { // 1보다 크거나 같으면
				max = dataList[i]; 			  // 요소(최대 값)의 값을 넣기
				maxIndex = i; 				  // 요소의 인덱스 값 저장하기
			}
		}
		return maxIndex; 					  // 이후 제일 큰 값의 인덱스를 반환
	}

	
}
