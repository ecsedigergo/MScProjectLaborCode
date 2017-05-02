package hu.bme.mit.GarageGate;

public class Main {

	public static void main(String[] args) {
		GarageGateLogic gate = new GarageGateLogic();
		SwitchControllerLogic sc = new SwitchControllerLogic(gate);
		MotionSensorLogic ms = new MotionSensorLogic(gate);
		
		sc.openSwitchController();
	}

}
