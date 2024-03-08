package ex01;

import ex01.AAA.Data;

class AAA{
	public void test() {
		System.out.println("AAA test");
	}
	static class Data{
		public Data(String str, int num) {
			System.out.println("Data 생성자 실행");
		}
		public void test() {
			System.out.println("Data test 호출");
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.test();
		Data d = new AAA.Data("aaaa", 100);
		d.test();
	}
}
