import java.util.*;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		String dup="";
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				if(!dup.contains(arr[i]+""))
				{
					dup=dup+arr[i]+" ";
				}
			}
		}
		String arr1[]=dup.split(" ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
