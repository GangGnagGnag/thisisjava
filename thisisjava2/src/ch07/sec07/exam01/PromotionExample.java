package ch07.sec07.exam01;

	class A {
	}
	
	class B extends A {
	}
	
	class C extends A {
	}
	
	class D extends B {
	}
	
	class E extends C {
	}
	
	public class PromotionExample {
		public static void main(String[] args) {
			B b = new B();
			C c = new C();
			D d = new D();
			E e = new E();
			
			A a1 = b;
			A a2 = c;
			A a3 = d;				// 자동 타입 변환(상속 관계에 있음)
			A a4 = e;
			
			B b1 = d;
			C c1 = e;				// 상속관계에 없기 때문에 에러가 남
			
			

			
//			B b3 = e;
//			C c2 = d;
		}

}
