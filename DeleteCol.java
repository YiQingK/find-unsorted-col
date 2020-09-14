import java.util.*;

public class DeleteCol
{
	//return indices of unsorted cols, empty set for all in order and -1 for errors
	public List<Integer> minDeletionSize(String [] array) //Taking in String type array
	{
		List<Integer> myList = new ArrayList<Integer>();
		int strlength = array[0].length();
		//check if all strings are the same length
		for (int l =1; l< array.length; l++)
		{
			if (array[l].length() != strlength)
			{
				myList.add(-1);
				return myList;
			}
		}
		for (int c=0; c<strlength-1; c++)
		{
			for (int r=0; r<array.length-1; r++ )
			{
				if(array[r].charAt(c) > array[r+1].charAt(c))
				{
					if (myList.contains(c) == false)
					{
						myList.add(c);					
					}
				}
			}
		}
		if(myList.isEmpty())
		{
			myList.add(0);
			return myList;
		}
		else
		{
			return myList;
		}
	}

	public static void main(String[] args)
	{
		String[] array = {"clock", "equal", "hello", "means", "right"};
		List <Integer> newlist = new ArrayList<Integer>();
		DeleteCol dc = new DeleteCol();
		newlist = dc.minDeletionSize(array);
		System.out.print("Columns to be deleted: ");
		for(int i=0;i<newlist.size();i++)
		{
   			System.out.print(newlist.get(i)+" ");
		} 
		//
	}
}