import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServicesPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaservicesect.ccbp.tech/");

        WebElement firstTitle = driver.findElement(By.xpath("//h1[@class = \"services-card-title\"]//ancestor::h1[1]"));
        WebElement secondTitle = driver.findElement(By.xpath("//h1[text() = \"Online Support 24/7\"]/preceding::h1[1]"));

        for(int i = 0; i< 1; i++){
            if(firstTitle.getText().equals("Fast and Free Delivery") && secondTitle.getText().equals("100% Money back guarantee")){
                System.out.println("Titles Checked");
            }else{
                System.out.println("Mismatch Found in Titles");
            }
        }

        WebElement firstDescription = driver.findElement(By.xpath("//h1[text() = \"Online Support 24/7\"]/ancestor::div[3]/div/div/p"));
        WebElement secondDescription = driver.findElement(By.xpath("//h1[text() = \"Online Support 24/7\"]/preceding::div[2]/div/p"));

        String expectedDescriptionOne = "Fast, free, and convenient delivery choices on millions of items.";
        String expectedDescriptionTwo = "This is probably the most popular guarantee in the world.";

        for(int i = 0; i<1; i++){
            if(firstDescription.getText().equals(expectedDescriptionOne) && secondDescription.getText().equals(expectedDescriptionTwo)){
                System.out.println("Descriptions Checked");
            }else{
                System.out.println("Mismatch Found in Descriptions");
            }
        }

        WebElement heading = driver.findElement(By.xpath("//h1[text() = \"Online Support 24/7\"]/ancestor::div[3]/div/h1"));
        WebElement description = driver.findElement(By.xpath("//h1[text() = \"Online Support 24/7\"]/preceding::p"));

        for(int i = 0; i < 1; i++){
            if(heading.getText().equals("Our Services") && description.getText().equals("Most online stores offer lower prices. Online shopping makes price comparison simpler and quicker. It is very convenient to shop from where you are located. It saves you the cost of driving to stores, as well as parking fees.")){
                System.out.println("Section Header Checked");
            }else{
                System.out.println("Mismatch Found in Section Header");
            }
        }
        driver.quit();
    }
}
