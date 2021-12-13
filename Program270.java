import java.util.*;

class Marvel 
{
	public int Arr[];

	public Marvel(int size)
	{
		Arr = new int[size];
	}

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		int i = 0;
		System.out.println("Enter elements : ");
		for(i = 0;i < Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}

	public void Display()
	{
		System.out.println("Entered elements are : ");
		int i = 0;
		for(i = 0;i < Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}

class BubbleSort extends Marvel
{
	public BubbleSort(int size)
	{
		super(size);
	}

	public boolean isSortX()
	{
		int i = 0;
		//boolean bAns = false;

		for(i = 0; i < (Arr.length - 1);i++)
		{
			if(Arr[i] > Arr[i + 1])
			{
				//bAns = false;
				break;
			}
		}

		if(Arr[i] > Arr[i + 1])
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void B_Sort()
	{
		int i = 0,j = 0,temp = 0;
		int isize = Arr.length - 1;

		for(i = 0;i < isize;i++)
		{
			for(j = 0;j < (isize - i - 1);j++)
			{
				if(Arr[j] > Arr[j + 1]) 
				{
					temp = Arr[j];
					Arr[j] = Arr[j + 1];
					Arr[j + 1] = temp;
				}
			}
		}
	}
}

class Program270
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of elements you want to enter : ");
		int ilen = sobj.nextInt();

		BubbleSort bobj = new BubbleSort(ilen);

		bobj.Accept();
		bobj.Display();

		boolean bret = bobj.isSortX();
		if(bret == true)
		{
			System.out.println("Given Array is sorted!!");
		}
		else
		{
			System.out.println("Given array is not sorted!!");
		}

		System.out.println("After Applying bubble sort array becomes : ");

		bobj.B_Sort();
	}
}