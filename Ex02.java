package week6day3;
class Trailblazer extends Thread{
	@Override
	public void run() {
		for(int i=1; i<101; i++) {
			System.out.println("Trail" + i);
			System.out.println("blazer" + i);
			
		}
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Trailblazer t = new Trailblazer();
		t.start();
		for(int i=1; i<101; i++) {
			System.out.println("Trailblazer" + i);
		}
		
}
}
