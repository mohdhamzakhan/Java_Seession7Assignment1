package session7;

public class Assignment1 {
	public static void main(String[] args)
	{
	int[] myArray={0,3,5,2,1,4};
	try{
		for(int i=0;i<=7;i++)
		{
			System.out.println(myArray[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("The value is beyound the limit");
	}
	}
}
