import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class OfficeDeskItemsXML {
    public static void main(String[] args) {
        try {
            // Create DocumentBuilderFactory and DocumentBuilder
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Create a new Document
            Document doc = docBuilder.newDocument();

            // Root element
            Element rootElement = doc.createElement("officeDesk");
            doc.appendChild(rootElement);

            // Item elements
            Element item1 = doc.createElement("item");
            item1.setAttribute("type", "Laptop");
            item1.setAttribute("brand", "Dell");
            item1.setAttribute("model", "XPS 13");
            item1.setAttribute("price", "1000");
            rootElement.appendChild(item1);

            Element item2 = doc.createElement("item");
            item2.setAttribute("type", "Monitor");
            item2.setAttribute("brand", "Samsung");
            item2.setAttribute("model", "Odyssey G7");
            item2.setAttribute("price", "700");
            rootElement.appendChild(item2);

            Element item3 = doc.createElement("item");
            item3.setAttribute("type", "Keyboard");
            item3.setAttribute("brand", "Logitech");
            item3.setAttribute("model", "MX Keys");
            item3.setAttribute("price", "100");
            rootElement.appendChild(item3);

            Element item4 = doc.createElement("item");
            item4.setAttribute("type", "Mouse");
            item4.setAttribute("brand", "Logitech");
            item4.setAttribute("model", "MX Master 3");
            item4.setAttribute("price", "100");
            rootElement.appendChild(item4);

            Element item5 = doc.createElement("item");
            item5.setAttribute("type", "Notebook");
            item5.setAttribute("brand", "Moleskine");
            item5.setAttribute("model", "Classic");
            item5.setAttribute("price", "20");
            rootElement.appendChild(item5);

            // Write the content into an XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            // Ensure the directory exists
            File directory = new File("xml");
            if (!directory.exists()) {
                directory.mkdirs();
            }

            // Output file
            File file = new File("xml/officeDeskItems.xml");
            StreamResult result = new StreamResult(file);

            // Output to console for testing
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);

            // Save to file
            transformer.transform(source, result);

            System.out.println("File saved!");

        } catch (ParserConfigurationException | TransformerException pce) {
            pce.printStackTrace();
        }
    }
}
