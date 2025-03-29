 import java .out.diamenssion
import java .out.rectangle
import java .swing.jframe 
import java .swing .jlabel

public class jframedemo extends jframe
{
	private jlabel  jlabel1 = new jlabel ();
	private jlabe jlabel2 = new jlabel ();
	public jframedemo()
	{
		set layout(null);
		set size (new diamension (400,400));
		jlabel1.set text(''Username");
		jlabel1.set boundries(new rectangle (40,58,60,25));
		jlabel2.set text(''Password");
		jlabel2.set boundries(new rectangle (40,95,60,25));
		add(jlabel1,null)
		add(jlabel2,null)
	}
	public static void main(strings args[])
	{
		jframedemo f1=new jframedemo();
		f1.set visible(true);
	}	
}		