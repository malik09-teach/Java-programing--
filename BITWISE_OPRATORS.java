package artimetics;
import java.util.Scanner;

public class BITWISE_OPRATORS {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
int num1,num2 ,res;
	String op;

System.out.print("enter num 1:");
num1=s.nextInt();

System.out.print("enter num 2:");
num2=s.nextInt();

System.out.print("opreator & , | , ^, >>, <<, >>>, ~ :");
op =s.next();

if(op.equals("&")) {
		res=num1&num2;
		System.out.print("result of AND : "+res);
			}
	
else if (op.equals("|")) {
		res=num1|num2;
	System.out.print("result of  OR : "+res);
	}

else if (op.equals("^")) {
	res=num1^num2;
	System.out.print("result of XOR : "+res);
	}

else if (op.equals("~")) {
	System.out.print("1:for num1 and 2:for num2:");
	int choice=s.nextInt();
	
	if(choice==1) {
	res=~num1;
	System.out.print("result of not : "+res);
	}
	
	else if(choice==2) {
		res=~num2;
		System.out.print("result of not : "+res);
			}
	
	else {
		System.out.print("innvalid opt ");
		}	
}

else if (op.equals(">>")) {
	System.out.print("1:for num1 and 2:for num2:");
	int choice=s.nextInt();

	System.out.print("want to bits move :");
	int n=s.nextInt();
	
	if(choice==1) {
	res=num1>>n;
	System.out.print("result of right shift : "+res);
	}
	
	else if(choice==2) {
		res=num2>>n;
		System.out.print("result of right shift : "+res);
			}
	else {
		System.out.print("innvalid opt ");		
	}
}
else if (op.equals(">>>")) {
	
	System.out.print("1:for num1 and 2:for num2:");
	int choice=s.nextInt();
	
	System.out.print("want to bits move :");
	
	int n=s.nextInt();
	if(choice==1) {
	res=num1>>>n;
	System.out.print("result of unsign right shift  : "+res);
	}
	else if(choice==2) {
		res=num2>>>n;
		System.out.print("result of unsign right shift  : "+res);	
	}
	else {
		System.out.print("innvalid opt ");
		
	}
}

else if(op.equals("<<")) {
	
	System.out.print("1:for num1 and 2:for num2:");
	int choice=s.nextInt();
	
	System.out.print("want to bits move :");
	int n=s.nextInt();
	
	if(choice==1) {
	res=num1<<n;
	System.out.print("result of left shift  : "+res);
	}
	
	else if(choice==2) {
		res=num2>>>n;
		System.out.print("result of left shift : "+res);	
	}
	else {
		System.out.print("innvalid opt ");		
	}
}
else {
		
		System.out.print("invalid opreator");
	}
}
	}


