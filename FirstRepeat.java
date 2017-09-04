public class FirstRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,4,2,4,5,6,7,8,8};
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=1;
					System.out.println(arr[i]);
					break;
				}
			}
			if(flag==1)
				break;
		}
		
	}

}
