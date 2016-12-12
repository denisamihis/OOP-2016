package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;

	public Insect(double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
	}
	public Insect() {
		super();
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean isDangerous() {
		return isDangerous;
	}

	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(isCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(isDangerous()));
		}
	
}
