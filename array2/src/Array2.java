//Elena Voinu
public class Array2 {
    public static void main(String[] args){
        int [] a = {1,2,3};
        int [] b = {1,4,6};
        System.out.println(commonEnd(a, b));

    }
    public static boolean commonEnd(int[] a, int[] b) {
        // check if the first element in first array is the same as in the second or the
        // last element is the same in  both arrays
        if(a[0]==b[0] || a[a.length-1] == b[b.length-1])
            return true;

        return false;
    }

}
