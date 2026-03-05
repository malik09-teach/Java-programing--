package abstraction_encapsulation_constructor;

public class mods {

public static void main (String []args){
	int arr[]= {0,2,4,1,3};
	
	for (int i=0;i<5;i++) {
		
		arr[i]=arr[((arr[i]+3)%5)];
	
		System.out.println(arr[i]);
	}
	

}
	
}


