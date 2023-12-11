package mypackage;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr=new int[]{1,5,5,4,6,8,8,4,9,3};
		System.out.println("Duplicate elements in given array:");
		//search for duplicate element
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
