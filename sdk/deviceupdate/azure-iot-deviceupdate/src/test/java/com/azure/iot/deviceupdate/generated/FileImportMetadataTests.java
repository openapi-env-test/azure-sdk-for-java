package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.FileImportMetadata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FileImportMetadataTests {
    @Test
    public void testDeserialize() {
        FileImportMetadata model =
                BinaryData.fromString("{\"filename\":\"ajpsquc\",\"url\":\"poyfdkfogkn\"}")
                        .toObject(FileImportMetadata.class);
        Assertions.assertEquals("ajpsquc", model.getFilename());
        Assertions.assertEquals("poyfdkfogkn", model.getUrl());
    }
}
