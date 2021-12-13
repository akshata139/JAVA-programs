//Doubly linear linked list.

import java.util.*;

class Node
{
	public int data;
	public Node next;
	public Node prev;
}

class DoublyLL
{
	private Node first;
	private int size;

	public DoublyLL()
	{
		this.first = null;
		this.size = 0;
	}

	public void InsertFirst(int no)
	{
		Node newn = null;

		newn = new Node();

		newn.data = no;
		newn.next = null;
		newn.prev = null;

		if(first == null)
		{
			first = newn;
		}
		else
		{
			newn.next = first;
			first.prev = newn;
			first = newn;
		}

		this.size++;
	}

	public void InsertLast(int no)
	{
		Node newn = null;

		newn = new Node();

		newn.data = no;
		newn.next = null;
		newn.prev = null;

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
			newn.prev = temp;
		}

		this.size++;
	}

	public void InsertAtPos(int no,int ipos)
	{
		if((ipos < 0) && (ipos > (size + 1)))
		{
			return;
		}

		if(ipos == 1)
		{
			InsertFirst(no);
		}
		else if(ipos == (size + 1))
		{
			InsertLast(no);
		}
		else
		{
			Node newn = null;

			newn = new Node();

			newn.data = no;
			newn.next = null;
			newn.prev = null;

			int i = 0;
			Node temp = first;

			for(i = 1;i < (ipos - 1);i++)
			{
				temp = temp.next;
			}

			temp.next.prev = newn;
			newn.next = temp.next;
			temp.next = newn;
			newn.prev = temp;

			this.size++;
		}
	}

	public void DeleteFirst()
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
			first.prev = null;
		}

		this.size--;
	}

	public void DeleteLast()
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
			Node temp = first;

			while(temp.next != null)
			{
				temp = temp.next;
			}

			temp.prev.next = null;
		}

		this.size--;
	}

	public void DeleteAtPos(int ipos)
	{
		if((ipos < 0) && (ipos > (size)))
		{
			return;
		}

		if(ipos == 1)
		{
			DeleteFirst();
		}
		else if(ipos == size)
		{
			DeleteLast();
		}
		else
		{
			Node temp = first;
			int i = 0;

			for(i = 1;i < (ipos - 1);i++)
			{
				temp = temp.next;
			}

			temp.next = temp.next.next;
			temp.next.prev = temp;

			this.size--;
		}
	}

	public void Display()
	{
		int i = 0;
		Node temp = first;

		System.out.println("Elements of Doubly Linear linked list are : ");

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

class Program277
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);

		DoublyLL obj = new DoublyLL();

		int choice = 1,iValue = 0,position = 0,iret = 0;

		while(choice != 0)
		{
			System.out.println("Enter the desired choice you want to perform on Doubly LL : ");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1 : Insert element at first position");
			System.out.println("2 : Insert element at last position");
			System.out.println("3 : Insert element at desired position");
			System.out.println("4 : Delete first node ");
			System.out.println("5 : Delete last node ");
			System.out.println("6 : Delete node from desired position ");
			System.out.println("7 : Display the contents of linked list");
			System.out.println("8 : Count the number of nodes of LL ");
			System.out.println("0 : Terminate the Doubly linear linked list application");
			System.out.println("---------------------------------------------------------------------");

			choice = sobj.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Enter element you want to insert : ");
					iValue = sobj.nextInt();
					obj.InsertFirst(iValue);
					break;

				case 2:
					System.out.println("Enter element you want to insert :");
					iValue = sobj.nextInt();
					obj.InsertLast(iValue);
					break;

				case 3:
					System.out.println("Enter element you want to insert :");
					iValue = sobj.nextInt();
					System.out.println("Enter the position : ");
					position = sobj.nextInt();
					obj.InsertAtPos(iValue,position);
					break;

				case 4:
					obj.DeleteFirst();
					break;

				case 5:
					obj.DeleteLast();
					break;

				case 6:
					System.out.println("Enter the position : ");
					position = sobj.nextInt();
					obj.DeleteAtPos(position);
					break;

				case 7:
					obj.Display();
					break;

				case 8:
					System.out.println("Total number of elements are : "+obj.Count());
					break;

				case 0:
					System.out.println("Thanks for using Doubly Liear linked list!!");
					break;

				default:
					System.out.println("Please enter desired choice!");
					break;
			}
		}
	}
}