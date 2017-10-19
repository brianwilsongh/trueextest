
public class Main {

	public static void main(String[] args) {
		ThirtySecondsFormatter formatter = new ThirtySecondsFormatter();

		Double dub = 923432.0352342342342;
		formatter.buildFormattedString(dub);
		
		Double dub2 = 00.00;
		formatter.buildFormattedString(dub2);
		
		Double dub3 = 105.033;
		formatter.buildFormattedString(dub3);
		
	}

}
