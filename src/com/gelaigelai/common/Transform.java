package com.gelaigelai.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import javassist.bytecode.stackmap.BasicBlock.Catch;
import java.text.ParseException;

public class Transform {
public static String DateToString(Date d){
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String time=sdf.format(d);
	return time;
}
public static Date StringToDate(String date){
	 Date d=null;
	try{
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	  d=sdf.parse(date);}
	catch(ParseException ex){
		ex.printStackTrace();
	}
	return d;
}
public  static int getAge(String date) {
	Date birthDate=StringToDate(date);
	  if (birthDate == null)
	   throw new
	RuntimeException("出生日期不能为null");
	  
	  int age = 0;
	  
	  Date now = new Date();
	  
	  SimpleDateFormat format_y = new
	SimpleDateFormat("yyyy");
	  SimpleDateFormat format_M = new
	SimpleDateFormat("MM");
	  
	  String birth_year =
	format_y.format(birthDate);
	  String this_year =
	format_y.format(now);
	  
	  String birth_month =
	format_M.format(birthDate);
	  String this_month =
	format_M.format(now);
	  
	  // 初步，估算
	  age =
	Integer.parseInt(this_year) - Integer.parseInt(birth_year);
	  
	  // 如果未到出生月份，则age - 1
	  if(this_month.compareTo(birth_month) < 0)
	   age -=1;
	  if (age <0)
	   age =0;
	  return age;
	 }
}
