package com.w2a.utils;

import java.util.ArrayList;

public class ExcelUtilTest {

	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		reader = new Xls_Reader("F:\\EthansWorkspace\\liveProject\\src\\test\\resources\\excel\\testdata.xlsx");
		
		
		for (int rowNum = 2 ; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			
			String fName = reader.getCellData("Sheet1", "fname", rowNum);
			String lName = reader.getCellData("Sheet1", "lname", rowNum);
			String pCode = reader.getCellData("Sheet1", "pcode", rowNum);
			
			Object ob[] = {fName,lName,pCode};
			myData.add(ob);
		}
		
		return myData;
	
	}

}
