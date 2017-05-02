package hu.bme.mit.GarageGate;

public class MotorLogic {
	private MotorState motorState = MotorState.STOPPED;

	public MotorLogic() {

	}

	public void startMotor() {
		if (motorState == MotorState.STOPPED) {
			motorState = MotorState.MOVING;
		}

	}

	public void stopMotor() {
		if (motorState == MotorState.MOVING) {
			motorState = MotorState.STOPPED;
		}
	}

}
