public class Continue {
    public static void main(String args[]){
        StringBuffer stringbuffer=new StringBuffer("hello hi how are you");
        int length=stringbuffer.length();
        int count=0;
        for(int i=0;i<length;i++){
            if(stringbuffer.charAt(i) != 'h'){
                continue;
                count++;
                stringbuffer.setCharAt(i,'h');
            }
            System.out.println(count);
            System.out.println(stringbuffer);
        }
    }
}
