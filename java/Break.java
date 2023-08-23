public class Break {
    public static void main(String args[]){
        int [] array={23,45,67,865,123};
        int no=123;
        int i=0;
        boolean found=false;
        for( i=0;i<array.length;i++){
            if(array[i]==no){
                found =true;
                break;
            }
        }
        if(found){
            System.out.println(no + i);
        }else{
            System.out.println(no);
        }
    }
    
}
