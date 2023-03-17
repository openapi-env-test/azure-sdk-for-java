// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.synapse.models.AutoPauseProperties;
import com.azure.resourcemanager.synapse.models.AutoScaleProperties;
import com.azure.resourcemanager.synapse.models.DynamicExecutorAllocation;
import com.azure.resourcemanager.synapse.models.LibraryRequirements;
import com.azure.resourcemanager.synapse.models.NodeSize;
import com.azure.resourcemanager.synapse.models.NodeSizeFamily;
import com.azure.resourcemanager.synapse.models.SparkConfigProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Big Data pool
 *
 * <p>A Big Data pool.
 */
@Fluent
public final class BigDataPoolResourceInfoInner extends Resource {
    /*
     * Spark pool properties
     *
     * Big Data pool properties
     */
    @JsonProperty(value = "properties")
    private BigDataPoolResourceProperties innerProperties;

    /** Creates an instance of BigDataPoolResourceInfoInner class. */
    public BigDataPoolResourceInfoInner() {
    }

    /**
     * Get the innerProperties property: Spark pool properties
     *
     * <p>Big Data pool properties.
     *
     * @return the innerProperties value.
     */
    private BigDataPoolResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public BigDataPoolResourceInfoInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BigDataPoolResourceInfoInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The state of the Big Data pool.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The state of the Big Data pool.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the autoScale property: Spark pool auto-scaling properties
     *
     * <p>Auto-scaling properties.
     *
     * @return the autoScale value.
     */
    public AutoScaleProperties autoScale() {
        return this.innerProperties() == null ? null : this.innerProperties().autoScale();
    }

    /**
     * Set the autoScale property: Spark pool auto-scaling properties
     *
     * <p>Auto-scaling properties.
     *
     * @param autoScale the autoScale value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withAutoScale(AutoScaleProperties autoScale) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withAutoScale(autoScale);
        return this;
    }

    /**
     * Get the creationDate property: The time when the Big Data pool was created.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the autoPause property: Spark pool auto-pausing properties
     *
     * <p>Auto-pausing properties.
     *
     * @return the autoPause value.
     */
    public AutoPauseProperties autoPause() {
        return this.innerProperties() == null ? null : this.innerProperties().autoPause();
    }

