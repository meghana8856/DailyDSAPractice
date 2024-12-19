package DSADailyPractice;

/*GIven an array of distinct elements which is sorted and rotated.Find index of target k
Ex: arr[]=4,5,8,10,1,2,3
k=2
Ans: 5
*/
public class ArraySortedAndRotatedBinarySearch {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 8, 10, 1, 2, 5 };
		int k = 5;
		int l = 0;
		int r = arr.length - 1;
		int mid = 0;
		while (l <= r) {
			mid = (l + r) / 2;
			if (arr[mid] == k) {
				System.out.println(mid);
				return;
			}
			if (arr[mid] >= arr[l]) {
				if (k >= arr[l] && k < arr[mid]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			} else {
				if (k > arr[mid] && k <= arr[r]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
		}

	}
}
