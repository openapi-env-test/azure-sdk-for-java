package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.UpdateFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateFileTests {
    @Test
    public void testDeserialize() {
        UpdateFile model =
                BinaryData.fromString(
                                "{\"fileId\":\"melwuipiccjz\",\"fileName\":\"z\",\"sizeInBytes\":662578251116723063,\"hashes\":{\"vc\":\"ayrhyrnx\",\"mueedndrdvstk\":\"qqtch\"},\"mimeType\":\"lmfmtdaay\",\"scanResult\":\"v\",\"scanDetails\":\"gpiohgwxrtfudxe\",\"etag\":\"gyqagvrvmnpkuk\"}")
                        .toObject(UpdateFile.class);
        Assertions.assertEquals("melwuipiccjz", model.getFileId());
        Assertions.assertEquals("z", model.getFileName());
        Assertions.assertEquals(662578251116723063L, model.getSizeInBytes());
        Assertions.assertEquals("ayrhyrnx", model.getHashes().get("vc"));
        Assertions.assertEquals("lmfmtdaay", model.getMimeType());
        Assertions.assertEquals("v", model.getScanResult());
        Assertions.assertEquals("gpiohgwxrtfudxe", model.getScanDetails());
        Assertions.assertEquals("gyqagvrvmnpkuk", model.getEtag());
    }
}
