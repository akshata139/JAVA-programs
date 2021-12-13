import java.util.*;

class BitWise
{
	public int BitToggleRange(int iNo,int iStart,int iEnd)
	{
		int iMask1 = 0xFFFFFFFF,iMask2 = 0xFFFFFFFF,iMask = 0,iResult = 0;

		iMask1 = iMask << (iStart - 1);
		iMask2 = iEnd >> (32 - iEnd);

		iMask = iMask1 & iMask2;

		iResult = iNo ^ iMask;

		return iResult;
	}
}

class Program205
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0,i = 0,j = 0,iRet = 0;

		System.out.println("Enter number : ");
		iValue = sobj.nextInt();

		System.out.println("Enter starting position : ");
		i = sobj.nextInt();

		System.out.println("Enter ending position : ");
		j = sobj.nextInt();

		BitWise bobj = new BitWise();

		iRet = bobj.BitToggleRange(iValue,i,j);

		System.out.println("Updated value is : "+iRet);

	}
}