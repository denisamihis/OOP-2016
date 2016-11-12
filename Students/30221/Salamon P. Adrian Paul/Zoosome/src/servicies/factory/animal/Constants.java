package servicies.factory.animal;

public final class Constants {
	public static final class Species {
		public static final String Mammals = "Mammals";
		public static final String Reptiles = "Reptiles";
		public static final String Birds = "Birds";
		public static final String Aquatics = "Aquatics";
		public static final String Insects = "Insects";

	}
public final class XML_TAGS{
	public static final String ANIMAL="ANIMAL";
	public static final String DISCRIMINANT="DISCRIMINANT";
	public static final String EMPLOYEE="EMPLOYEE";
}

	public static final class Employee {
		public static final String Caretakers = "Caretakers";

		public static final class Caretakerss {
			public static final String TCO_SUCCESS = "SUCCES";
			public static final String TCO_KILLED = "KILLED";
			public static final String TCO_NO_TIME = "NO_TIME";
		}

	}

	public static final class Animals {
		public static final class Mammals {
			public static final String Horse = "HORSE";
			public static final String Cat = "CAT";
			public static final String Rat = "RAT";
		}

		public static final class Reptiles {
			public static final String Turtle = "TURTLE";
			public static final String Lizard = "Lizard";
			public static final String Chameleon = "CHAMELEON";

		}

		public static final class Birds {
			public static final String Pigeon = "PIGEON";
			public static final String Hen = "HEN";
			public static final String Turkey = "TURKEY";
		}

		public static final class Aquatics {
			public static final String Salmon = "SALMON";
			public static final String Trout = "TROUT";
			public static final String Shark = "SHARK";

		}

		public static final class Insects {
			public static final String Ant = "ANT";
			public static final String Fly = "FLY";
			public static final String Moth = "MOTH";
		}
	}
}
