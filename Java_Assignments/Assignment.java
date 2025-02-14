package basics;

public class Assignment {
public static void main(String[] args) {
	int a=10;
	System.out.println(a);
	int b=a;
	System.out.println(b);
	
	//b=b+a (+=)
	b+=a;
	System.out.println(b);
	//b=b-a (-=)
	b-=a;
	System.out.println(b);
	//b=b*a (-*)
	b*=b;
	System.out.println(b);
	//b=b/a (/=)
	b/=b;
	System.out.println(b);
	
}
}
