package Java_basic.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;

public class MyParserByDom {
    public static void main(String[] args) throws Exception {
        // 获取 DocumentBuilderFactory的实例,创建 DOM 解析器的工厂
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //获取DOM模式的解析器对象
        DocumentBuilder parser = dbf.newDocumentBuilder();
        //输入流读取xml文档,得到代表整个文档的 Document 对象
        Document document = parser.parse(new FileInputStream(new File("src\\Java_basic\\xml\\book.xml")));
        System.out.println("用户的当前工作目录:"+System.getProperty("user.dir"));
        printNode(document,0);

    }

    public static void printNode(Node n, int indent) {
        //indent代表缩进
        for (int i = 0; i < indent; i++) {
            System.out.print(' ');
        }
        switch (n.getNodeType()) {
            case Node.DOCUMENT_NODE: // Document节点
                System.out.println("Document: " + n.getNodeName());
                break;
            case Node.ELEMENT_NODE: // 元素节点
                System.out.println("Element: " + n.getNodeName());
                break;
            case Node.TEXT_NODE: // 文本
                System.out.println("Text: " + n.getNodeName() + " = " + n.getNodeValue());
                break;
            case Node.ATTRIBUTE_NODE: // 属性
                System.out.println("Attr: " + n.getNodeName() + " = " + n.getNodeValue());
                break;
            default: // 其他
                System.out.println("NodeType: " + n.getNodeType() + ", NodeName: " + n.getNodeName());
        }
        for (Node child = n.getFirstChild(); child != null; child = child.getNextSibling()) {
            printNode(child, indent + 1);
        }
    }

}
