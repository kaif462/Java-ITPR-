// package 11 Oct;

public class continueStatement {
    public static void main(String[] args) {
        int num = 10 ;
        while(num < 20){
            if( num == 16){
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
    
}
