package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.LogCollectionOperationList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LogCollectionOperationListTests {
    @Test
    public void testDeserialize() {
        LogCollectionOperationList model =
                BinaryData.fromString(
                                "{\"value\":[{\"operationId\":\"vofqzhvfc\",\"deviceList\":[{\"deviceId\":\"yfm\",\"moduleId\":\"uxrkjp\"},{\"deviceId\":\"dwxf\",\"moduleId\":\"iivwzjbhyzsxjrka\"},{\"deviceId\":\"btrnegvm\",\"moduleId\":\"uqeqv\"}],\"description\":\"spastjbkkdmf\",\"createdDateTime\":\"est\",\"lastActionDateTime\":\"lx\",\"status\":\"NotStarted\"},{\"operationId\":\"ozapeew\",\"deviceList\":[{\"deviceId\":\"pxlktwkuziycsl\",\"moduleId\":\"ufuztcktyhjtq\"},{\"deviceId\":\"dcgzul\",\"moduleId\":\"mrqzzrrjvpgl\"},{\"deviceId\":\"dzgkr\",\"moduleId\":\"eevt\"},{\"deviceId\":\"epr\",\"moduleId\":\"t\"}],\"description\":\"ytp\",\"createdDateTime\":\"mov\",\"lastActionDateTime\":\"fvaawzqa\",\"status\":\"NotStarted\"}],\"nextLink\":\"z\"}")
                        .toObject(LogCollectionOperationList.class);
        Assertions.assertEquals("vofqzhvfc", model.getValue().get(0).getOperationId());
        Assertions.assertEquals("yfm", model.getValue().get(0).getDeviceList().get(0).getDeviceId());
        Assertions.assertEquals("uxrkjp", model.getValue().get(0).getDeviceList().get(0).getModuleId());
        Assertions.assertEquals("spastjbkkdmf", model.getValue().get(0).getDescription());
        Assertions.assertEquals("z", model.getNextLink());
    }
}
