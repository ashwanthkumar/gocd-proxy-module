package in.ashwanthkumar.gocd.proxy.module;

/**
 * Marker to describe from which version of GoCD version did we start adding this.
 */
public @interface SinceGoCD {
    String version();
}
