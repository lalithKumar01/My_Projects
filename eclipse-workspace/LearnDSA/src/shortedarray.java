import java.util.Iterator;

public class shortedarray {

	public static void main(String[] args) {
		int nums[]= {2,4,5,6,7,8,9,10,11};
		int target = 10;
		int result1 = lenearSearch(nums,target) ;
	    System.out.println(result1);
	    int result2 = binarySearch(nums,target) ;
	    System.out.println(result2);
	
	}
	public static int lenearSearch(int[] nums, int target) {
		//int find = 0;
		int i = 0;
	for(i=0;i<nums.length;i++) {
		if(nums[i]==target)
			return i;
	}
	return -1;
	
}
	public static int binarySearch(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(nums[mid]==target) {
			return mid;
		}
			else if(nums[mid]<target) {
				left= mid+1;
			}
			else
			right = mid-1;

	}
		return -1;
}
}

