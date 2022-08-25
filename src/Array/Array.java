package Array;

public class Array {
	/*storing a multiple value in single varaiable
	 non primitive data type 
	 supports similar data type index = 0,1,2
	 
	 fixed length=1,2,3
	 high memory wastage*/
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for (int i =0;i<a.length;i++)
			System.out.println(a[i]);
		
		
		
		
	}
	
}
