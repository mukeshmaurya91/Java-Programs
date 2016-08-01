package sorting;

public class TestSorting {

	public static void main(String[] args) {
		Sorting sort= new Sorting();
		int[] arr={5,8,3,9,2,0,4,21,65,90,54,1,33,22,11,7,6};
		//print(sort.sortByInsertion(arr));
		print(sort.quickSort(arr, 0, arr.length-1));

	}

	private static void print(int[] arr) {
		System.out.print("Array: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

}
