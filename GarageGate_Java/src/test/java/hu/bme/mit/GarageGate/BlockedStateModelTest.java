package hu.bme.mit.GarageGate;

import org.graphwalker.core.Assert;
import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(start = "e_init", value = "random(edge_coverage(80))")
public class BlockedStateModelTest implements BlockedStateModel {
	private GarageGateLogic gate;

	@Override
	public void e_free() {
		gate.free();
	}

	@Override
	public void e_block() {
		gate.block();
	}

	@Override
	public void v_Free() {
		Assert.expect(gate.getGateState()).to.have.property("GateState").and.is.equal(GarageGateState.OPENING);
//		Assert.expect(gate.getGateState()).to.have.property("GateState").and.is.equals(GarageGateState.CLOSING);
	}

	@Override
	public void v_Blocked() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_init() {
		gate = new GarageGateLogic();
	}
	
}
