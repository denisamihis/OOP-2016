package javasmmr.zoowsome.models.animals;

public class Interface {
	public interface Killer{
		public boolean kill();
	}
	public interface Caretaker_I{
		public String takeCareOf(Animal animal);
	}
}
