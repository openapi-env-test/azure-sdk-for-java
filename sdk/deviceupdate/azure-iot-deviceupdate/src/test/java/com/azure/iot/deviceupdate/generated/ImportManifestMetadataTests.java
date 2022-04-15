package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.ImportManifestMetadata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImportManifestMetadataTests {
    @Test
    public void testDeserialize() {
        ImportManifestMetadata model =
                BinaryData.fromString(
                                "{\"url\":\"btcqq\",\"sizeInBytes\":1427038009591318183,\"hashes\":{\"lhqgnufooojy\":\"ifsqesaagdfmg\",\"zlhjxrifkwmrvkt\":\"izntocipao\"}}")
                        .toObject(ImportManifestMetadata.class);
        Assertions.assertEquals("btcqq", model.getUrl());
        Assertions.assertEquals(1427038009591318183L, model.getSizeInBytes());
        Assertions.assertEquals("ifsqesaagdfmg", model.getHashes().get("lhqgnufooojy"));
    }
}
