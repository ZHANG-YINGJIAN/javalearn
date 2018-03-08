package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class DOM1 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("src/main/webapp/student.xml");
            NodeList nodeList = doc.getElementsByTagName("students");
            Element e = (Element) nodeList.item(0);
            NodeList studentsNodeList = e.getElementsByTagName("student");
            for (int i = 0; i <studentsNodeList.getLength() ; i++) {
                Element e1 = (Element) studentsNodeList.item(i);
                System.out.println("姓名："+e1.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
                System.out.println("性别："+e1.getElementsByTagName("sex").item(0).getFirstChild().getNodeValue());
                System.out.println("年龄："+e1.getElementsByTagName("age").item(0).getFirstChild().getNodeValue());
                System.out.println("==============");
            }


/*            Element e = (Element) nodeList.item(0);
            System.out.println("姓名："+e.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
            System.out.println("性别："+e.getElementsByTagName("sex").item(0).getFirstChild().getNodeValue());
            System.out.println("年龄："+e.getElementsByTagName("age").item(0).getFirstChild().getNodeValue());*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
