package com.gavin.util;

import java.text.SimpleDateFormat;
import java.util.Date;

//��ȡ����ϵͳʱ��
public class TimeUtil {
	public static String theNowTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}
}
