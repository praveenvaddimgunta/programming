import java.util.*;

class PowerofN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int count =0;
        while((q>0&&count!=-1)&&q!=1){
            if(q%p==0){
                q=q/p;
                count++;
            }else if(q%p!=0){
                count = -1;
            }     
        }
        System.out.println(count);    
    }
}