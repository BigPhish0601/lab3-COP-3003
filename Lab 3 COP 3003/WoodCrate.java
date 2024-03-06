package lab3;

// Class WoodCrate derives from abstract class Crate
class WoodCrate extends Crate {

	public WoodCrate() {
	}

	//  Method that calculates cost * weight of WoodCrate
	public double cost() {
		weight = weight * 1.4;
		return weight;
	}
}