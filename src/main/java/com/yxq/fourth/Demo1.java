package com.yxq.fourth;

import java.time.*;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2019, 10, 9);
        int ldy = ld.getYear();
        int ldm = ld.getMonthValue();
        int ldd = ld.getDayOfMonth();
        System.out.println(ldy + "：" + ldm + "：" + ldd);
        LocalDate date = LocalDate.now();
        int datey = date.getYear();
        int datem = date.getMonthValue();
        int dated = date.getDayOfMonth();
        System.out.println(datey + "：" + datem + "：" + dated);
        Date date1 = new Date();
        System.out.println(date1.toString());
    }
}
