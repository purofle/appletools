// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$34 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$34() {}
    static final FunctionDescriptor idevice_get_device_list_extended$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_get_device_list_extended$MH = RuntimeHelper.downcallHandle(
        "idevice_get_device_list_extended",
        constants$34.idevice_get_device_list_extended$FUNC
    );
    static final FunctionDescriptor idevice_device_list_extended_free$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_device_list_extended_free$MH = RuntimeHelper.downcallHandle(
        "idevice_device_list_extended_free",
        constants$34.idevice_device_list_extended_free$FUNC
    );
    static final FunctionDescriptor idevice_new$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_new$MH = RuntimeHelper.downcallHandle(
        "idevice_new",
        constants$34.idevice_new$FUNC
    );
    static final FunctionDescriptor idevice_new_with_options$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle idevice_new_with_options$MH = RuntimeHelper.downcallHandle(
        "idevice_new_with_options",
        constants$34.idevice_new_with_options$FUNC
    );
    static final FunctionDescriptor idevice_free$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_free$MH = RuntimeHelper.downcallHandle(
        "idevice_free",
        constants$34.idevice_free$FUNC
    );
    static final FunctionDescriptor idevice_connect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_connect$MH = RuntimeHelper.downcallHandle(
        "idevice_connect",
        constants$34.idevice_connect$FUNC
    );
}

