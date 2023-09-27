package übung1;

public class Übung1 {
	static boolean isBinaryNumber(String s) {
	
		for (int i = 0; i < s.length(); i++) {
			
			if(!(s.charAt(i) =='1' || s.charAt(i) =='0')) {
				return false;
			}}
		
		
	return true;
	}
	
	static int binaryToDecimal(String s) {
       int zahl=0;
		int pow=0;
		
		if(isBinaryNumber(s)==true) {
	for(int i=s.length()-1;i>=0;i--) {
	int temp= s.charAt(i)-'0';
		
		zahl+=temp*Math.pow(2, pow);
		pow++;
		}        
	

		
	}
		
		return zahl;
	
	}
	
	public static void main(String[] args) {
		System.out.println(binaryToDecimal("101101"));  // 45
		System.out.println(binaryToDecimal("0"));       // 0
		System.out.println(binaryToDecimal("000001"));  // 1
		System.out.println(binaryToDecimal("100000"));  // 32
		System.out.println(binaryToDecimal("101a01"));  // -1
		System.out.println(binaryToDecimal("101201"));  // -1
	}

}
