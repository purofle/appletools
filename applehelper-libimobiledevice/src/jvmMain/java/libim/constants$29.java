// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$29 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$29() {}
    static final FunctionDescriptor plist_is_binary$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle plist_is_binary$MH = RuntimeHelper.downcallHandle(
        "plist_is_binary",
        constants$29.plist_is_binary$FUNC
    );
    static final FunctionDescriptor plist_access_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle plist_access_path$MH = RuntimeHelper.downcallHandleVariadic(
        "plist_access_path",
        constants$29.plist_access_path$FUNC
    );
    static final FunctionDescriptor plist_access_pathv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_access_pathv$MH = RuntimeHelper.downcallHandle(
        "plist_access_pathv",
        constants$29.plist_access_pathv$FUNC
    );
    static final FunctionDescriptor plist_compare_node_value$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_compare_node_value$MH = RuntimeHelper.downcallHandle(
        "plist_compare_node_value",
        constants$29.plist_compare_node_value$FUNC
    );
    static final FunctionDescriptor plist_bool_val_is_true$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_bool_val_is_true$MH = RuntimeHelper.downcallHandle(
        "plist_bool_val_is_true",
        constants$29.plist_bool_val_is_true$FUNC
    );
    static final FunctionDescriptor plist_int_val_is_negative$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_int_val_is_negative$MH = RuntimeHelper.downcallHandle(
        "plist_int_val_is_negative",
        constants$29.plist_int_val_is_negative$FUNC
    );
}


