import java.util.*;

class BitWise
{
	public boolean CheckBit(int iNo,int i)
	{
		int iMask = 0x00000001,iResult = 0;

		iMask = iMask << (i - 1);

		iResult = iNo & iMask;

		if(iResult == iNo)
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
}

class ProgramBW202
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int iValue = 0,iPos = 0;
		boolean bRet = false;

		System.out.println("Enter number : ");
		iValue = sobj.nextInt();

		System.out.println("Enter position : ");
		iPos = sobj.nextInt();

		BitWise bobj = new BitWise();

		bRet = bobj.CheckBit(iValue,iPos);

		if(bRet == true)
		{
			System.out.println("Bit is on!!");
		}
		else
		{
			System.out.println("Bit is off!!");
		}
	}
}