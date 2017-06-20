package guvi;
import java.util.Scanner;
public class roman {
	public static void main(String[] args) {
        String RomanNo = "";
		int DecimalNo = 0;
		System.out.println("Enter a roman number : ");
		Scanner input = new Scanner(System.in);
		RomanNo = input.next();
				int length=  RomanNo.length();
				input.close();
        int n=0;
        int prevnum = 0;
        for (int i=length-1;i>=0;i--)
        { 
                char x =RomanNo.charAt(i);
                x = Character.toUpperCase(x);
                switch(x)
                {  
                        case 'I':
                        prevnum = n;
                        n= 1;
                        break;
                        case 'V':
                             prevnum = n;
                        n = 5;
                        break;
                        case 'X':
                                prevnum = n;
                        n= 10;
                        break;
                        case 'L':
                                prevnum = n;
                        n= 50;
                        break;
                        case 'C':
                                prevnum =n;
                        n= 100;
                        break;
                        case 'D':
                                prevnum = n;
                        n= 500;
                        break;
                        case 'M':
                                prevnum = n;
                        n= 1000;
                        break;
		           	}
                if (n<prevnum)
                {DecimalNo= DecimalNo-n;}
                 else
                DecimalNo = DecimalNo +n;
        }
        System.out.println("The Equilvalent Roman number is " + DecimalNo);
 	}
}

