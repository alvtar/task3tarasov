package compare;

import java.util.Comparator;

import domain.Site;


public class SiteCompare implements Comparator<Site> {
    public int compare(Site site1, Site site2) {
                return site1.getType().toString().compareTo(site2.getType().toString()) ;
        }
}
