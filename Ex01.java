package week6day3;

public class Ex01 {

	public static void main(String[] args) {
		
		/*for(int i=1; i<=100; i++) {
			System.out.println(i+ "�ȳ�");
		}
		
		for(int i=1; i<=100; i++) {
			System.out.println(i + "���� �ȳ�");
		}*/
		
//		Thread t = new Thread(new Runnable() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<=100;i++) {
					System.out.println(i+ "�ȳ�");
				}
			
				
				
			} //Runnable �������̽� ��ӹ޾Ƽ� �͸����� Ŭ������ �����ϴ� �ڵ�
			
		}).start();;
//		t.start(); //������ ����
		
		for(int i=1; i<=100; i++) {
			System.out.println(i+"���� �ȳ�");
		}

	}

}
