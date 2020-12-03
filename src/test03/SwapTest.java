
package test03;

public class SwapTest {
	public static void main(String[] args) {
		//swap (값을) 바꾸다
		
		int num1 = 2;
		int num2 = 3;
		int tmp = num1;
		
		num1 = num2;
		num2 = tmp;    // 이렇게 해서 결과를 2,3에서 3,2로 바꾸는 것을 swap이라고 한다. 
		
		System.out.println(num1 + "," + num2);
		
	}
}


/////System.out.println(num1=(num1*0)+num2); ㅋㅋㅋ요건 아니고... 저 위에거가 잘 짜인 코드라는거지..!! 격식있는 코드를 짜자고... ㅠㅠ사람들 똑똑하다... ㅜㅠㅠㅠㅠㅠㅠ
