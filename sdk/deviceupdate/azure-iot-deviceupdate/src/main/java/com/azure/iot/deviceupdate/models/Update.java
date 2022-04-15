package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Update metadata. */
@Fluent
public final class Update {
    /*
     * Update identity.
     */
    @JsonProperty(value = "updateId", required = true)
    private UpdateId updateId;

    /*
     * Update description specified by creator.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Friendly update name specified by importer.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * Whether the update can be deployed to a device on its own.
     */
    @JsonProperty(value = "isDeployable")
    private Boolean isDeployable;

    /*
     * Update type. Deprecated in latest import manifest schema.
     */
    @JsonProperty(value = "updateType")
    private String updateType;

    /*
     * String interpreted by Device Update client to determine if the update is
     * installed on the device. Deprecated in latest import manifest schema.
     */
    @JsonProperty(value = "installedCriteria")
    private String installedCriteria;

    /*
     * List of update compatibility information.
     */
    @JsonProperty(value = "compatibility", required = true)
    private List<Map<String, String>> compatibility;

    /*
     * Update install instructions.
     */
    @JsonProperty(value = "instructions")
    private Instructions instructions;

    /*
     * List of update identities that reference this update.
     */
    @JsonProperty(value = "referencedBy")
    private List<UpdateId> referencedBy;

    /*
     * Update aggregate scan result (calculated from payload file scan
     * results).
     */
    @JsonProperty(value = "scanResult")
    private String scanResult;

    /*
     * Schema version of manifest used to import the update.
     */
    @JsonProperty(value = "manifestVersion", required = true)
    private String manifestVersion;

    /*
     * Date and time in UTC when the update was imported.
     */
    @JsonProperty(value = "importedDateTime", required = true)
    private OffsetDateTime importedDateTime;

    /*
     * Date and time in UTC when the update was created.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private OffsetDateTime createdDateTime;

    /*
     * Update ETag.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the updateId property: Update identity.
     *
     * @return the updateId value.
     */
    public UpdateId getUpdateId() {
        return this.updateId;
    }

    /**
     * Set the updateId property: Update identity.
     *
     * @param updateId the updateId value to set.
     * @return the Update object itself.
     */
    public Update setUpdateId(UpdateId updateId) {
        this.updateId = updateId;
        return this;
    }

    /**
     * Get the description property: Update description specified by creator.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Update description specified by creator.
     *
     * @param description the description value to set.
     * @return the Update object itself.
     */
    public Update setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly update name specified by importer.
     *
     * @return the friendlyName value.
     */
    public String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly update name specified by importer.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the Update object itself.
     */
    public Update setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the isDeployable property: Whether the update can be deployed to a device on its own.
     *
     * @return the isDeployable value.
     */
    public Boolean isDeployable() {
        return this.isDeployable;
    }

    /**
     * Set the isDeployable property: Whether the update can be deployed to a device on its own.
     *
     * @param isDeployable the isDeployable value to set.
     * @return the Update object itself.
     */
    public Update setIsDeployable(Boolean isDeployable) {
        this.isDeployable = isDeployable;
        return this;
    }

    /**
     * Get the updateType property: Update type. Deprecated in latest import manifest schema.
     *
     * @return the updateType value.
     */
    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * Set the updateType property: Update type. Deprecated in latest import manifest schema.
     *
     * @param updateType the updateType value to set.
     * @return the Update object itself.
     */
    public Update setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }

    /**
     * Get the installedCriteria property: String interpreted by Device Update client to determine if the update is
     * installed on the device. Deprecated in latest import manifest schema.
     *
     * @return the installedCriteria value.
     */
    public String getInstalledCriteria() {
        return this.installedCriteria;
    }

    /**
     * Set the installedCriteria property: String interpreted by Device Update client to determine if the update is
     * installed on the device. Deprecated in latest import manifest schema.
     *
     * @param installedCriteria the installedCriteria value to set.
     * @return the Update object itself.
     */
    public Update setInstalledCriteria(String installedCriteria) {
        this.installedCriteria = installedCriteria;
        return this;
    }

    /**
     * Get the compatibility property: List of update compatibility information.
     *
     * @return the compatibility value.
     */
    public List<Map<String, String>> getCompatibility() {
        return this.compatibility;
    }

    /**
     * Set the compatibility property: List of update compatibility information.
     *
     * @param compatibility the compatibility value to set.
     * @return the Update object itself.
     */
    public Update setCompatibility(List<Map<String, String>> compatibility) {
        this.compatibility = compatibility;
        return this;
    }

    /**
     * Get the instructions property: Update install instructions.
     *
     * @return the instructions value.
     */
    public Instructions getInstructions() {
        return this.instructions;
    }

    /**
     * Set the instructions property: Update install instructions.
     *
     * @param instructions the instructions value to set.
     * @return the Update object itself.
     */
    public Update setInstructions(Instructions instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Get the referencedBy property: List of update identities that reference this update.
     *
     * @return the referencedBy value.
     */
    public List<UpdateId> getReferencedBy() {
        return this.referencedBy;
    }

    /**
     * Set the referencedBy property: List of update identities that reference this update.
     *
     * @param referencedBy the referencedBy value to set.
     * @return the Update object itself.
     */
    public Update setReferencedBy(List<UpdateId> referencedBy) {
        this.referencedBy = referencedBy;
        return this;
    }

    /**
     * Get the scanResult property: Update aggregate scan result (calculated from payload file scan results).
     *
     * @return the scanResult value.
     */
    public String getScanResult() {
        return this.scanResult;
    }

    /**
     * Set the scanResult property: Update aggregate scan result (calculated from payload file scan results).
     *
     * @param scanResult the scanResult value to set.
     * @return the Update object itself.
     */
    public Update setScanResult(String scanResult) {
        this.scanResult = scanResult;
        return this;
    }

    /**
     * Get the manifestVersion property: Schema version of manifest used to import the update.
     *
     * @return the manifestVersion value.
     */
    public String getManifestVersion() {
        return this.manifestVersion;
    }

    /**
     * Set the manifestVersion property: Schema version of manifest used to import the update.
     *
     * @param manifestVersion the manifestVersion value to set.
     * @return the Update object itself.
     */
    public Update setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * Get the importedDateTime property: Date and time in UTC when the update was imported.
     *
     * @return the importedDateTime value.
     */
    public OffsetDateTime getImportedDateTime() {
        return this.importedDateTime;
    }

    /**
     * Set the importedDateTime property: Date and time in UTC when the update was imported.
     *
     * @param importedDateTime the importedDateTime value to set.
     * @return the Update object itself.
     */
    public Update setImportedDateTime(OffsetDateTime importedDateTime) {
        this.importedDateTime = importedDateTime;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time in UTC when the update was created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time in UTC when the update was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the Update object itself.
     */
    public Update setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the etag property: Update ETag.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: Update ETag.
     *
     * @param etag the etag value to set.
     * @return the Update object itself.
     */
    public Update setEtag(String etag) {
        this.etag = etag;
        return this;
    }
}
