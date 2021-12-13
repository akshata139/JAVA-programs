import java.util.*;

class BitWise
{
	public int SwapByte(int iNo)
	{
		int iMask = 0x00FFFF00;
		int iResult = 0,iTemp = 0;

		iTemp = iNo & iMask;

		int Byte1 = iNo << 24;

		int Byte4 = iNo >> 24;

		iResult = iMask | Byte1 | Byte4;

		return iResult;
	}
}

class Program207
{
	public static void main(String arg[])                                                                                                                                      
	{
		Scanner sobj = new Scanner(System.in);

		int iValue = 0,iRet = 0;

		System.out.println("Enter number : ");
		iValue = sobj.nextInt();

		BitWise bobj = new BitWise();

		iRet = bobj.SwapByte(iValue);
		System.out.println("Updated value  is : "+iRet);
	}
}