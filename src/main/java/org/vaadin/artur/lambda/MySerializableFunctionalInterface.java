package org.vaadin.artur.lambda;
import java.io.Serializable;

@FunctionalInterface
public interface MySerializableFunctionalInterface extends Serializable {
    void someMethod();
}
