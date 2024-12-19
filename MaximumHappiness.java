package DSADailyPractice;

/*Flipkart is simplifying the shopping experience by introducing a feature that tailors product suggestions
based on customers' needs and budget. Customers can specify what they're looking for and how much
they can spend, and Flipkart will recommend the best options to fit their criteria. This streamlined
approach helps customers find what they need quickly and within their budget, enhancing their overall
satisfaction.
Problem Statement :
Given the Budget of the user and cost and happiness value of N items of the desired product. Compute the
maximum happiness value you can get if you buy some products optimally.*/

import java.util.Arrays;

public class MaximumHappiness {
	public static void main(String[] args) {
		int[] price = { 110, 180, 50, 120, 100 };
		int[] happiness = { 39, 57, 13, 44, 24 };
		int budget = 300;
		int ans = maxHappy(price, happiness, budget, 0);

		System.out.println(ans);
	}

	static int maxHappy(int[] price, int[] happiness, int budget, int ind) {

		if (ind >= price.length || budget <= 0) {
			return 0;
		}

		int dontPick = maxHappy(price, happiness, budget, ind + 1);
		int pick = 0;

		if (price[ind] <= budget) {
			pick = happiness[ind] + maxHappy(price, happiness, budget - price[ind], ind + 1);
		}

		return Math.max(dontPick, pick);
	}
}
