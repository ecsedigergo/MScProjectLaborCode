package hu.bme.mit.GarageGate;

public class SwitchControllerLogic {
	private IdleState switchControllerState = IdleState.IDLE;
	private GarageGateLogic gate;

	public SwitchControllerLogic(GarageGateLogic g) {
		gate = g;
	}

	public void openSwitchController() {
		setSwitchControllerState(IdleState.IDLE);
		gate.openGate();

	}

	public void closeSwitchController() {
		setSwitchControllerState(IdleState.IDLE);
		gate.closeGate();
	}

	public IdleState getSwitchControllerState() {
		return switchControllerState;
	}

	public void setSwitchControllerState(IdleState _switchControllerState) {
		switchControllerState = _switchControllerState;
	}
}
