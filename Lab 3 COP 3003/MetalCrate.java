package lab3;

// Class MetalCrate derives from abstract class Crate
class MetalCrate extends Crate {

	public MetalCrate() {
	}

	// Method that calculates cost * weight of MetalCrate
	public double cost() {
		weight = weight * 1.3;
		return weight;
	}
}