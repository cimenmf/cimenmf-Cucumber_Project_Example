package com.cukeserp.utilities.seleniumcucumber;

import java.time.*;
import java.time.format.*;

public class DateConverter {

    /*
ben istedigim format dd/MM/yyyy hh:mm:ss
bana verilan format  2019-03-20 03:18:35
     */

        public static void main(String[] args) {



            String str = "2019-03-20 22:18:36";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
            System.out.println("1:    =>   "+dateTime.format(formatter2));


            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
            //Convert String to LocalDateTime
            String date = "2019-03-20 03:18:35";
            LocalDateTime ldt = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println("2:    =>   " + format.format(ldt));


            //Paris, 2016 Apr-Oct = DST, UTC+2, other months UTC+1
            //UTC+2
            ZonedDateTime databaseDateTime = ldt.atZone(ZoneId.of("UTC"));
            System.out.println("Database DateTime : " + format.format(databaseDateTime));

            //hard code a zoneoffset like this, UTC-5
            ZoneOffset nyOffSet = ZoneOffset.of("-04:00");
            ZonedDateTime nyDateTime = databaseDateTime.withZoneSameInstant(nyOffSet);
            System.out.println("Local Time         :" + format.format(nyDateTime));

            String databaseDT = format.format(ldt);
            String localTime = format.format(nyDateTime);


            System.out.println("databaseDT         :"+ databaseDT );
            System.out.println("localTime          :" + localTime);
        }

    }

