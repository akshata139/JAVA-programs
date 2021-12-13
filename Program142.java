import java.util.*;

class ArrayDemo
{
	Scanner sobj = new Scanner(System.in);
	public int Arr[];

	public ArrayDemo(int iSize)
	{
		Arr = new int[iSize];
	}

	public void Accept()
	{
		int iCnt = 0;
		System.out.println("Enter elements :");
		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}

	public void Display()
	{
		int iCnt = 0;
		System.out.println("Enter elements are:");
		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}

class Practice extends ArrayDemo
{
	public Practice(int iValue)
	{
		super(iValue);
	}

	public int Add()
	{
		int iCnt = 0,iSum = 0;
		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			iSum = iSum + Arr[iCnt];
		}
		return iSum;
	}
}

class Program142
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int iLength = 0,iRet = 0;

		System.out.println("Enter number of elements :");
		iLength = sobj.nextInt();

		Practice pobj = new Practice(iLength);
		pobj.Accept();
		pobj.Display();
		iRet = pobj.Add();
		System.out.println("Addition is :"+iRet);
	}
}

//cd/desktop/package/
//javac ArrayX.java -d(Directory) .(Current directory)
//javac Program142.java -cp  "/users"