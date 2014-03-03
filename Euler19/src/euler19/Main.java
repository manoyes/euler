/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler19;

/**
 *
 * @author matt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 1901;
        int numSundaysOnFirstOfMonth = 0;
        Month month = Month.JAN;
        int day = 2;
        final int endYear = 2001;

        while (year < endYear) {
            switch (month) {
                case SEP:
                case APR:
                case JUN:
                case NOV:
                    day = (day + 30) % 7;
                    break;
                case JAN:
                case MAR:
                case MAY:
                case JUL:
                case AUG:
                case OCT:
                case DEC:
                    day = (day + 31) % 7;
                    break;
                case FEB:
                    if (isLeapYear(year)) {
                        day = (day + 29) % 7;
                    } else {
                        day = (day + 28) % 7;
                    }
                    break;
            }

            if (day == 0) {
                numSundaysOnFirstOfMonth++;
            }

            switch (month) {
                case JAN:
                    month = Month.FEB;
                    break;
                case FEB:
                    month = Month.MAR;
                    break;
                case MAR:
                    month = Month.APR;
                    break;
                case APR:
                    month = Month.MAY;
                    break;
                case MAY:
                    month = Month.JUN;
                    break;
                case JUN:
                    month = Month.JUL;
                    break;
                case JUL:
                    month = Month.AUG;
                    break;
                case AUG:
                    month = Month.SEP;
                    break;
                case SEP:
                    month = Month.OCT;
                    break;
                case OCT:
                    month = Month.NOV;
                    break;
                case NOV:
                    month = Month.DEC;
                    break;
                case DEC:
                    month = Month.JAN;
                    year++;
                    break;
            }

            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
            System.out.println("Year: " + year);

        }

        /*
        System.out.println("1900: " + isLeapYear(1900));
        System.out.println("2000: " + isLeapYear(2000));
        System.out.println("2003: " + isLeapYear(2003));
        System.out.println("2004: " + isLeapYear(2004));

         * */
        System.out.println("Number of Sundays: " + numSundaysOnFirstOfMonth);
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
    }

    public enum Month {

        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }
}
