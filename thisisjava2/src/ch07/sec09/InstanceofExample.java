package ch07.sec09;

public class InstanceofExample {
//	 main () 메소드 에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
//		persen이 참조하는 객체가 Student 타입인지 확인
		
		/*if(person instanceOf Student){
		 * Student 객체일 경우 강제 타입변환
		 * Student student = (Student) person;
		 * Student 객체만 가지고 있는 필드 및 메소드 사용
		 * System.out.println("studentNo: + student.studentNo);
		 * student.study();
		 * }
		 */
		
//		person이 잠조하는 객체가 student 타입일 경우
//		student 변수에 대입 (타입 변환 발생)
		 if(person instanceof Student student) {
	         System.out.println("StudentNo: " + student.studentNo);
	         student.study();
	      }
	}

	public static void main(String[] args) {
//		person 객체를 매게값으로 제공하고 personInfo()메소드 호출
		Person p1 = new Person("홍길돌");
		personInfo(p1);
		
		System.out.println();
		
//		Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p2 = new Student("김길도", 10);
		personInfo(p2);
	}
}
