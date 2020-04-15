package threading;
import javax.swing.JFrame;

//Test in CMD prompt
class Mythread1 extends Thread
{
	public void run()
	{
		System.out.println("Wait........ Applications are closing");
		for(int i = 1 ; i < 5 ; i ++)
		{
			System.out.println("Application " + i + " is closed");
		}

		System.out.println("All apps are closed");
	}
}
class ShutDownTest
{
	public static void main(String args[])
	{
		Runtime r = Runtime.getRuntime();
		Mythread1 t = new Mythread1();
		r.addShutdownHook(t);
		JFrame jf = new JFrame("Shut down example");
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setSize(500, 500);
		jf.setVisible(true);
	}
}