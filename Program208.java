import java.util.*; 

class ArrayX
{
	Scanner sobj = new Scanner(System.in);
	public int Arr[];

	public ArrayX(int iSize)
	{
		Arr = new int[iSize];
	}

	public void Accept()
	{
		int iCnt = 0;

		System.out.println("Enter elements : ");

		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}

	public void Display()
	{
		int iCnt = 0;

		System.out.println("Entered elements are : ");

		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}

class MaxCode extends ArrayX
{
	public MaxCode(int iValue)
	{
		super(iValue);
	}

	public int Maximum()
	{
		int iCnt = 0,iMax = Arr[iCnt];

		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			if(Arr[iCnt] > iMax)
			{
				iMax = Arr[iCnt];
			}
		}

		return iMax;
	}
}

class Program208
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int iLength = 0,iRet = 0;
		
		System.out.println("Enter the Length : ");
		iLength = sobj.nextInt();

		MaxCode mobj = new MaxCode(iLength);

		mobj.Accept();
		mobj.Display();

		iRet = mobj.Maximum();
		System.out.println("Maximum number is : "+iRet);
	}
}