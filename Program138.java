import java.util.*;

class Marvellous
{
	public int Addition(int Brr[])
	{
		int iCnt = 0,iSum = 0;

		for(iCnt = 0;iCnt < Brr.length;iCnt++)
		{
			iSum = iSum + Brr[iCnt];
		}

		return iSum;
	}
}

class Program138
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0,iCnt = 0,iRet = 0;

		System.out.println("Enter number of elements :");
		iSize = sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter elements :");
		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}

		Marvellous mobj = new Marvellous();
		iRet = mobj.Addition(Arr);

		System.out.println("Addition of array elements is:"+iRet);
	}
}