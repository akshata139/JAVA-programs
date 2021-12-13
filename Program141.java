import java.util.*;
import MarvellousNumbers.ArrayX;

class Marvellous extends ArrayX
{
	public Marvellous(int iValue)
	{
		super(iValue);
	}

	public float Avrage()
	{
		int iSum = 0,iCnt = 0;
		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			iSum = iSum + Arr[iCnt];
		}
		return (iSum / Arr.length);
	}
}

class Program141
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0;
		float fRet = 0;

		System.out.println("Enter the number of elements :");
		iLength = sobj.nextInt();

		Marvellous mobj = new Marvellous(iLength);
		mobj.Accept();
		mobj.Display();
		fRet = mobj.Avrage();
		System.out.println("Avrage is :"+fRet);
	}
}