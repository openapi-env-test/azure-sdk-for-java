package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.LogCollectionOperationDetailedStatusList;
import com.azure.iot.deviceupdate.models.OperationStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LogCollectionOperationDetailedStatusListTests {
    @Test
    public void testDeserialize() {
        LogCollectionOperationDetailedStatusList model =
                BinaryData.fromString(
                                "{\"value\":[{\"operationId\":\"ojpykvgtrdc\",\"createdDateTime\":\"fmzzsdymbrny\",\"lastActionDateTime\":\"xmprafwg\",\"status\":\"Failed\",\"deviceStatus\":[{\"deviceId\":\"xvd\",\"moduleId\":\"fwafqrouda\",\"status\":\"Undefined\",\"resultCode\":\"vehhrvkbunzozu\",\"extendedResultCode\":\"cxgkmoyxcdyui\",\"logLocation\":\"mfdn\"},{\"deviceId\":\"zydvfvf\",\"moduleId\":\"naeo\",\"status\":\"NotStarted\",\"resultCode\":\"vhmgorffukis\",\"extendedResultCode\":\"w\",\"logLocation\":\"hwplefaxvx\"},{\"deviceId\":\"l\",\"moduleId\":\"tg\",\"status\":\"NotStarted\",\"resultCode\":\"zeyqxtjjfzqlqhyc\",\"extendedResultCode\":\"odggx\",\"logLocation\":\"ee\"},{\"deviceId\":\"mieknlraria\",\"moduleId\":\"iuagydwqfbylyrfg\",\"status\":\"Succeeded\",\"resultCode\":\"tcojocqwo\",\"extendedResultCode\":\"nzjvusfzldm\",\"logLocation\":\"uxylfsbtkadpy\"}],\"description\":\"wn\"}],\"nextLink\":\"gkbugrjqct\"}")
                        .toObject(LogCollectionOperationDetailedStatusList.class);
        Assertions.assertEquals("ojpykvgtrdc", model.getValue().get(0).getOperationId());
        Assertions.assertEquals("fmzzsdymbrny", model.getValue().get(0).getCreatedDateTime());
        Assertions.assertEquals("xmprafwg", model.getValue().get(0).getLastActionDateTime());
        Assertions.assertEquals(OperationStatus.FAILED, model.getValue().get(0).getStatus());
        Assertions.assertEquals("xvd", model.getValue().get(0).getDeviceStatus().get(0).getDeviceId());
        Assertions.assertEquals("fwafqrouda", model.getValue().get(0).getDeviceStatus().get(0).getModuleId());
        Assertions.assertEquals(
                OperationStatus.UNDEFINED, model.getValue().get(0).getDeviceStatus().get(0).getStatus());
        Assertions.assertEquals("vehhrvkbunzozu", model.getValue().get(0).getDeviceStatus().get(0).getResultCode());
        Assertions.assertEquals(
                "cxgkmoyxcdyui", model.getValue().get(0).getDeviceStatus().get(0).getExtendedResultCode());
        Assertions.assertEquals("mfdn", model.getValue().get(0).getDeviceStatus().get(0).getLogLocation());
        Assertions.assertEquals("wn", model.getValue().get(0).getDescription());
        Assertions.assertEquals("gkbugrjqct", model.getNextLink());
    }
}
