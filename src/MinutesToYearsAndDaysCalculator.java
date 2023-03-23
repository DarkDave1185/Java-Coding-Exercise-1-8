public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes<0) {
            System.out.println("Invalid Value");
        }else {
            long dayMinutes = minutes / 1440;
            long yearDays = dayMinutes / 365;
            long yearDaysLeft = dayMinutes % 365;
            System.out.println(minutes + " min = " + yearDays + " y and " + yearDaysLeft + " d");
        }
    }
}
