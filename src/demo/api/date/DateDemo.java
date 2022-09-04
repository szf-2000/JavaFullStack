package demo.api.date;

import java.text.SimpleDateFormat;

public class DateDemo {
    //根据时间判断星期几
    public static String getWeek(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        int w = 0;
        try {
            java.util.Date dt = sdf.parse(date);
            java.util.Calendar cal = java.util.Calendar.getInstance();
            cal.setTime(dt);
            w = cal.get(java.util.Calendar.DAY_OF_WEEK) - 1;
            if (w < 0)
                w = 0;
        } catch (Exception e) {
        }
        return weekDays[w];
    }

    public static void main(String[] args) {
        System.out.println(getWeek("2022-06-01"));
    }


}
