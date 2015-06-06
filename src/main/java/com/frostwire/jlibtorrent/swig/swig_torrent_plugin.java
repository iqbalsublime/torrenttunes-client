/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class swig_torrent_plugin {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected swig_torrent_plugin(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(swig_torrent_plugin obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_swig_torrent_plugin(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    libtorrent_jni.swig_torrent_plugin_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libtorrent_jni.swig_torrent_plugin_change_ownership(this, swigCPtr, true);
  }

  public swig_peer_plugin new_peer_connection(peer_connection pc) {
    long cPtr = (getClass() == swig_torrent_plugin.class) ? libtorrent_jni.swig_torrent_plugin_new_peer_connection(swigCPtr, this, peer_connection.getCPtr(pc), pc) : libtorrent_jni.swig_torrent_plugin_new_peer_connectionSwigExplicitswig_torrent_plugin(swigCPtr, this, peer_connection.getCPtr(pc), pc);
    return (cPtr == 0) ? null : new swig_peer_plugin(cPtr, false);
  }

  public swig_peer_plugin new_bt_peer_connection(bt_peer_connection pc) {
    long cPtr = (getClass() == swig_torrent_plugin.class) ? libtorrent_jni.swig_torrent_plugin_new_bt_peer_connection(swigCPtr, this, bt_peer_connection.getCPtr(pc), pc) : libtorrent_jni.swig_torrent_plugin_new_bt_peer_connectionSwigExplicitswig_torrent_plugin(swigCPtr, this, bt_peer_connection.getCPtr(pc), pc);
    return (cPtr == 0) ? null : new swig_peer_plugin(cPtr, false);
  }

  public swig_peer_plugin new_web_peer_connection(web_peer_connection pc) {
    long cPtr = (getClass() == swig_torrent_plugin.class) ? libtorrent_jni.swig_torrent_plugin_new_web_peer_connection(swigCPtr, this, web_peer_connection.getCPtr(pc), pc) : libtorrent_jni.swig_torrent_plugin_new_web_peer_connectionSwigExplicitswig_torrent_plugin(swigCPtr, this, web_peer_connection.getCPtr(pc), pc);
    return (cPtr == 0) ? null : new swig_peer_plugin(cPtr, false);
  }

  public swig_peer_plugin new_http_seed_connection(http_seed_connection pc) {
    long cPtr = (getClass() == swig_torrent_plugin.class) ? libtorrent_jni.swig_torrent_plugin_new_http_seed_connection(swigCPtr, this, http_seed_connection.getCPtr(pc), pc) : libtorrent_jni.swig_torrent_plugin_new_http_seed_connectionSwigExplicitswig_torrent_plugin(swigCPtr, this, http_seed_connection.getCPtr(pc), pc);
    return (cPtr == 0) ? null : new swig_peer_plugin(cPtr, false);
  }

  public void on_piece_pass(int index) {
    if (getClass() == swig_torrent_plugin.class) libtorrent_jni.swig_torrent_plugin_on_piece_pass(swigCPtr, this, index); else libtorrent_jni.swig_torrent_plugin_on_piece_passSwigExplicitswig_torrent_plugin(swigCPtr, this, index);
  }

  public void on_piece_failed(int index) {
    if (getClass() == swig_torrent_plugin.class) libtorrent_jni.swig_torrent_plugin_on_piece_failed(swigCPtr, this, index); else libtorrent_jni.swig_torrent_plugin_on_piece_failedSwigExplicitswig_torrent_plugin(swigCPtr, this, index);
  }

  public void tick() {
    if (getClass() == swig_torrent_plugin.class) libtorrent_jni.swig_torrent_plugin_tick(swigCPtr, this); else libtorrent_jni.swig_torrent_plugin_tickSwigExplicitswig_torrent_plugin(swigCPtr, this);
  }

  public boolean on_pause() {
    return (getClass() == swig_torrent_plugin.class) ? libtorrent_jni.swig_torrent_plugin_on_pause(swigCPtr, this) : libtorrent_jni.swig_torrent_plugin_on_pauseSwigExplicitswig_torrent_plugin(swigCPtr, this);
  }

  public boolean on_resume() {
    return (getClass() == swig_torrent_plugin.class) ? libtorrent_jni.swig_torrent_plugin_on_resume(swigCPtr, this) : libtorrent_jni.swig_torrent_plugin_on_resumeSwigExplicitswig_torrent_plugin(swigCPtr, this);
  }

  public void on_files_checked() {
    if (getClass() == swig_torrent_plugin.class) libtorrent_jni.swig_torrent_plugin_on_files_checked(swigCPtr, this); else libtorrent_jni.swig_torrent_plugin_on_files_checkedSwigExplicitswig_torrent_plugin(swigCPtr, this);
  }

  public void on_state(int s) {
    if (getClass() == swig_torrent_plugin.class) libtorrent_jni.swig_torrent_plugin_on_state(swigCPtr, this, s); else libtorrent_jni.swig_torrent_plugin_on_stateSwigExplicitswig_torrent_plugin(swigCPtr, this, s);
  }

  public void on_unload() {
    if (getClass() == swig_torrent_plugin.class) libtorrent_jni.swig_torrent_plugin_on_unload(swigCPtr, this); else libtorrent_jni.swig_torrent_plugin_on_unloadSwigExplicitswig_torrent_plugin(swigCPtr, this);
  }

  public void on_load() {
    if (getClass() == swig_torrent_plugin.class) libtorrent_jni.swig_torrent_plugin_on_load(swigCPtr, this); else libtorrent_jni.swig_torrent_plugin_on_loadSwigExplicitswig_torrent_plugin(swigCPtr, this);
  }

  public void on_add_peer(tcp_endpoint endp, int src, int flags) {
    if (getClass() == swig_torrent_plugin.class) libtorrent_jni.swig_torrent_plugin_on_add_peer(swigCPtr, this, tcp_endpoint.getCPtr(endp), endp, src, flags); else libtorrent_jni.swig_torrent_plugin_on_add_peerSwigExplicitswig_torrent_plugin(swigCPtr, this, tcp_endpoint.getCPtr(endp), endp, src, flags);
  }

  public swig_torrent_plugin() {
    this(libtorrent_jni.new_swig_torrent_plugin(), true);
    libtorrent_jni.swig_torrent_plugin_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
