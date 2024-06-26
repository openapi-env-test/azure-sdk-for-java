// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonS3Location;

public final class AmazonS3LocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonS3Location model = BinaryData.fromString(
            "{\"type\":\"AmazonS3Location\",\"bucketName\":\"dataae\",\"version\":\"datacflwtjdtlr\",\"folderPath\":\"datafooy\",\"fileName\":\"datauxdtzcq\",\"\":{\"lantolamlb\":\"datadudgcozzomeh\",\"z\":\"datajuxkqll\"}}")
            .toObject(AmazonS3Location.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonS3Location model = new AmazonS3Location().withFolderPath("datafooy").withFileName("datauxdtzcq")
            .withBucketName("dataae").withVersion("datacflwtjdtlr");
        model = BinaryData.fromObject(model).toObject(AmazonS3Location.class);
    }
}
