// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct idevice_info {
 *     char* udid;
 *     enum idevice_connection_type conn_type;
 *     void* conn_data;
 * };
 * }
 */
public class idevice_info {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("udid"),
        Constants$root.C_INT$LAYOUT.withName("conn_type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("conn_data")
    ).withName("idevice_info");
    public static MemoryLayout $LAYOUT() {
        return idevice_info.$struct$LAYOUT;
    }
    static final VarHandle udid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("udid"));
    public static VarHandle udid$VH() {
        return idevice_info.udid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* udid;
     * }
     */
    public static MemorySegment udid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)idevice_info.udid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* udid;
     * }
     */
    public static void udid$set(MemorySegment seg, MemorySegment x) {
        idevice_info.udid$VH.set(seg, x);
    }
    public static MemorySegment udid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)idevice_info.udid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void udid$set(MemorySegment seg, long index, MemorySegment x) {
        idevice_info.udid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle conn_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("conn_type"));
    public static VarHandle conn_type$VH() {
        return idevice_info.conn_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum idevice_connection_type conn_type;
     * }
     */
    public static int conn_type$get(MemorySegment seg) {
        return (int)idevice_info.conn_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum idevice_connection_type conn_type;
     * }
     */
    public static void conn_type$set(MemorySegment seg, int x) {
        idevice_info.conn_type$VH.set(seg, x);
    }
    public static int conn_type$get(MemorySegment seg, long index) {
        return (int)idevice_info.conn_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void conn_type$set(MemorySegment seg, long index, int x) {
        idevice_info.conn_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle conn_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("conn_data"));
    public static VarHandle conn_data$VH() {
        return idevice_info.conn_data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* conn_data;
     * }
     */
    public static MemorySegment conn_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)idevice_info.conn_data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* conn_data;
     * }
     */
    public static void conn_data$set(MemorySegment seg, MemorySegment x) {
        idevice_info.conn_data$VH.set(seg, x);
    }
    public static MemorySegment conn_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)idevice_info.conn_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void conn_data$set(MemorySegment seg, long index, MemorySegment x) {
        idevice_info.conn_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


