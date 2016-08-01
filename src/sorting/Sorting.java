package sorting;

public class Sorting {

	/**
	 * Simple implementation of Bubble sort Algorithm
	 * @param arr the array to be sorted
	 * @return   sorted Array
	 */
	public int[] sortByBubble(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		 return arr;
	}
	
	/**
	 * Simple implementation of Selection sort Algorithm
	 * @param arr the array to be sorted
	 * @return   sorted Array
	 */
	public int[] sortBySelection(int[] arr) {
		int temp=0,min=0,loc=0;
		for(int i=0;i<arr.length-1;i++){
			min=arr[i];
			loc=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
                     min=arr[j];
                     loc=j;
				}
			}
			if(loc!=i){
				temp=arr[loc];
				arr[loc]=arr[i];
				arr[i]=temp;
			}
		}
		 return arr;
	}
	
	/**
	 * Simple implementation of Insertion sort Algorithm
	 * @param arr the array to be sorted
	 * @return   sorted Array
	 */
	public int[] sortByInsertion(int[] arr) {
		int temp=0;
		for(int i=1;i<arr.length;i++){
			temp=arr[i];
			int j=i-1;
			while(j>=0&&temp<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[++j]=temp;
		}
		 return arr;
	}
	
	
	//Quick sort  @not correct yet
	
	public int[] quickSort(int[] arr, int start, int end){
		if(start<end){
			int m=partition(arr,start,end);
			quickSort(arr, start, m-1);
			quickSort(arr, m+1, end);
		}
		return arr;
	}
   
	private int partition(int[] arr, int start, int end) {
		int pivote=arr[end];
		int i=start-1;
		for(int j=start;j<end-1;j++){
			if(arr[j]<pivote){
				i++;
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
			int m=arr[i+1];
			arr[i+1]=pivote;
			pivote=m;
		}
		return i+1;
	}
	
	
	
	
	// merge sort
}
