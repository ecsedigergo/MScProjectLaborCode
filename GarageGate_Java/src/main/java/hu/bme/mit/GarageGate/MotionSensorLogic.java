package hu.bme.mit.GarageGate;

public class MotionSensorLogic {
	private IdleState motionSensorState = IdleState.IDLE;
	private GarageGateLogic gate;

	public MotionSensorLogic(GarageGateLogic g) {
		gate = g;
	}

	public void freeMotionSensor() {
		setMotionSensorState(IdleState.IDLE);
		gate.free();
	}

	public void blockMotionSensor() {
		setMotionSensorState(IdleState.IDLE);
		gate.block();
	}

	public IdleState getMotionSensorState() {
		return motionSensorState;
	}

	public void setMotionSensorState(IdleState _motionSensorState) {
		motionSensorState = _motionSensorState;
	}
}
