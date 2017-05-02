package hu.bme.mit.GarageGate;

public class GateStateSensorLogic {
	private GateState gateIsClosedState = GateState.CLOSED;
	private GarageGateLogic gate;

	public GateStateSensorLogic(GarageGateLogic g) {
		gate = g;
	}

	public void ClosedGate() {
		setGateIsClosedState(GateState.CLOSED);
		gate.gateClosed();
	}

	public void OpenedGate() {
		setGateIsClosedState(GateState.OPENED);
		gate.gateOpened();
	}

	public GateState getGateIsClosedState() {
		return gateIsClosedState;
	}

	public void setGateIsClosedState(GateState _gateIsClosedState) {
		gateIsClosedState = _gateIsClosedState;
	}
}
