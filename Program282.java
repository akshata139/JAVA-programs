// Binary Search Tree.

import java.util.*;

class Node
{
	public int data;
	public Node rchild;
	public Node lchild;
}

class BST
{
	private Node root;
	private int size;
	private static int iCnt;

	public BST()
	{
		this.root = null;
		this.size = 0;
		this.iCnt = 0;
	}

	public void Insert(int no)
	{
		Node newn = null;

		newn = new Node();

		newn.data = no;
		newn.lchild = null;
		newn.rchild = null;

		if(root == null)
		{
			root = newn;
		}
		else
		{
			Node temp = root;

			while(true)
			{
				if(no == (temp.data))
				{
					newn = null;
					break;
				}
				else if(no > (temp.data))
				{
					if(temp.rchild == null)
					{
						temp.rchild = newn;
						break;
					}

					temp = temp.rchild;

				}
				else if(no < (temp.data))
				{
					if(temp.lchild == null)
					{
						temp.lchild = newn;
						break;
					}

					temp = temp.lchild;
				}
			}
		}

		size++;
	}

	public boolean Search(int no)
	{
		boolean flag = false;

		if(root == null)
		{
			System.out.println("BST is empty!");
			flag = false;
		}
		else
		{
			while(root != null)
			{
				if(no == (root.data))
				{
					flag = true;
					break;
				}
				else if(no > (root.data))
				{
					root = root.rchild;

				}
				else if(no < (root.data))
				{
					root = root.lchild;
				
				}
			}

			//return flag;
		}
		return flag;
	}

	public void DisplayPre()
	{
		Preorder(root);
	}

	public void Preorder(Node ptr)
	{
		if(ptr != null)
		{
			System.out.println("|"+ptr.data+"|");
			Preorder(ptr.lchild);
			Preorder(ptr.rchild);
		}
	}

	public void DisplayIn()
	{
		Inorder(root);
	}

	public void Inorder(Node ptr)
	{
		if(ptr != null)
		{
			Inorder(ptr.lchild);
			System.out.println("|"+ptr.data+"|");
			Inorder(ptr.rchild);
		}
	}

	public void DisplayPost()
	{
		Postorder(root);
	}

	public void Postorder(Node ptr)
	{
		if(ptr != null)
		{
			Postorder(ptr.lchild);
			Postorder(ptr.rchild);
			System.out.println("|"+ptr.data+"|");
		}
	}

	public int Count()
	{
		return size;
	}

	public int Parent()
	{
		CountParent(root);
		return 1;
	}

	public int CountParent(Node ptr)
	{
		//static int iCnt = 0;

		if(ptr != null)
		{
			if((ptr.rchild != null) || (ptr.lchild != null))
			{
				iCnt++;
			}

			CountParent(ptr.lchild);
			CountParent(ptr.rchild);
		}

		return iCnt;
	}

	public int Leaf()
	{
		CountLeaf(root);
		return 1;
	}


	public int CountLeaf(Node ptr)
	{
		if(ptr != null)
		{
			if((ptr.rchild == null) && (ptr.lchild == null))
			{
				iCnt++;
			}

			CountLeaf(ptr.lchild);
			CountLeaf(ptr.rchild);
		}

		return iCnt;
	}
}

class Program282
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);

		BST obj = new BST();

		int choice = 1,iValue = 0,iNo = 0,iret = 0;

		while(choice != 0)
		{
			System.out.println("Enter the desired choice you want to perform on Binary Search Tree : ");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1 : Insert element ");
			System.out.println("2 : Search element ");
			System.out.println("3 : Display the contents of BST in Preorder");
			System.out.println("4 : Display the contents of BST in Inorder");
			System.out.println("5 : Display the contents of BST in Postorder");
			System.out.println("6 : Count the number of nodes of BST ");
			System.out.println("7 : Count the number of Parent nodes of BST ");
			System.out.println("8 : Count the number of Leaf nodes of BST ");
			System.out.println("0 : Terminate the BST application");
			System.out.println("---------------------------------------------------------------------");

			choice = sobj.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Enter element you want to insert : ");
					iValue = sobj.nextInt();
					obj.Insert(iValue);
					break;

				case 2:
					System.out.println("Enter element to be Search ");
					iNo = sobj.nextInt();
					boolean bret = obj.Search(iNo);

					if(bret == true)
					{
						System.out.println("Element is there !");
					}
					else
					{
						System.out.println("Element not found!");
					}

					break;

				case 3:
					System.out.println("PREORDER -> ");
					obj.DisplayPre();
					break;

				case 4:
					System.out.println("INORDER -> ");
					obj.DisplayIn();
					break;

				case 5:
					System.out.println("POSTORDER -> ");
					obj.DisplayPost();
					break;

				case 6:
					System.out.println("Total number of nodes are : "+obj.Count());
					break;

				case 7:
					iret = obj.Parent();

					if(iret == 1)
					{
						System.out.println("Total number of Parent nodes are :"+iret);
					}
					
					break;

				case 8:
					iret = obj.Leaf();

					if(iret == 1)
					{
						System.out.println("Total number of Leaf nodes are : "+iret);
					}
					break;

				case 0:
					System.out.println("Thanks for using BST!!");
					break;

				default:
					System.out.println("Please enter desired choice!");
					break;
			}
		}
	}
}