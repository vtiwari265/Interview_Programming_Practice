package binary;

public class Convert_Binary_to_Decimal {
	public int convert1(String bin) {
		char[] binStr = bin.toCharArray();
		int output = 0;
		for (int i = 0; i < binStr.length; i++) {
	        output += Character.getNumericValue(binStr[i]) * Math.pow(2,i);
	    }
		return output;
	}
	
	public int convert2(int bin) {
		String bin1 = Integer.toString(bin);
		char[] binStr = bin1.toCharArray();
		int output = 0;
		for (int i = 0; i < binStr.length; i++) {
	        output += Character.getNumericValue(binStr[i]) * Math.pow(2,i);
	    }
		return output;
	}
}
