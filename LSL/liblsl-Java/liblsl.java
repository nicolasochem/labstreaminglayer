/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class liblsl {
  public static double getIRREGULAR_RATE() {
    return liblslJNI.IRREGULAR_RATE_get();
  }

  public static double getDEDUCED_TIMESTAMP() {
    return liblslJNI.DEDUCED_TIMESTAMP_get();
  }

  public static double getFOREVER() {
    return liblslJNI.FOREVER_get();
  }

  public static int protocol_version() {
    return liblslJNI.protocol_version();
  }

  public static int library_version() {
    return liblslJNI.library_version();
  }

  public static double local_clock() {
    return liblslJNI.local_clock();
  }

  public static vectorinfo resolve_streams(double wait_time) {
    return new vectorinfo(liblslJNI.resolve_streams__SWIG_0(wait_time), true);
  }

  public static vectorinfo resolve_streams() {
    return new vectorinfo(liblslJNI.resolve_streams__SWIG_1(), true);
  }

  public static vectorinfo resolve_stream(String prop, String value, int minimum, double timeout) {
    return new vectorinfo(liblslJNI.resolve_stream__SWIG_0(prop, value, minimum, timeout), true);
  }

  public static vectorinfo resolve_stream(String prop, String value, int minimum) {
    return new vectorinfo(liblslJNI.resolve_stream__SWIG_1(prop, value, minimum), true);
  }

  public static vectorinfo resolve_stream(String prop, String value) {
    return new vectorinfo(liblslJNI.resolve_stream__SWIG_2(prop, value), true);
  }

  public static vectorinfo resolve_stream(String pred, int minimum, double timeout) {
    return new vectorinfo(liblslJNI.resolve_stream__SWIG_3(pred, minimum, timeout), true);
  }

  public static vectorinfo resolve_stream(String pred, int minimum) {
    return new vectorinfo(liblslJNI.resolve_stream__SWIG_4(pred, minimum), true);
  }

  public static vectorinfo resolve_stream(String pred) {
    return new vectorinfo(liblslJNI.resolve_stream__SWIG_5(pred), true);
  }

}