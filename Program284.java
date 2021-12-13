//is Sorted function

import java.util.*;

abstract class ArrayX
{
	public int Arr[];

	public ArrayX(int size)
	{
		Arr = new int[size];
	}

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the elements : ");
		for(int i = 0;i < Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}

	public void Display()
	{
		System.out.println("Entered data is : ");
		for(int i = 0; i < Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}

class Sorted extends ArrayX
{
	public Sorted(int iLen)
	{
		super(iLen);
	}

	public boolean isSorted()
	{
		boolean bAns = false;

		int size = Arr.length;

		if((Arr[0] > Arr[size - 1]))
		{
			bAns = true;
		}
		else if((Arr[0] < Arr[size - 1]))
		{
			bAns = true;
		}
		else
		{
			bAns = false;
		}

		return bAns;
	}
}

class Program284
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		int iSize = 0;

		System.out.println("Enter size of array : ");
		iSize = sobj.nextInt();

		boolean bret = false;

		Sorted obj = new Sorted(iSize);

		obj.Accept();
		obj.Display();

		bret = obj.isSorted();

		if(bret == true)
		{
			System.out.println("Array is sorted !!");
		}
		else
		{
			System.out.println("Array is not sorted!!");
		}
	}
}