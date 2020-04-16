package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.commonfunctions.BaseUrl;
import com.page.CTJudicialPath;

public class CTJudicialTest extends BaseUrl {

	BaseUrl commonmethod=new BaseUrl();
		
	
	@Test (priority=1)
	public void CityMilford() throws Exception {
		Actions action = new Actions(driver);
				
		PageFactory.initElements(driver, CTJudicialPath.class);
		CTJudicialPath.OnclickTownM.click();
			
		WebElement element1 = CTJudicialPath.OnclickNotice;
		action.contextClick(element1).perform();Thread.sleep(2000);
		commonmethod.OpenNewTab();
		
		WebElement element2 = CTJudicialPath.OnclickNotice1;
		action.contextClick(element2).perform();Thread.sleep(2000);
		commonmethod.OpenNewTab();
		
		CTJudicialPath.BackToPage.click();
	}
	
	
	@Test (priority=2)
	public void CityNorwalk () throws Exception {

		Actions action = new Actions(driver);
		
		
		PageFactory.initElements(driver, CTJudicialPath.class);
		WebElement element =CTJudicialPath.OnclickTownN;
		action.contextClick(element).perform();Thread.sleep(2000);
		commonmethod.OpenNewWindow();
		
		commonmethod.ActionNewPage();
		WebElement element1 = CTJudicialPath.OnclickNotice;
		action.contextClick(element1).perform();Thread.sleep(2000);
		commonmethod.OpenNewTab();
	
		WebElement element2 = CTJudicialPath.OnclickNotice1;
		action.contextClick(element2).perform();Thread.sleep(2000);
		commonmethod.OpenNewTab();
		
		WebElement element3 = CTJudicialPath.OnclickNotice2;
		action.contextClick(element3).perform();Thread.sleep(2000);
		commonmethod.OpenNewTab();
		
		CTJudicialPath.BackToPage.click();
	}
	
	@Test (priority=3)
	public void CityStamford () throws Exception {
		
		Actions action = new Actions(driver);
		PageFactory.initElements(driver, CTJudicialPath.class);
		
		WebElement element =CTJudicialPath.OnclickTownST;
		action.contextClick(element).perform();Thread.sleep(2000);
		commonmethod.OpenNewWindow();
	
		commonmethod.ActionNewPage();
		WebElement element1 = CTJudicialPath.OnclickNotice;
		action.contextClick(element1).perform();Thread.sleep(2000);
		commonmethod.OpenNewTab();
		
		WebElement element2 = CTJudicialPath.OnclickNotice1;
		action.contextClick(element2).perform();Thread.sleep(2000);
		commonmethod.OpenNewTab();
		
		WebElement element3 = CTJudicialPath.OnclickNotice2;
		action.contextClick(element3).perform();Thread.sleep(2000);
		commonmethod.OpenNewTab();
		Thread.sleep(1000);
		
		CTJudicialPath.BackToPage.click();
	}
	
	@Test (priority=4)
	public void CityTrumbull () throws Exception {
		Actions action = new Actions(driver);
		
		PageFactory.initElements(driver, CTJudicialPath.class);
		WebElement element =CTJudicialPath.OnclickTownT;
		action.contextClick(element).perform();Thread.sleep(2000);
		commonmethod.OpenNewWindow();
		
		CTJudicialPath.BackToPage.click();
	}
	@Test (priority=5)
	public void CityShelton () throws Exception {
		
		Actions action = new Actions(driver);
		PageFactory.initElements(driver, CTJudicialPath.class);
		
		WebElement element =CTJudicialPath.OnclickTownSH;
		action.contextClick(element).perform();Thread.sleep(2000);
		commonmethod.OpenNewWindow();
		
		CTJudicialPath.BackToPage.click();
	}
	
	@Test (priority=6)
	public void CityFairfield () throws Exception {
		
		Actions action = new Actions(driver);
		PageFactory.initElements(driver, CTJudicialPath.class);
		
		WebElement element =CTJudicialPath.OnclickTownF;
		action.contextClick(element).perform();Thread.sleep(2000);
		commonmethod.OpenNewWindow();
				
	}
}
