package lifeoop.material;

public abstract class MaterialImp implements MaterialInterface {
	private double rigidity = 0.0;	//	硬度
	private double heatPreservation = 0.0; // 保温性
	
	public MaterialImp(double rigidity, double heatPreservation) {
		super();
		this.rigidity = rigidity;
		this.heatPreservation = heatPreservation;
	}

	public double getRigidity() {
		return rigidity;
	}

	public void setRigidity(double rigidity) {
		this.rigidity = rigidity;
	}

	public double getHeatPreservation() {
		return heatPreservation;
	}

	public void setHeatPreservation(double heatPreservation) {
		this.heatPreservation = heatPreservation;
	}
}
