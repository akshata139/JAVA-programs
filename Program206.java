import java.util.*;

class BitWise
{
	public void DisplayByte(int iNo)
	{
		int Byte1 = iNo & 0x000000FF;

		int Byte2 = iNo & 0x0000FF00;
		Byte2 = Byte2 >> 8;

		int Byte3 = iNo & 0x00FF0000;
		Byte3 = Byte3 >> 16;

		int Byte4 = iNo & 0xFF000000;
		Byte4 = Byte4 >> 24;

		System.out.println("Byte1 "+Byte1);
		System.out.println("Byte2 "+Byte2);
		System.out.println("Byte3 "+Byte3);
		System.out.println("Byte4 "+Byte4);

	}
}

class Program206
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int iValue = 0;

		System.out.println("Enter number : ");
		iValue = sobj.nextInt();

		BitWise bobj = new BitWise();

		System.out.println("Result is : ");
		bobj.DisplayByte(iValue);

	}
}