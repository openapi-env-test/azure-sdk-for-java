// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a database or collection within a MongoDB data source. */
@Fluent
public class MongoDbObjectInfo {
    /*
     * The average document size, or -1 if the average size is unknown
     */
    @JsonProperty(value = "averageDocumentSize", required = true)
    private long averageDocumentSize;

    /*
     * The estimated total data size, in bytes, or -1 if the size is unknown.
     */
    @JsonProperty(value = "dataSize", required = true)
    private long dataSize;

    /*
     * The estimated total number of documents, or -1 if the document count is unknown
     */
    @JsonProperty(value = "documentCount", required = true)
    private long documentCount;

    /*
     * The unqualified name of the database or collection
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The qualified name of the database or collection. For a collection, this is the database-qualified name.
     */
    @JsonProperty(value = "qualifiedName", required = true)
    private String qualifiedName;

    /** Creates an instance of MongoDbObjectInfo class. */
    public MongoDbObjectInfo() {
    }

    /**
     * Get the averageDocumentSize property: The average document size, or -1 if the average size is unknown.
     *
     * @return the averageDocumentSize value.
     */
    public long averageDocumentSize() {
        return this.averageDocumentSize;
    }

    /**
     * Set the averageDocumentSize property: The average document size, or -1 if the average size is unknown.
     *
     * @param averageDocumentSize the averageDocumentSize value to set.
     * @return the MongoDbObjectInfo object itself.
     */
    public MongoDbObjectInfo withAverageDocumentSize(long averageDocumentSize) {
        this.averageDocumentSize = averageDocumentSize;
        return this;
    }

    /**
     * Get the dataSize property: The estimated total data size, in bytes, or -1 if the size is unknown.
     *
     * @return the dataSize value.
     */
    public long dataSize() {
        return this.dataSize;
    }

    /**
     * Set the dataSize property: The estimated total data size, in bytes, or -1 if the size is unknown.
     *
     * @param dataSize the dataSize value to set.
     * @return the MongoDbObjectInfo object itself.
     */
    public MongoDbObjectInfo withDataSize(long dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * Get the documentCount property: The estimated total number of documents, or -1 if the document count is unknown.
     *
     * @return the documentCount value.
     */
    public long documentCount() {
        return this.documentCount;
    }

    /**
     * Set the documentCount property: The estimated total number of documents, or -1 if the document count is unknown.
     *
     * @param documentCount the documentCount value to set.
     * @return the MongoDbObjectInfo object itself.
     */
    public MongoDbObjectInfo withDocumentCount(long documentCount) {
        this.documentCount = documentCount;
        return this;
    }

    /**
     * Get the name property: The unqualified name of the database or collection.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The unqualified name of the database or collection.
     *
     * @param name the name value to set.
     * @return the MongoDbObjectInfo object itself.
     */
    public MongoDbObjectInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the qualifiedName property: The qualified name of the database or collection. For a collection, this is the
     * database-qualified name.
     *
     * @return the qualifiedName value.
     */
    public String qualifiedName() {
        return this.qualifiedName;
    }

    /**
     * Set the qualifiedName property: The qualified name of the database or collection. For a collection, this is the
     * database-qualified name.
     *
     * @param qualifiedName the qualifiedName value to set.
     * @return the MongoDbObjectInfo object itself.
     */
    public MongoDbObjectInfo withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model MongoDbObjectInfo"));
        }
        if (qualifiedName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property qualifiedName in model MongoDbObjectInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbObjectInfo.class);
}
