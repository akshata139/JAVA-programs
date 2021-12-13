import java.util.*;

class BitWise
{
	int OnBit(int iNo)
	{
		int iMask = 0x0000000F,iResult = 0;

		iResult = iNo | iMask;

		return iResult;
	}	
}

class Program204
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int iValue = 0,iRet = 0;

		System.out.println("Enter number : ");
		iValue = sobj.nextInt();

		BitWise bobj = new BitWise();

		iRet = bobj.OnBit(iValue);

		System.out.println("Updated value is : "+iRet);
	}
}