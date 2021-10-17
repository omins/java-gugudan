import java.util.Scanner;

//사용자의 입력 값에 따라 8*7단, 9*9 단, 5*6 단 등을 출력하는 프로그램 
public class GugudanPracticeHard {
	
	

	public static void main(String[] args) {
		System.out.println("몇몇단을 출력하시겠습니까? (쉼표로 구분): ");
		
		//사용자 입력 값 받기 
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		//사용자 입력 값을 쉼표로 구분 
		String[] splitedValue = inputValue.split(",");
		
		//입력 값의 문자열을 정수로 반환 
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		//입력 값 연산 및 출력 
		for(int i = 2; i < (first + 1); i++) { //first 값의 단 동안  
			int[] result = Gugudan.calculate(i, second); //second 값 까지 곱해라 
			Gugudan.print(result); //출력 
		}
	}
	
}
