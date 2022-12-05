package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());

        Date date1 = new Date(System.currentTimeMillis());
        System.out.println(date1);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTimeFormatter.format(localDate));

        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());

        System.out.println(localDate.plusDays(7));
        System.out.println(localDate.minusDays(4));

        System.out.println(localDate.getEra());
        System.out.println(localDate.getChronology());

        ZoneId zoneId = ZoneId.of("Asia/Kolkata");

        LocalDate localDate1 = localDate.now(zoneId);
        System.out.println(localDate1);

        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 12, 3, 12, 7);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 12, 3, 12, 7);

        Duration duration = Duration.between(localDateTime1, localDateTime2);
        System.out.println(duration);

        LocalDate localDate2 = LocalDate.of(2000, 1, 1);
        LocalDate localDate3 = LocalDate.now();
        Period p = Period.between(localDate2, localDate3);
        System.out.println(p);


    }
}
