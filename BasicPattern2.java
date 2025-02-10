public class BasicPattern2 {
    public static void main(String[] args){
        for(int i=1;i<=3;i++){ 
            //first for space 
            for(int s=2;s>=i;s--){
                System.out.print(" ");
            }
            //second loop 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
