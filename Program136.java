import java.util.*;

class Marvellous
{
	public boolean CheckArmstrong(int iNo)
	{
		return true;
	}
}

class Program136
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0;
		boolean bRet = false;

		System.out.println("Enter number");
		iValue = sobj.nextInt();

		Marvellous mobj = new Marvellous();
		bRet = mobj.CheckArmstrong(iValue);

		if(bRet == true)
		{
			System.out.println("It is Armstrong number");
		}
		else
		{
			System.out.println("It is not Armstrong number");
		}
	}
}