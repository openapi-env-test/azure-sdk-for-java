package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.GroupBestUpdatesFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GroupBestUpdatesFilterTests {
    @Test
    public void testDeserialize() {
        GroupBestUpdatesFilter model =
                BinaryData.fromString("{\"provider\":\"qhzvhxnkomt\",\"name\":\"bo\",\"version\":\"pnvdxz\"}")
                        .toObject(GroupBestUpdatesFilter.class);
        Assertions.assertEquals("qhzvhxnkomt", model.getProvider());
        Assertions.assertEquals("bo", model.getName());
        Assertions.assertEquals("pnvdxz", model.getVersion());
    }
}
