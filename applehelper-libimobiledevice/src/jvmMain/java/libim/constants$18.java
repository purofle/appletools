// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$18 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$18() {}
    static final FunctionDescriptor plist_new_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle plist_new_string$MH = RuntimeHelper.downcallHandle(
        "plist_new_string",
        constants$18.plist_new_string$FUNC
    );
    static final FunctionDescriptor plist_new_bool$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle plist_new_bool$MH = RuntimeHelper.downcallHandle(
        "plist_new_bool",
        constants$18.plist_new_bool$FUNC
    );
    static final FunctionDescriptor plist_new_uint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle plist_new_uint$MH = RuntimeHelper.downcallHandle(
        "plist_new_uint",
        constants$18.plist_new_uint$FUNC
    );
    static final FunctionDescriptor plist_new_int$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle plist_new_int$MH = RuntimeHelper.downcallHandle(
        "plist_new_int",
        constants$18.plist_new_int$FUNC
    );
    static final FunctionDescriptor plist_new_real$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle plist_new_real$MH = RuntimeHelper.downcallHandle(
        "plist_new_real",
        constants$18.plist_new_real$FUNC
    );
    static final FunctionDescriptor plist_new_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle plist_new_data$MH = RuntimeHelper.downcallHandle(
        "plist_new_data",
        constants$18.plist_new_data$FUNC
    );
}

