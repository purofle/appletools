// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$36 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$36() {}
    static final FunctionDescriptor idevice_connection_disable_bypass_ssl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle idevice_connection_disable_bypass_ssl$MH = RuntimeHelper.downcallHandle(
        "idevice_connection_disable_bypass_ssl",
        constants$36.idevice_connection_disable_bypass_ssl$FUNC
    );
    static final FunctionDescriptor idevice_connection_get_fd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_connection_get_fd$MH = RuntimeHelper.downcallHandle(
        "idevice_connection_get_fd",
        constants$36.idevice_connection_get_fd$FUNC
    );
    static final FunctionDescriptor idevice_get_handle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_get_handle$MH = RuntimeHelper.downcallHandle(
        "idevice_get_handle",
        constants$36.idevice_get_handle$FUNC
    );
    static final FunctionDescriptor idevice_get_udid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_get_udid$MH = RuntimeHelper.downcallHandle(
        "idevice_get_udid",
        constants$36.idevice_get_udid$FUNC
    );
    static final MemorySegment NULL$ADDR = MemorySegment.ofAddress(0L);
    static final MemorySegment P_tmpdir$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("/tmp");
}


