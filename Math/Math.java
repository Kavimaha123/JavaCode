package Math;

public class Math {
        public static void main(String args[]){
            int result=sum(10);
            System.out.println(result);
        }
        public static int sum(int k){
            if(k>0){
                return k+sum(10-1);
            }
            else{
                return 0;
            }
        }
}
