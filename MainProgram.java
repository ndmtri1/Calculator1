import java.util.Scanner;

public class MainProgram {
	static double result,number;
		public double doPlus(double firstnum, double secondnum)
	{
		result = firstnum + secondnum;
		return result;
	}
	public double doMinus(double firstnum, double secondnum)
	{
		result = firstnum - secondnum;
		return result;
	}
	public double doTime(double firstnum, double secondnum)
	{
		result = firstnum * secondnum;
		return result;
	}
	public double doDevide(double firstnum, double secondnum)
	{
		result = firstnum / secondnum;
		return result;
	}
	public double doSquare(double firstnum)
	{
		result = firstnum * firstnum;
		return result;
	}
	public double doDevidedbyone(double firstnum)
	{
		result = 1/firstnum;
		return result;
	}
	public void inputNumber()	// return number variable
	{
		boolean check=true;
		while (check==true)
		{
			try
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Input number: ");
				number = scanner.nextDouble();
				check=false;
			}
			catch(Exception e)
			{
				System.out.println("Not a number, Input again: ");
			}
		}
	}
	public int inputOperation()
	{
		boolean check=true;
		int op=0;
		while(check==true)
		{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Input operation: ");
				String operation = scanner.nextLine();
				switch(operation){
				case "+": 
					op=1;
					check=false;
					break;					
				case "-":
					op=2;
					check=false;
					break;
				case "*":
					op=3;
					check=false;
					break;
				case "/":
					op=4;
					check=false;
					break;
				case "=":
					op=5;
					check=false;
					break;
				case "sqrt":
					op=6;
					check=false;
					break;
				case "1/x":
					op=7;
					check=false;
					break;
				case "ac":
					op=8;
					check=false;
					break;
				case "off":
					op=9;
					check=false;
					break;					
				default:
					System.out.println("Not a operation, Input again: ");
				}
		}
		return op;
	}
    public static void main(String[] args) 
	{
		boolean check=true;
		double firstnumber=0,secondnumber=0;	
		while(true)
		{	
			System.out.println("Calculator");
			MainProgram run = new MainProgram();
			run.inputNumber(); 
			firstnumber = number;
			result = number;
			do
			{	
				int operate = run.inputOperation();
				if (operate ==9)
				{
					System.exit(0);
				}
				if (operate ==5)
				{
					System.out.println("Result:"+result);
					check=false;
					break;
				}
				if (operate ==6)
				{	
					run.doSquare(firstnumber);
					System.out.println("Result:"+result);
					firstnumber = result;
					continue;
				}
				if (operate ==7)
				{	
					run.doDevidedbyone(firstnumber);
					System.out.println("Result:"+result);
					firstnumber = result;
					continue;
				}
				if (operate ==8)
				{
					firstnumber = 0;
					secondnumber = 0;
					result=0;
					break;
				}
				run.inputNumber(); 
				secondnumber = number;
				switch(operate)
				{
					case 1:
						run.doPlus(firstnumber,secondnumber);
						System.out.println("Result:"+result);
						firstnumber = result;
						break;
					case 2:
						run.doMinus(firstnumber,secondnumber);
						System.out.println("Result:"+result);
						firstnumber = result;
						break;
					case 3:
						run.doTime(firstnumber,secondnumber);
						System.out.println("Result:"+result);
						firstnumber = result;
						break;		
					case 4:
						if(secondnumber==0)
						{
							System.out.println("Can not devide 0");
							check=false;
							break;
						}
						else
						{
							run.doDevide(firstnumber,secondnumber);
							System.out.println("Result:"+result);
							firstnumber = result;
							break;	
						}
					default:
						break;
				}
				
			}while(check==true);
		}
	}

}
