// Generated by jextract

package libim;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3() {}
    static final FunctionDescriptor futimens$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle futimens$MH = RuntimeHelper.downcallHandle(
        "futimens",
        constants$3.futimens$FUNC
    );
    static final OfAddress stdin$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle stdin$VH = constants$3.stdin$LAYOUT.varHandle();
    static final MemorySegment stdin$SEGMENT = RuntimeHelper.lookupGlobalVariable("stdin", constants$3.stdin$LAYOUT);
    static final OfAddress stdout$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle stdout$VH = constants$3.stdout$LAYOUT.varHandle();
    static final MemorySegment stdout$SEGMENT = RuntimeHelper.lookupGlobalVariable("stdout", constants$3.stdout$LAYOUT);
    static final OfAddress stderr$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle stderr$VH = constants$3.stderr$LAYOUT.varHandle();
    static final MemorySegment stderr$SEGMENT = RuntimeHelper.lookupGlobalVariable("stderr", constants$3.stderr$LAYOUT);
    static final FunctionDescriptor remove$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle remove$MH = RuntimeHelper.downcallHandle(
        "remove",
        constants$3.remove$FUNC
    );
    static final FunctionDescriptor rename$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rename$MH = RuntimeHelper.downcallHandle(
        "rename",
        constants$3.rename$FUNC
    );
}


