import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javafx.scene.paint.Color;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleConsumer;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        File xml = new File("file.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(xml);
        org.w3c.dom.Element element = document.getDocumentElement();
        printElements(element.getChildNodes());

        System.out.println(element.getTextContent());
    }
        public static void printElements(NodeList nodeList){
        for (int i = 0; i < nodeList.getLength(); i++){
            if(nodeList.item(i) instanceof Element){
                System.out.println(((Element) nodeList.item(i)).getSimpleName());
            }else if(nodeList.item(i).hasChildNodes()){
                printElements(nodeList.item(i).getChildNodes());
            }
        }
        }
    }