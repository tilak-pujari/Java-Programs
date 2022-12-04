package com.grooming;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetTime {

	public static void main(String[] args) {

		Calendar cal=Calendar.getInstance();
		Date time=cal.getTime();
		System.out.println(time);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss");
		String modtime=sdf.format(time);
		System.out.println(modtime);
	}

}
