package easy;

public class Problem704 {
	public static void main(String[] args) {
		
	}
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1; 
		int mid;
		
		while(left <= right) {
			mid = left + (right - left)/2; 
			if(target == nums[mid]) {
				return mid;
			}
			else if(target > nums[mid]) {
				left = mid + 1;
			}
			else {
				right = mid -1;
			}
			
		}
		return -1;
		
	}
}
