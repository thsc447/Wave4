package POO_I.classI.integrationII;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Start date: ");
        String start = sc.nextLine();

        System.out.println("Enter the value of company X: ");
        BigDecimal valueCompanyX = sc.nextBigDecimal();

        System.out.println("Enter the expected avearege growth: ");
        double average = sc.nextDouble();
        average /= 100;

        System.out.println("Enter the value of company X: ");
        BigDecimal valueCompanyy = sc.nextBigDecimal();

        sc.close();

        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(start);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int i = 1;
        while (valueCompanyX.compareTo(valueCompanyy) < 1) {
            if (i % 12 == 0)
                System.out.printf("The value of the company in the last 12 months is: %.2f%n", valueCompanyX);
            valueCompanyX = valueCompanyX.add(valueCompanyX.multiply(BigDecimal.valueOf(average)));
            i++;
        }

        cal.add(Calendar.MONTH, i);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.printf("The expected date for reaching the goal is: %s", df.format(cal.getTime()));
    }
}
