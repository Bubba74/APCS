
public class NamedCow extends Cow {

	private String name;

	public NamedCow (String animalType, String name, String sound){
		super (animalType, sound);
		this.name = name;
	}

	public String getName(){
		return name;
	}
}
