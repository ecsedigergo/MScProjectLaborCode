package hu.bme.mit.GarageGate;

public class LampLogic {
	public  LampState lampState = LampState.OFF;
	// private GateLogic gate;

	public LampLogic() {
		// gate = g;
	}

	public void onLamp() {
		if (lampState == LampState.OFF) {
			lampState = LampState.ON;
		}
	}

	public void offLamp() {
		if (lampState == LampState.ON) {
			lampState = LampState.OFF;
		}
	}
}
