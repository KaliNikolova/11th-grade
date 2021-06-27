
public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 9 };
		System.out.println(hasPairWithSum(arr, 3));
	}

	public static boolean hasPairWithSum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum)
					return true;
			}
		}
		return false;
	}
}
