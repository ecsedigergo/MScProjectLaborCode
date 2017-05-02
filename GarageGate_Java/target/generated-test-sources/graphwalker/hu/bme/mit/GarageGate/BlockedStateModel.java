// Generated by GraphWalker (http://www.graphwalker.org)
package hu.bme.mit.GarageGate;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "hu/bme/mit/GarageGate/BlockedStateModel.graphml")
public interface BlockedStateModel {

    @Edge()
    void e_free();

    @Edge()
    void e_block();

    @Vertex()
    void v_Free();

    @Vertex()
    void v_Blocked();

    @Edge()
    void e_init();
}
