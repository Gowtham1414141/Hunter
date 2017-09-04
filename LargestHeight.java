import java.util.*;
public class LargestHeight {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int height[]=new int[50];
		System.out.println("Enter the height of 50 members");
		for(int i=0;i<50;i++)
		{
			height[i]=sc.nextInt();
		}
		Arrays.sort(height);
		System.out.println("Enter the K value : ");
		int k = sc.nextInt();
		int len = height.length;
		System.out.println(height[len-k]);
	}

}
