package io.ayers.spring.basics.xml;

public class XmlDao {
    public XmlConnection getXmlConnection() {
        return xmlConnection;
    }

    public void setXmlConnection(XmlConnection xmlConnection) {
        this.xmlConnection = xmlConnection;
    }

    XmlConnection xmlConnection;
}
