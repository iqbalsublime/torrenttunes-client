/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class address_v4 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected address_v4(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(address_v4 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_address_v4(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public address_v4() {
    this(libtorrent_jni.new_address_v4__SWIG_0(), true);
  }

  public address_v4(long addr) {
    this(libtorrent_jni.new_address_v4__SWIG_1(addr), true);
  }

  public address_v4(address_v4 other) {
    this(libtorrent_jni.new_address_v4__SWIG_2(address_v4.getCPtr(other), other), true);
  }

  public long to_ulong() {
    return libtorrent_jni.address_v4_to_ulong(swigCPtr, this);
  }

  public String to_string() {
    return libtorrent_jni.address_v4_to_string__SWIG_0(swigCPtr, this);
  }

  public String to_string(error_code ec) {
    return libtorrent_jni.address_v4_to_string__SWIG_1(swigCPtr, this, error_code.getCPtr(ec), ec);
  }

  public static address_v4 from_string(String str) {
    return new address_v4(libtorrent_jni.address_v4_from_string__SWIG_0(str), true);
  }

  public static address_v4 from_string(String str, error_code ec) {
    return new address_v4(libtorrent_jni.address_v4_from_string__SWIG_1(str, error_code.getCPtr(ec), ec), true);
  }

  public boolean is_loopback() {
    return libtorrent_jni.address_v4_is_loopback(swigCPtr, this);
  }

  public boolean is_unspecified() {
    return libtorrent_jni.address_v4_is_unspecified(swigCPtr, this);
  }

  public boolean is_class_a() {
    return libtorrent_jni.address_v4_is_class_a(swigCPtr, this);
  }

  public boolean is_class_b() {
    return libtorrent_jni.address_v4_is_class_b(swigCPtr, this);
  }

  public boolean is_class_c() {
    return libtorrent_jni.address_v4_is_class_c(swigCPtr, this);
  }

  public boolean is_multicast() {
    return libtorrent_jni.address_v4_is_multicast(swigCPtr, this);
  }

  public static address_v4 any() {
    return new address_v4(libtorrent_jni.address_v4_any(), true);
  }

  public static address_v4 loopback() {
    return new address_v4(libtorrent_jni.address_v4_loopback(), true);
  }

  public static address_v4 broadcast() {
    return new address_v4(libtorrent_jni.address_v4_broadcast__SWIG_0(), true);
  }

  public static address_v4 broadcast(address_v4 addr, address_v4 mask) {
    return new address_v4(libtorrent_jni.address_v4_broadcast__SWIG_1(address_v4.getCPtr(addr), addr, address_v4.getCPtr(mask), mask), true);
  }

  public static address_v4 netmask(address_v4 addr) {
    return new address_v4(libtorrent_jni.address_v4_netmask(address_v4.getCPtr(addr), addr), true);
  }

}
