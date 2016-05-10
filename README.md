# lambda-serialization
Test case for broken lambda serialization in Java 8

To test, run `mvn clean install`

If you have a broken JDK (they all seem to be), you will get
```
java.lang.ClassCastException: cannot assign instance of java.lang.invoke.SerializedLambda to field org.vaadin.artur.lambda.ListenerHolder$1.val$l of type org.vaadin.artur.lambda.MySerializableFunctionalInterface in instance of org.vaadin.artur.lambda.ListenerHolder$1
```

