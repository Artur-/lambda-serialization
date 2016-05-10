package org.vaadin.artur.lambda;

import java.io.Serializable;

public class ListenerHolder implements Serializable {
    private MySerializableFunctionalInterface listener;

    public MySerializableFunctionalInterface register(
            MySerializableFunctionalInterface l) {
        listener = l;
        return () -> unregister(l);
    }

    private void unregister(MySerializableFunctionalInterface l) {
        // Only the reference to this method is important
    }
}
