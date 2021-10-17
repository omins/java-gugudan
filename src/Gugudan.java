
public class Gugudan {
			//연산 메소드 
	public static int[] calculate(int times, int number){
				int[] result = new int[number];
				for(int i = 0; i < result.length; i++) {
					result[i] = times * (i + 1);
				}
				return result;
			}
			
			
			//출력 메소드 
			public static void print(int[] result) {
				for (int i = 0;i < result.length; i++) {
					System.out.println(result[i]);
				}
			}
}
