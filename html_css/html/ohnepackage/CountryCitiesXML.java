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

public class CountryCitiesXML {
    public static void main(String[] args) {
        try {
            // Create DocumentBuilderFactory and DocumentBuilder
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Create a new Document
            Document doc = docBuilder.newDocument();

            // Root element
            Element rootElement = doc.createElement("countries");
            doc.appendChild(rootElement);

            // Country element
            Element country = doc.createElement("country");
            country.setAttribute("name", "USA");
            rootElement.appendChild(country);

            // City elements
            Element city1 = doc.createElement("city");
            city1.setAttribute("name", "New York");
            city1.setAttribute("population", "8419000");
            country.appendChild(city1);

            Element city2 = doc.createElement("city");
            city2.setAttribute("name", "Los Angeles");
            city2.setAttribute("population", "3980400");
            country.appendChild(city2);

            Element city3 = doc.createElement("city");
            city3.setAttribute("name", "Chicago");
            city3.setAttribute("population", "2716000");
            country.appendChild(city3);

            // Another Country element
            Element country2 = doc.createElement("country");
            country2.setAttribute("name", "Canada");
            rootElement.appendChild(country2);

            // City elements for the second country
            Element city4 = doc.createElement("city");
            city4.setAttribute("name", "Toronto");
            city4.setAttribute("population", "2930000");
            country2.appendChild(city4);

            Element city5 = doc.createElement("city");
            city5.setAttribute("name", "Vancouver");
            city5.setAttribute("population", "675218");
            country2.appendChild(city5);

            Element city6 = doc.createElement("city");
            city6.setAttribute("name", "Montreal");
            city6.setAttribute("population", "1704694");
            country2.appendChild(city6);

            // Write the content into an XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("countries.xml"));

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
