package com.SOLID.singleresponsiblity;

import java.util.Date;

public class Promotion {
    public static boolean promotionThisYear(Employee emp, int year){
        if(year-emp.getDatOfJoining().getYear()>10){
            return true;
        }
        return false;
    }
}
