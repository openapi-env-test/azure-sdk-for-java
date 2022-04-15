package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.StringsList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class StringsListTests {
    @Test
    public void testDeserialize() {
        StringsList model =
                BinaryData.fromString("{\"value\":[\"rkvcikhnvpa\",\"qgxqquezikyw\",\"gxk\"],\"nextLink\":\"la\"}")
                        .toObject(StringsList.class);
        Assertions.assertEquals("rkvcikhnvpa", model.getValue().get(0));
        Assertions.assertEquals("la", model.getNextLink());
    }
}
