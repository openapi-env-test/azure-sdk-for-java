// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.Map;

/** Base class for MongoDB migration outputs. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "resultType",
    defaultImpl = MongoDbProgress.class)
@JsonTypeName("MongoDbProgress")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Collection", value = MongoDbCollectionProgress.class),
    @JsonSubTypes.Type(name = "Database", value = MongoDbDatabaseProgress.class),
    @JsonSubTypes.Type(name = "Migration", value = MongoDbMigrationProgress.class)
})
@Fluent
public class MongoDbProgress {
    /*
     * The number of document bytes copied during the Copying stage
     */
    @JsonProperty(value = "bytesCopied", required = true)
    private long bytesCopied;

    /*
     * The number of documents copied during the Copying stage
     */
    @JsonProperty(value = "documentsCopied", required = true)
    private long documentsCopied;

    /*
     * The elapsed time in the format [ddd.]hh:mm:ss[.fffffff] (i.e. TimeSpan
     * format)
     */
    @JsonProperty(value = "elapsedTime", required = true)
    private String elapsedTime;

    /*
     * The errors and warnings that have occurred for the current object. The
     * keys are the error codes.
     */
    @JsonProperty(value = "errors", required = true)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, MongoDbError> errors;

    /*
     * The number of oplog events awaiting replay
     */
    @JsonProperty(value = "eventsPending", required = true)
    private long eventsPending;

    /*
     * The number of oplog events replayed so far
     */
    @JsonProperty(value = "eventsReplayed", required = true)
    private long eventsReplayed;

    /*
     * The timestamp of the last oplog event received, or null if no oplog
     * event has been received yet
     */
    @JsonProperty(value = "lastEventTime")
    private OffsetDateTime lastEventTime;

    /*
     * The timestamp of the last oplog event replayed, or null if no oplog
     * event has been replayed yet
     */
    @JsonProperty(value = "lastReplayTime")
    private OffsetDateTime lastReplayTime;

    /*
     * The name of the progress object. For a collection, this is the
     * unqualified collection name. For a database, this is the database name.
     * For the overall migration, this is null.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The qualified name of the progress object. For a collection, this is the
     * database-qualified name. For a database, this is the database name. For
     * the overall migration, this is null.
     */
    @JsonProperty(value = "qualifiedName")
    private String qualifiedName;

    /*
     * The state property.
     */
    @JsonProperty(value = "state", required = true)
    private MongoDbMigrationState state;

    /*
     * The total number of document bytes on the source at the beginning of the
     * Copying stage, or -1 if the total size was unknown
     */
    @JsonProperty(value = "totalBytes", required = true)
    private long totalBytes;

    /*
     * The total number of documents on the source at the beginning of the
     * Copying stage, or -1 if the total count was unknown
     */
    @JsonProperty(value = "totalDocuments", required = true)
    private long totalDocuments;

    /**
     * Get the bytesCopied property: The number of document bytes copied during the Copying stage.
     *
     * @return the bytesCopied value.
     */
    public long bytesCopied() {
        return this.bytesCopied;
    }

    /**
     * Set the bytesCopied property: The number of document bytes copied during the Copying stage.
     *
     * @param bytesCopied the bytesCopied value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withBytesCopied(long bytesCopied) {
        this.bytesCopied = bytesCopied;
        return this;
    }

    /**
     * Get the documentsCopied property: The number of documents copied during the Copying stage.
     *
     * @return the documentsCopied value.
     */
    public long documentsCopied() {
        return this.documentsCopied;
    }

    /**
     * Set the documentsCopied property: The number of documents copied during the Copying stage.
     *
     * @param documentsCopied the documentsCopied value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withDocumentsCopied(long documentsCopied) {
        this.documentsCopied = documentsCopied;
        return this;
    }

    /**
     * Get the elapsedTime property: The elapsed time in the format [ddd.]hh:mm:ss[.fffffff] (i.e. TimeSpan format).
     *
     * @return the elapsedTime value.
     */
    public String elapsedTime() {
        return this.elapsedTime;
    }

    /**
     * Set the elapsedTime property: The elapsed time in the format [ddd.]hh:mm:ss[.fffffff] (i.e. TimeSpan format).
     *
     * @param elapsedTime the elapsedTime value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    /**
     * Get the errors property: The errors and warnings that have occurred for the current object. The keys are the
     * error codes.
     *
     * @return the errors value.
     */
    public Map<String, MongoDbError> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: The errors and warnings that have occurred for the current object. The keys are the
     * error codes.
     *
     * @param errors the errors value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withErrors(Map<String, MongoDbError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the eventsPending property: The number of oplog events awaiting replay.
     *
     * @return the eventsPending value.
     */
    public long eventsPending() {
        return this.eventsPending;
    }

    /**
     * Set the eventsPending property: The number of oplog events awaiting replay.
     *
     * @param eventsPending the eventsPending value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withEventsPending(long eventsPending) {
        this.eventsPending = eventsPending;
        return this;
    }

    /**
     * Get the eventsReplayed property: The number of oplog events replayed so far.
     *
     * @return the eventsReplayed value.
     */
    public long eventsReplayed() {
        return this.eventsReplayed;
    }

    /**
     * Set the eventsReplayed property: The number of oplog events replayed so far.
     *
     * @param eventsReplayed the eventsReplayed value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withEventsReplayed(long eventsReplayed) {
        this.eventsReplayed = eventsReplayed;
        return this;
    }

    /**
     * Get the lastEventTime property: The timestamp of the last oplog event received, or null if no oplog event has
     * been received yet.
     *
     * @return the lastEventTime value.
     */
    public OffsetDateTime lastEventTime() {
        return this.lastEventTime;
    }

    /**
     * Set the lastEventTime property: The timestamp of the last oplog event received, or null if no oplog event has
     * been received yet.
     *
     * @param lastEventTime the lastEventTime value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withLastEventTime(OffsetDateTime lastEventTime) {
        this.lastEventTime = lastEventTime;
        return this;
    }

    /**
     * Get the lastReplayTime property: The timestamp of the last oplog event replayed, or null if no oplog event has
     * been replayed yet.
     *
     * @return the lastReplayTime value.
     */
    public OffsetDateTime lastReplayTime() {
        return this.lastReplayTime;
    }

    /**
     * Set the lastReplayTime property: The timestamp of the last oplog event replayed, or null if no oplog event has
     * been replayed yet.
     *
     * @param lastReplayTime the lastReplayTime value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withLastReplayTime(OffsetDateTime lastReplayTime) {
        this.lastReplayTime = lastReplayTime;
        return this;
    }

    /**
     * Get the name property: The name of the progress object. For a collection, this is the unqualified collection
     * name. For a database, this is the database name. For the overall migration, this is null.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the progress object. For a collection, this is the unqualified collection
     * name. For a database, this is the database name. For the overall migration, this is null.
     *
     * @param name the name value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the qualifiedName property: The qualified name of the progress object. For a collection, this is the
     * database-qualified name. For a database, this is the database name. For the overall migration, this is null.
     *
     * @return the qualifiedName value.
     */
    public String qualifiedName() {
        return this.qualifiedName;
    }

    /**
     * Set the qualifiedName property: The qualified name of the progress object. For a collection, this is the
     * database-qualified name. For a database, this is the database name. For the overall migration, this is null.
     *
     * @param qualifiedName the qualifiedName value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    public MongoDbMigrationState state() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     *
     * @param state the state value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withState(MongoDbMigrationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the totalBytes property: The total number of document bytes on the source at the beginning of the Copying
     * stage, or -1 if the total size was unknown.
     *
     * @return the totalBytes value.
     */
    public long totalBytes() {
        return this.totalBytes;
    }

    /**
     * Set the totalBytes property: The total number of document bytes on the source at the beginning of the Copying
     * stage, or -1 if the total size was unknown.
     *
     * @param totalBytes the totalBytes value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withTotalBytes(long totalBytes) {
        this.totalBytes = totalBytes;
        return this;
    }

    /**
     * Get the totalDocuments property: The total number of documents on the source at the beginning of the Copying
     * stage, or -1 if the total count was unknown.
     *
     * @return the totalDocuments value.
     */
    public long totalDocuments() {
        return this.totalDocuments;
    }

    /**
     * Set the totalDocuments property: The total number of documents on the source at the beginning of the Copying
     * stage, or -1 if the total count was unknown.
     *
     * @param totalDocuments the totalDocuments value to set.
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withTotalDocuments(long totalDocuments) {
        this.totalDocuments = totalDocuments;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (elapsedTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property elapsedTime in model MongoDbProgress"));
        }
        if (errors() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property errors in model MongoDbProgress"));
        } else {
            errors()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (state() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property state in model MongoDbProgress"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbProgress.class);
}
