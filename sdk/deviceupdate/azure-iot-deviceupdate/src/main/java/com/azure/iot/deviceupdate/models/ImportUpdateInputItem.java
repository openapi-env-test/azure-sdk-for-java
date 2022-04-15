package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Import update input item metadata. */
@Fluent
public final class ImportUpdateInputItem {
    /*
     * Import manifest metadata like source URL, file size/hashes, etc.
     */
    @JsonProperty(value = "importManifest", required = true)
    private ImportManifestMetadata importManifest;

    /*
     * Friendly update name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * One or more update file properties like filename and source URL.
     */
    @JsonProperty(value = "files")
    private List<FileImportMetadata> files;

    /**
     * Get the importManifest property: Import manifest metadata like source URL, file size/hashes, etc.
     *
     * @return the importManifest value.
     */
    public ImportManifestMetadata getImportManifest() {
        return this.importManifest;
    }

    /**
     * Set the importManifest property: Import manifest metadata like source URL, file size/hashes, etc.
     *
     * @param importManifest the importManifest value to set.
     * @return the ImportUpdateInputItem object itself.
     */
    public ImportUpdateInputItem setImportManifest(ImportManifestMetadata importManifest) {
        this.importManifest = importManifest;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly update name.
     *
     * @return the friendlyName value.
     */
    public String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly update name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the ImportUpdateInputItem object itself.
     */
    public ImportUpdateInputItem setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the files property: One or more update file properties like filename and source URL.
     *
     * @return the files value.
     */
    public List<FileImportMetadata> getFiles() {
        return this.files;
    }

    /**
     * Set the files property: One or more update file properties like filename and source URL.
     *
     * @param files the files value to set.
     * @return the ImportUpdateInputItem object itself.
     */
    public ImportUpdateInputItem setFiles(List<FileImportMetadata> files) {
        this.files = files;
        return this;
    }
}
