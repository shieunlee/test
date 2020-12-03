package test03;

public class SortTest {
	

	public static void main(String[] args) {
	// sort : 정렬, 정렬은 왜할까? 보기 좋으려고, 데이터 잘 찾으려고, 있어보이려고?
		
		//데이터라 함은 어디서나 정렬이 가능하게 가공 (내림차순, 오름차순, 인기순, 낮은 가격순 게시물 올릴때 최근 날짜 가 위로가게 등등등등)
		
		// 순서가 바껴야하니까 결국 swap이 일어나야함.
		
		int[] ages = new int[3];
		ages[0] = 10;
		ages[1] = 5;
		ages[2] = 22;
	//내림차순
		int tmp = ages[0];
		ages[0] = ages[2];
		//22.5.22
		ages[2] = tmp;
		//22.5.10
		tmp = ages[1];
		ages[1] = ages[2];
		ages[2] = tmp;
		//22.10.5
		
		
		for(int i = 0; i<ages.length; i++) {
			System.out.println(ages[i]);
			
			//ascending 오름차순
			//
			//1
			//10
			//100
			
			//descending 내림차순
			//
			//100
			//10
			//1
			
			
			
			
		}
		
		
	}
}
