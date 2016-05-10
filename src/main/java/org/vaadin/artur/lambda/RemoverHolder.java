package org.vaadin.artur.lambda;

import java.io.Serializable;

public class RemoverHolder implements Serializable {
    private MySerializableFunctionalInterface remover;

    public RemoverHolder(ListenerHolder e) {
        MySerializableFunctionalInterface remover = e
                .register(() -> doSomething());
        this.remover = remover;
    }

    private void doSomething() {
        // Only the reference to this method is important
    }
}
