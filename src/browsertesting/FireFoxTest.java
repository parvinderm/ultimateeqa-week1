package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class FireFoxTest {

    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";  //storing base url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe");  //setting webdriver
        WebDriver driver = new EdgeDriver();  //Creating object of Edge driver
        driver.get(baseurl);  //method to invoke url
        driver.manage().window().maximize();  //maximising the windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));   //timeout session
        String title = driver.getTitle();  //Storing title
        System.out.println("The title of the page :"+title);  //Printing the title in console
        String url = driver.getCurrentUrl();  //Predefined method
        System.out.println("Current URL :"+url); //getting url
        String source = driver.getPageSource();  //Storing source page
        System.out.println("Page source :"+source);  //Printing the page source in console
        WebElement emailIdField = driver.findElement(By.name("user[email]")); //Storing emailfield
        emailIdField.sendKeys("parvinderm767@gmail.com");  //sending keys to email id field
        WebElement passwordField = driver.findElement(By.name("user[password]"));  //Storing password field
        passwordField.sendKeys("Jignesh89@");
        driver.close();  //Closing the browser


    }
}
