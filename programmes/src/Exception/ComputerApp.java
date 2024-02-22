package Exception;

public class ComputerApp {
	public static void main(String[]args) {
		Thread t=Thread.currentThread();
		t.setName("os-thread");
		System.out.println(t.getName()+"is starting");
		ChromeThread ct=new ChromeThread();
		EclipseThread et=new EclipseThread();
		ct.setName("chrome-thread is running");
		et.setName("eclipse-thread is running");
		ct.start();
		et.start();
		try
		{
			ct.join();
			et.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
class ChromeThread extends Thread{
	public void run() {
		String tName=Thread.currentThread().getName();
		System.out.println(tName+"is starting running");
		for(int i=1;i<=5;i++) {
			System.out.println(tName+"is running");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class EclipseThread extends Thread{
	public void run() {
		String tName=Thread.currentThread().getName();
		System.out.println(tName+"is starting running");
		for(int i=1;i<=5;i++) {
			System.out.println(tName+"is running");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
				
		}
	}
}





