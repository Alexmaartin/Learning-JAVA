package com.campusdual.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class XMLFileCreator {
    private static void createDocument() throws ParserConfigurationException{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        Element root = document.createElement("Computer");
        document.appendChild(root);
        Element components = document.createElement("Components");
        root.appendChild(components);
    }

    public static void main(String[] args) {
        try {
            XMLFileCreator.createDocument();
        }catch (ParserConfigurationException e){
            throw new RuntimeException(e);
        }
    }
}
