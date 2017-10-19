
public class ThirtySecondsFormatter {

	public ThirtySecondsFormatter(){
		//105-08 means $105 plus 8/32 of a dollar which equates to 105.25
		//at least two digits used for integer(full dollars), only two for the 32nds of the price
	};
	
	public String buildFormattedString(Double theDouble){
		if (theDouble == null){
			return "";
		}
		
		if (theDouble < 0){
			return "";
		}
		
		Integer theInteger = theDouble.intValue();
		String formattedIntegerString = String.format("%02d", theInteger); //format to at least 2 digits
		
		Double decimal = theDouble % theInteger; //get decimal
		Double thirtySeconds = decimal * 32; //change into units of 1/32 of dollar
		String formattedDecimalString = String.format("%02d", thirtySeconds.intValue()); //format to 2 digits
		
		StringBuilder s = new StringBuilder();
		s.append(formattedIntegerString); //formatted dollar portion of string, at least 2 decimals
		s.append("-"); //delimiter
		s.append(formattedDecimalString);
		
		System.out.println("ThirtySecondsFormatter.buildFormattedString received " + theDouble);
		System.out.println("Output: " + s);
		return s.toString();
	}
}
