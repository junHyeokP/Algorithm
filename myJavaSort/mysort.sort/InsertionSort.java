package mysort.sort;

public class InsertionSort extends Sort { // 삽입 정렬 : 필요한 데이터를 타겟으로 지정한 장소에 집어넣어 정렬하는 알고리즘 

	@Override
	public void sort(int[] dataList) {
		setData(dataList); //부모 메서드 호출
		
		for (int i = 1; i < sortedData.length; i++) { // 정렬한 데이터의 길이만큼 for문 실행
			int loc = findLessFromLast(sortedData, sortedData[i], i-1); //i번째 해당 데이터 요소를 넣고 삽입될 위치를 탐색해줄 메소드 호출 (맨 끝보다 작은 위치 탐색)
			if (loc != i-1) // 구했던 위치의 값이 i번째 값에 -1보다 적을경우
				insertData(sortedData, loc+1, i); // 위치에 데이터를 넣는 메서드 호출
		}

	}

	private void insertData(int[] dataList, int target, int source) {
		int temp = dataList[source]; 			// 타겟쪽으로 옮길 데이터값을 저장할 임시 공간 생성
		for (int i = source; i > target; i--) { // i를 source값으로 하고, i가 타겟값에 도달할때까지 -증감연산 
			dataList[i] = dataList[i-1]; 		// i - 1 번째 배열의 값을 i번째에 넣기
		}
		dataList[target] = temp; 				// 타겟쪽으로 데이터를 삽입하기 
	}

	private int findLessFromLast(int[] dataList, int data, int last) { 
		for (int i = last; i >= 0; i--) { 		// 맨끝부터 탐색
			if (dataList[i] <= data) return i;  // i번째 요소가 윗쪽에서 매개변수로 가져온 데이터보다 작거나 같다면 위치로 i 반환
		}
		return -1; // 아니면은 -1 반환
	}
	
	 

}
