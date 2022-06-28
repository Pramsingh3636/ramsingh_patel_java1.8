package com.myzensar;

import com.rams.zensar.MyData;

public class MyExtendedData extends MyData
{
		/*
		 * base class has pub pri pro def
		 * what can i access : pub pro
		 * pri : class
		 * def : package
		 * pro : package + or subclass
		 */
		public void fun()
		{
			super.pub = 55;
			super.pro = 46;
		}

}
