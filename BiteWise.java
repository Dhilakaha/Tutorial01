
public class BiteWise {
	public static void main(String[] args)
	{
		int a = 2;  //0010
		int b = 3;  //0011
		System.out.println(a&b); //0010
		System.out.println(a|b); //0011
		System.out.println(a^b); //0001
		
		a %= 3;
		System.out.println(a);
		double ss = Math.pow(2, 3);
		int i = 2;
		int j= (i=3)* ((i=4));
		System.out.println(j + " dan " + ss);
		
		System.out.println(i);
		int r = i * (i = 5);
		System.out.println(r + " " + i);
		
		int k = 2;
		int n = k = 3 * k;
		System.out.println(n + " dan " + k);
		
		System.out.println(~-1);
		System.out.println(~0);
		System.out.println(~1);
		System.out.println(~2);
		
		System.out.println( 4 << 3); // 4 x 2^3 
		// didalam biner penggeseran angka ke kiri
		
		System.out.println( 2 >> 5);
		System.out.println( 3 >>> 1);
		System.out.println(4 / 3); 
		
		int kaha = 2;
		double kh = (int) kaha;
		String nama = Integer.toString(kaha);
		
		System.out.println("Fadhilah Khairatun Hisan".substring(2));
		
		System.out.println("Fadhilah\t Khairatun\r Hisan");
		
		System.out.println("D\u00e9D\u00e9P\u00e9");
		
	}
}
