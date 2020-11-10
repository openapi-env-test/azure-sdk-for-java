/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TransferType.
 */
public enum TransferType {
    /** Import data to azure. */
    IMPORT_TO_AZURE("ImportToAzure"),

    /** Export data from azure. */
    EXPORT_FROM_AZURE("ExportFromAzure");

    /** The actual serialized value for a TransferType instance. */
    private String value;

    TransferType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TransferType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TransferType object, or null if unable to parse.
     */
    @JsonCreator
    public static TransferType fromString(String value) {
        TransferType[] items = TransferType.values();
        for (TransferType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
