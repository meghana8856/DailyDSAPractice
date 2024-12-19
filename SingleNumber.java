package DSADailyPractice;

import java.util.Arrays;

// Every element occurred twice in an array..But only one element came one.which is that number?Do it in 0(logn ) complexity

public class SingleNumber {
	public static void main(String[] args) {

		int arr[] = { 2, 2, 5, 5,4, 8, 8};

		int l = 0;
		int r = arr.length - 1;
		int mid = 0;
		

		while (l < r) {
			mid = (l + r) / 2;
			if (mid % 2 == 1) {
				mid--;
			}

			if (arr[mid] == arr[mid + 1]) {
				l = mid + 2;
			} else {
				r = mid;
			}
		}

        System.out.println("The single element is: " + arr[l]);


	}
}
