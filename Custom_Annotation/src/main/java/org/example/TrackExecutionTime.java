package org.example;

import java.lang.annotation.*;

@Target(ElementType.METHOD)        // usable on methods only
@Retention(RetentionPolicy.RUNTIME) // available at runtime (important for AOP)
@Documented
public @interface TrackExecutionTime {
}
