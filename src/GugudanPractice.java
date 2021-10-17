import java.util.Scanner;

// 사용자의 입력 값에 따라 8*8 단,19*19 단 등을 출력하는 프로그램 
public class GugudanPractice {
	
	public static void main(String[] args) {
		System.out.println("몇몇단 까지 출력하시겠습니까? (8입력 시 8*8단 까지 출력): ");
		
		//사용자 입력 값 받기 
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		//사용자 입력 값 연산 및 출력 
		for(int i = 2; i < (number + 1); i++) { 		//입력 값 동안  
			int[] result = Gugudan.calculate(i, number); //입력 값 까지 곱해라
			Gugudan.print(result);	//출력 
		}
	}

}
