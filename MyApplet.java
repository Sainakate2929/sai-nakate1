import java.awt.*;
import java.applet.Applet;


public class MyApplet extends Applet
{
	public void init()
	{
		Button btn1=new Button("Submit");
		Checkbox ch1=new Checkbox("Pizza");
		Checkbox ch2=new Checkbox("Burger");
		add(btn1);
		add(ch1);
		add(ch2);
	}
}
	
