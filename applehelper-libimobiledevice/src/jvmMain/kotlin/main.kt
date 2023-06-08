import libim.libimobiledevice_h.*
import java.lang.foreign.MemorySegment
import java.lang.foreign.Arena;

fun main() {
    /**
     * 对应 C 代码：
     * idevice_t device = NULL;
     *
     * /* Try to connect to first USB device */
     * if (idevice_new_with_options(&device, NULL, IDEVICE_LOOKUP_USBMUX) != IDEVICE_E_SUCCESS) {
     *   printf("ERROR: No device found!\n");
     *   return -1;
     * }
     */
    val arena = Arena.openConfined()
    val deviceAddress = arena.allocate(C_POINTER);

    if (idevice_new_with_options(deviceAddress, NULL(), IDEVICE_LOOKUP_USBMUX()) != IDEVICE_E_SUCCESS()) {
        println("ERROR: No device found!")
    } else {
        println(deviceAddress)
    }
}