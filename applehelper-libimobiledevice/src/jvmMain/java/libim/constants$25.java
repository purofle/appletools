// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$25 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$25() {}
    static final FunctionDescriptor plist_get_uid_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_get_uid_val$MH = RuntimeHelper.downcallHandle(
        "plist_get_uid_val",
        constants$25.plist_get_uid_val$FUNC
    );
    static final FunctionDescriptor plist_set_key_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_set_key_val$MH = RuntimeHelper.downcallHandle(
        "plist_set_key_val",
        constants$25.plist_set_key_val$FUNC
    );
    static final FunctionDescriptor plist_set_string_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_set_string_val$MH = RuntimeHelper.downcallHandle(
        "plist_set_string_val",
        constants$25.plist_set_string_val$FUNC
    );
    static final FunctionDescriptor plist_set_bool_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle plist_set_bool_val$MH = RuntimeHelper.downcallHandle(
        "plist_set_bool_val",
        constants$25.plist_set_bool_val$FUNC
    );
    static final FunctionDescriptor plist_set_uint_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle plist_set_uint_val$MH = RuntimeHelper.downcallHandle(
        "plist_set_uint_val",
        constants$25.plist_set_uint_val$FUNC
    );
    static final FunctionDescriptor plist_set_int_val$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle plist_set_int_val$MH = RuntimeHelper.downcallHandle(
        "plist_set_int_val",
        constants$25.plist_set_int_val$FUNC
    );
}


