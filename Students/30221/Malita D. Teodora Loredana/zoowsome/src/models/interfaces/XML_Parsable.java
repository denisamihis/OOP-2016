package models.interfaces;

import javax.lang.model.element.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public interface XML_Parsable {
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException;
	public void decodeFromXML(Element element);
}
