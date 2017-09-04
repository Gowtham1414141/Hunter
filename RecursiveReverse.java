
public class RecursiveReverse {

	public static void main(String[] args) {
		
		int arr[]={5,3,2,4,7,1,11,42,54};
		int len=arr.length;
		rev(arr,len-1);

	}
	static void rev(int arr[],int index)
	{
		System.out.println(arr[index]);
		if(index>0)
			rev(arr,index-1);
	}
}
