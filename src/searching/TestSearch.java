package searching;

public class TestSearch {

	public static void main(String[] args) {
		int[] arr={5,8,3,9,2,0,4,21,65,90,54,1,33,22,11,7,6};
		int value=0;
		Searching search= new Searching();
		int index=search.binarySsearch(arr, value);//linearSsearch(arr, value);
		if(index!=-1)
		    System.out.println(value+" at location "+index);
		else
			System.out.println(value+" not found in the Array.");

	}

}
