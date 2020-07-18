package org.bitm.SeleniumMavenProject.Test;

import org.bitm.SeleniumMavenProject.Utils.DriverManager;
import org.bitm.SeleniumMavenProject.Utils.URLTestUtils;
import org.bitm.SeleniumMavenProject.Utils.XpathUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	private WebDriver driver = null;
	@Test
	public void checkLoginPageTitle() 
	{
		driver = DriverManager.driver; 	
		driver.get(URLTestUtils.URL.base_url);
		Assert.assertEquals(driver.getTitle(), URLTestUtils.Text.HomePageTitle);
	}
    @Test (dependsOnMethods = "checkLoginPageTitle")
	public void LogInTest() {
		
		driver.findElement(By.xpath(XpathUtils.LoginModule.user_name)).sendKeys("tutorial");
		driver.findElement(By.xpath(XpathUtils.LoginModule.password)).sendKeys("tutorial");
		driver.findElement(By.xpath(XpathUtils.LoginModule.Login)).click();
		
		
	}
}
