package ch07.sec04.exam01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();
		
		computer computer = new computer();
		System.out.println("원 면적: " + computer.areaCircle(r));
	}

}
