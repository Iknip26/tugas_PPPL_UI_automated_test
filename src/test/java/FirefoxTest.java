import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

    @Test
    public void testWebSv() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        masukDanPrintJudul(driver, "https://sv.ugm.ac.id/");
        masukDanPrintJudul(driver, "https://sv.ugm.ac.id/profil/");
        masukDanPrintJudul(driver, "https://sv.ugm.ac.id/pendidikan/");
        masukDanPrintJudul(driver, "https://sv.ugm.ac.id/p2mks/penelitian/");
        masukDanPrintJudul(driver, "https://sv.ugm.ac.id/jurnal/");
        masukDanPrintJudul(driver, "https://sv.ugm.ac.id/center-of-excellence-2/");
        masukDanPrintJudul(driver, "https://sv.ugm.ac.id/kerja-sama/kerja-sama-dalam-negeri/");
        masukDanPrintJudul(driver, "https://sv.ugm.ac.id/pendaftaran/");

        driver.quit();
    }

    private void masukDanPrintJudul(WebDriver driver, String url) {
        driver.get(url);
        String title = driver.getTitle();
        System.out.println("Judul Halaman : " + title);
    }
}
