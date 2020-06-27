public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
