package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static void specialSquareGenerator(int n){
		int i = 0;
		int num = 0;
		int square = 0;
		int sum;
		while(i!=n){
			square = num*num;
			sum = 0;
			for (int c = 1; sum < square; c++){
				sum = sum + c;
				if (sum == square){
					System.out.println(square);
					i++;
					break;
				}
			}
			num++;
		}
	}
	
}
