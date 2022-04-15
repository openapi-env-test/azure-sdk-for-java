package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Group details. */
@Fluent
public final class Group {
    /*
     * Group identity.
     */
    @JsonProperty(value = "groupId", required = true)
    private String groupId;

    /*
     * Group type.
     */
    @JsonProperty(value = "groupType", required = true)
    private GroupType groupType;

    /*
     * IoT Hub tags.
     */
    @JsonProperty(value = "tags", required = true)
    private List<String> tags;

    /*
     * Date and time when the update was created.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private String createdDateTime;

    /*
     * The number of devices in the group.
     */
    @JsonProperty(value = "deviceCount")
    private Integer deviceCount;

    /*
     * The deployment Id for the group.
     */
    @JsonProperty(value = "deploymentId")
    private String deploymentId;

    /*
     * The device class Id for the group.
     */
    @JsonProperty(value = "deviceClassId")
    private String deviceClassId;

    /**
     * Get the groupId property: Group identity.
     *
     * @return the groupId value.
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: Group identity.
     *
     * @param groupId the groupId value to set.
     * @return the Group object itself.
     */
    public Group setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the groupType property: Group type.
     *
     * @return the groupType value.
     */
    public GroupType getGroupType() {
        return this.groupType;
    }

    /**
     * Set the groupType property: Group type.
     *
     * @param groupType the groupType value to set.
     * @return the Group object itself.
     */
    public Group setGroupType(GroupType groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * Get the tags property: IoT Hub tags.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: IoT Hub tags.
     *
     * @param tags the tags value to set.
     * @return the Group object itself.
     */
    public Group setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time when the update was created.
     *
     * @return the createdDateTime value.
     */
    public String getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time when the update was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the Group object itself.
     */
    public Group setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the deviceCount property: The number of devices in the group.
     *
     * @return the deviceCount value.
     */
    public Integer getDeviceCount() {
        return this.deviceCount;
    }

    /**
     * Set the deviceCount property: The number of devices in the group.
     *
     * @param deviceCount the deviceCount value to set.
     * @return the Group object itself.
     */
    public Group setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }

    /**
     * Get the deploymentId property: The deployment Id for the group.
     *
     * @return the deploymentId value.
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * Set the deploymentId property: The deployment Id for the group.
     *
     * @param deploymentId the deploymentId value to set.
     * @return the Group object itself.
     */
    public Group setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * Get the deviceClassId property: The device class Id for the group.
     *
     * @return the deviceClassId value.
     */
    public String getDeviceClassId() {
        return this.deviceClassId;
    }

    /**
     * Set the deviceClassId property: The device class Id for the group.
     *
     * @param deviceClassId the deviceClassId value to set.
     * @return the Group object itself.
     */
    public Group setDeviceClassId(String deviceClassId) {
        this.deviceClassId = deviceClassId;
        return this;
    }
}
