package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceClassesList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceClassesListTests {
    @Test
    public void testDeserialize() {
        DeviceClassesList model =
                BinaryData.fromString(
                                "{\"value\":[{\"deviceClassId\":\"rgz\",\"compatProperties\":{\"rlazszrnw\":\"iin\"},\"bestCompatibleUpdateId\":{\"provider\":\"fpwpjylwbt\",\"name\":\"h\",\"version\":\"lsj\"}},{\"deviceClassId\":\"dhszfjv\",\"compatProperties\":{\"gofel\":\"a\",\"rqmq\":\"ldvriiiojnalghfk\",\"tvsexsowuel\":\"qhhahhxvrhmzkwpj\"},\"bestCompatibleUpdateId\":{\"provider\":\"wws\",\"name\":\"ughftqsx\",\"version\":\"qxujxukndxd\"}}],\"nextLink\":\"rjguufzdmsyqtf\"}")
                        .toObject(DeviceClassesList.class);
        Assertions.assertEquals("rgz", model.getValue().get(0).getDeviceClassId());
        Assertions.assertEquals("iin", model.getValue().get(0).getCompatProperties().get("rlazszrnw"));
        Assertions.assertEquals("fpwpjylwbt", model.getValue().get(0).getBestCompatibleUpdateId().getProvider());
        Assertions.assertEquals("h", model.getValue().get(0).getBestCompatibleUpdateId().getName());
        Assertions.assertEquals("lsj", model.getValue().get(0).getBestCompatibleUpdateId().getVersion());
        Assertions.assertEquals("rjguufzdmsyqtf", model.getNextLink());
    }
}
