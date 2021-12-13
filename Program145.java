import java.util.*;

class StringX
{
	public String Str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String :");
		Str = sobj.nextLine();
	}

	public void Display()
	{
		System.out.println("String is :"+Str);
	}
}

class Program145
{
	public static void main(String arg[])
	{
		StringX sobj = new StringX();
		sobj.Accept();
		sobj.Display();
	}
}