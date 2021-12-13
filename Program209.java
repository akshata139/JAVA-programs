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

class CapCode extends StringX
{
	public int CapitalCount()
	{
		char Arr[] = str.toCharArray();
		int iCnt = 0,i = 0;

		while(i < Arr.length)
		{
			if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
			{ 
				iCnt++;
			}

			i++;
		}
		return iCnt;
	}
}

class Program209
{
	public static void main(String args[])
	{
		CapCode cobj = new CapCode();

		cobj.Accept();
		cobj.Display();

		int iRet = cobj.CapitalCount();

		System.out.println("count of capital letters in given string is : "+iRet);

	}
}