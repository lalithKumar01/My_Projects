
public class SelectionSort {
public static void main(String[] args) {
	
		int nums[]= {4,7,2,4,6,2,5,1};
		int temp =0;
		int size = nums.length;
		int minnum = 0;
		for(int i=0;i<size-1;i++) {
			minnum=i;
			for(int j=i+1;j<size;j++) {
				if(nums[minnum] > nums[j])
					minnum=j;
			}
			temp = nums[minnum];
			nums[minnum]= nums[i];
			nums[i]= temp;
		}
		for (int num : nums) {
			System.out.println(num);
		}
}
}
