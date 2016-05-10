package org.vaadin.artur.lambda;
import java.io.Serializable;

public class TestSubject implements Serializable {
    RemoverHolder removerHolder;
    ListenerHolder listenerHolder;

    public TestSubject() {
        listenerHolder = new ListenerHolder();
        removerHolder = new RemoverHolder(listenerHolder);
    }

}
