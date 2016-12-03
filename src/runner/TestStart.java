package runner;

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
            //Random random = new Random();
            //for (Site site : sites) {
            //    site.setCost((long) (site.getCost() * (1 + random.nextInt(100)/100.0)));
            //}
            //Collections.sort(sites);
//            for (Site site : sites) {
 //               System.out.println(site.toString());
//            }
        } else {
            System.out.println(validator.getError());
        }

    }

}
