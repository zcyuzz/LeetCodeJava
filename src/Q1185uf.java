public class Q1185uf {
    public static String dayOfTheWeek(int day, int month, int year) {
        int days = 0;
        days += (year - 1971) * 365;
        days += year > 2000 ? (year - 1971 / 2) : 1;
        System.out.println(days);
        return "";
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(1, 1, 1970));
    }
}
