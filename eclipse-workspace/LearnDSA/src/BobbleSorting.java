import java.util.Iterator;

public class BobbleSorting {
public static void main(String[] args) {
	int nums[]= {4,7,2,4,6,2,5,1};
	int temp =0;
	int size = nums.length;
	for(int j=0; j<size;j++) {
	for(int i=0; i<size-j-1;i++) {
		if(nums[i]>nums[i+1]) {
			temp=nums[i];
			nums[i]= nums[i+1];
			nums[i+1]=temp;
		}
	}
	}
	for (int num : nums) {
		System.out.println(num);
	}
}
}
