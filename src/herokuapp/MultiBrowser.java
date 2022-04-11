package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 for Chrome");
        System.out.println("Press 2 for Edge");
        System.out.println("Press 3 for Firefox");
        int A = in.nextInt();
        String baserURL= "http://the-internet.herokuapp.com/";
        if (A==1){
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
        else if (A==2){
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();

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
        else if (A==3){
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();

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
        else{
            System.out.println("Invalid Selection");
        }

    }
}
