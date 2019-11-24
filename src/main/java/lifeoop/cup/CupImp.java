package lifeoop.cup;

import lifeoop.brand.Brand;
import lifeoop.material.MaterialInterface;
import lifeoop.shape.Shape3D;

public abstract class CupImp implements CupInterface {
	private Brand brand = null;	// 牌子
	private Shape3D shape = null;	
	private MaterialInterface material = null;
	private int numLayer = 1;	// 几层
	private double heatPreservation = 0.0;	//保温性
	private boolean hasLid = false;		// 是否有盖
	public CupImp(Brand brand, Shape3D shape, MaterialInterface material, int numLayer, double heatPreservation,
			boolean hasLid) {
		super();
		this.brand = brand;
		this.shape = shape;
		this.material = material;
		this.numLayer = numLayer;
		this.heatPreservation = heatPreservation;
		this.hasLid = hasLid;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Shape3D getShape() {
		return shape;
	}
	public void setShape(Shape3D shape) {
		this.shape = shape;
	}
	public MaterialInterface getMaterial() {
		return material;
	}
	public void setMaterial(MaterialInterface material) {
		this.material = material;
	}
	public int getNumLayer() {
		return numLayer;
	}
	public void setNumLayer(int numLayer) {
		this.numLayer = numLayer;
	}
	public double getHeatPreservation() {
		return heatPreservation;
	}
	public void setHeatPreservation(double heatPreservation) {
		this.heatPreservation = heatPreservation;
	}
	public boolean isHasLid() {
		return hasLid;
	}
	public void setHasLid(boolean hasLid) {
		this.hasLid = hasLid;
	}
	
	@Override
	public double valume() {
		return this.shape.volume();
	}
}
