import java.util.HashSet;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 9 };
		System.out.println(hasPairWithSum(arr, 4));
	}

	public static boolean hasPairWithSum(int[] arr, int sum) {
		HashSet<Integer> set = new HashSet<>();
		for(int elem: arr) {
			if(set.contains(elem)) return true;
			set.add(sum - elem);
		}
		return false;
	}
}
