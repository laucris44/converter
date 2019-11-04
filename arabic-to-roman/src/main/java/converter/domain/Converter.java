package converter.domain;


public class Converter {
	
	public static  String converterToRoman(double Num) {
		
		String Uni[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	    String Dec[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	    String Cen[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
	    
	    
	    int u=(int) (Num%10);
	    int d=(int) ((Num/10)%10);
	    int c=(int) (Num/100);

		String roman;
		
		if(Num>=100){
			roman = (new StringBuilder()).append(Cen[c]).append(Dec[d]).append(Uni[u]).toString();	
		}else {
			if(Num>=10){
				roman = (new StringBuilder()).append(Dec[d]).append(Uni[u]).toString();
			}else {
				roman = (new StringBuilder()).append(Uni[u]).toString();
			}
		}
		return roman;
	}	
}


