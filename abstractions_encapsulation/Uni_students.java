package abstraction_encapsulation_constructor;
import java.util.Scanner;
public class Uni_students {


 private String name ,id ;
	private  int max_marks,obt_marks;
	
	Uni_students(String name , String id, int max_marks ,int obt_marks){
		
		 this. name=name ; 
		 this.id=id ;
		
		 this.max_marks= max_marks;
		 this.obt_marks=obt_marks;
		 
		 
	}
	
  String namefun() {
	  return name  ;  
  }
  
  String ids() {
	  return id ; 
	  
  }
  
  int obt() {
	  
	 return obt_marks;
  }
  
  int maxi() {
	  return max_marks ;
	  
  }
  
  boolean isqulified() {
	  return obt_marks>=max_marks/10*4;
  }
  
  public String toString() {
	 
	  return "\n name :"+name +"\n id :"+id+"\n obt marks : "+obt_marks+"\n is qulified :"+isqulified();
  }
  
  



	public static void main (String []args) {
		Scanner s=new Scanner(System.in);	

		System.out.println("enter num of object you want: ");
		
		int n=s.nextInt();
		
		Uni_students student[]=new Uni_students [n];
		s.nextLine();  
		for (int i=0;i<n;i++) {
			s.nextLine();  
		System.out.print("enter your name :");
			String name=s.nextLine();
			System.out.print("enter your id :");
					String id=s.nextLine();
					System.out.print("enter MAX MARKS :");
              int max_marks=s.nextInt();

              System.out.print("enter OBT MARKS  :");

		int obt_marks=s.nextInt();
		
		
		student[i]=new Uni_students (name, id, max_marks, obt_marks);
		s.nextLine();  
	}
		
		for (Uni_students k:student) {
			
			System.out.println(k);
			
		}
}
	}