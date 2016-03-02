import java.util.Scanner;
public class decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t1,t2;
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text : ");
		t1 = scan.nextLine();
		t2 = t1.toUpperCase();
		
		for(int i = t2.length()-1 ; i >= 0 ; i-- )
		{
			ch = t2.charAt(i);
			if(ch == 'E')
			{
				ch = 'R';
			}
			else if(ch == 'R')
			{
				ch = 'W';
			}
			else if(ch == 'W')
			{
				ch = 'E';
			}
			System.out.print(ch);
		}
	}

}
