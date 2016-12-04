package domain;

public class Site implements Comparable<Site> {
    private String id;
    private String title;
    private Type type;
    public Chars chars = new Chars();
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
        this.title = title;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getType() {
        return type.getType();
    }

    public boolean isAuthorization() {
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
        str.append(chars.toString());
        str.append("Авторизация: ");
        if (isAuthorization()) {
            str.append("необходима");
        } else
            str.append("нет");
        str.append('\n');
        return str.toString();
    }

    @Override
    public int compareTo(Site site) {
        return getType().compareTo(site.getType());
    }
}
