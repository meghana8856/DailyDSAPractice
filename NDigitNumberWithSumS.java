package DSADailyPractice;

import java.util.ArrayList;
import java.util.List;

public class NDigitNumberWithSumS {
	public static void main(String[] args) {
	int n=2;
	int sum=13;
    List<Integer> currentNumber = new ArrayList();

	int ans = findDigits(n,sum,true,currentNumber);
	System.out.println(ans);
	}

	private static int findDigits(int n,int s,boolean flag,List<Integer> currentNumber) {
		

		if(s<0) {
			return 0;
		}
		
		if(n==0 && s==0) {
			System.out.println(currentNumber);
			return 1;
		}
		
		if(n==0 && s!=0) {
			return 0;
		}
		
		int start=0;
		
	
		if(flag==true) {
			start=1;
		}
		int count=0;
		
		for(int i=start;i<=9;i++) {
		currentNumber.add(i);
			count = count + findDigits(n-1,s-i,false,currentNumber);
			currentNumber.remove(currentNumber.size()-1);
		}
		return count;	
		
	}
		
	
}
