// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$33 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$33() {}
    static final FunctionDescriptor idevice_event_cb_t_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_event_cb_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$33.idevice_event_cb_t_DOWN$FUNC
    );
    static final FunctionDescriptor idevice_set_debug_level$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle idevice_set_debug_level$MH = RuntimeHelper.downcallHandle(
        "idevice_set_debug_level",
        constants$33.idevice_set_debug_level$FUNC
    );
    static final FunctionDescriptor idevice_event_subscribe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_event_subscribe$MH = RuntimeHelper.downcallHandle(
        "idevice_event_subscribe",
        constants$33.idevice_event_subscribe$FUNC
    );
    static final FunctionDescriptor idevice_event_unsubscribe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle idevice_event_unsubscribe$MH = RuntimeHelper.downcallHandle(
        "idevice_event_unsubscribe",
        constants$33.idevice_event_unsubscribe$FUNC
    );
    static final FunctionDescriptor idevice_get_device_list$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_get_device_list$MH = RuntimeHelper.downcallHandle(
        "idevice_get_device_list",
        constants$33.idevice_get_device_list$FUNC
    );
    static final FunctionDescriptor idevice_device_list_free$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle idevice_device_list_free$MH = RuntimeHelper.downcallHandle(
        "idevice_device_list_free",
        constants$33.idevice_device_list_free$FUNC
    );
}


