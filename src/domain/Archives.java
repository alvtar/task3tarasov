package domain;
// -------------------
import java.util.ArrayList;

public class Archives extends Chars {
        private ArrayList<String> archives; /// переделать на элементс в чарс с геттерами

        public String getNews() {
            return archives.toString();
        }

        public void addNews(String news) {
            this.archives.add(news);
        }
        
        @Override 
        public String toString() {
            
            StringBuilder str = new StringBuilder();
            
            for (String n : archives) {
                str.append("Ссылка на скачивание №: ").append(archives.iterator()).append(n).append('\n');
            }
            return str.toString(); 
        }

    }