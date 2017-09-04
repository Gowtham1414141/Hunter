import java.util.Arrays;

public class UniqueElementUnSortedArray {

	public static void main(String[] args) {
		
		int arr[]={1,2,9,8,7,8,7,9,1};
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
