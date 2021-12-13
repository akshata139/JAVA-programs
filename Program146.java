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

class Marvellous extends StringX
{
	public int CountVowels()
	{
		char Arr[] = Str.toCharArray();
		int iCnt = 0,i = 0;
		for(i = 0;i < Arr.length;i++)
		{
			if((Arr[i] == 'a') || (Arr[i] == 'e') || (Arr[i] == 'i') || (Arr[i] == 'o') || (Arr[i] == 'u') || (Arr[i] == 'A') || (Arr[i] == 'E') || (Arr[i] == 'I') || (Arr[i] == 'O') || (Arr[i] == 'U'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

class Program146
{
	public static void main(String arg[])
	{
		Marvellous mobj = new Marvellous();
		int iRet = 0;
		mobj.Accept();
		mobj.Display();

		iRet = mobj.CountVowels();
		System.out.println("Count is :"+iRet);
	}
}