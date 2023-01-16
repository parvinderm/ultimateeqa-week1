package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";  //storing base url
        System.setProperty("webdriver.edgedriver.driver","src/drivers/msedgedriver.exe");  //setting webdriver
        WebDriver  driver = new EdgeDriver();  //Creating object of chrome webdriver
        driver.get(baseurl);  //method to invoke url
        driver.manage().window().maximize();  //maiximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String title = driver.getTitle(); //Storing title
        System.out.println("The title of the page : "+ title);  //Printing the title in console
        String url = driver.getCurrentUrl();  //Predefined title
        System.out.println("Current url :"+ url);  //getting url
        String source = driver.getPageSource();  //Storing source page
        System.out.println("Page source :"+source);  //Printing the source page in console
        WebElement emailIdField = driver.findElement(By.name("user[email]"));  //Storing email id
        emailIdField.sendKeys("parvinderm767@gmail.com");  //Sending keys to email id field
        WebElement passwordField = driver.findElement(By.name("user[password]"));  //Storing password field
        passwordField.sendKeys("Jignesh89@");   //sendkeys to password field
        driver.close();  //closing browser

    }
}
