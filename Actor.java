
public class Actor extends People {

	int [] oscarNominations;
	String actorType;
	
	public enum ActorType {
		MAIN, SUPPORTING, STUNTMAN;
	}
	
	public Actor() {
		
	}
	
	public Actor(int[] oscarNominations, String actorType) {
		super();
		this.oscarNominations = oscarNominations;
		this.actorType = actorType;
	}

	public String getActorType() {
		return actorType;
	}
	
	public void setActorType(String actorType) {
		if (ActorType.values().equals(actorType)) {
		this.actorType = actorType;
		}
		
	}

	public Actor(int [] oscarNominations) {
		this.oscarNominations=oscarNominations;
	}

	public int[] getOscarNominations() {
		return oscarNominations;
	}

	public void setOscarNominations(int[] oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

}
