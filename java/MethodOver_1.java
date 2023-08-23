public class MethodOver_1 {
    public static void printArray(Integer[] a){
        for(int element:a){
            System.out.println(element);
        }
    }
    public static void printArray(Double[] b){
        for(double element:b){
            System.out.println(b);
        }
    }
    public static void printArray(Character[] c){
        for(char element:c){
            System.out.println(c);
        }
    }
    public static void main(String args[]){
        Integer[] a={1,2,2,4,5};
        Double[] b={2.2,2.3,4.5,8.9};
        Character[] c={'j','s','v','m'} ;
        printArray(a);
        printArray(b);
        printArray(c);
    }
    
}
