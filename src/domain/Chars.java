package domain;

import java.util.ArrayList;

public class Chars {
    private String email;
    private boolean votes;
    private boolean anonimous;
    private ArrayList<String> elements=new ArrayList<String>();  /// переделать на элементс в чарс с геттерами
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
    
    public ArrayList<String> getElements() {
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
        str.append("Е-мейл: ").append(getEmail()).append('\n');
        //str.append("Е-мейл: ").append(getEmail()).append('\n');
        /// переделать элементс в чарс с геттерами
        
        return email;
        
    }
}
