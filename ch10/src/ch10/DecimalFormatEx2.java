package ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx2 {
	public static void main(String args[]) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89");
			System.out.print("1,234,567.89 -> " );
			
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			
			System.out.println(df2.format(d));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
