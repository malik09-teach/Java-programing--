package STRINGS;

public class methos_string_minpulation {
	
	public static void main (String[]gb) {
		
	
	String name1 ="  malik khan";
	String name2 ="LABOUR.org.";
	String name3 ="LABOUR.ORG.";

	
	System.out.println(" name no 1 : "+ name1);
	System.out.println(" name no 2 : "+ name2);
	
	
//function directly apply on the printing the length of string .
	System.out.println(" name length : "+ name1.length());
	
	//the function use for the upper the latter for the to convert the lower case to the upper case 
	System.out.println(" upper case name 1 : "+ name1.toUpperCase());
	
	//the function use for the upper the latter for the to convert the upper case to the lower case
	System.out.println(" LOWER CASE name 2: "+ name2.toLowerCase());
	
	// to remove the white spaces from the string 
	System.out.println(" triming the white spaces  : "+ name1.trim());

	// to start the string from the specific  index 
	System.out.println(" name you want to start from the latter  : "+ name1.substring(6));
	
	// to start the string on the specific index and end at on the specific index
	System.out.println(" the string you  want to start from the first and end at on the index : "+ name1.substring(4, 9));
	
	// replacing function  the latter in the string ...
	System.out.println(" replacing the words  : "+ name1.replace('a', 'i'));
	
	// the fun is use for to check weather the name is start from the specific name taking the full variable . 
	System.out.println(" is name1 start from the name 2 : "+ name1.startsWith(name2));  
	System.out.println(" is name1 start from the name 1 : "+ name1.startsWith(name1));
	
	// the fun is use for to check weather the name is start from the specific words at start 
	System.out.println(" is name2 start from the labour : "+ name2.startsWith("LABOUR"));
	
	
	// the fun is use for to check weather the name is END from the specific name taking the full variable . 
		System.out.println(" is name2 end from the name 1 : "+ name2.endsWith(name1));  
		System.out.println(" is name2 end from the name 2 : "+ name2.endsWith(name2));
		
		// the fun is use for to check weather the name is END from the specific words at start 
		System.out.println(" is name2 end on the org  : "+ name2.endsWith("org"));
		
		
		//checking the the latter on the index 
		System.out.println(" the latter on the index  : "+name2.charAt(6));
		
		// the function which return the index  of the those specific latter
		System.out.println(" the index number of the '.' (any latter) : "+ name2.indexOf('.'));
		
		//if you want to search some latter after the specific latter you can by using this 
		System.out.println(" the index number of the '.' (any latter) : "+ name2.indexOf('.',7));
		
		// function for giving the space to the string from the start
		System.out.println(" giving space to the string from start : "+ name2.indent(8));
		
		//if you wana to search  the  index from the last you can give the comond like
		System.out.println(" sreaching form the last index  : "+ name2.lastIndexOf('o'));
		
		//function take the enteir string to search
		System.out.println(" sreaching form the last index  : "+ name2.lastIndexOf("org"));
		
		
		System.out.println(" sreaching form the last index  : "+ name2.equals(name1));
		
		System.out.println(" sreaching form the last index  : "+ name2.equalsIgnoreCase(name3));

		
		
		
		
		
		
	
	
	}
}
