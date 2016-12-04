package domain;

public class Site implements Comparable<Site> {
    private String id;
    private String title;
    private Type type;
    //private Set<Chars> chars = new LinkedHashSet<Chars>();
    public Chars chars = new Chars();
    
    
    
    
    
    //public void setChars(ArrayList<Chars> chars) {
    //    this.chars = chars;
    //}





    private boolean authorization;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title=title;
    }

    public void setType(Type type) {
        this.type=type;
    }

    public String getType() {
        return type.getType();
    }

    public boolean getAuthorization() {
        return authorization;
    }

    public void setAuthorization(boolean authorization) {
        this.authorization = authorization;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Идентификатор: ").append(getId()).append('\n');
        str.append("Название страницы: ").append(getTitle()).append('\n');
        str.append("Тип страницы: ").append(getType()).append('\n');
        str.append("Характеристика сайта:\n");
        //str.append(getChars().toString());
        str.append("Авторизация: ").append(getAuthorization()).append('\n');
        
        
        /*switch (type.getType()) {
        ////////////////////////////делай тута!!!!!!!!!!!!!!!!!
            case "NEWS": {
            //    str.append('\t').append(chars.toArray(). getEmail()).append(": ").append(chars.getValue()).append('\n');
            //    for (Chars chars : getChars()) {
            //    str.append('\t').append(chars.getName()).append(": ").append(chars.getValue()).append('\n');
            //    }
            //    str.append("Стоимость: ").append(getCost()).append('\n');
                
                //chars.g
                for (Chars chars : getChars()) {

                
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
                
                //return str.toString();
            }
            
        }
        str.append("Авторизация:\n");
        */
        
        return str.toString();
            
        }
    

    
    


    
    
    
    
    @Override
    public int compareTo(Site site) {
        return getType().compareTo(site.getType());
    }
}