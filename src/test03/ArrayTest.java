package test03;

public class ArrayTest {
	public static void main(String[] ars) {
		//Array(배열): 차례나 순서에 따라 저장하는 거
	//nt[] nums = new int[3]; //배열의 장점: 양말을 한번에 넣을 수 있다는 점이 있다. /단점: 반드시 방 개수를 정해줘야한다. 양말통에 양말만 넣을 수 있다. 그래서 속옷은 못 넣음
	//new int [3]에 숫자 3개를 저장할 수 있음. **방번호는 항상 0부터 시작
		
		//int [] ages = new int[21]; 이건 방이 21개 0부터 시작해서 20까지
		//ages[0] = 22;
		//ages [1] = 23;
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
	// System.out.println(nums); //이렇게 하면 "[I@15db9742"나옴
		System.out.println(nums[0]); 
		System.out.println(nums[1]); 
		System.out.println(nums[2]); 
	
	//	System.out.println(nums[3]); //이건 에러
	//	System.out.println(new int[3]); // "[I@15db9742"이래 나온다...?
		
		
		//0부터 방 개수 전까지 for문을 돌리면 
		
		
	}
}
