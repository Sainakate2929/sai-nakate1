import java.awt.Frame;

class MyFrame1 extends Frame
{

	public MyFrame1()
	{

	}
	public static void main(String args[])
	{
		MyFrame1 fr1=new MyFrame1();
		fr1.setSize(400,400);
		fr1.setTitle("MyFrame");
		fr1.setVisible(true);
	}
}