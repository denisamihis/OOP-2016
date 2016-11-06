package javasmmr.zoowsome.services;
import javasmmr.zoowsome.models.*;

public abstract class SpeciesFactory {
	
	public abstract Animal getAnimal(String type);
}
