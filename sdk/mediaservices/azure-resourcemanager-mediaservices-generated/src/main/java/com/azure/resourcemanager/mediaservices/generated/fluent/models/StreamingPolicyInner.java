// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.models.CommonEncryptionCbcs;
import com.azure.resourcemanager.mediaservices.generated.models.CommonEncryptionCenc;
import com.azure.resourcemanager.mediaservices.generated.models.EnvelopeEncryption;
import com.azure.resourcemanager.mediaservices.generated.models.NoEncryption;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A Streaming Policy resource. */
@JsonFlatten
@Fluent
public class StreamingPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StreamingPolicyInner.class);

    /*
     * Creation time of Streaming Policy
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * Default ContentKey used by current Streaming Policy
     */
    @JsonProperty(value = "properties.defaultContentKeyPolicyName")
    private String defaultContentKeyPolicyName;

    /*
     * Configuration of EnvelopeEncryption
     */
    @JsonProperty(value = "properties.envelopeEncryption")
    private EnvelopeEncryption envelopeEncryption;

    /*
     * Configuration of CommonEncryptionCenc
     */
    @JsonProperty(value = "properties.commonEncryptionCenc")
    private CommonEncryptionCenc commonEncryptionCenc;

    /*
     * Configuration of CommonEncryptionCbcs
     */
    @JsonProperty(value = "properties.commonEncryptionCbcs")
    private CommonEncryptionCbcs commonEncryptionCbcs;

    /*
     * Configurations of NoEncryption
     */
    @JsonProperty(value = "properties.noEncryption")
    private NoEncryption noEncryption;

    /**
     * Get the created property: Creation time of Streaming Policy.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the defaultContentKeyPolicyName property: Default ContentKey used by current Streaming Policy.
     *
     * @return the defaultContentKeyPolicyName value.
     */
    public String defaultContentKeyPolicyName() {
        return this.defaultContentKeyPolicyName;
    }

    /**
     * Set the defaultContentKeyPolicyName property: Default ContentKey used by current Streaming Policy.
     *
     * @param defaultContentKeyPolicyName the defaultContentKeyPolicyName value to set.
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
        this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
        return this;
    }

    /**
     * Get the envelopeEncryption property: Configuration of EnvelopeEncryption.
     *
     * @return the envelopeEncryption value.
     */
    public EnvelopeEncryption envelopeEncryption() {
        return this.envelopeEncryption;
    }

    /**
     * Set the envelopeEncryption property: Configuration of EnvelopeEncryption.
     *
     * @param envelopeEncryption the envelopeEncryption value to set.
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withEnvelopeEncryption(EnvelopeEncryption envelopeEncryption) {
        this.envelopeEncryption = envelopeEncryption;
        return this;
    }

    /**
     * Get the commonEncryptionCenc property: Configuration of CommonEncryptionCenc.
     *
     * @return the commonEncryptionCenc value.
     */
    public CommonEncryptionCenc commonEncryptionCenc() {
        return this.commonEncryptionCenc;
    }

    /**
     * Set the commonEncryptionCenc property: Configuration of CommonEncryptionCenc.
     *
     * @param commonEncryptionCenc the commonEncryptionCenc value to set.
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withCommonEncryptionCenc(CommonEncryptionCenc commonEncryptionCenc) {
        this.commonEncryptionCenc = commonEncryptionCenc;
        return this;
    }

    /**
     * Get the commonEncryptionCbcs property: Configuration of CommonEncryptionCbcs.
     *
     * @return the commonEncryptionCbcs value.
     */
    public CommonEncryptionCbcs commonEncryptionCbcs() {
        return this.commonEncryptionCbcs;
    }

    /**
     * Set the commonEncryptionCbcs property: Configuration of CommonEncryptionCbcs.
     *
     * @param commonEncryptionCbcs the commonEncryptionCbcs value to set.
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withCommonEncryptionCbcs(CommonEncryptionCbcs commonEncryptionCbcs) {
        this.commonEncryptionCbcs = commonEncryptionCbcs;
        return this;
    }

    /**
     * Get the noEncryption property: Configurations of NoEncryption.
     *
     * @return the noEncryption value.
     */
    public NoEncryption noEncryption() {
        return this.noEncryption;
    }

    /**
     * Set the noEncryption property: Configurations of NoEncryption.
     *
     * @param noEncryption the noEncryption value to set.
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withNoEncryption(NoEncryption noEncryption) {
        this.noEncryption = noEncryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (envelopeEncryption() != null) {
            envelopeEncryption().validate();
        }
        if (commonEncryptionCenc() != null) {
            commonEncryptionCenc().validate();
        }
        if (commonEncryptionCbcs() != null) {
            commonEncryptionCbcs().validate();
        }
        if (noEncryption() != null) {
            noEncryption().validate();
        }
    }
}
