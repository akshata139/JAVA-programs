import java.util.*;

class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter string : ");
		str = sobj.nextLine();

	}

	public void Display()
	{
		System.out.println("String is : "+str);
	}
}

class Marv extends StringX
{
	public String StrRevX()
	{
		char Arr[] = str.toCharArray();
		char temp;
		int iStart = 0,iEnd = Arr.length - 1;

		if(iStart < iEnd)
		{
			temp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = temp;

			iStart++;
			iEnd--;
		}

		return String.valueOf(Arr);
	}
}

class Program256
{
	public static void main(String arg[])
	{
		Marv obj = new Marv();
		obj.Accept();
		obj.Display();

		String s = obj.StrRevX();
		System.out.println("Reverse string is : "+s);
	}
}