import java.util.*;																																								

public class Main
{
	public static void main(String[] args) throws InterruptedException{
		
		String wait_anim = ".........";
		int cont = 0;
		
		for(int i = 0; i < wait_anim.length(); i++){
			cont = cont++;
			//String s =String.valueOf(wait_anim.charAt(i));
			System.out.print(wait_anim.charAt(i));
			Thread.sleep(new Random().nextInt(600));
		}
		
		System.out.println("\nThread em main: Começando");
		Thread.sleep(2500);
		System.out.println("Thread em main: Finalizado");
		
		MyThread myThread = new MyThread("\n\n Hello Word!!");
		MyThread mThread = new MyThread("\n\nThread 2", 1600);
		
	}
}
