// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.singularity.models.GroupPolicyPatchProperties;
import com.azure.resourcemanager.singularity.models.InstanceTypeSeriesQuota;
import java.util.List;

/** The GroupPolicyResourcePatchDescriptionProperties model. */
@Fluent
public final class GroupPolicyResourcePatchDescriptionProperties extends GroupPolicyPatchProperties {
    /** {@inheritDoc} */
    @Override
    public GroupPolicyResourcePatchDescriptionProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GroupPolicyResourcePatchDescriptionProperties withQuotas(List<InstanceTypeSeriesQuota> quotas) {
        super.withQuotas(quotas);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GroupPolicyResourcePatchDescriptionProperties withMaxSharedStorageIOPs(Integer maxSharedStorageIOPs) {
        super.withMaxSharedStorageIOPs(maxSharedStorageIOPs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GroupPolicyResourcePatchDescriptionProperties withMaxSharedStorageBandwidth(
        Integer maxSharedStorageBandwidth) {
        super.withMaxSharedStorageBandwidth(maxSharedStorageBandwidth);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
