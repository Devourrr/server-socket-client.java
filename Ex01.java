package week6day3;

public class Ex01 {

	public static void main(String[] args) {
		
		/*for(int i=1; i<=100; i++) {
			System.out.println(i+ "안녕");
		}
		
		for(int i=1; i<=100; i++) {
			System.out.println(i + "나도 안녕");
		}*/
		
//		Thread t = new Thread(new Runnable() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<=100;i++) {
					System.out.println(i+ "안녕");
				}
			
				
				
			} //Runnable 인터페이스 상속받아서 익명으로 클래스를 정의하는 코드
			
		}).start();;
//		t.start(); //쓰레드 실행
		
		for(int i=1; i<=100; i++) {
			System.out.println(i+"나도 안녕");
		}

	}

}
