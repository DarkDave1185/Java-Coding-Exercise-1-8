public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || (hourOfDay>7 && hourOfDay<23) || (hourOfDay<0 || hourOfDay>23)) {
            return false;
        } else {
            return true;
        }
    }
}
