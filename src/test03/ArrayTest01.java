package test03;

public class ArrayTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
	//	nums[9] = 1; /이거는 없는 방번호를 집어넣어서 이 코드가 있으면 error가 난다.
		
	//	for(int i =0; i<3;i++) {
	//		System.out.println(nums [i]);
			//이 코드에 단점이 있는데 뭘까?
			/* 방 개수는 여러가지 경우의 수에 의해서 바뀔 수 있다. 근데 new int [5]로 바꾸고 싶으면 밑에 for문도 i<5로 바꿔야함.
			 * 그래서 쓸 수 있는 방법이 i<nums.length로 사용함. 이런게 잘 짠 프로그램
			 */
	for(int i =0; i<nums.length;i++) {
		System.out.println(nums [i]);
			//이렇게 하면 다 출력됨.
			
			//2차원, 3,4차원 배열도 있음/하기 나름 ex. int[][][] nums= new int[][][];
			
		}
	}

}
