import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("what is the principle amount?");
        int p = sc.nextInt();
        System.out.println("what is the interest rate");
        double rate = sc.nextDouble();
        double r = rate/100;
        System.out.println("how many years will it be invested for");
        int t = sc.nextInt();
        System.out.println("how many times will it compound per year");
        double n = sc.nextInt();

        double A = p*Math.pow(1+((rate*0.01)/n),n*t);

        System.out.println(p +  " invested at "+r+" for "+t+" years compounded"+n+ " times per year is "+A);
    }
}
