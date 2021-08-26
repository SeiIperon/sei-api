package br.gov.ro.pge.sei.api.util;

import org.apache.commons.lang3.ObjectUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class DateTimeUtils {

    private static final String TIME_ZONE_ID = "America/Porto_Velho";
    private static final DateTimeZone DATE_TIME_ZONE = DateTimeZone.forID(TIME_ZONE_ID);

    public static DateTime newDateTime() {
        return DateTime.now().withZone(DATE_TIME_ZONE);
    }

    public static Date newDate() {
        return newDateTime().toDate();
    }

    public static Date plusDays(Date date, int days) {
        DateTime dateTime = null;
        if (ObjectUtils.isEmpty(date)) {
            dateTime = newDateTime();
        } else {
            dateTime = new DateTime(date);
        }
        dateTime.plusDays(days);
        return dateTime.toDate();
    }

    public static int getCurrentYear(Date date) {
        if (ObjectUtils.isNotEmpty(date)) {
            DateTime dateTime = new DateTime(date);
            return dateTime.getYear();
        }
        return DateTime.now().withZone(DATE_TIME_ZONE).getYear();
    }

    public static String format(Date date, final String pattern) {
        if (ObjectUtils.isEmpty(date)) {
            date = newDate();
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        sdf.setTimeZone(TimeZone.getTimeZone(TIME_ZONE_ID));
        return sdf.format(date);
    }
}
