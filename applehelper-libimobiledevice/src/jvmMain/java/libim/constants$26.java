// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$26 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$26() {}
    static final FunctionDescriptor plist_set_real_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle plist_set_real_val$MH = RuntimeHelper.downcallHandle(
        "plist_set_real_val",
        constants$26.plist_set_real_val$FUNC
    );
    static final FunctionDescriptor plist_set_data_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle plist_set_data_val$MH = RuntimeHelper.downcallHandle(
        "plist_set_data_val",
        constants$26.plist_set_data_val$FUNC
    );
    static final FunctionDescriptor plist_set_date_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle plist_set_date_val$MH = RuntimeHelper.downcallHandle(
        "plist_set_date_val",
        constants$26.plist_set_date_val$FUNC
    );
    static final FunctionDescriptor plist_set_uid_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle plist_set_uid_val$MH = RuntimeHelper.downcallHandle(
        "plist_set_uid_val",
        constants$26.plist_set_uid_val$FUNC
    );
    static final FunctionDescriptor plist_to_xml$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_to_xml$MH = RuntimeHelper.downcallHandle(
        "plist_to_xml",
        constants$26.plist_to_xml$FUNC
    );
    static final FunctionDescriptor plist_to_bin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_to_bin$MH = RuntimeHelper.downcallHandle(
        "plist_to_bin",
        constants$26.plist_to_bin$FUNC
    );
}


