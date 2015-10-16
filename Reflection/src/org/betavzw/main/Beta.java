package org.betavzw.main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Definitie van een eigen annotatie die opgenomen zal worden in het .class bestand (RUNTIME)
 * en alleen kan worden toegepast op klassen, interfaces en enums (TYPE)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Beta {

}
