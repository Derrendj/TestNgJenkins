package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	
	public static void getChromedriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void getFirefoxdriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	public static void getSafaridriver() {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
	}
	
	public static void getEdgedriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	public static void getOperadriver() {
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver();
	}
	
	public void writeData(String excelName,String sheet,int row,int cell, String data) throws IOException {
		File F = new File(System.getProperty("user.dir")+"\\Excel\\"+excelName+".xlsx");
		FileInputStream Fin = new FileInputStream(F);
		Workbook w = new XSSFWorkbook(Fin);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(data);
		FileOutputStream Fout = new FileOutputStream(F);
		w.write(Fout);	
	}
	
	public String getData(String excelName,String sheet,int row, int cell) throws IOException {
		String value = null;
		File F = new File(System.getProperty("user.dir")+"\\Excel\\"+excelName+".xlsx");
		FileInputStream Fin = new FileInputStream(F);
		Workbook w = new XSSFWorkbook(Fin);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();
		if (type==1) {
			value = c.getStringCellValue();
			return value;
		}
		if (type==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
				value = sim.format(dateCellValue);
				return value;
			}
			else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);
				return value;
			}
		}
		return value;
	}

	public void updateData(String excelName,String sheet,int row, int cell, String oldData, String newData) throws IOException {
		File F = new File(System.getProperty("user.dir")+"\\Excel\\"+excelName+".xlsx");
		FileInputStream Fin = new FileInputStream(F);
		Workbook w = new XSSFWorkbook(Fin);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String data = c.getStringCellValue();
		if (data.equals(oldData)) {
			c.setCellValue(newData);
		}
		FileOutputStream Fout = new FileOutputStream(F);
		w.write(Fout);
	}

	public static void closeWindow() {
		driver.close();
	}
	
	public static void closeAllWindows() {
		driver.quit();
	}
		
	public String getAttributevalue(WebElement element) {
		String data = element.getAttribute("value");
		return data;
	}	
		
	public static void loadurl(String Data) {
		driver.get(Data);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void fullscreen() {
		driver.manage().window().fullscreen();
	}
	
	public WebElement findlocatorbyid(String Attributename) {
		WebElement element = driver.findElement(By.id(Attributename));
		return element;
	}
	
	public WebElement findlocatorbbyname(String Attributename) {
		WebElement element = driver.findElement(By.name(Attributename));
		return element;
	}
	
	public WebElement findlocatorbyclass(String Attributename) {
		WebElement element = driver.findElement(By.className(Attributename));
		return element;
	}
	
	public WebElement findlocatorbyxpath(String Attributename) {
		WebElement element = driver.findElement(By.xpath(Attributename));
		return element;
	}
	
	public WebElement findlocatorbytagname(String Attributename) {
		WebElement element = driver.findElement(By.tagName(Attributename));
		return element;
	}
	
	public WebElement findlocatorbycssselector(String Attributename) {
		WebElement element = driver.findElement(By.cssSelector(Attributename));
		return element;
	}
	
	public WebElement findlocatorbylinktext(String Attributename) {
		WebElement element = driver.findElement(By.linkText(Attributename));
		return element;
	}
	
	public WebElement findlocatorbypartiallinktext(String Attributename) {
		WebElement element = driver.findElement(By.partialLinkText(Attributename));
		return element;
	}
	
	public void type(WebElement element,String Data) {
		element.sendKeys(Data);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	public void deleteCookies(Cookie cookie) {
		driver.manage().deleteCookie(cookie);
	}
	
	public void deleteCookieNamed(String cookie) {
		driver.manage().deleteCookieNamed(cookie);
	}
	
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	
	public void acceptAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public void waitforalert(int waitTime) {
		WebDriverWait w = new WebDriverWait(driver, waitTime);
		w.until(ExpectedConditions.alertIsPresent());
	}
	
	public void waittoclickelement(int waitTime, WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, waitTime);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waittoselectelement(int waitTime, WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, waitTime);
		w.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public void waitforvisbiltyofelement(int waitTime, By element) {
		WebDriverWait w = new WebDriverWait(driver, waitTime);
		w.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public void waitforvisbiltyofallelement(int waitTime, By element) {
		WebDriverWait w = new WebDriverWait(driver, waitTime);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
	}
	
	public void waitforframename(int waitTime, String framename) {
		WebDriverWait w = new WebDriverWait(driver, waitTime);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framename));
	}
	
	public void waitforframeno(int waitTime, int index) {
		WebDriverWait w = new WebDriverWait(driver, waitTime);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	
	public void waitforframeelement(int waitTime, WebElement frameElement) {
		WebDriverWait w = new WebDriverWait(driver, waitTime);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	
	public void dismissAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	
	public void alertText(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
	}
	
	public String alertGetAttribute() {
		Alert a = driver.switchTo().alert();
		return a.getText();
	}
	
	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String getenteredUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}
	
	public String getattributevalue(WebElement element, String Attributename) {
		String Data = element.getAttribute(Attributename);
		return Data;
	}
	
	public String getattributevalue(WebElement element) {
		String Data = element.getAttribute("Value");
		return Data;
	}
	
	public void selectoptionbytext(WebElement element, String Data) {
		Select s = new Select(element);
		s.selectByVisibleText(Data);
	}
	
	public void selectoptionbyindex(WebElement element, int Index) {
		Select s = new Select(element);
		s.selectByIndex(Index);
	}
	
	public void selectoptionbyvalue(WebElement element, String Attributename) {
		Select s = new Select(element);
		s.selectByValue(Attributename);
	}
	
	public void deselectoptionbytext(WebElement element, String Data) {
		Select s = new Select(element);
		s.deselectByVisibleText(Data);
	}
	
	public void deselectoptionbyindex(WebElement element, int Index) {
		Select s = new Select(element);
		s.deselectByIndex(Index);
	}
	
	public void deselectoptionbyvalue(WebElement element, String Attributename) {
		Select s = new Select(element);
		s.deselectByValue(Attributename);
	}
	
	public void deselectall(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}
	
	public List<WebElement> getallselectedoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> data = s.getAllSelectedOptions();
		return data;
	}
	
	public WebElement getfirstselectedoptions(WebElement element) {
		Select s = new Select(element);
		WebElement data = s.getFirstSelectedOption();
		return data;
	}
	
	public boolean dropdownismultiple(WebElement element) {
		Select s = new Select(element);
		boolean b = s.isMultiple();
		return b;
	}
	
	public void mouseclick(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).click().build().perform();
	}
	
	public void mouserightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).contextClick().build().perform();
	}
	
	public void mousedoubleclick(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).doubleClick().build().perform();
	}
	
	public void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public void dragAnadDrop(WebElement elementsrc, WebElement elementdest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(elementsrc, elementdest).build().perform();
	}
	
	public void togglewindow(String windowid) {
		driver.switchTo().window(windowid);
	}
	
	public void toggleframe(String framename) {
		driver.switchTo().frame(framename);
	}
	
	public void toggleframe(int index) {
		driver.switchTo().frame(index);
	}
	
	public void toggleframe(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void togglemainframe() {
		driver.switchTo().defaultContent();
	}
	
	public void toggleparentframe() {
		driver.switchTo().parentFrame();
	}
	
	public void navigate(String url) {
		driver.navigate().to(url);
	}
	
	public void refreshpage() {
		driver.navigate().refresh();
	}
	
	public void backpage() {
		driver.navigate().back();
	}
	
	public void forwardpage() {
		driver.navigate().forward();
	}
	
	public boolean elementdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	
	public boolean elementenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	public boolean elementselected(WebElement element) {
		boolean selected= element.isSelected();
		return selected;
	}
	
	
	

}
