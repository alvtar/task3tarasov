package runner;

/** Task 3, variant 12
 * @author Tarasov Alexandr
 * 
 * Class TestStart with main() method
 * 
 * */

import java.util.Collections;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import domain.Site;
import xml.SiteXmlReader;
import xml.SiteXmlValidator;


public class TestStart {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        SiteXmlValidator validator = new SiteXmlValidator("sites.xml");
        if (validator.validate()) {
            SiteXmlReader reader = new SiteXmlReader();
            List<Site> sites = reader.read("sites.xml");

            Collections.sort(sites);
            
            System.out.println("СОРТИРОВКА ПО ТИПУ СТРАНИЦЫ \n");
            for (Site site : sites) {
                System.out.println(site.toString());
            }
            
        } else 
            System.out.println(validator.getError());
    }
}
