// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$23 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$23() {}
    static final FunctionDescriptor plist_get_parent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_get_parent$MH = RuntimeHelper.downcallHandle(
        "plist_get_parent",
        constants$23.plist_get_parent$FUNC
    );
    static final FunctionDescriptor plist_get_node_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_get_node_type$MH = RuntimeHelper.downcallHandle(
        "plist_get_node_type",
        constants$23.plist_get_node_type$FUNC
    );
    static final FunctionDescriptor plist_get_key_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_get_key_val$MH = RuntimeHelper.downcallHandle(
        "plist_get_key_val",
        constants$23.plist_get_key_val$FUNC
    );
    static final FunctionDescriptor plist_get_string_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_get_string_val$MH = RuntimeHelper.downcallHandle(
        "plist_get_string_val",
        constants$23.plist_get_string_val$FUNC
    );
    static final FunctionDescriptor plist_get_string_ptr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_get_string_ptr$MH = RuntimeHelper.downcallHandle(
        "plist_get_string_ptr",
        constants$23.plist_get_string_ptr$FUNC
    );
    static final FunctionDescriptor plist_get_bool_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_get_bool_val$MH = RuntimeHelper.downcallHandle(
        "plist_get_bool_val",
        constants$23.plist_get_bool_val$FUNC
    );
}


