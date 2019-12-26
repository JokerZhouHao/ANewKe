package designpattern.ch06command;

import designpattern.ch06command.appliance.Light;

public class LightOnCommand implements Command {
	private Light light;
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.lightOn();
	}

}
