import java.util.*;
public class count1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
           int n=sc.nextInt();
           int c=0;
           for(int j=1;j<=n;j++){
            if(n%j==0)
            c+=1;
            if(i*i!=n){
                c+=1;
            }
           }System.out.print(c);
        }
    }
}        