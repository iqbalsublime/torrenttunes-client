/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class piece_picker {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected piece_picker(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(piece_picker obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_piece_picker(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class block_info {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected block_info(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(block_info obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libtorrent_jni.delete_piece_picker_block_info(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public block_info() {
      this(libtorrent_jni.new_piece_picker_block_info(), true);
    }
  
    public void setNum_peers(long value) {
      libtorrent_jni.piece_picker_block_info_num_peers_set(swigCPtr, this, value);
    }
  
    public long getNum_peers() {
      return libtorrent_jni.piece_picker_block_info_num_peers_get(swigCPtr, this);
    }
  
    public void setState(long value) {
      libtorrent_jni.piece_picker_block_info_state_set(swigCPtr, this, value);
    }
  
    public long getState() {
      return libtorrent_jni.piece_picker_block_info_state_get(swigCPtr, this);
    }
  
    public final static int state_none = libtorrent_jni.piece_picker_block_info_state_none_get();
    public final static int state_requested = libtorrent_jni.piece_picker_block_info_state_requested_get();
    public final static int state_writing = libtorrent_jni.piece_picker_block_info_state_writing_get();
    public final static int state_finished = libtorrent_jni.piece_picker_block_info_state_finished_get();
  
  }

  static public class downloading_piece {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected downloading_piece(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(downloading_piece obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libtorrent_jni.delete_piece_picker_downloading_piece(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public downloading_piece() {
      this(libtorrent_jni.new_piece_picker_downloading_piece(), true);
    }
  
    public boolean op_lt(piece_picker.downloading_piece rhs) {
      return libtorrent_jni.piece_picker_downloading_piece_op_lt(swigCPtr, this, piece_picker.downloading_piece.getCPtr(rhs), rhs);
    }
  
    public void setInfo(piece_picker.block_info value) {
      libtorrent_jni.piece_picker_downloading_piece_info_set(swigCPtr, this, piece_picker.block_info.getCPtr(value), value);
    }
  
    public piece_picker.block_info getInfo() {
      long cPtr = libtorrent_jni.piece_picker_downloading_piece_info_get(swigCPtr, this);
      return (cPtr == 0) ? null : new piece_picker.block_info(cPtr, false);
    }
  
    public void setIndex(int value) {
      libtorrent_jni.piece_picker_downloading_piece_index_set(swigCPtr, this, value);
    }
  
    public int getIndex() {
      return libtorrent_jni.piece_picker_downloading_piece_index_get(swigCPtr, this);
    }
  
    public void setFinished(short value) {
      libtorrent_jni.piece_picker_downloading_piece_finished_set(swigCPtr, this, value);
    }
  
    public short getFinished() {
      return libtorrent_jni.piece_picker_downloading_piece_finished_get(swigCPtr, this);
    }
  
    public void setWriting(short value) {
      libtorrent_jni.piece_picker_downloading_piece_writing_set(swigCPtr, this, value);
    }
  
    public short getWriting() {
      return libtorrent_jni.piece_picker_downloading_piece_writing_get(swigCPtr, this);
    }
  
    public void setRequested(short value) {
      libtorrent_jni.piece_picker_downloading_piece_requested_set(swigCPtr, this, value);
    }
  
    public short getRequested() {
      return libtorrent_jni.piece_picker_downloading_piece_requested_get(swigCPtr, this);
    }
  
    public void setState(int value) {
      libtorrent_jni.piece_picker_downloading_piece_state_set(swigCPtr, this, value);
    }
  
    public int getState() {
      return libtorrent_jni.piece_picker_downloading_piece_state_get(swigCPtr, this);
    }
  
  }

  public piece_picker() {
    this(libtorrent_jni.new_piece_picker(), true);
  }

  public void get_availability(int_vector avail) {
    libtorrent_jni.piece_picker_get_availability(swigCPtr, this, int_vector.getCPtr(avail), avail);
  }

  public void we_have(int index) {
    libtorrent_jni.piece_picker_we_have(swigCPtr, this, index);
  }

  public void we_dont_have(int index) {
    libtorrent_jni.piece_picker_we_dont_have(swigCPtr, this, index);
  }

  public int cursor() {
    return libtorrent_jni.piece_picker_cursor(swigCPtr, this);
  }

  public int reverse_cursor() {
    return libtorrent_jni.piece_picker_reverse_cursor(swigCPtr, this);
  }

  public int sparse_regions() {
    return libtorrent_jni.piece_picker_sparse_regions(swigCPtr, this);
  }

  public void init(int blocks_per_piece, int blocks_in_last_piece, int total_num_pieces) {
    libtorrent_jni.piece_picker_init(swigCPtr, this, blocks_per_piece, blocks_in_last_piece, total_num_pieces);
  }

  public int num_pieces() {
    return libtorrent_jni.piece_picker_num_pieces(swigCPtr, this);
  }

  public boolean have_piece(int index) {
    return libtorrent_jni.piece_picker_have_piece(swigCPtr, this, index);
  }

  public boolean is_downloading(int index) {
    return libtorrent_jni.piece_picker_is_downloading(swigCPtr, this, index);
  }

  public boolean set_piece_priority(int index, int prio) {
    return libtorrent_jni.piece_picker_set_piece_priority(swigCPtr, this, index, prio);
  }

  public int piece_priority(int index) {
    return libtorrent_jni.piece_picker_piece_priority(swigCPtr, this, index);
  }

  public void piece_priorities(int_vector pieces) {
    libtorrent_jni.piece_picker_piece_priorities(swigCPtr, this, int_vector.getCPtr(pieces), pieces);
  }

  public void filtered_pieces(bool_vector mask) {
    libtorrent_jni.piece_picker_filtered_pieces(swigCPtr, this, bool_vector.getCPtr(mask), mask);
  }

  public boolean is_requested(piece_block block) {
    return libtorrent_jni.piece_picker_is_requested(swigCPtr, this, piece_block.getCPtr(block), block);
  }

  public boolean is_downloaded(piece_block block) {
    return libtorrent_jni.piece_picker_is_downloaded(swigCPtr, this, piece_block.getCPtr(block), block);
  }

  public boolean is_finished(piece_block block) {
    return libtorrent_jni.piece_picker_is_finished(swigCPtr, this, piece_block.getCPtr(block), block);
  }

  public void write_failed(piece_block block) {
    libtorrent_jni.piece_picker_write_failed(swigCPtr, this, piece_block.getCPtr(block), block);
  }

  public int num_peers(piece_block block) {
    return libtorrent_jni.piece_picker_num_peers(swigCPtr, this, piece_block.getCPtr(block), block);
  }

  public void piece_info(int index, piece_picker.downloading_piece st) {
    libtorrent_jni.piece_picker_piece_info(swigCPtr, this, index, piece_picker.downloading_piece.getCPtr(st), st);
  }

  public piece_picker.piece_pos piece_stats(int index) {
    return new piece_picker.piece_pos(libtorrent_jni.piece_picker_piece_stats(swigCPtr, this, index), false);
  }

  public void restore_piece(int index) {
    libtorrent_jni.piece_picker_restore_piece(swigCPtr, this, index);
  }

  public boolean is_piece_finished(int index) {
    return libtorrent_jni.piece_picker_is_piece_finished(swigCPtr, this, index);
  }

  public int blocks_in_piece(int index) {
    return libtorrent_jni.piece_picker_blocks_in_piece(swigCPtr, this, index);
  }

  public int unverified_blocks() {
    return libtorrent_jni.piece_picker_unverified_blocks(swigCPtr, this);
  }

  public downloading_piece_vector get_download_queue() {
    return new downloading_piece_vector(libtorrent_jni.piece_picker_get_download_queue(swigCPtr, this), false);
  }

  public int num_downloading_pieces() {
    return libtorrent_jni.piece_picker_num_downloading_pieces(swigCPtr, this);
  }

  public int num_filtered() {
    return libtorrent_jni.piece_picker_num_filtered(swigCPtr, this);
  }

  public int num_have_filtered() {
    return libtorrent_jni.piece_picker_num_have_filtered(swigCPtr, this);
  }

  public int num_have() {
    return libtorrent_jni.piece_picker_num_have(swigCPtr, this);
  }

  public int num_want_left() {
    return libtorrent_jni.piece_picker_num_want_left(swigCPtr, this);
  }

  static public class has_index {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected has_index(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(has_index obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libtorrent_jni.delete_piece_picker_has_index(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public has_index(int i) {
      this(libtorrent_jni.new_piece_picker_has_index(i), true);
    }
  
    public void setIndex(int value) {
      libtorrent_jni.piece_picker_has_index_index_set(swigCPtr, this, value);
    }
  
    public int getIndex() {
      return libtorrent_jni.piece_picker_has_index_index_get(swigCPtr, this);
    }
  
  }

  public int blocks_in_last_piece() {
    return libtorrent_jni.piece_picker_blocks_in_last_piece(swigCPtr, this);
  }

  public int_int_pair distributed_copies() {
    return new int_int_pair(libtorrent_jni.piece_picker_distributed_copies(swigCPtr, this), true);
  }

  static public class piece_pos {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected piece_pos(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(piece_pos obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libtorrent_jni.delete_piece_picker_piece_pos(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public piece_pos() {
      this(libtorrent_jni.new_piece_picker_piece_pos__SWIG_0(), true);
    }
  
    public piece_pos(int peer_count_, int index_) {
      this(libtorrent_jni.new_piece_picker_piece_pos__SWIG_1(peer_count_, index_), true);
    }
  
    public void setPeer_count(long value) {
      libtorrent_jni.piece_picker_piece_pos_peer_count_set(swigCPtr, this, value);
    }
  
    public long getPeer_count() {
      return libtorrent_jni.piece_picker_piece_pos_peer_count_get(swigCPtr, this);
    }
  
    public void setDownloading(long value) {
      libtorrent_jni.piece_picker_piece_pos_downloading_set(swigCPtr, this, value);
    }
  
    public long getDownloading() {
      return libtorrent_jni.piece_picker_piece_pos_downloading_get(swigCPtr, this);
    }
  
    public void setFull(long value) {
      libtorrent_jni.piece_picker_piece_pos_full_set(swigCPtr, this, value);
    }
  
    public long getFull() {
      return libtorrent_jni.piece_picker_piece_pos_full_get(swigCPtr, this);
    }
  
    public void setPiece_priority(long value) {
      libtorrent_jni.piece_picker_piece_pos_piece_priority_set(swigCPtr, this, value);
    }
  
    public long getPiece_priority() {
      return libtorrent_jni.piece_picker_piece_pos_piece_priority_get(swigCPtr, this);
    }
  
    public void setIndex(long value) {
      libtorrent_jni.piece_picker_piece_pos_index_set(swigCPtr, this, value);
    }
  
    public long getIndex() {
      return libtorrent_jni.piece_picker_piece_pos_index_get(swigCPtr, this);
    }
  
    public boolean have() {
      return libtorrent_jni.piece_picker_piece_pos_have(swigCPtr, this);
    }
  
    public void set_have() {
      libtorrent_jni.piece_picker_piece_pos_set_have(swigCPtr, this);
    }
  
    public void set_not_have() {
      libtorrent_jni.piece_picker_piece_pos_set_not_have(swigCPtr, this);
    }
  
    public boolean filtered() {
      return libtorrent_jni.piece_picker_piece_pos_filtered(swigCPtr, this);
    }
  
    public int priority(piece_picker picker) {
      return libtorrent_jni.piece_picker_piece_pos_priority(swigCPtr, this, piece_picker.getCPtr(picker), picker);
    }
  
    public boolean op_neq(piece_picker.piece_pos p) {
      return libtorrent_jni.piece_picker_piece_pos_op_neq(swigCPtr, this, piece_picker.piece_pos.getCPtr(p), p);
    }
  
    public boolean op_eq(piece_picker.piece_pos p) {
      return libtorrent_jni.piece_picker_piece_pos_op_eq(swigCPtr, this, piece_picker.piece_pos.getCPtr(p), p);
    }
  
    public final static int we_have_index = libtorrent_jni.piece_picker_piece_pos_we_have_index_get();
    public final static int filter_priority = libtorrent_jni.piece_picker_piece_pos_filter_priority_get();
    public final static int max_peer_count = libtorrent_jni.piece_picker_piece_pos_max_peer_count_get();
  
  }

  public void set_num_pad_files(int n) {
    libtorrent_jni.piece_picker_set_num_pad_files(swigCPtr, this, n);
  }

  public void setM_seeds(int value) {
    libtorrent_jni.piece_picker_m_seeds_set(swigCPtr, this, value);
  }

  public int getM_seeds() {
    return libtorrent_jni.piece_picker_m_seeds_get(swigCPtr, this);
  }

  public final static int priority_levels = libtorrent_jni.piece_picker_priority_levels_get();
  public final static int prio_factor = libtorrent_jni.piece_picker_prio_factor_get();

  public enum piece_state_t {
    none,
    slow,
    medium,
    fast;

    public final int swigValue() {
      return swigValue;
    }

    public static piece_state_t swigToEnum(int swigValue) {
      piece_state_t[] swigValues = piece_state_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (piece_state_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + piece_state_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private piece_state_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private piece_state_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private piece_state_t(piece_state_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum options_t {
    rarest_first(libtorrent_jni.piece_picker_rarest_first_get()),
    reverse(libtorrent_jni.piece_picker_reverse_get()),
    on_parole(libtorrent_jni.piece_picker_on_parole_get()),
    prioritize_partials(libtorrent_jni.piece_picker_prioritize_partials_get()),
    sequential(libtorrent_jni.piece_picker_sequential_get()),
    speed_affinity(libtorrent_jni.piece_picker_speed_affinity_get()),
    ignore_whole_pieces(libtorrent_jni.piece_picker_ignore_whole_pieces_get()),
    time_critical_mode(libtorrent_jni.piece_picker_time_critical_mode_get());

    public final int swigValue() {
      return swigValue;
    }

    public static options_t swigToEnum(int swigValue) {
      options_t[] swigValues = options_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (options_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + options_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private options_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private options_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private options_t(options_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public final static int max_pieces = libtorrent_jni.piece_picker_max_pieces_get();

}
