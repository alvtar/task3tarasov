package xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import domain.*;


public class SiteXmlReader {
 
    
    public List<Site> read(String fileName) throws FileNotFoundException {
        
        XMLStreamReader reader = null;
        try {
            List<Site> sites = new ArrayList<Site>();
            Site site = null;
            XMLInputFactory factory = XMLInputFactory.newFactory();
            reader = factory.createXMLStreamReader(new FileInputStream(fileName));
            while (reader.hasNext()) {
                int elementType = reader.next();
                
                switch (elementType) {
                case XMLStreamConstants.START_ELEMENT: {
                    String tagName = reader.getLocalName();
                    String value;
                    try {
                        value = reader.getElementText();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } finally {
                        value="";
                    }

                    switch (tagName) {   
                        case "site": {
                            site = new Site();
                            site.setId(reader.getAttributeValue(null, "id"));
                            break; }
                        case "title":         {site.setTitle(value); break;}
                        case "type":          {site.setType(value); break;}     
                        case "email":         {site.chars.setEmail(value); break;}
                        case "n":
                        case "a":             {site.chars.addElement(value); break;}
                        case "votes":         {site.chars.setAnonimous(Boolean.parseBoolean(
                                reader.getAttributeValue(null, "anonimous"))); break;}
                        case "enable":        {site.chars.setVotes(Boolean.parseBoolean(value)); break;}
                        case "payment":       {site.chars.setPayment(Boolean.parseBoolean(value)); break;}
                        case "authorization": {site.setAuthorization(Boolean.parseBoolean(value));};
                    }
                }
                break;
                
                case XMLStreamConstants.END_ELEMENT: {
                    String tagName = reader.getLocalName();
                    if ("site".equals(tagName)) {
                        sites.add(site);
                    }
                    break;
                }
            }
        }
        return sites;
            
        } catch (XMLStreamException e) {
            return null;
        } finally {
            try {
                reader.close();
            } catch (Exception e) {}   
        }
    }
}     
  
                
                
                
                
                
                
                    
                   /*switch (tagName) {   
                   case "site": {  ///.equals(tagName)) {
                       site = new Site();
                       site.setId(reader.getAttributeValue(null, "id"));
                       break; }
                   case "title": {site.setTitle(reader.getElementText()); break;}
                   case "type":  {site.setType(reader.getElementText()); break;}     
                   //case "chars": {
                   case "email": {site.chars.setEmail(reader.getElementText()); 
                    } else if ("news".equals(tagName)) {
                        reader.getElementText();
                        while ("n".equals(tagName)) {
                            site.chars.addElement(reader.getElementText()); 
                        }
                    } else if ("votes".equals(tagName)) {
                            site.chars.setAnonimous(Boolean.parseBoolean(reader.getAttributeValue(null, "anonimous")));
                            //reader.getElementText();
                            if ("enable".equals(tagName)) {
                                site.chars.setVotes(Boolean.parseBoolean(reader.getElementText()));
                            }
                        } else if ("payment".equals(tagName)) {
                            site.chars.setPayment(Boolean.parseBoolean(reader.getElementText()));
                        } else if ("authorization".equals(tagName)) {
                            site.setAuthorization(Boolean.parseBoolean(reader.getElementText()));
                        }  
                        
                        
                        
                        
                    /*} else if ("chars".equals(tagName)) {
                        reader.getElementText();

                        if (!siteType.equals("ADS")) {

                        switch (siteType) {
                        case "NEWS":
                        case "MIRROR": 
                        case "PORTAL": {
                            if ("chars".equals(tagName)) {
                                reader.getElementText();
                            } else if ("email".equals(tagName)) {
                                site.chars.setEmail(reader.getElementText());
                            } 
                            
                            
                            
                            else if ("news".equals(tagName)) {
                                reader.getElementText();
                                while ("n".equals(tagName)) {
                                    site.chars.addElement(reader.getElementText()); 
                                }
                            } else if ("votes".equals(tagName)) {
                                site.chars.setAnonimous(Boolean.parseBoolean(reader.getAttributeValue(null, "anonimous")));
                                //reader.getElementText();
                                if ("enable".equals(tagName)) {
                                    site.chars.setVotes(Boolean.parseBoolean(reader.getElementText()));
                                }
                            } else if ("payment".equals(tagName)) {
                                site.chars.setPayment(Boolean.parseBoolean(reader.getElementText()));
                            } else if ("authorization".equals(tagName)) {
                                site.setAuthorization(Boolean.parseBoolean(reader.getElementText()));
                            }
                        break;  
                        }
                        
                        case "MIRRO": {
                            if ("chars".equals(tagName)) {
                                site.chars.setEmail(reader.getElementText());
                            } else if ("email".equals(tagName)) {
                                site.setTitle(reader.getElementText());
                            } else if ("archives".equals(tagName)) {
                                reader.getElementText();
                                while ("a".equals(tagName)) {
                                    site.chars.addElement(reader.getElementText()); 
                                }
                            } else if ("votes".equals(tagName)) {
                                site.chars.setAnonimous(Boolean.parseBoolean(reader.getAttributeValue(null, "anonimous")));
                                //reader.getElementText();
                                if ("enable".equals(tagName)) {
                                    site.chars.setVotes(Boolean.parseBoolean(reader.getElementText()));
                                }
                            } else if ("payment".equals(tagName)) {
                                site.chars.setPayment(Boolean.parseBoolean(reader.getElementText()));
                            } else if ("authorization".equals(tagName)) {
                                site.setAuthorization(Boolean.parseBoolean(reader.getElementText()));
                            }
                        break;  
                        }
                        
                            
                      
                       
                        
                   
                    break;
                }
                        
                    
                        
                        
                        */
                        
                
