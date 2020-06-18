package com.edu.springmvc.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2020/6/18 12:05
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(s);
            return date;
        } catch (ParseException e) {
            return null;
        }
    }
}
