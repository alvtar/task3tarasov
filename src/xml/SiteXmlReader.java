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
                    switch (tagName) {
                    case "site": {
                        site = new Site();
                        site.setId(reader.getAttributeValue(null, "id"));
                        break;
                    }
                    case "title": {
                        site.setTitle(reader.getElementText());
                        break;
                    }
                    case "type": {
                        site.setType(Type.valueOf(reader.getElementText()));
                        break;
                    }
                    case "email": {
                        site.chars.setEmail(reader.getElementText());
                        break;
                    }
                    case "n":
                    case "a": {
                        site.chars.addElement(reader.getElementText());
                        break;
                    }
                    case "votes": {
                        site.chars.setAnonimous(Boolean.parseBoolean(reader.getAttributeValue(null, "anonimous")));
                        break;
                    }
                    case "enable": {
                        site.chars.setVotes(Boolean.parseBoolean(reader.getElementText()));
                        break;
                    }
                    case "payment": {
                        site.chars.setPayment(Boolean.parseBoolean(reader.getElementText()));
                        break;
                    }
                    case "authorization": {
                        site.setAuthorization(Boolean.parseBoolean(reader.getElementText()));
                        break;
                    }
                    }
                    break;
                }

                case XMLStreamConstants.END_ELEMENT: {
                    if ("site".equals(reader.getLocalName())) {
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
            } catch (Exception e) {
            }
        }
    }
}
