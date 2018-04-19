import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.*;

public class TestIngest {
    public static void main(String[] args) {
        ingestStock();
    }

    public static void ingestStock(){
        ArrayList<String> stock = new ArrayList<String>(Arrays.asList("Body", "Exterior", "Interior", "PowerTrain", "Seat", "Radio", "Rim", "Tire", "Misc"));
        try {
            File file = new File("Stock.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(file);
            document.getDocumentElement().normalize();
            for (String j : stock){
                NodeList n = document.getElementsByTagName(j);
                for (int t = 0; t < n.getLength(); t++) {
                    Node node = n.item(t);
                    Element e = (Element) node;
                    switch(j) {
                        case "Body" :
                            for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                                System.out.println("Body -> Count: " + i + " Id: " + e.getAttribute("id") + " Type: " + j + " Cost: $" + e.getElementsByTagName("Cost").item(0).getTextContent() + " Attribute: " + e.getElementsByTagName("name").item(0).getTextContent());
                                // Add b to your data structure what ever it may be
                            }
                            break;
                        case "Exterior" :
                            for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                                System.out.println("Exterior -> Count: " + i + " Id: " +e.getAttribute("id") + " Type: " + j + " Cost: $" + e.getElementsByTagName("Cost").item(0).getTextContent() + " Attribute: " + e.getElementsByTagName("color").item(0).getTextContent());
                                // Add b to your data structure what ever it may be
                            }
                            break;
                        case "Interior" :
                            for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                                System.out.println("Interior -> Count: " + i + " Id: " +e.getAttribute("id") + " Type: " + j + " Cost: $" + e.getElementsByTagName("Cost").item(0).getTextContent() + " Attribute: " + e.getElementsByTagName("color").item(0).getTextContent() + " Attribute: " + e.getElementsByTagName("material").item(0).getTextContent());
                                // Add b to your data structure what ever it may be
                            }
                            break;
                        case "PowerTrain" :
                            for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                                System.out.println("PowerTrain -> Count: " + i + " Id: " +e.getAttribute("id") + " Type: " + j + " Cost: $" + e.getElementsByTagName("Cost").item(0).getTextContent() + " Attribute: " + e.getElementsByTagName("auto").item(0).getTextContent());
                                // Add b to your data structure what ever it may be
                            }
                            break;
                        case "Seat" :
                            for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                                System.out.println("Seat -> Count: " + i + " Id: " +e.getAttribute("id") + " Type: " + j + " Cost: $" + e.getElementsByTagName("Cost").item(0).getTextContent() + " Attribute: " + e.getElementsByTagName("sType").item(0).getTextContent());
                                // Add b to your data structure what ever it may be
                            }
                            break;
                        case "Radio" :
                            for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                                System.out.println("Radio -> Count: " + i + " Id: " +e.getAttribute("id") + " Type: " + j + " Cost: $" + e.getElementsByTagName("Cost").item(0).getTextContent() + " Attribute: " + e.getElementsByTagName("console").item(0).getTextContent());
                                // Add b to your data structure what ever it may be
                            }
                            break;
                        case "Rim" :
                            for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                                System.out.println("Rim -> Count: " + i + " Id: " +e.getAttribute("id") + " Type: " + j + " Cost: $" + e.getElementsByTagName("Cost").item(0).getTextContent() + " Attribute: " + e.getElementsByTagName("size").item(0).getTextContent());
                                // Add b to your data structure what ever it may be
                            }
                            break;
                        case "Tire" :
                            for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                                System.out.println("TIRE -> Count: " + i + " Id: " + e.getAttribute("id") + " Type: " + j + " Cost: $" + e.getElementsByTagName("Cost").item(0).getTextContent() + " Attribute: " + e.getElementsByTagName("tType").item(0).getTextContent());
                                // Add b to your data structure what ever it may be
                            }
                            break;
                        case "Misc" :
                            ArrayList<String> misc = ingestStockMisc(e, e.getAttribute("index"));
                            System.out.println(misc);
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static ArrayList<String> ingestStockMisc(Element e, String index){
        ArrayList<String> p = new ArrayList<String>();
        switch (index) {
            case "1" :
                Element a = (Element) e.getElementsByTagName("DrivingAssist").item(0);
                for (int i = 0; i < Integer.parseInt(a.getElementsByTagName("qty").item(0).getTextContent()); i++) {
                    p.add("DrivingAssist -> Count: " + i + " Id: " + a.getAttribute("id") + " Type: DrivingAssist Cost: $" + a.getElementsByTagName("Cost").item(0).getTextContent() + " Index: " + e.getAttribute("index") + " Attribute: " + a.getElementsByTagName("dType").item(0).getTextContent());
                }
                break;
            case "2" :
                Element r = (Element) e.getElementsByTagName("Roof").item(0);
                for (int i = 0; i < Integer.parseInt(r.getElementsByTagName("qty").item(0).getTextContent()); i++) {
                    p.add("Roof -> Count: " + i + " Id: " + r.getAttribute("id") + " Type: Roof Cost: $" + r.getElementsByTagName("Cost").item(0).getTextContent() + " Index: " + e.getAttribute("index") + " Attribute: " + r.getElementsByTagName("rType").item(0).getTextContent());
                }
                break;
            case "3" :
                Element b = (Element) e.getElementsByTagName("Backup").item(0);
                for (int i = 0; i < Integer.parseInt(b.getElementsByTagName("qty").item(0).getTextContent()); i++) {
                    p.add("Backup -> Count: " + i + " Id: " + b.getAttribute("id") + " Type: Backup Cost: $" + b.getElementsByTagName("Cost").item(0).getTextContent() + " Index: " + e.getAttribute("index") + " Attribute: " + b.getElementsByTagName("bType").item(0).getTextContent());
                }
                break;
            case "4" :
                Element s = (Element) e.getElementsByTagName("Sensor").item(0);
                for (int i = 0; i < Integer.parseInt(s.getElementsByTagName("qty").item(0).getTextContent()); i++) {
                    p.add("Sensor -> Count: " + i + " Id: " + s.getAttribute("id") + " Type: Sensor Cost: $" + s.getElementsByTagName("Cost").item(0).getTextContent() + " Index: " + e.getAttribute("index") + " Attribute: " + s.getElementsByTagName("sType").item(0).getTextContent());
                }
                break;
        }
        return p;
    }
}