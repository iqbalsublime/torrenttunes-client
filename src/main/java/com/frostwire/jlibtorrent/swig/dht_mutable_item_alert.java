/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_mutable_item_alert extends alert {
  private long swigCPtr;

  protected dht_mutable_item_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.dht_mutable_item_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_mutable_item_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_mutable_item_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.dht_mutable_item_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.dht_mutable_item_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.dht_mutable_item_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.dht_mutable_item_alert_message(swigCPtr, this);
  }

  public boolean discardable() {
    return libtorrent_jni.dht_mutable_item_alert_discardable(swigCPtr, this);
  }

  public void setSeq(java.math.BigInteger value) {
    libtorrent_jni.dht_mutable_item_alert_seq_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getSeq() {
    return libtorrent_jni.dht_mutable_item_alert_seq_get(swigCPtr, this);
  }

  public void setSalt(String value) {
    libtorrent_jni.dht_mutable_item_alert_salt_set(swigCPtr, this, value);
  }

  public String getSalt() {
    return libtorrent_jni.dht_mutable_item_alert_salt_get(swigCPtr, this);
  }

  public void setItem(entry value) {
    libtorrent_jni.dht_mutable_item_alert_item_set(swigCPtr, this, entry.getCPtr(value), value);
  }

  public entry getItem() {
    return new entry(libtorrent_jni.dht_mutable_item_alert_item_get(swigCPtr, this), true);
  }

  public char_vector key_v() {
    return new char_vector(libtorrent_jni.dht_mutable_item_alert_key_v(swigCPtr, this), true);
  }

  public char_vector signature_v() {
    return new char_vector(libtorrent_jni.dht_mutable_item_alert_signature_v(swigCPtr, this), true);
  }

  public final static int alert_type = libtorrent_jni.dht_mutable_item_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.dht_mutable_item_alert_static_category_get();
}
