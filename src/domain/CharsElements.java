package domain;

import java.util.ArrayList;

public class CharsElements extends Chars {
    private ArrayList<String> elements; /// переделать на элементс в чарс с геттерами

    public String getElements() {
        return elements.toString();
    }

    public void addElements(String news) {
        this.elements.add(news);
    }
    
    @Override 
    public String toString() {
        
        StringBuilder str = new StringBuilder();
        
        for (String s : elements) {
            str.append("Ссылка на скачивание №: ").append(elements.iterator()).append(s).append('\n');
        }
        return str.toString(); 
    }
    
}

