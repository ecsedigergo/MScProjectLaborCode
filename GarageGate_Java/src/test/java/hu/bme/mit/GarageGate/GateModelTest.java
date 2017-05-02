package hu.bme.mit.GarageGate;

import static org.graphwalker.core.Assert.expect;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.graphwalker.core.Assert;
import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.test.TestBuilder;


//import hu.bme.mit.GateModel;

@GraphWalker(start = "e_init", value = "random(edge_coverage(80))")
public class GateModelTest extends ExecutionContext implements GateModel {
	// public final static Path ModelPath =
	// Paths.get("/GarageGate/src/test/resources/hu/bme/mit/GarageGate/GateModel.graphml");
	private GarageGateLogic gate;

	@Override
	public void e_BlockToOpeningBlocked() {
		gate.setGateState(GarageGateState.OPENING);
		gate.block();

	}

	@Override
	public void e_Closed() {
		gate.setGateState(GarageGateState.CLOSING);
		gate.closeGate();
	}

	@Override
	public void e_Close() {
		gate.setGateState(GarageGateState.OPENED);
		gate.closeGate();

	}

	@Override
	public void e_BlockToClosing() {
		gate.setGateState(GarageGateState.CLOSING);
		gate.block();
	}

	@Override
	public void e_FreeToLighting() {
		gate.setGateState(GarageGateState.CLOSING_BLOCKED);
		gate.free();
	}

	@Override
	public void e_FreeToClosing() {
		gate.setGateState(GarageGateState.LIGHTING_TIMER);
		gate.free();
	}

	@Override
	public void e_Opened() {
		gate.setGateState(GarageGateState.OPENING);
		gate.gateOpened();
	}

	@Override
	public void e_init() {
		gate = new GarageGateLogic();

	}

	@Override
	public void e_FreeToOpening() {
		gate.setGateState(GarageGateState.OPENING);
		gate.free();
	}

	@Override
	public void e_FreeReOpening() {
		gate.setGateState(GarageGateState.OPENING_BLOCKED);
		gate.free();
	}

	@Override
	public void e_FreeReClosing() {
		gate.setGateState(GarageGateState.CLOSING);
		gate.free();
	}

	@Override
	public void e_BlockReOpeningBlocked() {
		gate.setGateState(GarageGateState.OPENING_BLOCKED);
		gate.free();
	}

	@Override
	public void e_BlockToClosingBlocked() {
		gate.setGateState(GarageGateState.OPENING);
		gate.block();
	}

	@Override
	public void e_Open() {
		gate.setGateState(GarageGateState.CLOSED);
		gate.openGate();
	}

	@Override
	public void e_ReClose() {
		gate.setGateState(GarageGateState.CLOSED);
		gate.closeGate();
	}
	
	@Override
	public void e_ReOpen() {
		gate.setGateState(GarageGateState.OPENED);
		gate.openGate();
	}

	@Override
	public void v_Closed() {
		Assert.expect(gate.getGateState()).equals(GarageGateState.CLOSED);
//		expect(model).to.have.property("edges").and.that.it.have.size(get("edges"));
	}

	@Override
	public void v_OpeningBlocked() {
//		Assert.assertEquals(GarageGateState.OPENING_BLOCKED, gate.getGateState());
		Assert.expect(gate.getGateState()).equals(GarageGateState.OPENING_BLOCKED);
	}

	@Override
	public void v_Opening() {
		Assert.expect(gate.getGateState()).equals(GarageGateState.OPENING);
	}

	@Override
	public void v_ClosingBlocked() {
		Assert.expect(gate.getGateState()).equals(GarageGateState.CLOSING_BLOCKED);
	}

	@Override
	public void v_Opened() {
		Assert.expect(gate.getGateState()).equals(GarageGateState.OPENED);
	}

	@Override
	public void v_Closing() {
		Assert.expect(gate.getGateState()).equals(GarageGateState.CLOSING);
	}

	@Override
	public void v_LightingTimer() {
		Assert.expect(gate.getGateState()).equals(GarageGateState.LIGHTING_TIMER);
	}

	

}
