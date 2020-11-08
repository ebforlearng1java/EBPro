package co.jp.chapter10;

public enum PetType {
	CAT("猫", "0"),
    DOG("犬", "1");

    private String type;
    private String id;

    PetType(String type, String id) {
        this.type = type;
    	this.id = id;
	}

	public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public static PetType getById(String id) {

        for( PetType petType : PetType.values() ) {
            if( petType.getId().equals(id) ) {
                return petType;
            }
        }
        return null;
    }
}
