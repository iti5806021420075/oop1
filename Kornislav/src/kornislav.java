import java.util.Scanner;
public class kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,temp;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter A : ");
		a = scan.nextInt();
		System.out.print("Enter B : ");
		b = scan.nextInt();
		System.out.print("Enter C : ");
		c = scan.nextInt();
		System.out.print("Enter D : ");
		d = scan.nextInt();
		
		if(a>b)
		{
			temp=a;
			a=b;
			b=temp;
		}
		
		if(a>c)
		{
			temp=a;
			a=c;
			c=temp;
		}
		
		if(a>d)
		{
			temp=a;
			a=d;
			d=temp;
		}
		
		if(b>c)
		{
			temp=b;
			b=c;
			c=temp;
		}
		
		if(b>d)
		{
			temp=b;
			b=d;
			d=temp;
		}
		
		if(c>d)
		{
			temp=c;
			c=d;
			d=temp;
		}
		
		System.out.print("More Area =  " + c * a);
	}

}
