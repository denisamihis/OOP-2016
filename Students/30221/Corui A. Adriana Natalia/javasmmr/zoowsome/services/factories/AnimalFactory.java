package javasmmr.zoowsome.services.factories;

public class AnimalFactory {

	public SpeciesFactory getSpeciesFactory(String type)
	{
		try
		{
			if(Constants.Species.Reptiles.equals(type))
			{
				return new ReptileFactory();
			}else 
				if(Constants.Species.Birds.equals(type))
				{	
					return new BirdFactory();
				}else
					if(Constants.Species.Insects.equals(type))
					{	
						return new InsectFactory();
					}else
						if(Constants.Species.Aquatics.equals(type))
						{	
							return new AquaticFactory();
						}
			}
		catch( Exception e)
		{
			System.out.println("Invalid species exception");
		}
		return null;
	}
}
