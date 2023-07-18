package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
        int range = 8;
		int firstNo = 0;
		int secNo = 1;
		int sum;
		
		System.out.println(firstNo);
		for (int i = 1; i < range; i++) {
			sum = firstNo + secNo;
			firstNo = secNo;
			secNo = sum;
			System.out.println(sum);
		}


}
}