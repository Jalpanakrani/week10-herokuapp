package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args)
    {
        String baserURL= "http://the-internet.herokuapp.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch the URl
        driver.get(baserURL);
        //Maximisi window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Get Current URl
        System.out.println("Current URL = " + driver.getCurrentUrl());
        String loginURL = "http://the-internet.herokuapp.com/login";
        driver.navigate().to(loginURL);
        System.out.println("Current URl = " + driver.getCurrentUrl());

        //Find the email field element

        WebElement emailField = driver .findElement(By.id("username"));
        //sending email to email feild element
        emailField.sendKeys("tomsmith");
        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //close the browser
        driver.close();

    }
}
