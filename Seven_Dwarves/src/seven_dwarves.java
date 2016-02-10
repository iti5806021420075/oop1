import java.util.Scanner;
public class seven_dwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,num4,num5,num6,num7,num8,num9;
			
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number1 : ");
		num1 = scan.nextInt();
		System.out.print("Enter Number2 : ");
		num2 = scan.nextInt();
		System.out.print("Enter Number3 : ");
		num3 = scan.nextInt();
		System.out.print("Enter Number4 : ");
		num4 = scan.nextInt();
		System.out.print("Enter Number5 : ");
		num5 = scan.nextInt();
		System.out.print("Enter Number6 : ");
		num6 = scan.nextInt();
		System.out.print("Enter Number7 : ");
		num7 = scan.nextInt();
		System.out.print("Enter Number8 : ");
		num8 = scan.nextInt();
		System.out.print("Enter Number9 : ");
		num9 = scan.nextInt();
		
		//num1
		if((num3 + num4 + num5 + num6 + num7 + num8 + num9)==100)
			System.out.print("Num1 = "+num1+" "+"Num2 = "+num2+" No Seven Dwarves");
		if((num2 + num4 + num5 + num6 + num7 + num8 + num9)==100)
			System.out.print("Num1 = "+num1+" "+"Num3 = "+num3+" No Seven Dwarves");
		if((num2 + num3 + num5 + num6 + num7 + num8 + num9)==100)
			System.out.print("Num1 = "+num1+" "+"Num4 = "+num4+" No Seven Dwarves");
		if((num2 + num3 + num4 + num6 + num7 + num8 + num9)==100)
			System.out.print("Num1 = "+num1+" "+"Num5 = "+num5+" No Seven Dwarves");
		if((num2 + num3 + num4 + num5 + num7 + num8 + num9)==100)
			System.out.print("Num1 = "+num1+" "+"Num6 = "+num6+" No Seven Dwarves");
		if((num2 + num3 + num4 + num5 + num6 + num8 + num9)==100)
			System.out.print("Num1 = "+num1+" "+"Num7 = "+num7+" No Seven Dwarves");
		if((num2 + num3 + num4 + num5 + num6 + num7 + num9)==100)
			System.out.print("Num1 = "+num1+" "+"Num8 = "+num8+" No Seven Dwarves");
		if((num2 + num3 + num4 + num5 + num6 + num7 + num8)==100)
			System.out.print("Num1 = "+num1+" "+"Num9 = "+num9+" No Seven Dwarves");
		
		//num2
		if((num1 + num4 + num5 + num6 + num7 + num8 + num9)==100)
			System.out.print("Num2 = "+num2+" "+"Num3 = "+num3+" No Seven Dwarves");
		if((num1 + num3 + num5 + num6 + num7 + num8 + num9)==100)
			System.out.print("Num2 = "+num2+" "+"Num4 = "+num4+" No Seven Dwarves");
		if((num1 + num3 + num4 + num6 + num7 + num8 + num9)==100)
			System.out.print("Num2 = "+num2+" "+"Num5 = "+num5+" No Seven Dwarves");
		if((num1 + num3 + num4 + num5 + num7 + num8 + num9)==100)
			System.out.print("Num2 = "+num2+" "+"Num6 = "+num6+" No Seven Dwarves");
		if((num1 + num3 + num4 + num5 + num6 + num8 + num9)==100)
			System.out.print("Num2 = "+num2+" "+"Num7 = "+num7+" No Seven Dwarves");
		if((num1 + num3 + num4 + num5 + num6 + num7 + num9)==100)
			System.out.print("Num2 = "+num2+" "+"Num8 = "+num8+" No Seven Dwarves");
		if((num1 + num3 + num4 + num5 + num6 + num7 + num8)==100)
			System.out.print("Num2 = "+num2+" "+"Num9 = "+num9+" No Seven Dwarves");
		
		//num3
		if((num1 + num2 + num5 + num6 + num7 + num8 + num9)==100)
			System.out.print("Num3 = "+num3+" "+"Num4 = "+num4+" No Seven Dwarves");
		if((num1 + num2 + num4 + num6 + num7 + num8 + num9)==100)
			System.out.print("Num3 = "+num3+" "+"Num5 = "+num5+" No Seven Dwarves");
		if((num1 + num2 + num4 + num5 + num7 + num8 + num9)==100)
			System.out.print("Num3 = "+num3+" "+"Num6 = "+num6+" No Seven Dwarves");
		if((num1 + num2 + num4 + num5 + num6 + num8 + num9)==100)
			System.out.print("Num3 = "+num3+" "+"Num7 = "+num7+" No Seven Dwarves");
		if((num1 + num2 + num4 + num5 + num6 + num7 + num9)==100)
			System.out.print("Num3 = "+num3+" "+"Num8 = "+num8+" No Seven Dwarves");
		if((num1 + num2 + num4 + num5 + num6 + num7 + num8)==100)
			System.out.print("Num3 = "+num3+" "+"Num9 = "+num9+" No Seven Dwarves");
		
		//num4
		if((num1 + num2 + num3 + num6 + num7 + num8 + num9)==100)
			System.out.print("Num4 = "+num4+" "+"Num5 = "+num5+" No Seven Dwarves");
		if((num1 + num2 + num3 + num5 + num7 + num8 + num9)==100)
			System.out.print("Num4 = "+num4+" "+"Num6 = "+num6+" No Seven Dwarves");
		if((num1 + num2 + num3 + num5 + num6 + num8 + num9)==100)
			System.out.print("Num4 = "+num4+" "+"Num7 = "+num7+" No Seven Dwarves");
		if((num1 + num2 + num3 + num5 + num6 + num7 + num9)==100)
			System.out.print("Num4 = "+num4+" "+"Num8 = "+num8+" No Seven Dwarves");
		if((num1 + num2 + num3 + num5 + num6 + num7 + num8)==100)
			System.out.print("Num4 = "+num4+" "+"Num9 = "+num9+" No Seven Dwarves");
		
		//num5
		if((num1 + num2 + num3 + num4 + num7 + num8 + num9)==100)
			System.out.print("Num5 = "+num5+" "+"Num6 = "+num6+" No Seven Dwarves");
		if((num1 + num2 + num3 + num4 + num6 + num8 + num9)==100)
			System.out.print("Num5 = "+num5+" "+"Num7 = "+num7+" No Seven Dwarves");
		if((num1 + num2 + num3 + num4 + num6 + num7 + num9)==100)
			System.out.print("Num5 = "+num5+" "+"Num8 = "+num8+" No Seven Dwarves");
		if((num1 + num2 + num3 + num4 + num6 + num7 + num8)==100)
			System.out.print("Num5 = "+num5+" "+"Num9 = "+num9+" No Seven Dwarves");
		
		//num6
		if((num1 + num2 + num3 + num4 + num5 + num8 + num9)==100)
			System.out.print("Num6 = "+num6+" "+"Num7 = "+num7+" No Seven Dwarves");
		if((num1 + num2 + num3 + num4 + num5 + num7 + num9)==100)
			System.out.print("Num6 = "+num6+" "+"Num8 = "+num8+" No Seven Dwarves");
		if((num1 + num2 + num3 + num4 + num5 + num7 + num8)==100)
			System.out.print("Num6 = "+num6+" "+"Num9 = "+num9+" No Seven Dwarves");
		
		//num7
		if((num1 + num2 + num3 + num4 + num5 + num6 + num9)==100)
			System.out.print("Num7 = "+num7+" "+"Num8 = "+num8+" No Seven Dwarves");
		if((num1 + num2 + num3 + num4 + num5 + num6 + num8)==100)
			System.out.print("Num7 = "+num7+" "+"Num9 = "+num9+" No Seven Dwarves");
		
		//num8
		if((num1 + num2 + num3 + num4 + num5 + num6 + num7)==100)
			System.out.print("Num8 = "+num8+" "+"Num9 = "+num9+" No Seven Dwarves");
	}

}
