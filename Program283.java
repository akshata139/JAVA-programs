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

	public void Display1()
	{
		System.out.println("Entered data is : ");
		for(int i = 0; i < Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}

class Sorting extends ArrayX
{

	public Sorting(int iValue)
	{
		super(iValue);
	}

	public void BubbleSort()
	{
		int pass = 0,j = 0,temp = 0;
		int size = Arr.length;
		boolean flag = false;

		System.out.println("Bubble Sort : ");

		for(pass = 0,flag = true; (pass < size) && (flag = true);pass++)
		{
			for(j = 0,flag = false;j < (size - pass - 1);j++)
			{
				if(Arr[j] > Arr[j + 1])
				{
					flag = true;

					temp = Arr[j];
					Arr[j] = Arr[j + 1];
					Arr[j + 1] = temp;
				}
			}
		}
	}

	public void InsertionSort()
	{
		int i = 0,j = 0,key = 0;
		int size = Arr.length;

		System.out.println("Insertion sort : ");

		for(i = 1;i < size; i++)
		{
			key = Arr[i];

			for(j = i - 1; (j >= 0) && (Arr[j] > key);j--)
			{
				Arr[j + 1] = Arr[j];
			}

			Arr[j + 1] = key;
		}

	}

	public void SelectionSort()
	{
		int i = 0,j = 0,minindex = 0,temp = 0;
		int size = Arr.length;

		System.out.println("Selection Sort : ");
		
		for(i = 0;i <size;i++)
		{
			minindex = i;

			for(j = i;j < size;j++)
			{
				if(Arr[minindex] > Arr[j])
				{
					minindex = j;
				}

				temp = Arr[i];
				Arr[i] = Arr[minindex];
				Arr[minindex] = Arr[i];

			}
		}
	}

	public void Display2()
	{
		System.out.println("After function call data is  : ");
		for(int i = 0; i < Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}

class Searching extends ArrayX
{
	public Searching(int iValue)
	{
		super(iValue);
	}

	public boolean LinearSearch(int no)
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

	public boolean BinarySearch(int iNo)
	{
		int start = 0;
		int end = Arr.length - 1;
		int mid = (start + end) / 2;
	//	boolean bAns = false;

		while(start <= end)
		{
			if(Arr[mid] == iNo)
			{
				break;
			}
			else if(iNo > Arr[mid])
			{
				start = mid + 1;
			}
			else if(iNo < Arr[mid])
			{
				end = mid - 1;
			}

			mid = (start + end) / 2;
		}

		if(Arr[mid] == iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Program283
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int iValue = 0;

		System.out.println("Enter length of array : ");
		iValue = sobj.nextInt();

		Sorting obj = new Sorting(iValue);

		obj.Accept();
		obj.Display1();

		obj.BubbleSort();
		obj.Display2();

		obj.SelectionSort();
		obj.Display2();

		obj.InsertionSort();
		obj.Display2();

		System.out.println("Enter number to be search : ");
		int iNo = sobj.nextInt();

		Searching obj2 = new Searching(iValue);

		boolean bret1,bret2;

		bret1 = obj2.LinearSearch(iNo);

		if(bret1 == true)
		{
			System.out.println("Element is there!!");
		}
		else 
		{
			System.out.println("Element not found!!");
		}
		
		bret2 = obj2.BinarySearch(iNo);

		if(bret2 == true)
		{
			System.out.println("Element is there!!");
		}
		else 
		{
			System.out.println("Element not found!!");
		}
		
	}
}