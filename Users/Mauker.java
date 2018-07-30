public class Mauker extends Room15User {

	private boolean isRoomOwner = false;
	private boolean hasCircle = true;
	private boolean hasAndroidWear = false;
	private boolean hasHat = true;
	private ArrayList<Color> hatColors;

	public Mauker() {
		// TODO auto generated method stub
		if (hasHat) {
			hatColors = new ArrayList<>();
			hatColors.add(Color.BLACK);
			hatColors.add(Color.WHITE);
		}	
	}

	public boolean isCircle(){
		return hasCircle;
	}

	public boolean isOwner(){
		return isRoomOwner;
	}

	public boolean hasAndroidWear() {
		return hasAndroidWear;
	}

	public boolean hasHat() {
		return hasHat;
	}

	public ArrayList<Color> getHatColors() {
		if (hasHat) {
			if (hatColors != null) {
				return hatColors;
			}
		}
		return null;
	}
	
	public void plz() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Mauker plz";
	}
}
