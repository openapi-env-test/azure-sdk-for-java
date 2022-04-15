package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.ImportUpdateInputItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImportUpdateInputItemTests {
    @Test
    public void testDeserialize() {
        ImportUpdateInputItem model =
                BinaryData.fromString(
                                "{\"importManifest\":{\"url\":\"mmhquvgjxpyb\",\"sizeInBytes\":1226587808838328746,\"hashes\":{\"hmtzopbsphrup\":\"dgs\",\"bb\":\"jhphoyc\"}},\"friendlyName\":\"xaobhdxbmtqioqjz\",\"files\":[{\"filename\":\"bmufpown\",\"url\":\"izhwlrxy\"},{\"filename\":\"qsoqijgkd\",\"url\":\"bpazlobcufpdzn\"}]}")
                        .toObject(ImportUpdateInputItem.class);
        Assertions.assertEquals("mmhquvgjxpyb", model.getImportManifest().getUrl());
        Assertions.assertEquals(1226587808838328746L, model.getImportManifest().getSizeInBytes());
        Assertions.assertEquals("dgs", model.getImportManifest().getHashes().get("hmtzopbsphrup"));
        Assertions.assertEquals("xaobhdxbmtqioqjz", model.getFriendlyName());
        Assertions.assertEquals("bmufpown", model.getFiles().get(0).getFilename());
        Assertions.assertEquals("izhwlrxy", model.getFiles().get(0).getUrl());
    }
}
