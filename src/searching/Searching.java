package searching;


public class Searching {
	/**
	 * Linear search of an integer array for a specific value  
	 *
	 * @param arr  - array for the search
	 * @param value - value to be search  
	 * @return  index of first occurrence of value in the array if found otherwise -1
	 */
	 
	public int linearSsearch(int[] arr,int value){
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]==value)
				 return i;
		 }
		return -1;
	}
	
	/**
	 * Binary search of an integer array for a specific value  
	 * if multiple values are present in array then it may return any index of value
	 *
	 * @param arr  - array for the search
	 * @param value - value to be search  
	 * @return  index of value in the array if found otherwise -1
	 */
	public int binarySsearch(int[] arr,int value){
		//since this algorithm only applicable for sorted elements so first sort them
		arr=sort(arr);
		print(arr);
		
		int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high)/2;     //calculate mid  
            
            if (arr[mid] <value)            //update values of low or high accordingly
                low = mid + 1;
            else if (arr[mid] > value)
                high = mid - 1;
            else
                return mid; 
        }
        return -1; 
	}

	private void print(int[] arr) {
		System.out.print("Array: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
	}
	
   //simple bubble sort
	private int[] sort(int[] arr) {
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

}
