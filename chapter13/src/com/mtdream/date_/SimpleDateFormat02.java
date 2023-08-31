package com.mtdream.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat02 {
    public static void main(String[] args) throws ParseException {
        /*
        需求：秒杀活动：2023年11月11日 0:0:0（毫秒值)
             开始时间：2023年11月11日 0:10:0（毫秒值)

             小贾下单并付款时间：2023年11月11日 0:01:00
             小皮下单并付款时间：2023年11月11日 0:01:00
         */

        // 1.定义字符串表示三个时间，格式化，把时间按我们想要的方式展示
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:01:00";

        // 2.解析上面的三个时间，解析就是把一个字符串表示的时间转换成Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        // 3.得到三个时间的毫秒值，才能对它进行计算以及接下来的判断
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        // 4.判断
        if(orderTime > startTime && orderTime <= endTime){
            System.out.println("参加秒杀活动成功");
        }else{
            System.out.println("参加秒杀活动失败");
        }















    }
}
