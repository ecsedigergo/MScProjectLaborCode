package hu.bme.mit.GarageGate;

public class GarageGateLogic {
	// private GarageGate gate;
	private GarageGateState gateState;
	private SwitchControllerLogic sc;
	private MotionSensorLogic ms;
	private LampLogic l;
	private MotorLogic m;

	public GarageGateLogic() {
		setGateState(GarageGateState.CLOSED);
		l = new LampLogic();
		m = new MotorLogic();
		sc = new SwitchControllerLogic(this);
		ms = new MotionSensorLogic(this);
	}

	public void openGate() {
		switch (getGateState()) {
		case CLOSED:
			setGateState(GarageGateState.OPENING);
			m.startMotor();
			break;
		// case OPENED:
		// gateState = GateState.OPENED;
		// break;
		// case OPENING:
		// gateState = GateState.OPENING;
		// break;

		default:
			throw new RuntimeException();
		}
	}

	public void closeGate() {
		switch (getGateState()) {
		case OPENED:
			setGateState(GarageGateState.CLOSING);
			m.startMotor();
			break;

		// case CLOSED:
		// gateState = GateState.CLOSED;
		// break;
		//
		// case CLOSING:
		// gateState = GateState.CLOSING;
		// break;

		default:
			throw new RuntimeException();
		}

	}

	public void free() {
		switch (getGateState()) {
		case OPENING_BLOCKED:
			setGateState(GarageGateState.OPENING);
			m.startMotor();
			break;

		case CLOSING_BLOCKED:
			setGateState(GarageGateState.LIGHTING_TIMER);
			l.onLamp();
			break;

		default:
			throw new RuntimeException();

		}
	}

	public void block() {
		switch (getGateState()) {
		case OPENING:
			setGateState(GarageGateState.OPENING_BLOCKED);
			m.stopMotor();
			break;

		case CLOSING:
			setGateState(GarageGateState.CLOSING_BLOCKED);
			m.stopMotor();
			break;

		case LIGHTING_TIMER:
			setGateState(GarageGateState.CLOSING_BLOCKED);
			l.offLamp();
			break;

		default:
			throw new RuntimeException();
		}
	}

	public void finishedMoving() {
		switch (getGateState()) {
		case CLOSING:
			setGateState(GarageGateState.CLOSED);
			m.stopMotor();
			break;
		case OPENING:
			setGateState(GarageGateState.OPENED);
			m.stopMotor();
			break;
		default:
			break;
		}
	}

	public void gateClosed() {
		switch (getGateState()) {
		case CLOSING:
			setGateState(GarageGateState.CLOSED);
			m.stopMotor();
			break;

		default:
			throw new RuntimeException();

		}

	}

	public void gateOpened() {
		switch(getGateState()){
		case OPENING:
			setGateState(GarageGateState.OPENED);
			m.stopMotor();
			break;
		default:
			throw new RuntimeException();
		}
	}

	public GarageGateState getGateState() {
		return gateState;
	}

	public void setGateState(GarageGateState _gateState) {
		gateState = _gateState;
	}
}
