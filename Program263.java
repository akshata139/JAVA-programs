import java.util.*;

abstract class ArrayX //abstract means we cant create an object (1.interface 2.abstract)
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

class Searching extends ArrayX
{
	public Searching(int size)
	{
		super(size);
	}

	public boolean search(int no)
	{
		int i = 0;

		for(i = 0;i < Arr.length;i++)
		{
			if(Arr[i] == no)
			{
				break;
			}
		}

		if(i == Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

class Program263
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int size = sobj.nextInt();

		Searching obj = new Searching(size);

		obj.Accept();
		obj.Display();

		System.out.println("Enter element to search : ");
		int no = sobj.nextInt();

		boolean bret = obj.search(no);

		if(bret == true)
		{
			System.out.println("Element is there in the array!");
		}
		else
		{
			System.out.println("Element is not there in the array");
		}
	}
}


//interface chya aat mdhe default method lihu shkto.
//abstract - it contains 0 or more abstract method in it.