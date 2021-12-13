import java.util.*;

class Sorting
{
	public void BubbleSort(int Arr[])
	{
		int pass = 0,j = 0,temp = 0;
		int size = Arr.length;
		for(pass = 0;pass < size;pass++)
		{
			for(j = 0;j < size - pass - 1;j++)
			{
				if(Arr[j] > Arr[j + 1])
				{
					temp = Arr[j];
					Arr[j] = Arr[j + 1];
					Arr[j + 1] = temp;
				}
			}

			System.out.println("Data after pass"+pass+1);
			for(int i = 0;i < Arr.length;i++)
			{
				System.out.println(Arr[i]+" ");
			}

			System.out.println();
		}
	}
}

class Program271
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int size = sobj.nextInt();

		int Arr[] = new int[size];

		System.out.println("Enter the elements : ");
		for(int i = 0;i < Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}

		Sorting obj = new Sorting();

		obj.BubbleSort(Arr);

		//boolean bret = new Searching();

		System.out.println("Data after function call");
		for(int i = 0;i < Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}

//time coplexity is n^2;