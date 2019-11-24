package lifeoop.cup;

import lifeoop.brand.Brand;
import lifeoop.material.MaterialInterface;
import lifeoop.shape.Shape3D;

public class SnoopyCup extends CupImp {
	private String sticker = "Snoopy";	// 贴画
	
	public SnoopyCup(Shape3D shape, MaterialInterface material, int numLayer, double heatPreservation,
			boolean hasLid, String sticker) {
		super(Brand.Peanuts, shape, material, numLayer, heatPreservation, hasLid);
		this.sticker = sticker;
	}

	public String getSticker() {
		return sticker;
	}

	public void setSticker(String sticker) {
		this.sticker = sticker;
	}
}
