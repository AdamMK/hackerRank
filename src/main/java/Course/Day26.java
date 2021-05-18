package Course;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Day26 {

    public static LocalDate takeDate(int day, int month, int year) {
        return LocalDate.of(year, month, day);
    }

    public static int fine(LocalDate ret, LocalDate due) {
        int dayFine = 15;
        int monthFine = 500;
        int maxFine = 10000;
        if (ret.getYear() == due.getYear()) {
            if (YearMonth.from(ret).isAfter(YearMonth.from(due))) {
                int numberMonths = (int) ChronoUnit.MONTHS.between(due, ret);
                return monthFine * numberMonths;
            } else if (ret.getMonth() == due.getMonth() && ret.getDayOfMonth() > due.getDayOfMonth()) {
                int numberDays = (int) ChronoUnit.DAYS.between(due, ret);
                return numberDays * dayFine;
            }
        } else if (ret.getYear() > due.getYear()) {
            return maxFine;
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

//        int[] li = new int[3];
//
//        for (int i = 0; i < li.length; i++) {
//            li[i] = scanner.nextInt();
//        }
//        LocalDate returnDate = takeDate(li[0], li[1], li[2]);
//
//        for (int i = 0; i < li.length; i++) {
//            li[i] = scanner.nextInt();
//        }
//        LocalDate dueDate = takeDate(li[0], li[1], li[2]);
        LocalDate returnDate = takeDate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        LocalDate dueDate = takeDate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println(fine(returnDate, dueDate));
    }
}