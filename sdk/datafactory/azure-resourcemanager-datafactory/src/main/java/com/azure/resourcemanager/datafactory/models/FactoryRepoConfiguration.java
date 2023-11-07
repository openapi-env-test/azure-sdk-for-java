// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Factory's git repo information. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = FactoryRepoConfiguration.class)
@JsonTypeName("FactoryRepoConfiguration")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FactoryVSTSConfiguration", value = FactoryVstsConfiguration.class),
    @JsonSubTypes.Type(name = "FactoryGitHubConfiguration", value = FactoryGitHubConfiguration.class)
})
@Fluent
public class FactoryRepoConfiguration {
    /*
     * Account name.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /*
     * Repository name.
     */
    @JsonProperty(value = "repositoryName", required = true)
    private String repositoryName;

    /*
     * Collaboration branch.
     */
    @JsonProperty(value = "collaborationBranch", required = true)
    private String collaborationBranch;

    /*
     * Root folder.
     */
    @JsonProperty(value = "rootFolder", required = true)
    private String rootFolder;

    /*
     * Last commit id.
     */
    @JsonProperty(value = "lastCommitId")
    private String lastCommitId;

    /** Creates an instance of FactoryRepoConfiguration class. */
    public FactoryRepoConfiguration() {
    }

    /**
     * Get the accountName property: Account name.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Account name.
     *
     * @param accountName the accountName value to set.
     * @return the FactoryRepoConfiguration object itself.
     */
    public FactoryRepoConfiguration withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the repositoryName property: Repository name.
     *
     * @return the repositoryName value.
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    /**
     * Set the repositoryName property: Repository name.
     *
     * @param repositoryName the repositoryName value to set.
     * @return the FactoryRepoConfiguration object itself.
     */
    public FactoryRepoConfiguration withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * Get the collaborationBranch property: Collaboration branch.
     *
     * @return the collaborationBranch value.
     */
    public String collaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * Set the collaborationBranch property: Collaboration branch.
     *
     * @param collaborationBranch the collaborationBranch value to set.
     * @return the FactoryRepoConfiguration object itself.
     */
    public FactoryRepoConfiguration withCollaborationBranch(String collaborationBranch) {
        this.collaborationBranch = collaborationBranch;
        return this;
    }

    /**
     * Get the rootFolder property: Root folder.
     *
     * @return the rootFolder value.
     */
    public String rootFolder() {
        return this.rootFolder;
    }

    /**
     * Set the rootFolder property: Root folder.
     *
     * @param rootFolder the rootFolder value to set.
     * @return the FactoryRepoConfiguration object itself.
     */
    public FactoryRepoConfiguration withRootFolder(String rootFolder) {
        this.rootFolder = rootFolder;
        return this;
    }

    /**
     * Get the lastCommitId property: Last commit id.
     *
     * @return the lastCommitId value.
     */
    public String lastCommitId() {
        return this.lastCommitId;
    }

    /**
     * Set the lastCommitId property: Last commit id.
     *
     * @param lastCommitId the lastCommitId value to set.
     * @return the FactoryRepoConfiguration object itself.
     */
    public FactoryRepoConfiguration withLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accountName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property accountName in model FactoryRepoConfiguration"));
        }
        if (repositoryName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property repositoryName in model FactoryRepoConfiguration"));
        }
        if (collaborationBranch() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property collaborationBranch in model FactoryRepoConfiguration"));
        }
        if (rootFolder() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property rootFolder in model FactoryRepoConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FactoryRepoConfiguration.class);
}
