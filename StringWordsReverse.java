public class StringWordsReverse {

	public static void main(String[] args) {
		
		String str = "i love my india";
		String arr[]=str.split(" ");
		String temp="";
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i!=0)
			temp = temp+arr[i]+" ";
			else
			temp = temp+arr[i];
		}
		System.out.println(temp);
		
	}

}
