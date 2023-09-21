package com.example.TutorialPoint;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class FullTutorialpointSWebsite {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testFullTutorialpointSWebsite() throws Exception {
    driver.get("https://www.tutorialspoint.com/index.htm");
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.linkText("Coding Ground")).click();
    driver.get("https://www.tutorialspoint.com/codingground.htm");
    driver.get("https://www.tutorialspoint.com/cgsignup.php");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.get("https://www.tutorialspoint.com/codingground.htm");
    driver.findElement(By.linkText("Signup for Free")).click();
    driver.get("https://www.tutorialspoint.com/cgsignup.php");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    driver.findElement(By.xpath("//div[@id='codebox']/div/div[3]/ul/li[3]/a[2]")).click();
    driver.findElement(By.xpath("//a[@id='execute']/span/span/b")).click();
    driver.findElement(By.xpath("//div[@id='editor']/div[2]/div")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='editor']/div[2]/div | ]]
    driver.findElement(By.xpath("//div[@id='editor']/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='editor']/textarea")).sendKeys("System.out.println(\"dadadada, World!\");");
    driver.findElement(By.id("execute")).click();
    driver.findElement(By.xpath("//a[@id='beautify']/span/span/b")).click();
    driver.findElement(By.xpath("//div[@id='editor']/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='editor']/div[2]/div")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='editor']/div[2]/div | ]]
    driver.findElement(By.xpath("//div[@id='editor']/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='editor']/textarea")).sendKeys("System.out.println(\"dadadadad, World!\");");
    driver.findElement(By.xpath("//a[@id='beautify']/span/span")).click();
    driver.findElement(By.xpath("//a[@id='share']/span/span/b")).click();
    driver.findElement(By.xpath("//div[@id='submit']/a[2]/span/span")).click();
    driver.findElement(By.xpath("//div[@id='codebox']/div/div[3]/ul/li/a/span")).click();
    driver.findElement(By.xpath("//div[@id='codebox']/div/div[3]/ul/li[2]/a/span")).click();
    driver.findElement(By.xpath("//a[@id='project']/span")).click();
    driver.findElement(By.xpath("//div[@id='searchproject']/div")).click();
    driver.findElement(By.xpath("//body[@id='cc']/div[19]")).click();
    driver.findElement(By.xpath("//body[@id='cc']/div[17]/div/div[2]/a[2]")).click();
    driver.findElement(By.xpath("//a[@id='edit']/span")).click();
    driver.findElement(By.xpath("//div[@id='redo']/div")).click();
    driver.findElement(By.xpath("//a[@id='edit']/span/span")).click();
    driver.findElement(By.id("paste")).click();
    driver.findElement(By.xpath("//a[@id='edit']/span/span")).click();
    driver.findElement(By.xpath("//div[@id='cut']/div")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//a[@id='setting']/span/span")).click();
    driver.findElement(By.xpath("//div[@onclick=\"setEditorTabSize('1');\"]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Setting'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//div[@onclick='setEditorGutter(1);']")).click();
    driver.findElement(By.xpath("//a[@id='execute']/span/span/b")).click();
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.get("https://www.tutorialspoint.com/codingground.htm");
    driver.findElement(By.xpath("//img[@alt='tutorialspoint']")).click();
    driver.get("https://www.tutorialspoint.com/index.htm");
    driver.findElement(By.linkText("Jobs")).click();
    driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
    driver.findElement(By.linkText("Privacy Policy")).click();
    driver.get("https://www.tutorialspoint.com/about/about_privacy.htm");
    driver.findElement(By.linkText("Cookies Policy")).click();
    driver.get("https://www.tutorialspoint.com/about/about_cookies.htm");
    driver.findElement(By.linkText("Terms of Use")).click();
    driver.get("https://www.tutorialspoint.com/about/about_terms_of_use.htm");
    driver.findElement(By.linkText("Refund Policy")).click();
    driver.get("https://www.tutorialspoint.com/about/return_refund_policy.htm");
    driver.findElement(By.linkText("Write for us")).click();
    driver.get("https://www.tutorialspoint.com/about/tutorials_writing.htm");
    driver.findElement(By.linkText("Guidelines for Freelancers")).click();
    driver.get("https://www.tutorialspoint.com/about/guidelines_for_freelancers.htm");
    driver.findElement(By.linkText("FAQ")).click();
    driver.get("https://www.tutorialspoint.com/about/faq.htm");
    driver.findElement(By.xpath("//div[@id='mainContent']/section[6]/label")).click();
    driver.findElement(By.xpath("//div[@id='mainContent']/section[7]/label")).click();
    driver.findElement(By.xpath("//div[@id='mainContent']/section[4]/label")).click();
    driver.findElement(By.linkText("Helping")).click();
    driver.get("https://www.tutorialspoint.com/about/about_helping.htm");
    driver.findElement(By.linkText("Contact")).click();
    driver.get("https://www.tutorialspoint.com/about/contact_us.htm");
    driver.findElement(By.linkText("UPSC IAS Exams Notes")).click();
    driver.get("https://www.tutorialspoint.com/upsc_ias_exams.htm");
    driver.findElement(By.xpath("//img[@alt='Geography']")).click();
    driver.get("https://www.tutorialspoint.com/geography/index.htm");
    driver.findElement(By.linkText("Geography India - Energy Resources")).click();
    driver.get("https://www.tutorialspoint.com/geography/geography_india_energy_resources.htm");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Geography - Home'])[1]/following::ul[1]")).click();
    driver.findElement(By.linkText("Geography India - The People")).click();
    driver.get("https://www.tutorialspoint.com/geography/geography_india_the_people.htm");
    driver.findElement(By.xpath("//img[@alt='Tutorialspoint']")).click();
    driver.get("https://www.tutorialspoint.com/index.htm");
    driver.findElement(By.linkText("Whiteboard")).click();
    driver.get("https://www.tutorialspoint.com/whiteboard.htm");
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.cssSelector("svg.svg-inline--fa.fa-palette > g.fa-duotone-group > path.fa-secondary")).click();
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.xpath("//div[@id='penColorPick']/div[2]/div/a[4]/div")).click();
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='of 1'])[1]/following::*[name()='svg'][10]")).click();
    driver.findElement(By.cssSelector("svg.svg-inline--fa.fa-circle > path")).click();
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.xpath("//div[@id='canvasBoardDiv1']/div/canvas[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='of 1'])[1]/following::*[name()='svg'][13]")).click();
    driver.findElement(By.cssSelector("svg.svg-inline--fa.fa-rotate-left > g.fa-duotone-group > path.fa-secondary")).click();
    driver.findElement(By.cssSelector("svg.svg-inline--fa.fa-rotate-left > g.fa-duotone-group > path.fa-secondary")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | css=svg.svg-inline--fa.fa-rotate-left > g.fa-duotone-group > path.fa-secondary | ]]
    driver.findElement(By.cssSelector("svg.svg-inline--fa.fa-rotate-left > g.fa-duotone-group > path.fa-secondary")).click();
    driver.findElement(By.cssSelector("svg.svg-inline--fa.fa-trash-can > g.fa-duotone-group > path.fa-secondary")).click();
    driver.findElement(By.linkText("Ok")).click();
    driver.findElement(By.xpath("//img[@alt='Free Online Whiteboard']")).click();
    driver.get("https://www.tutorialspoint.com/index.htm");
    driver.findElement(By.linkText("Corporate Training")).click();
    driver.get("https://www.tutorialspoint.com/business/index.asp");
    driver.findElement(By.id("credential_picker_container")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Verifying...'])[1]/following::*[name()='svg'][1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.linkText("Not Interested")).click();
    driver.get("https://www.tutorialspoint.com/market/index.asp");
    driver.get("https://www.tutorialspoint.com/latest/certifications");
    driver.findElement(By.xpath("//div[@id='swiper-wrapper-ba9e77b5b27e42b5']/div[3]/div[2]/a")).click();
    driver.get("https://www.tutorialspoint.com/cart.jsp");
    driver.findElement(By.linkText("Home")).click();
    driver.get("https://www.tutorialspoint.com/index.htm");
    driver.get("https://www.tutorialspoint.com/categories/data_science_and_ai_ml");
    driver.get("https://www.tutorialspoint.com/index.htm");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Development'])[2]/following::h5[1]")).click();
    driver.get("https://www.tutorialspoint.com/categories/it_and_software");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_4 | ]]
    driver.get("https://www.tutorialspoint.com/profile/cliff_krahenbill");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("//ul[@id='category']/li[6]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu'])[1]/following::ul[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("//ul[@id='category']/li[2]")).click();
    driver.findElement(By.linkText("Development")).click();
    driver.get("https://www.tutorialspoint.com/categories/development");
    driver.findElement(By.linkText("Teach with us")).click();
    driver.get("https://www.tutorialspoint.com/market/teach-with-us.jsp");
    driver.findElement(By.xpath("//section[@id='faq']/div/details[6]/summary")).click();
    driver.findElement(By.xpath("//section[@id='faq']/div/details[4]")).click();
    driver.findElement(By.xpath("//section[@id='faq']/div/details[3]")).click();
    driver.findElement(By.xpath("//section[@id='faq']/div/details[3]")).click();
    driver.findElement(By.xpath("//section[@id='faq']/div/details[3]/summary")).click();
    driver.findElement(By.linkText("Free Library")).click();
    driver.get("https://www.tutorialspoint.com/tutorialslibrary.htm");
    driver.findElement(By.linkText("Learn Apache Flume")).click();
    driver.get("https://www.tutorialspoint.com/apache_flume/index.htm");
    driver.get("https://www.tutorialspoint.com/apache_flume/sequence_generator_source.htm");
    driver.findElement(By.linkText("Effective Resume Writing")).click();
    driver.get("https://www.tutorialspoint.com/effective_resume_writing.htm");
    driver.findElement(By.xpath("//a[contains(text(),'Jobs')]")).click();
    driver.get("https://www.tutorialspoint.com/job_search.php");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Data Structure'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("//li[3]/a/img")).click();
    driver.findElement(By.linkText("Data Structure")).click();
    driver.findElement(By.linkText("Data Structure")).click();
    driver.findElement(By.linkText("Data Structure")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | link=Data Structure | ]]
    driver.findElement(By.linkText("Data Structure")).click();
    driver.findElement(By.linkText("Data Structure")).click();
    driver.findElement(By.linkText("Data Structure")).click();
    driver.findElement(By.linkText("Data Structure")).click();
    driver.findElement(By.linkText("RDBMS")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='RDBMS'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='RDBMS'])[1]/following::li[1]")).click();
    driver.findElement(By.linkText("Android")).click();
    driver.findElement(By.linkText("Android")).click();
    driver.findElement(By.linkText("Android")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | link=Android | ]]
    driver.findElement(By.linkText("Android")).click();
    driver.findElement(By.linkText("Android")).click();
    driver.findElement(By.linkText("C Programming")).click();
    driver.findElement(By.linkText("C Programming")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | link=C Programming | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='C Programming'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[2]/following::ul[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[2]/following::div[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MySQL'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MySQL'])[1]/following::li[1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='MySQL'])[1]/following::li[1] | ]]
    driver.findElement(By.linkText("Javascript")).click();
    driver.findElement(By.linkText("PHP")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[2]/following::main[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[2]/following::main[1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Login'])[2]/following::main[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Teach with us'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("//img[@alt='logo']")).click();
    driver.get("https://www.tutorialspoint.com/index.htm");
    driver.get("https://www.tutorialspoint.com/about/about_team.htm");
    driver.get("https://www.tutorialspoint.com/hr_interview_questions/index.htm");
    driver.get("https://www.tutorialspoint.com/hr_interview_questions/quick_guide.htm");
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
