package ArrayMax;

public class ArrayMax {
    static int arr[] = { 12, 33, 56, 867, 98 };

    static int largest() {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
                return max;
            }
        }

    }

    public static void main(String args[]) {

        System.out.println(largest());

    }
}
