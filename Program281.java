//Queue.

import java.util.*;

class Node
{
	public int data;
	public Node next;
}

class Queue
{
	private Node first;
	private int size;

	public Queue()
	{
		this.first = null;
		this.size = 0;
	}

	public void Enqueue(int no)
	{
		Node newn = null;
		newn = new Node();

		newn.data = no;
		newn.next = null;

		if(first == null)
		{
			first = newn;
		}
		else
		{
			Node temp = first;

			while(temp.next != null)
			{
				temp = temp.next;
			}

			temp.next = newn;
		}

		this.size++;
	}

	public void Dequeue()
	{
		if(size == 0)
		{
			return;
		}

		if(size == 1)
		{
			first = null;
		}
		else
		{
			first = first.next;
		}

		this.size--;
	}

	public void Display()
	{
		int i = 0;
		Node temp = first;

		System.out.println("Elements of Queue are : ");
		
		for(i = 0;i < size;i++)
		{
			System.out.print("|"+temp.data+" |-> ");
			temp = temp.next;
		}

		System.out.println("null");
	}

	public int Count()
	{
		return size;
	}
}

class Program281
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);

		Queue obj = new Queue();

		int choice = 1,iValue = 0,position = 0,iret = 0;

		while(choice != 0)
		{
			System.out.println("Enter the desired choice you want to perform on Queue : ");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1 : Insert element ");
			System.out.println("2 : Delete element ");
			System.out.println("3 : Display the contents of Stack");
			System.out.println("4 : Count the number of nodes of Stack ");
			System.out.println("0 : Terminate the Queue application");
			System.out.println("---------------------------------------------------------------------");

			choice = sobj.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Enter element you want to insert : ");
					iValue = sobj.nextInt();
					obj.Enqueue(iValue);
					break;

				case 2:
					obj.Dequeue();
					break;

				case 3:
					obj.Display();
					break;

				case 4:
					System.out.println("Total number of elements are : "+obj.Count());
					break;

				case 0:
					System.out.println("Thanks for using Queue!!");
					break;

				default:
					System.out.println("Please enter desired choice!");
					break;
			}
		}
	}
}