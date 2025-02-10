import java.util.*;
public class BasicPattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows ");
        int row=sc.nextInt();
        //outer loop for row 
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}