// Generated by GraphWalker (http://www.graphwalker.org)
package hu.bme.mit.GarageGate;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "hu/bme/mit/GarageGate/GateModel.graphml")
public interface GateModel {

    @Vertex()
    void v_Closed();

    @Edge()
    void e_BlockToOpeningBlocked();

    @Edge()
    void e_ReClose();

    @Vertex()
    void v_OpeningBlocked();

    @Vertex()
    void v_Opening();

    @Edge()
    void e_Closed();

    @Edge()
    void e_Close();

    @Edge()
    void e_BlockToClosing();

    @Edge()
    void e_FreeToLighting();

    @Edge()
    void e_FreeToClosing();

    @Edge()
    void e_Opened();

    @Edge()
    void e_FreeReOpening();

    @Vertex()
    void v_ClosingBlocked();

    @Edge()
    void e_init();

    @Edge()
    void e_FreeToOpening();

    @Vertex()
    void v_Opened();

    @Vertex()
    void v_Closing();

    @Edge()
    void e_BlockReOpeningBlocked();

    @Vertex()
    void v_LightingTimer();

    @Edge()
    void e_BlockToClosingBlocked();

    @Edge()
    void e_Open();

    @Edge()
    void e_FreeReClosing();

    @Edge()
    void e_ReOpen();
}
