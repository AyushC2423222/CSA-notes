import static java.lang.System.*;
public class Arrays_2D {
	/*
	 2D arrays are just matrices from algebra, scary I know
	 They are used for anything really with a row and a column
	 They can have any data type including personal constructors
	 */
	private int skibidiNum;
	private boolean isToilet;
	private String skibType;
	private Arrays_2D[] skibs;
	public Arrays_2D(Arrays_2D[] skibys) {
		//skibs = skibys; AP PENALITY POINT = - 1 
		// LOOP THROUGH THE Source array and put the contents in the instance array
		skibs = new Arrays_2D[skibys.length];//this part is important. IDK why
		for(int i = 0; i<skibys.length; i++) {
			skibs[i] = skibys[i];
		}
	}
	public Arrays_2D[] getSkibs() {
		return skibs;
	}
	public void setBookRack(Arrays_2D[] a) {
		skibs = a;
	}
	public Arrays_2D(int skibidiNum, boolean isToilet, String skibType) {
		this.skibidiNum = skibidiNum;
		this.isToilet = isToilet;
		this.skibType = skibType;
	}
	public int getSkibidiNum() {
		return skibidiNum;
	}
	public void setSkibidiNum(int a) {
		skibidiNum = a;
	}
	public boolean getIsToilet() {
		return isToilet;
	}
	public void setIsToilet(boolean a) {
		isToilet = a;
	}
	public String getSkibType() {
		return skibType;
	}
	public void setSkibType(String a) {
		skibType = a;
	}
	public String toString() {
		String printSkibs = "Skibidi number "+skibidiNum+" is a "+skibType+" and is ";
		if(isToilet == true) {
			printSkibs+="a toilet.";
		}else {
			printSkibs+="not a toilet";
		}
		return printSkibs;
	}
	
	public static void main(String[] args) {

		Arrays_2D skib1 = new Arrays_2D(1, true, "Fast Skibidi");
		Arrays_2D skib2 = new Arrays_2D(2, true, "G-Man Skibidi");
		Arrays_2D skib3 = new Arrays_2D(3, true, "Glasses Skibidi");
		Arrays_2D skib4 = new Arrays_2D(-1, false, "Scientist Cameraman");
		Arrays_2D skib5 = new Arrays_2D(4, true, "Skibidi Jetpack");
		Arrays_2D skib6 = new Arrays_2D(5, true, "Air and Land Skibidi");
		Arrays_2D skib7 = new Arrays_2D(-1, false, "Large Speakerman");
		Arrays_2D skib8 = new Arrays_2D(6, true, "Moist Critical Skibidi");
		Arrays_2D skib9 = new Arrays_2D(-1, false, "Camera Toilet");
		//It is the 2d array of Skibdis! I has to use Arrays_2D since i am too lazy to make a skibidi class
		Arrays_2D[][] allSkibs = {{skib1, skib2, skib3}, {skib4, skib5, skib6} ,{skib7, skib8, skib9}};
		for(int i = 0; i<allSkibs.length; i++) {
			for(int j = 0; j<allSkibs.length; j++) {
				out.println(allSkibs[i][j]);
			}
		}
		out.println();
		out.println("The Boys are: ");
		
		char[][] alphaBits = new char[13][2];//This is the proper way to Write it. 13 is the number of rows, while 2 is columns

		//This is a 2d array of the boys names. It has rows and columns
		String[][] theBoys = {{"Eric", "Kenny"},   //row 0
							  {"Stan", "Kyle"},    //row 1
							  {"Butters", "Tweek"},//Row 2 
			                  {"Timmy", "Jimmy"}}; //Row 3
								//Col 0   Col 1

		//This is a ragged array. It is ragged(i know right) and it is wierd cuz it is uneven
		int[][] strangeThings = {{1, 2, 3, 4, 5, 6, 7, 8},   //Episodes in season 1
				{1, 2, 3, 4, 5, 6, 7, 8, 9},//Episodes in season 2 
				{1, 2, 3, 4, 5, 6, 7, 8},   //Episodes in season 3
				{1, 2, 3, 4, 5, 6, 7, 8, 9},//Episodes in season 4
				{1, 2, 3, 4}};              //Episodes in season 5

		//To loop through these bad boys, you need 2 for loops(i can see the aghast expression on ur face but it will be ok)
		for(int rows = 0; rows<theBoys.length;/*The length of the boys is the amount of rows*/rows++) {
			for(int columns = 0; columns<theBoys[rows].length;/*this measures the length of each array in the array*/ columns++) {
				
				/*
				  To explain this collossus, you need to imagine an array. a 2d array is an array of arrays
				  when you get the length of the array(theBoys.length), you are finding the length of the main array
				  when you do theBoys[0].length, you are finding the length of the 0th index
				*/
				
				out.print(theBoys[rows][columns]+" and ");//you are index of the element in that row and that column in the nested loop
				
			}
			out.println();
		}
		out.println("Token.");
	}
}

