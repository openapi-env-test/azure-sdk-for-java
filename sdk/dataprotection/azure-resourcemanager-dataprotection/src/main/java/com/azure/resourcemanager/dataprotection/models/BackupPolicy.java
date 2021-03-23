// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Rule based backup policy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("BackupPolicy")
@Fluent
public final class BackupPolicy extends BaseBackupPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupPolicy.class);

    /*
     * Policy rule dictionary that contains rules for each backuptype i.e
     * Full/Incremental/Logs etc
     */
    @JsonProperty(value = "policyRules", required = true)
    private List<BasePolicyRule> policyRules;

    /**
     * Get the policyRules property: Policy rule dictionary that contains rules for each backuptype i.e
     * Full/Incremental/Logs etc.
     *
     * @return the policyRules value.
     */
    public List<BasePolicyRule> policyRules() {
        return this.policyRules;
    }

    /**
     * Set the policyRules property: Policy rule dictionary that contains rules for each backuptype i.e
     * Full/Incremental/Logs etc.
     *
     * @param policyRules the policyRules value to set.
     * @return the BackupPolicy object itself.
     */
    public BackupPolicy withPolicyRules(List<BasePolicyRule> policyRules) {
        this.policyRules = policyRules;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackupPolicy withDatasourceTypes(List<String> datasourceTypes) {
        super.withDatasourceTypes(datasourceTypes);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (policyRules() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property policyRules in model BackupPolicy"));
        } else {
            policyRules().forEach(e -> e.validate());
        }
    }
}
