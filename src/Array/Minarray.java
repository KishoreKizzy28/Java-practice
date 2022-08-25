package Array;

public class Minarray {
 static void min(int arr[]) {
	 int min = arr[0];
	 for(int i=1;i<arr.length;i++) {
		 if(min>arr[i])
			 min=arr[i];
			 System.out.println(min);
	 }
 
 }
 public static void main(String[] args) {
	int a[]= {25,2,26,5,8};
	min(a);
 

}
}