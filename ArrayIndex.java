import java.util.*;
public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={-3,-1,1,3,44};
		int prev = -999;
		for(int i=0;i<arr.length;i++)
		{
			if(prev<arr[i])
			{
				prev=arr[i];
				if(i==arr[i])
				{
					System.out.println(arr[i]);
				}
			}
			else
			{
				System.out.println("Invalid array");
				break;
			}
		}
	}

}
