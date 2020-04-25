/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * File server read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = FileServerReadSettings.class)
@JsonTypeName("FileServerReadSettings")
public class FileServerReadSettings extends StoreReadSettings {
    /**
     * If true, files under the folder path will be read recursively. Default
     * is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /**
     * FileServer wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "wildcardFolderPath")
    private Object wildcardFolderPath;

    /**
     * FileServer wildcardFileName. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "wildcardFileName")
    private Object wildcardFileName;

    /**
     * Point to a text file that lists each file (relative path to the path
     * configured in the dataset) that you want to copy. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "fileListPath")
    private Object fileListPath;

    /**
     * Indicates whether to enable partition discovery.
     */
    @JsonProperty(value = "enablePartitionDiscovery")
    private Boolean enablePartitionDiscovery;

    /**
     * Specify the root path where partition discovery starts from. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionRootPath")
    private Object partitionRootPath;

    /**
     * The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeStart")
    private Object modifiedDatetimeStart;

    /**
     * The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeEnd")
    private Object modifiedDatetimeEnd;

    /**
     * Specify a filter to be used to select a subset of files in the
     * folderPath rather than all files. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "fileFilter")
    private Object fileFilter;

    /**
     * Get if true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the recursive value
     */
    public Object recursive() {
        return this.recursive;
    }

    /**
     * Set if true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set
     * @return the FileServerReadSettings object itself.
     */
    public FileServerReadSettings withRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get fileServer wildcardFolderPath. Type: string (or Expression with resultType string).
     *
     * @return the wildcardFolderPath value
     */
    public Object wildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set fileServer wildcardFolderPath. Type: string (or Expression with resultType string).
     *
     * @param wildcardFolderPath the wildcardFolderPath value to set
     * @return the FileServerReadSettings object itself.
     */
    public FileServerReadSettings withWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get fileServer wildcardFileName. Type: string (or Expression with resultType string).
     *
     * @return the wildcardFileName value
     */
    public Object wildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set fileServer wildcardFileName. Type: string (or Expression with resultType string).
     *
     * @param wildcardFileName the wildcardFileName value to set
     * @return the FileServerReadSettings object itself.
     */
    public FileServerReadSettings withWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     *
     * @return the fileListPath value
     */
    public Object fileListPath() {
        return this.fileListPath;
    }

    /**
     * Set point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     *
     * @param fileListPath the fileListPath value to set
     * @return the FileServerReadSettings object itself.
     */
    public FileServerReadSettings withFileListPath(Object fileListPath) {
        this.fileListPath = fileListPath;
        return this;
    }

    /**
     * Get indicates whether to enable partition discovery.
     *
     * @return the enablePartitionDiscovery value
     */
    public Boolean enablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set indicates whether to enable partition discovery.
     *
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set
     * @return the FileServerReadSettings object itself.
     */
    public FileServerReadSettings withEnablePartitionDiscovery(Boolean enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     *
     * @return the partitionRootPath value
     */
    public Object partitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     *
     * @param partitionRootPath the partitionRootPath value to set
     * @return the FileServerReadSettings object itself.
     */
    public FileServerReadSettings withPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the start of file's modified datetime. Type: string (or Expression with resultType string).
     *
     * @return the modifiedDatetimeStart value
     */
    public Object modifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the start of file's modified datetime. Type: string (or Expression with resultType string).
     *
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set
     * @return the FileServerReadSettings object itself.
     */
    public FileServerReadSettings withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the end of file's modified datetime. Type: string (or Expression with resultType string).
     *
     * @return the modifiedDatetimeEnd value
     */
    public Object modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the end of file's modified datetime. Type: string (or Expression with resultType string).
     *
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set
     * @return the FileServerReadSettings object itself.
     */
    public FileServerReadSettings withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * Get specify a filter to be used to select a subset of files in the folderPath rather than all files. Type: string (or Expression with resultType string).
     *
     * @return the fileFilter value
     */
    public Object fileFilter() {
        return this.fileFilter;
    }

    /**
     * Set specify a filter to be used to select a subset of files in the folderPath rather than all files. Type: string (or Expression with resultType string).
     *
     * @param fileFilter the fileFilter value to set
     * @return the FileServerReadSettings object itself.
     */
    public FileServerReadSettings withFileFilter(Object fileFilter) {
        this.fileFilter = fileFilter;
        return this;
    }

}
