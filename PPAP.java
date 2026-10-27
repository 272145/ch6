public static String PPAP(String str){
	int comma = str.indexOf(",");
	String object1 = str.substring(9,comma);
	
	String object2 = str.substring(comma+11);
	
	object2 = object2.substring(0,1).toUpperCase() + object2.substring(1);
	
	return "Uh! " + object2 + " " + object1;
	



}
