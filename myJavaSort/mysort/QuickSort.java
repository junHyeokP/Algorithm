package mysort.sort;

public class QuickSort<T extends Comparable> extends Sort<T> {

	@Override
	public void sort(T[] dataList) { 				   // 추상 부모 메서드 오버라이딩, <데이터 타입>으로만 제한하도록 명시된 제네릭 타입 배열 사용
		setData(dataList); 			                   //sort 부모 클래스에서 가져온 데이터리스트 가져오기, 부모 메서드를 호출
		quickSort(sortedData, 0, sortedData.length-1); // 빠른 정렬을 해주는 메서드 호출,인덱스 0번째부터 정렬된 데이터부터 인덱스 마지막번째의 숫자를 집어넣음  
	}
	
	void quickSort(T[] sortedData, int start, int end) { // 빠른 정렬, 정렬된 데이터와 시작점, 끝을 매개변수로 가져옴
		
		if (start >= end) return; 				   // 끝 지점이 시작보다 크거나 같을 경우 재귀 상태에서 빠져나옴
		int p = partition(sortedData, start, end); // 배열을 분할하는 메서드 호출 (Divide), 결과를 변수 p(pivot을 뜻하는 듯)에 저장
		
		quickSort(sortedData, start,  p-1); // 재귀 알고리즘, 이미 위에서 구했던 pivot에 -1을한 값을 끝자리로 정한채로 호출 (pivot보다 낮은 값들)
		quickSort(sortedData, p+1, end); 	// 위의 명령어를 실행하여 구한 pivot을 시작점으로 정해서 호출 (pivot보다 높은 값들)
	}
	
	int partition(T[] dataList, int start, int end) { // 파티션 (분할)
		T pivot = dataList[end]; 						// 배열의 끝부분 변수를 pivot으로 지정 (pivot은 빠른 정렬에서 "배열의 분할"에 공통적으로 사용되는 변수의 이름이다, 주로 배열에 있는 요소들 중 하나로 pivot의 위치를 정하지만, 여기선 배열의 끝을 지정하는 기법을 사용했다.) 
		int leftEnd = start - 1;						// 분열한 배열의 시작 = 배열의 시작 - 1
		for (int i = start; i <= end - 1; i++) { 		// for문, 변수 i로 배열의 시작부터 끝까지 탐색하도록 설정
			if (dataList[i].compareTo(pivot) == -1) { 	// i번째 인덱스의 데이터가 pivot보다 작을경우
				swap(dataList, ++leftEnd, i); 			// 배열 첫부분 증감연산후 스왑, 인덱스도 매개변수로 넣기
			}
		}
		swap(dataList, leftEnd + 1, end); // 이후 분열한 데이터 배열과 분열한 배열 시작점 + 1, 배열 끝 지점을 매개변수로 넣기 
		return leftEnd + 1;  			  // 배열의 왼쪽 끝(분열한 배열의 시작점)에 + 1 계산한채로 반환
	}

}
