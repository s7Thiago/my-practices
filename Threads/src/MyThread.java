public class MyThread extends Thread{

	private String msg;

	public MyThread(String msg)
	{
		this.msg = msg;
		run();
	}
	
	public MyThread(String msg, int time) throws InterruptedException
	{
		this.msg = msg;
		Thread.sleep(time);
		run();
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public String getMsg()
	{
		return msg;
	}
	
	@Override
	public void run(){
		System.out.println(getMsg());
	}																			
}
