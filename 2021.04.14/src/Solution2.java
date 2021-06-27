
public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 9 };
		System.out.println(hasPairWithSum(arr, 5));
	}

	public static boolean hasPairWithSum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			if (binarySearch(sum - arr[i], i+1, arr.length - 1, arr) == true) {
				return true;
			}
		}
		return false;
	}

	private static boolean binarySearch(int num, int low, int hi, int[] arr) {
		// TODO Auto-generated method stub
		int mid = (low + hi) / 2;
		if (low > hi)
			return false;
		if (num > arr[mid])
			return binarySearch(num, mid+1, hi, arr);
		else if (num < arr[mid])
			return binarySearch(num, low, mid-1, arr);
		else {
			return true;
		}
	}

}
