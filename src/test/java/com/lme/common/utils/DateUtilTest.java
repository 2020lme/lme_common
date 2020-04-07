package com.lme.common.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateUtilTest {

	@Test
	void testGetInitMonth() {
		
		Date date = DateUtil.getInitMonth(new java.util.Date(1000000000000l));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	
	@Test
	public void testRandomDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		for(int i=0; i<100; i++) {
			Date date = DateUtil.randomDate(c.getTime(), new Date());
		}
		Date date = new Date(1000000000000l);
		System.out.println(df.format(date));
		System.out.println(Math.random());
	}
	
	@Test
	public void testEndMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2020, 1,20);
		
		Date date = DateUtil.getEndMoth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd  HH:mm:ss");
		System.out.println(df.format(date));
	}
	
	@Test
	public void testGetAge() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 10,20);
		int i = DateUtil.getAgeByBirthday(c.getTime());
		System.out.println(i+"岁");
	}

}
