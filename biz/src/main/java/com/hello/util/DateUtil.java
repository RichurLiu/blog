package com.hello.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
public class DateUtil {
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
}
