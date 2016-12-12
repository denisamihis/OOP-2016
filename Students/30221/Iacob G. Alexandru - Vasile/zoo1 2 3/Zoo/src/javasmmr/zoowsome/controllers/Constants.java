package javasmmr.zoowsome.controllers;

public final class Constants {
	
	public static final int NR_OF_ANIMALS = 50;
	public static final int NR_OF_SPECIES = 5;
	public static final int NR_OF_DIF_ANIMALS = 3;
	public static final int NR_OF_EMPLOYEES = 35;
	
	public static final class Species {
		public static final String MAMMALS = "Mammals";
		public static final String BIRDS = "Birds";
		public static final String REPTILES = "Reptiles";
		public static final String INSECTS = "Insects";
		public static final String AQUATICS = "Aquatic";
	}
	public static final class Animals {
		
		public static class Mammals {
			public static final String COW = "COW";
			public static final String TIGER = "TIGER";
			public static final String MONKEY = "MONKEY";
		}
	
		public static class Birds {
			public static final String PIGEON = "PIGEON";
			public static final String EAGLE = "EAGLE";
			public static final String CHICKEN = "CHICKEN";
		}
	
		public static class Reptiles {
			public static final String CROCODILE = "CROCODILE";
			public static final String LIZARD = "LIZARD";
			public static final String SNAKE = "SNAKE";
		}
	
		public static class Insects {
			public static final String BUTTERFLY = "BUTTERFLY";
			public static final String DRAGONFLY = "DRAGONFLY";
			public static final String SPIDER = "SPIDER";
		}
		
		public static class Aquatics {
			public static final String SHARK = "SHARK";
			public static final String SALMON = "SALMON";
			public static final String GOLDFISH = "GOLDFISH";
		}
	}
	public static final class Employees {
		public static final String CARETAKER = "Caretaker";
		
		public static final class Caretakers {
			public static final String TCO_SUCCES = "SUCCES";
			public static final String TCO_KILLED = "KILLED";
			public static final String TCO_NO_TIME = "NO_TIME";
		}
	}
	
}
