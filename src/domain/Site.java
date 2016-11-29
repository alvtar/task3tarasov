package domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Site implements Comparable<Site> {
    private String id;
    private String title;
    private String type;
    private Set<Chars> chars = new LinkedHashSet<Chars>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Set<Chars> getChars() {
        return chars;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Идентификатор: ").append(getId()).append('\n');
        str.append("Название страницы: ").append(getTitle()).append('\n');
        str.append("Тип страницы: ").append(getType()).append('\n');
        str.append("Характеристика сайта:\n");
        
        
        switch (type) {
        ////////////////////////////делай тута!!!!!!!!!!!!!!!!!
            case "NEWS": {
                str.append('\t').append(chars.getName()).append(": ").append(chars.getValue()).append('\n');
            //    for (Chars chars : getChars()) {
                str.append('\t').append(chars.getName()).append(": ").append(chars.getValue()).append('\n');
            //    }
            //    str.append("Стоимость: ").append(getCost()).append('\n');
            //    return str.toString();
            //    break;
            }
            case "MIRROR": {
                
                break;
            }
            case "PORTAL": {
                
                break;
            }
            case "ADS": {
                
                return str.toString();
            }
            
        }
        return str.toString();
            
        }
    

    @Override
    public int compareTo(Site site) {
        return getType().compareTo(site.getType());
    }
}