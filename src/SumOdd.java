public class SumOdd {
    public static boolean isOdd(int number) {
        if ((number<=0)||(number%2==0)) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        if ((end<start)||(start<0 || end<0)) {
            return -1;
        }
        int oddSum=0;
        for (int number=start;number<=end;number++){
            if (isOdd(number)) {
                oddSum+=number;
            }
        }
        return oddSum;
    }
}
