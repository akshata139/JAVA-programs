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

class DisplayCode extends StringX
{
	public void DisplaySep()
	{
		char Arr[] = str.toCharArray();
		char iCap,iSmall,iSym,iNum;
		int  i = 0;

		while(i < Arr.length)
		{
			if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
			{
				iCap = Arr[i];
				System.out.println(iCap);
			}
			
			else if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
			{
				iSmall = Arr[i];
				System.out.println(iSmall);
			}

			else if((Arr[i] >= '0') && (Arr[i] <= '9'))
			{
				iNum = Arr[i];
				System.out.println(iNum);
			}

			else
			{
				iSym = Arr[i];
				System.out.println(iSym);
			}

			i++;
		}
	}
}

class Program210
{
	public static void main(String args[])
	{
		DisplayCode dobj = new DisplayCode();

		dobj.Accept();
		dobj.Display();

		System.out.println("Capital letters : \t  Small letters : \t  Numbers : \t Symbols : ");
		dobj.DisplaySep();
	}
}