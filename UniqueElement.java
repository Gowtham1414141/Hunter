import java.util.Arrays;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,9,8,7,8,7,9,1};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[i+1])
			{
				i++;
			}
			else
			{
				System.out.println(arr[i]);
			}
		}

	}

}