    /**
     * Set the autoPause property: Spark pool auto-pausing properties
     *
     * <p>Auto-pausing properties.
     *
     * @param autoPause the autoPause value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withAutoPause(AutoPauseProperties autoPause) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withAutoPause(autoPause);
        return this;
    }

    /**
     * Get the isComputeIsolationEnabled property: Whether compute isolation is required or not.
     *
     * @return the isComputeIsolationEnabled value.
     */
    public Boolean isComputeIsolationEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isComputeIsolationEnabled();
    }

    /**
     * Set the isComputeIsolationEnabled property: Whether compute isolation is required or not.
     *
     * @param isComputeIsolationEnabled the isComputeIsolationEnabled value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withIsComputeIsolationEnabled(Boolean isComputeIsolationEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withIsComputeIsolationEnabled(isComputeIsolationEnabled);
        return this;
    }

    /**
     * Get the sessionLevelPackagesEnabled property: Whether session level packages enabled.
     *
     * @return the sessionLevelPackagesEnabled value.
     */
    public Boolean sessionLevelPackagesEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().sessionLevelPackagesEnabled();
    }

    /**
     * Set the sessionLevelPackagesEnabled property: Whether session level packages enabled.
     *
     * @param sessionLevelPackagesEnabled the sessionLevelPackagesEnabled value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withSessionLevelPackagesEnabled(Boolean sessionLevelPackagesEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withSessionLevelPackagesEnabled(sessionLevelPackagesEnabled);
        return this;
    }

    /**
     * Get the cacheSize property: The cache size.
     *
     * @return the cacheSize value.
     */
    public Integer cacheSize() {
        return this.innerProperties() == null ? null : this.innerProperties().cacheSize();
    }

    /**
     * Set the cacheSize property: The cache size.
     *
     * @param cacheSize the cacheSize value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withCacheSize(Integer cacheSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withCacheSize(cacheSize);
        return this;
    }

    /**
     * Get the dynamicExecutorAllocation property: Dynamic Executor Allocation.
     *
     * @return the dynamicExecutorAllocation value.
     */
    public DynamicExecutorAllocation dynamicExecutorAllocation() {
        return this.innerProperties() == null ? null : this.innerProperties().dynamicExecutorAllocation();
    }

    /**
     * Set the dynamicExecutorAllocation property: Dynamic Executor Allocation.
     *
     * @param dynamicExecutorAllocation the dynamicExecutorAllocation value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withDynamicExecutorAllocation(
        DynamicExecutorAllocation dynamicExecutorAllocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withDynamicExecutorAllocation(dynamicExecutorAllocation);
        return this;
    }

    /**
     * Get the sparkEventsFolder property: The Spark events folder.
     *
     * @return the sparkEventsFolder value.
     */
    public String sparkEventsFolder() {
        return this.innerProperties() == null ? null : this.innerProperties().sparkEventsFolder();
    }

    /**
     * Set the sparkEventsFolder property: The Spark events folder.
     *
     * @param sparkEventsFolder the sparkEventsFolder value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withSparkEventsFolder(String sparkEventsFolder) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withSparkEventsFolder(sparkEventsFolder);
        return this;
    }

    /**
     * Get the nodeCount property: The number of nodes in the Big Data pool.
     *
     * @return the nodeCount value.
     */
    public Integer nodeCount() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeCount();
    }

    /**
     * Set the nodeCount property: The number of nodes in the Big Data pool.
     *
     * @param nodeCount the nodeCount value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withNodeCount(Integer nodeCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withNodeCount(nodeCount);
        return this;
    }

    /**
     * Get the libraryRequirements property: Spark pool library version requirements
     *
     * <p>Library version requirements.
     *
     * @return the libraryRequirements value.
     */
    public LibraryRequirements libraryRequirements() {
        return this.innerProperties() == null ? null : this.innerProperties().libraryRequirements();
    }

    /**
     * Set the libraryRequirements property: Spark pool library version requirements
     *
     * <p>Library version requirements.
     *
     * @param libraryRequirements the libraryRequirements value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withLibraryRequirements(LibraryRequirements libraryRequirements) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withLibraryRequirements(libraryRequirements);
        return this;
    }

    /**
     * Get the customLibraries property: List of custom libraries/packages associated with the spark pool.
     *
     * @return the customLibraries value.
     */
    public List<LibraryInfo> customLibraries() {
        return this.innerProperties() == null ? null : this.innerProperties().customLibraries();
    }

    /**
     * Set the customLibraries property: List of custom libraries/packages associated with the spark pool.
     *
     * @param customLibraries the customLibraries value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withCustomLibraries(List<LibraryInfo> customLibraries) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withCustomLibraries(customLibraries);
        return this;
    }

    /**
     * Get the sparkConfigProperties property: Spark pool Config Properties
     *
     * <p>Spark configuration file to specify additional properties.
     *
     * @return the sparkConfigProperties value.
     */
    public SparkConfigProperties sparkConfigProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().sparkConfigProperties();
    }

    /**
     * Set the sparkConfigProperties property: Spark pool Config Properties
     *
     * <p>Spark configuration file to specify additional properties.
     *
     * @param sparkConfigProperties the sparkConfigProperties value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withSparkConfigProperties(SparkConfigProperties sparkConfigProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withSparkConfigProperties(sparkConfigProperties);
        return this;
    }

    /**
     * Get the sparkVersion property: The Apache Spark version.
     *
     * @return the sparkVersion value.
     */
    public String sparkVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().sparkVersion();
    }

    /**
     * Set the sparkVersion property: The Apache Spark version.
     *
     * @param sparkVersion the sparkVersion value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withSparkVersion(String sparkVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withSparkVersion(sparkVersion);
        return this;
    }

    /**
     * Get the defaultSparkLogFolder property: The default folder where Spark logs will be written.
     *
     * @return the defaultSparkLogFolder value.
     */
    public String defaultSparkLogFolder() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultSparkLogFolder();
    }

    /**
     * Set the defaultSparkLogFolder property: The default folder where Spark logs will be written.
     *
     * @param defaultSparkLogFolder the defaultSparkLogFolder value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withDefaultSparkLogFolder(String defaultSparkLogFolder) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withDefaultSparkLogFolder(defaultSparkLogFolder);
        return this;
    }

    /**
     * Get the nodeSize property: The level of compute power that each node in the Big Data pool has.
     *
     * @return the nodeSize value.
     */
    public NodeSize nodeSize() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeSize();
    }

    /**
     * Set the nodeSize property: The level of compute power that each node in the Big Data pool has.
     *
     * @param nodeSize the nodeSize value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withNodeSize(NodeSize nodeSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withNodeSize(nodeSize);
        return this;
    }

    /**
     * Get the nodeSizeFamily property: The kind of nodes that the Big Data pool provides.
     *
     * @return the nodeSizeFamily value.
     */
    public NodeSizeFamily nodeSizeFamily() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeSizeFamily();
    }

    /**
     * Set the nodeSizeFamily property: The kind of nodes that the Big Data pool provides.
     *
     * @param nodeSizeFamily the nodeSizeFamily value to set.
     * @return the BigDataPoolResourceInfoInner object itself.
     */
    public BigDataPoolResourceInfoInner withNodeSizeFamily(NodeSizeFamily nodeSizeFamily) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BigDataPoolResourceProperties();
        }
        this.innerProperties().withNodeSizeFamily(nodeSizeFamily);
        return this;
    }

    /**
     * Get the lastSucceededTimestamp property: The time when the Big Data pool was updated successfully.
     *
     * @return the lastSucceededTimestamp value.
     */
    public OffsetDateTime lastSucceededTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().lastSucceededTimestamp();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
