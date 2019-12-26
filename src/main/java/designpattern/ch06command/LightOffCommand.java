package designpattern.ch06command;

import designpattern.ch06command.appliance.Light;

public class LightOffCommand implements Command {
	private Light light;
	
	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.lightOff();
	}

}
