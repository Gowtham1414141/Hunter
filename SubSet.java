public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[]={1,4,6,7,3,66,44,32,54};
		int a2[]={66,32,6,7};
		int res=0;
		for(int i=0;i<a2.length;i++)
		{
			int flag=0;
			for(int j=0;j<a1.length;j++)
			{
				if(a2[i]==a1[j])
					flag=1;
			}
			if(flag==0)
			{
				res=1;
				break;
			}
		}
		if(res==0)
			System.out.println("A2 is subset of A1");
		else
			System.out.println("A2 is not subset of A1");
	}

}
