
public class Solution3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 9 };
		System.out.println(hasPairWithSum(arr, 5));
	}

	public static boolean hasPairWithSum(int[] arr, int sum) {
		int low =0;
		int hi = arr.length-1;
		while(low<hi) {
			if(sum > arr[low]+arr[hi]) {
				low++;
			}else if(sum < arr[low] + arr[hi]) {
				hi--;
			}else return true;
		}
		return false;
	}

}
