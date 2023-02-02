// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Definition of which custom log files will be collected by this data collection rule. */
@Fluent
public final class LogFilesDataSource {
    /*
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data source
     */
    @JsonProperty(value = "streams", required = true)
    private List<String> streams;

    /*
     * File Patterns where the log files are located
     */
    @JsonProperty(value = "filePatterns", required = true)
    private List<String> filePatterns;

    /*
     * The data format of the log files
     */
    @JsonProperty(value = "format", required = true)
    private KnownLogFilesDataSourceFormat format;

    /*
     * The log files specific settings.
     */
    @JsonProperty(value = "settings")
    private LogFilesDataSourceSettings settings;

    /*
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of LogFilesDataSource class. */
    public LogFilesDataSource() {
    }

    /**
     * Get the streams property: List of streams that this data source will be sent to. A stream indicates what schema
     * will be used for this data source.
     *
     * @return the streams value.
     */
    public List<String> streams() {
        return this.streams;
    }

    /**
     * Set the streams property: List of streams that this data source will be sent to. A stream indicates what schema
     * will be used for this data source.
     *
     * @param streams the streams value to set.
     * @return the LogFilesDataSource object itself.
     */
    public LogFilesDataSource withStreams(List<String> streams) {
        this.streams = streams;
        return this;
    }

    /**
     * Get the filePatterns property: File Patterns where the log files are located.
     *
     * @return the filePatterns value.
     */
    public List<String> filePatterns() {
        return this.filePatterns;
    }

    /**
     * Set the filePatterns property: File Patterns where the log files are located.
     *
     * @param filePatterns the filePatterns value to set.
     * @return the LogFilesDataSource object itself.
     */
    public LogFilesDataSource withFilePatterns(List<String> filePatterns) {
        this.filePatterns = filePatterns;
        return this;
    }

    /**
     * Get the format property: The data format of the log files.
     *
     * @return the format value.
     */
    public KnownLogFilesDataSourceFormat format() {
        return this.format;
    }

    /**
     * Set the format property: The data format of the log files.
     *
     * @param format the format value to set.
     * @return the LogFilesDataSource object itself.
     */
    public LogFilesDataSource withFormat(KnownLogFilesDataSourceFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the settings property: The log files specific settings.
     *
     * @return the settings value.
     */
    public LogFilesDataSourceSettings settings() {
        return this.settings;
    }

    /**
     * Set the settings property: The log files specific settings.
     *
     * @param settings the settings value to set.
     * @return the LogFilesDataSource object itself.
     */
    public LogFilesDataSource withSettings(LogFilesDataSourceSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the name property: A friendly name for the data source. This name should be unique across all data sources
     * (regardless of type) within the data collection rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A friendly name for the data source. This name should be unique across all data sources
     * (regardless of type) within the data collection rule.
     *
     * @param name the name value to set.
     * @return the LogFilesDataSource object itself.
     */
    public LogFilesDataSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (streams() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property streams in model LogFilesDataSource"));
        }
        if (filePatterns() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property filePatterns in model LogFilesDataSource"));
        }
        if (format() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property format in model LogFilesDataSource"));
        }
        if (settings() != null) {
            settings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogFilesDataSource.class);
}
