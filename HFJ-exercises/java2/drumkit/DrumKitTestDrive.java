class DrumKitTestDrive {
	public static void main(String [] args) {

		DrumKit d = new DrumKit();

		d.snare = false;
		d.playSnare();

		d.topHat = false;
		d.playTopHat();

		if (d.snare == true) {
			d.playSnare();
		}

	}
}