package javasmmr.zoowsome.models.interfaces;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public interface XML_Parable {
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException;
	public void decodeFromXml(Element element);

}
