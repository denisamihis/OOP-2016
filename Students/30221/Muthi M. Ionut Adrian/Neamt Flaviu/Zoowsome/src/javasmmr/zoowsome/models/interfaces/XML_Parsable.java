package javasmmr.zoowsome.models.interfaces;

import java.xml.stream.XMLEventWriter;
import java.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
public interface XML_Parsable {
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException;
	public void decodeFromXml(Element element);
}
