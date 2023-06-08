// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct __pthread_internal_slist {
 *     struct __pthread_internal_slist* __next;
 * };
 * }
 */
public class __pthread_internal_slist {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("__next")
    ).withName("__pthread_internal_slist");
    public static MemoryLayout $LAYOUT() {
        return __pthread_internal_slist.$struct$LAYOUT;
    }
    static final VarHandle __next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__next"));
    public static VarHandle __next$VH() {
        return __pthread_internal_slist.__next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct __pthread_internal_slist* __next;
     * }
     */
    public static MemorySegment __next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)__pthread_internal_slist.__next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct __pthread_internal_slist* __next;
     * }
     */
    public static void __next$set(MemorySegment seg, MemorySegment x) {
        __pthread_internal_slist.__next$VH.set(seg, x);
    }
    public static MemorySegment __next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)__pthread_internal_slist.__next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __next$set(MemorySegment seg, long index, MemorySegment x) {
        __pthread_internal_slist.__next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


