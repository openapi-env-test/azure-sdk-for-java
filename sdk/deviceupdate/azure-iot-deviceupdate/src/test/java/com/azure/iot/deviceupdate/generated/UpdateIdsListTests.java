package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.UpdateIdsList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateIdsListTests {
    @Test
    public void testDeserialize() {
        UpdateIdsList model =
                BinaryData.fromString(
                                "{\"value\":[{\"provider\":\"wygzlvdnkfxusem\",\"name\":\"wzrmuh\",\"version\":\"pfcqdp\"}],\"nextLink\":\"xqv\"}")
                        .toObject(UpdateIdsList.class);
        Assertions.assertEquals("wygzlvdnkfxusem", model.getValue().get(0).getProvider());
        Assertions.assertEquals("wzrmuh", model.getValue().get(0).getName());
        Assertions.assertEquals("pfcqdp", model.getValue().get(0).getVersion());
        Assertions.assertEquals("xqv", model.getNextLink());
    }
}
