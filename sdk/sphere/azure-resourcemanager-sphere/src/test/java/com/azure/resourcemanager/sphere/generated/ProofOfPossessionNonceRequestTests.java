// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.models.ProofOfPossessionNonceRequest;
import org.junit.jupiter.api.Assertions;

public final class ProofOfPossessionNonceRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProofOfPossessionNonceRequest model =
            BinaryData.fromString("{\"proofOfPossessionNonce\":\"kwt\"}").toObject(ProofOfPossessionNonceRequest.class);
        Assertions.assertEquals("kwt", model.proofOfPossessionNonce());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProofOfPossessionNonceRequest model = new ProofOfPossessionNonceRequest().withProofOfPossessionNonce("kwt");
        model = BinaryData.fromObject(model).toObject(ProofOfPossessionNonceRequest.class);
        Assertions.assertEquals("kwt", model.proofOfPossessionNonce());
    }
}
