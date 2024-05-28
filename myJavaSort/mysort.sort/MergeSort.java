package mysort.sort;

public class MergeSort extends Sort { // 병합 정렬 : 데이터를 계속 반씩 나누어서 소규모로 정렬,분할될 데이터를 병합하면서 정렬하며 나중엔 하나로 정렬되는 알고리즘

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		mergeSort(sortedData, 0, sortedData.length-1);
	}
	
	void mergeSort(int[] dataList, int start, int end) { // 재귀 알고리즘, 자기 자신을 부르는데 결과는 스택에 저장해놓는다
		// 베이스 컨디션 : 시작이 끝보다 크거나 같을 때
		if (start >= end) return;
		// Divide and Qonquer
		int mid = (start + end) / 2; 	  // 배열의 중앙을 구하는 식
		mergeSort(dataList, start, mid);  // 오른쪽으로 끝까지 반씩 분할,base condition과 조건이 맞을때 return(계산 이전 값을 반환)을 만나 종료 후 다음 메서드로 이동
		mergeSort(dataList, mid+1, end);  // 왼쪽으로 끝까지 반씩 분할, return으로 종료 후 다음 메서드로 이동
		merge(dataList, start, mid, end); // 잘랐던 오른쪽 배열과 왼쪽 배열 합치기
	}
	
	void merge(int[] dataList, int start, int mid, int end) {
		int[] tempList = new int[end-start + 1]; // 끝과 중간인덱스 값을 빼고 1을 더한 만큼의 크기로 보조 배열 생성
		int i = start, j = mid + 1, k = 0; 	     // 배열의 시작점과 중간점 + 1, k 생성
		while (i <= mid && j <= end) { 			 // i가 중간 인덱스값보다 적고 j가 배열 마지막 인덱스값보다 적을동안
			if (dataList[i] <= dataList[j]) 	 // i번째 데이터가 j번째 데이터보다 적거나 같을시
				tempList[k++] = dataList[i++];   // k번째 보조 배열에 i번째 배열에 담긴 데이터값을 넣기, 이후 k와 i 증감연산
			else
				tempList[k++] = dataList[j++]; 	 // 아니면 보조 배열에 j번째 값을 넣기, k와 j 증감연산
		}
		
		while (i <= mid) tempList[k++] = dataList[i++]; // 이후 i가 중간인덱스 값보다 적거나 같을동안 보조 배열에 데이터를 넣으며 k와 i증감연산 
		while (j <= end) tempList[k++] = dataList[j++]; // j가 맨끝의 인덱스값보다 적거나 같을동안 보조 배열에 데이터를 넣으며 k와 j 증감연산
		
		for (i = start, k = 0; k < tempList.length; i++, k++) // 배열의 시작점, k값은 0으로 지정해놓고 k가 임시 배열의 크기에 도달할때까지 i와 같이 증감연산
			dataList[i] = tempList[k];						  // 원본 배열 i번째에 임시 배열 k번째에 있는 값을 넣기
		//System.arraycopy(dataList, start, tempList, 0, end-start+1); 
	}

}
