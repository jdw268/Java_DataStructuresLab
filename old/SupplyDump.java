import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.util.*;

class SupplyDump {

    private Map<String, Part> Stock = new HashMap<>();

    public static void main(String[] args){
        ingestStock();
      //  request();
    }

    public static void request(){}
    public void buildOrder(String oid){}
  //  public int[] pidFormat(int i){}
  //  public Boolean partAvailable(String p, String id){}
  //  public ArrayList<Part> returnParts(String pid){}
    public void createInvoice(){}
    public void showInvoice(){}
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
                               Body b = new Body(j, e.getAttribute("id"), e.getElementsByTagName("Cost").item(0).getTextContent(), e.getElementsByTagName("name").item(0).getTextContent());
                               // Add b to your data structure what ever it may be
                            }
                            break;
                        // case "Exterior" :
                        //     for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                        //         Exterior e = new Exterior(j, e.getAttribute("id"), e.getElementsByTagName("Cost").item(0).getTextContent(),e.getElementsByTagName("color").item(0).getTextContent());
                        //        // Add b to your data structure what ever it may be
                        //     }
                        //     break;
                        // case "Interior" :
                        //     for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                        //         Interior i = new Interior(e.getAttribute("id"), i, e.getElementsByTagName("Cost").item(0).getTextContent(),e.getElementsByTagName("color").item(0).getTextContent(),e.getElementsByTagName("material").item(0).getTextContent());
                        //        // Add b to your data structure what ever it may be
                        //     }
                        //     break;
                        // case "PowerTrain" :
                        //     for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                        //         PowerTrain p = new PowerTrain(e.getAttribute("id"), i, e.getElementsByTagName("Cost").item(0).getTextContent(),e.getElementsByTagName("auto").item(0).getTextContent());
                        //        // Add b to your data structure what ever it may be
                        //     }
                        //     break;
                        // case "Seat" :
                        //     for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                        //         Seat s = new Seat(e.getAttribute("id"), i, e.getElementsByTagName("Cost").item(0).getTextContent(),e.getElementsByTagName("sType").item(0).getTextContent());
                        //        // Add b to your data structure what ever it may be
                        //     }
                        //     break;
                        // case "Radio" :
                        //     for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                        //         Radio r = new Radio(e.getAttribute("id"), i, e.getElementsByTagName("Cost").item(0).getTextContent(),e.getElementsByTagName("console").item(0).getTextContent());
                        //        // Add b to your data structure what ever it may be
                        //     }
                        //     break;
                        // case "Rim" :
                        //     for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                        //         Rim r = new Rim(e.getAttribute("id"), i, e.getElementsByTagName("Cost").item(0).getTextContent(),e.getElementsByTagName("size").item(0).getTextContent());
                        //        // Add b to your data structure what ever it may be
                        //     }
                        //     break;
                        // case "Tire" :
                        //     for(int i = 0; i < Integer.parseInt(e.getElementsByTagName("qty").item(0).getTextContent()); i++){
                        //         Tire t = new Tire(e.getAttribute("id"), i, e.getElementsByTagName("Cost").item(0).getTextContent(),e.getElementsByTagName("tType").item(0).getTextContent());
                        //        // Add b to your data structure what ever it may be
                        //     }
                        //     break;
                        // case "Misc" :
                        //     ArrayList<String> misc = ingestStockMisc(e, e.getAttribute("index"));
                        //        // Add b to your data structure what ever it may be
                        //     break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public static ArrayList<Misc> ingestStockMisc(Element e, String index){
        ArrayList<Misc> p = new ArrayList<String>();
        switch (index) {
            case "1" :
                Element a = (Element) e.getElementsByTagName("DrivingAssist").item(0);
                for (int i = 0; i < Integer.parseInt(a.getElementsByTagName("qty").item(0).getTextContent()); i++) {
                        misc.get(i).add(new DrivingAssist(e.getElementsByTagName(p).item(0).getAttribute("id"),"DrivingAssist",e.getElementsByTagName(p).item(0).getAttribute("Cost").item(0).getTextContent(),e.getAttribute("index"),e.getElementsByTagName(p).item(0).getAttribute("dType").item(0).getTextContent()));
                }
                break;
            case "2" :
                Element r = (Element) e.getElementsByTagName("Roof").item(0);
                for (int i = 0; i < Integer.parseInt(r.getElementsByTagName("qty").item(0).getTextContent()); i++) {
                        misc.get(i).add(new Roof(e.getElementsByTagName(p).item(0).getAttribute("id"),"Roof",e.getElementsByTagName(p).item(0).getAttribute("Cost").item(0).getTextContent(),e.getAttribute("index"),e.getElementsByTagName(p).item(0).getAttribute("rType").item(0).getTextContent()));
                }
                break;
            case "3" :
                Element b = (Element) e.getElementsByTagName("Backup").item(0);
                for (int i = 0; i < Integer.parseInt(b.getElementsByTagName("qty").item(0).getTextContent()); i++) {
                        misc.get(i).add(new Backup(e.getElementsByTagName(p).item(0).getAttribute("id"),"Backup",e.getElementsByTagName(p).item(0).getAttribute("Cost").item(0).getTextContent(),e.getAttribute("index"),e.getElementsByTagName(p).item(0).getAttribute("bType").item(0).getTextContent()));
                }
                break;
            case "4" :
                Element s = (Element) e.getElementsByTagName("Sensor").item(0);
                for (int i = 0; i < Integer.parseInt(s.getElementsByTagName("qty").item(0).getTextContent()); i++) {
                        misc.get(i).add(new Sensor(e.getElementsByTagName(p).item(0).getAttribute("id"),"Sensor",e.getElementsByTagName(p).item(0).getAttribute("Cost").item(0).getTextContent(),e.getAttribute("index"),e.getElementsByTagName(p).item(0).getAttribute("sType").item(0).getTextContent()));
                }
                break;
        }
        return p;
    }  //end ingestStockMisc
}  //end supplyDump class
