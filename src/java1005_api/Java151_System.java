package java1005_api;

public class Java151_System {
	public static void main(String[] args) {
		int[] arr1 = {1, 5, 2, 4};
		int[] arr2 = {6, 3, 9, 7, 8};
		int[] arr3 = {4, 2};
		int[] arr4 = process(arr1, arr2, arr3);
		
		for(int data : arr4)
			System.out.printf("%3d", data);
		
	}
	
	public static int[] process(int[] arr1, int[] arr2, int[] arr3) {	// 주어진 배열을 하나의 배열로 통합
		int[] data = new int[arr1.length + arr2.length + arr3.length];
		
		/*
		for(int i = 0; i < data.length; i++) {
			if(i < arr1.length)
				data[i] = arr1[i];
			else if(i >= arr1.length && i < arr1.length+arr2.length)
				data[i] = arr2[i - arr1.length];
			else
				data[i] = arr3[i - arr1.length - arr2.length];
		}
		*/
		
		System.arraycopy(arr1, 0, data, 0, arr1.length);
		System.arraycopy(arr2, 0, data, arr1.length, arr2.length);
		System.arraycopy(arr3, 0, data, arr1.length+arr2.length, arr3.length);
		
		return data;
	}
}
