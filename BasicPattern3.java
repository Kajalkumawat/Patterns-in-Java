public class BasicPattern3 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            //space
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            //star 
            for(int j=3;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
