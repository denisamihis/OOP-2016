package models.animals;


	public enum   WaterType{
	 	WaterType1("Saltwater"),
	 	WaterType2("Freshwater");
		 private final String name;       

		    private WaterType(String s) {
		        name = s;
		    }

		    public boolean equalsName(String otherName) {
		        return (otherName == null) ? false : name.equals(otherName);
		    }

		    public String toString() {
		       return this.name;
		    }
	 	
	 	}

