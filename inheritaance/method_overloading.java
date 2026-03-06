package inhertance;



class calcualtion {

private int n1;
private int n2;
private int n3;


calcualtion (int n1,int n2,int n3){
	
	this.n1=n1;
	this.n2=n2;
	this.n3=n3;
}

	int maximum(int n1,int n2) {

		return n1>n2 ? n1:n2;
		
	}
	
int maximum(int n1 ,int n2,int n3) {
	
if (n1>n2 && n1>n3) { 
	return n1;
	}
else if(n2>n1 && n2>n3) {
	return n2;
}

return n3;

	
}

}

public class method_overloading {

	public static void main(String []args) {
		
		calcualtion max=new calcualtion (21,22,31);
		
	System.out.println(	max.maximum(322, 11));
	System.out.println(	max.maximum(3, 22, 21));
		
	}
	
}
