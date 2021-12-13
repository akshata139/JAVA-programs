import java.util.*;

class BitWise
{
	public int OffBit(int iNo,int i)
	{
		int iMask = 0x00000001,iResult = 0;

		iMask = iMask << (i - 1);

		iResult = iNo ^ iMask;

		return iResult;
	}
}

class Program203
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0,iPos = 0,iRet = 0;

		System.out.println("Enter number : ");
		iValue = sobj.nextInt();

		System.out.println("Enter position : ");
		iPos = sobj.nextInt();

		BitWise bobj = new BitWise();

		iRet = bobj.OffBit(iValue,iPos);

		System.out.println("Updated value is : "+iRet);

	}
}