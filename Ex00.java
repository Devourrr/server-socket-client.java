package week6day3;

public class Ex00 {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<5; i++) {
					
					for(int j=1; j<3; j++) {
						System.out.println("Trail");
					}
					for(int j=1; j<3; j++) {
						System.out.println("blazer");
					}
					for(int j=1; j<2; j++) {
						System.out.println("Trailblazer");
					}
				}
				
			}
			
		}).start();
			
		
		

	

}
}
