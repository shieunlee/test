package test03;

public class ArrayTest4 {

	public static void main(String[] args) {
		System.out.println(1);
		boolean[] bls = new boolean[5];
		bls[0] = true;
		bls[1] = false;
		bls[2] = true;
		bls[3] = false;
		bls[4] = true;

		//출력하는거 아니고 코드 만들기
//		for (int i = 0; i < bls.length; i++) {
//			if (i % 2 == 0) {
//				bls[i] = true;
//			} else {
//				bls[i] = false;
//				
//			}

//		}
		
		//더 간단하게
		//입력하는 포문
		for(int i = 0; i< bls.length; i++) {
			bls[i] = i % 2 == 0;
		}
		//출력하는 포문
		for(int i = 0; i<bls.length;i++) {
			System.out.println(bls[i]);
			
			//당분간은 입력하는 포문, 출력하는 포문
		}
	}
}
