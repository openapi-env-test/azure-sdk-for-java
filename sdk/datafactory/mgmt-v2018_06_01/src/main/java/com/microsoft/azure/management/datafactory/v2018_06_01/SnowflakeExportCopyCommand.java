/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Snowflake export command settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SnowflakeExportCopyCommand.class)
@JsonTypeName("SnowflakeExportCopyCommand")
public class SnowflakeExportCopyCommand extends ExportSettings {
    /**
     * Additional copy options directly passed to snowflake Copy Command. Type:
     * key value pairs (value should be string type) (or Expression with
     * resultType object). Example: "additionalCopyOptions": { "DATE_FORMAT":
     * "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }.
     */
    @JsonProperty(value = "additionalCopyOptions")
    private Map<String, Object> additionalCopyOptions;

    /**
     * Additional format options directly passed to snowflake Copy Command.
     * Type: key value pairs (value should be string type) (or Expression with
     * resultType object). Example: "additionalFormatOptions": { "OVERWRITE":
     * "TRUE", "MAX_FILE_SIZE": "'FALSE'" }.
     */
    @JsonProperty(value = "additionalFormatOptions")
    private Map<String, Object> additionalFormatOptions;

    /**
     * Get additional copy options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }.
     *
     * @return the additionalCopyOptions value
     */
    public Map<String, Object> additionalCopyOptions() {
        return this.additionalCopyOptions;
    }

    /**
     * Set additional copy options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }.
     *
     * @param additionalCopyOptions the additionalCopyOptions value to set
     * @return the SnowflakeExportCopyCommand object itself.
     */
    public SnowflakeExportCopyCommand withAdditionalCopyOptions(Map<String, Object> additionalCopyOptions) {
        this.additionalCopyOptions = additionalCopyOptions;
        return this;
    }

    /**
     * Get additional format options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalFormatOptions": { "OVERWRITE": "TRUE", "MAX_FILE_SIZE": "'FALSE'" }.
     *
     * @return the additionalFormatOptions value
     */
    public Map<String, Object> additionalFormatOptions() {
        return this.additionalFormatOptions;
    }

    /**
     * Set additional format options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalFormatOptions": { "OVERWRITE": "TRUE", "MAX_FILE_SIZE": "'FALSE'" }.
     *
     * @param additionalFormatOptions the additionalFormatOptions value to set
     * @return the SnowflakeExportCopyCommand object itself.
     */
    public SnowflakeExportCopyCommand withAdditionalFormatOptions(Map<String, Object> additionalFormatOptions) {
        this.additionalFormatOptions = additionalFormatOptions;
        return this;
    }

}
