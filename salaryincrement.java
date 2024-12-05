import java.util.*;
public class salaryincrement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pp=sc.nextInt();
        int exp=sc.nextInt();
        int sal=sc.nextInt();
        int inc;
        if(pp>=5 && exp>=10 && sal>=50000)
        {
            inc=(sal/100)*10;
            System.out.println("after increment sal="+(sal+inc));
        }
        else if(pp>=3 && pp<5 &&exp>=5 && exp<10 && sal>=30000 && sal<50000)
        {
            inc=(sal/100)*8;
            System.out.println("after increment sal="+(sal+inc));
        }
        else if(pp>=1 && pp<3 &&exp>=1 && exp<5 && sal>=15000 && sal<30000)
        {
            inc=(sal/100)*6;
            System.out.println("after increment sal="+(sal+inc));
        }
        else
        {
            System.out.println("you are not eligible for increment");
        }
    }
}