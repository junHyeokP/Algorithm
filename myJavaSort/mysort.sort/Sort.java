package mysort.sort;

import java.util.Arrays;

public abstract class Sort { // 기본 정렬
	int[] orgData;			 // 원본 데이터
	int[] sortedData;		 // 정렬된 데이터
	
	public abstract void sort(int[] dataList); // 추상 메서드, 매개변수 명시만 해두기
	
	void swap(int[] dataList, int a, int b) { // 임시 변수를 생성하여 데이터 위치를 바꿔주는 메서드
		if (a == b) return; // 매개변수로 가져온 a와 b가 동일할시 바로 빠져나오기
		int temp;
		temp = dataList[a];
		dataList[a] = dataList[b];
		dataList[b] = temp;
	}
	
	public void setData(int[] dataList) { // 데이터 설정자, 추상 메서드에서 정렬한 데이터를 가져와서 필드 변수에 저장
		this.orgData = dataList;
		this.sortedData = dataList.clone(); // Arrays 메서드 호출
	}
	
	public String getOrgData() { // 원본 데이터 배열 접근자, Arrays에서 가져온 메서드로 원본 데이터 배열을 반환해주는 역할의 메서드
		return Arrays.toString(orgData); 
	}
	
	public String getSortedData() { // 위와 동일하지만 여기선 정렬된 데이터를 반환
		return Arrays.toString(sortedData);
	}

}
