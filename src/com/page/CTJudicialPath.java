package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CTJudicialPath {

			
			@FindBy(xpath="(//a[contains(text(),'Milford')])[1]")
			public static WebElement OnclickTownM;
			
			@FindBy(xpath="(//a[contains(text(),'Trumbull')])[1]")
			public static WebElement OnclickTownT;
			
			@FindBy(xpath="(//a[contains(text(),'Norwalk')])[1]")
			public static WebElement OnclickTownN;
			
			@FindBy(xpath="(//a[contains(text(),'Stamford')])[1]")
			public static WebElement OnclickTownST;
					
			@FindBy(xpath="(//a[contains(text(),'Shelton')])[1]")
			public static WebElement OnclickTownSH;
			
			@FindBy(xpath="(//a[contains(text(),'Fairfield')])[1]")
			public static WebElement OnclickTownF;

			
			@FindBy(xpath="(//a[contains(text(),'View Full Notice')])[1]")
			public static WebElement OnclickNotice;
			
			@FindBy(xpath="(//a[contains(text(),'View Full Notice')])[2]")
			public static WebElement OnclickNotice1;
			
			@FindBy(xpath="(//a[contains(text(),'View Full Notice')])[3]")
			public static WebElement OnclickNotice2;
			
			@FindBy(id="ctl00_cphBody_hlnktownlist")
			public static WebElement BackToPage;
			

}
