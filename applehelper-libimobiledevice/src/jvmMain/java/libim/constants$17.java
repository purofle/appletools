// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$17 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$17() {}
    static final FunctionDescriptor ftrylockfile$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ftrylockfile$MH = RuntimeHelper.downcallHandle(
        "ftrylockfile",
        constants$17.ftrylockfile$FUNC
    );
    static final FunctionDescriptor funlockfile$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle funlockfile$MH = RuntimeHelper.downcallHandle(
        "funlockfile",
        constants$17.funlockfile$FUNC
    );
    static final FunctionDescriptor __uflow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __uflow$MH = RuntimeHelper.downcallHandle(
        "__uflow",
        constants$17.__uflow$FUNC
    );
    static final FunctionDescriptor __overflow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __overflow$MH = RuntimeHelper.downcallHandle(
        "__overflow",
        constants$17.__overflow$FUNC
    );
    static final FunctionDescriptor plist_new_dict$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle plist_new_dict$MH = RuntimeHelper.downcallHandle(
        "plist_new_dict",
        constants$17.plist_new_dict$FUNC
    );
    static final FunctionDescriptor plist_new_array$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle plist_new_array$MH = RuntimeHelper.downcallHandle(
        "plist_new_array",
        constants$17.plist_new_array$FUNC
    );
}


