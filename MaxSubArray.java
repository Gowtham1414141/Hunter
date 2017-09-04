import java.util.*;
public class MaxSubArray {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5,6,7,8};
		int n=sc.nextInt();
		int maxSum=0;
		int startIndex=-1;
		for(int i=0;i<arr.length-(n-1);i++)
		{
			int sum=0;
			for(int j=i;j<i+n;j++)
			{
				sum=sum+arr[j];
			}
			if(sum>maxSum)
			{
				maxSum=sum;
				startIndex=i;
			}
		}
		for(int i=startIndex;i<startIndex+n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
