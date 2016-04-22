package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		
		if (arabe.equals("1")){
		return "I";
		}
		else if (arabe.equals("2")){
			return "II";
		}
		return " ";
		}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
