class MyThread1 extends Thread
{
	public void run()
	{
		int count=1;
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread 1:"+count);
			count++;
            if(count==10){
              System.out.println("Thread 1:"+count+"win");
              System.exit(0);
            }
			try
			{
				Thread.sleep(500);

			}
			catch(Exception ex)
			{
			}
		}
	}
	
}
class MyThread2 extends Thread
{
	public void run()
	{int count=1;
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread 2:"+count);
			count++;
            if(count==10){
                System.out.println("Thread 1:"+count+"win");
                System.exit(0);
            }

			try
			{
				Thread.sleep(500);
			}
			catch(Exception ex)
			{
			}
		}
	}
	
}

    class Demo 
    {
        public static void main(String ...s)
        {
            MyThread1 t1=new MyThread1();
            MyThread2 t2=new MyThread2();
            t1.start();
            t2.start();
                              
        }
    }   

