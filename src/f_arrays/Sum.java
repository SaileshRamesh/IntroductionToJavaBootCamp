package f_arrays;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5};
		mul(arr);
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]);
		}
	}


	public static void mul(int [] arr)
	{
		for(int i=0;i<5;i++)
			arr[i]*=i;

	}
}


