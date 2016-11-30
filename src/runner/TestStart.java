package runner;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import domain.Site;
import xml.SiteXmlReader;
import xml.SiteXmlValidator;


public class TestStart {

    
    /// тута пингвинь!!!!!!!!!!
    ///               
    
    
    public static void main(String[] args) {
        SiteXmlValidator validator = new SiteXmlValidator("sites.xml");
        if (validator.validate()) {
            SiteXmlReader reader = new SiteXmlReader();
            List<Site> vauchers = reader.read("sites.xml");
            Random random = new Random();
            for (Site site : sites) {
                site.setCost((long) (site.getCost() * (1 + random.nextInt(100)/100.0)));
            }
            Collections.sort(sites);
            for (Site vaucher : sites) {
                System.out.println(site);
            }
        } else {
            System.out.println(validator.getError());
        }

    }

}
