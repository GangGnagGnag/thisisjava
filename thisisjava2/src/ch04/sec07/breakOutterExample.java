package ch04.sec07;

public class breakOutterExample {
	public static void main(String[] args) throws Exception {
		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++	) {
				System.out.println(upper + "-" + lower);
				if(lower =='g') {
					break Outter;
					
				}
				
			}
		}
		System.out.print("시스템 종료");
		
	}

}
