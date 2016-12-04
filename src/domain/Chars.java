package domain;

import java.util.ArrayList;
import java.util.List;


public class Chars {
    private String email;
    private boolean votes;
    private boolean anonimous;
    private List<String> elements=new ArrayList<String>();
    private boolean payment;
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean isVotes() {
        return votes;
    }
    
    public void setVotes(boolean votes) {
        this.votes = votes;
    }
    
    public boolean isAnonimous() {
        return anonimous;
    }
    
    public void setAnonimous(boolean anonimous) {
        this.anonimous = anonimous;
    }
    
    public boolean isPayment() {
        return payment;
    }
    
    public List<String> getElements() {
        return elements;
    }
    
    public void addElement(String element) {
        elements.add(element);
    }
    
    public void setPayment(boolean payment) {
        this.payment = payment;
    }
    
    @Override 
    public String toString() {
        StringBuilder str = new StringBuilder();
        String email=getEmail();
        if (email!=null) {
            str.append("Е-мейл: ").append(email).append('\n');
        }
        for (String element : elements) {
            str.append(element.toString()).append('\n');
        }
        
        str.append("Голосование: ");
        if (isVotes()) {
            str.append("есть, ");
            if (isAnonimous()) {
                str.append("анонимное");
            } else str.append("не анонимное");
        } else str.append("нет");
         str.append('\n');    
        
         if (isPayment()) {
             str.append("Платный");
         } else str.append("Бесплатный");
         str.append('\n'); 
         
        //if (email!=null) {
        //    str.append("Е-мейл: ").append(email).append('\n');
        //}

        return str.toString();
        
    }
}
