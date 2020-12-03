package test03;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		/*[]지금은 방이라고 부르지만 실제 명칭은 index(목차)라고 부름.
		*반복문을 사용해서 
		*0번 방 = 10
		*1번 방 = 20
		*2번 방 = 30
		*3번 방 = 40
		*4번 방 = 50
		*입력하는 코드를 만드세요
		*/
		
 	for(int i =0;i<nums.length;i++) {
	nums[i] = (i+1)*10;
 	}
	}

}



