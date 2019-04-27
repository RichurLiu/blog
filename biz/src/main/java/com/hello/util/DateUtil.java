package com.hello.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
public class DateUtil {
    public static String SHORT_DATE="yyyy-MM-dd";
    /**
     * 获取几天后的时间
     * @param date
     * @param num
     * @return
     */
    public static Date getDaysLater(Date date, int num){
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(Calendar.DAY_OF_MONTH, num);
        return instance.getTime();
    }


    public static String dateToShortStr(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat(SHORT_DATE);
        return formatter.format(date);
    }

    public static Date shortStrToDate(String date){
        SimpleDateFormat formatter = new SimpleDateFormat(SHORT_DATE);
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date dateToShort(Date date){
        return shortStrToDate(dateToShortStr(date));
    }

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat(SHORT_DATE);
        System.out.println(LocalDate.now());
    }


}
