package compare;

import java.util.Comparator;
import domain.Tariff;

public class SiteCompare implements Comparator<Tariff> {
        public int compare(Tariff tariff1, Tariff tariff2) {
                return tariff1.getPayroll() - tariff2.getPayroll();
        }
}
