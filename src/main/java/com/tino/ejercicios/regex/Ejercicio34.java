package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un texto que contiene fechas y horas en formato ISO 8601,
 * como "2023-10-26T12:00:00+03:00",
 * y extrae todas las fechas junto con sus zonas horarias.
 */
public class Ejercicio34 {
    private static void timeZoneParser(String tz){
        String display = "";
        String regexDate = "([0-9]{4}-[0-9]{2}-[0-9]{2})(?=T[0-9]{2}:[0-9]{2}:[0-9]{2}\\+[0-9]{2}:[0-9]{2})";
        Pattern patternDate = Pattern.compile(regexDate);
        Matcher matcherDate = patternDate.matcher(tz);
        if(matcherDate.find()) display = "Fecha: " + matcherDate.group();
        String regexTime = "(?<=[0-9]{4}-[0-9]{2}-[0-9]{2}T)([0-9]{2}:[0-9]{2}:[0-9]{2})(?=\\+[0-9]{2}:[0-9]{2})";
        Pattern patternTime = Pattern.compile(regexTime);
        Matcher matcherTime = patternTime.matcher(tz);
        if(matcherTime.find()) display += ", hora: " + matcherTime.group();
        Pattern patternZone = Pattern.compile("(?<=[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2})(\\+[0-9]{2}:[0-9]{2})");
        Matcher matcherZone = patternZone.matcher(tz);
        if(matcherZone.find()) display += ", zona horaria: " + matcherZone.group();
        System.out.println(display);
    }

    public static void main(String[] args) {
        String[] tzs = {
                "2021-09-10T05:40:00+05:00",
                "2023-04-11T03:22:20+03:00",
                "2020-12-07T07:15:10+03:00",
                "2017-08-21T14:33:45+07:00",
                "2014-03-31T15:16:16+06:00"
        };
        for(String timezone: tzs){
            timeZoneParser(timezone);
        }
    }
}
