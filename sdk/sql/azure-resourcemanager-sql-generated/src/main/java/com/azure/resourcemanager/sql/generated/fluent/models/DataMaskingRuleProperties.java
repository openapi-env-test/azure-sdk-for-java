// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.DataMaskingFunction;
import com.azure.resourcemanager.sql.generated.models.DataMaskingRuleState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a database data masking rule. */
@Fluent
public final class DataMaskingRuleProperties {
    /*
     * The rule Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The alias name. This is a legacy parameter and is no longer used.
     */
    @JsonProperty(value = "aliasName")
    private String aliasName;

    /*
     * The rule state. Used to delete a rule. To delete an existing rule,
     * specify the schemaName, tableName, columnName, maskingFunction, and
     * specify ruleState as disabled. However, if the rule doesn't already
     * exist, the rule will be created with ruleState set to enabled,
     * regardless of the provided value of ruleState.
     */
    @JsonProperty(value = "ruleState")
    private DataMaskingRuleState ruleState;

    /*
     * The schema name on which the data masking rule is applied.
     */
    @JsonProperty(value = "schemaName", required = true)
    private String schemaName;

    /*
     * The table name on which the data masking rule is applied.
     */
    @JsonProperty(value = "tableName", required = true)
    private String tableName;

    /*
     * The column name on which the data masking rule is applied.
     */
    @JsonProperty(value = "columnName", required = true)
    private String columnName;

    /*
     * The masking function that is used for the data masking rule.
     */
    @JsonProperty(value = "maskingFunction", required = true)
    private DataMaskingFunction maskingFunction;

    /*
     * The numberFrom property of the masking rule. Required if maskingFunction
     * is set to Number, otherwise this parameter will be ignored.
     */
    @JsonProperty(value = "numberFrom")
    private String numberFrom;

    /*
     * The numberTo property of the data masking rule. Required if
     * maskingFunction is set to Number, otherwise this parameter will be
     * ignored.
     */
    @JsonProperty(value = "numberTo")
    private String numberTo;

    /*
     * If maskingFunction is set to Text, the number of characters to show
     * unmasked in the beginning of the string. Otherwise, this parameter will
     * be ignored.
     */
    @JsonProperty(value = "prefixSize")
    private String prefixSize;

    /*
     * If maskingFunction is set to Text, the number of characters to show
     * unmasked at the end of the string. Otherwise, this parameter will be
     * ignored.
     */
    @JsonProperty(value = "suffixSize")
    private String suffixSize;

    /*
     * If maskingFunction is set to Text, the character to use for masking the
     * unexposed part of the string. Otherwise, this parameter will be ignored.
     */
    @JsonProperty(value = "replacementString")
    private String replacementString;

    /**
     * Get the id property: The rule Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the aliasName property: The alias name. This is a legacy parameter and is no longer used.
     *
     * @return the aliasName value.
     */
    public String aliasName() {
        return this.aliasName;
    }

    /**
     * Set the aliasName property: The alias name. This is a legacy parameter and is no longer used.
     *
     * @param aliasName the aliasName value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * Get the ruleState property: The rule state. Used to delete a rule. To delete an existing rule, specify the
     * schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled. However, if the rule
     * doesn't already exist, the rule will be created with ruleState set to enabled, regardless of the provided value
     * of ruleState.
     *
     * @return the ruleState value.
     */
    public DataMaskingRuleState ruleState() {
        return this.ruleState;
    }

    /**
     * Set the ruleState property: The rule state. Used to delete a rule. To delete an existing rule, specify the
     * schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled. However, if the rule
     * doesn't already exist, the rule will be created with ruleState set to enabled, regardless of the provided value
     * of ruleState.
     *
     * @param ruleState the ruleState value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withRuleState(DataMaskingRuleState ruleState) {
        this.ruleState = ruleState;
        return this;
    }

    /**
     * Get the schemaName property: The schema name on which the data masking rule is applied.
     *
     * @return the schemaName value.
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the schemaName property: The schema name on which the data masking rule is applied.
     *
     * @param schemaName the schemaName value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get the tableName property: The table name on which the data masking rule is applied.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The table name on which the data masking rule is applied.
     *
     * @param tableName the tableName value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the columnName property: The column name on which the data masking rule is applied.
     *
     * @return the columnName value.
     */
    public String columnName() {
        return this.columnName;
    }

    /**
     * Set the columnName property: The column name on which the data masking rule is applied.
     *
     * @param columnName the columnName value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Get the maskingFunction property: The masking function that is used for the data masking rule.
     *
     * @return the maskingFunction value.
     */
    public DataMaskingFunction maskingFunction() {
        return this.maskingFunction;
    }

    /**
     * Set the maskingFunction property: The masking function that is used for the data masking rule.
     *
     * @param maskingFunction the maskingFunction value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withMaskingFunction(DataMaskingFunction maskingFunction) {
        this.maskingFunction = maskingFunction;
        return this;
    }

    /**
     * Get the numberFrom property: The numberFrom property of the masking rule. Required if maskingFunction is set to
     * Number, otherwise this parameter will be ignored.
     *
     * @return the numberFrom value.
     */
    public String numberFrom() {
        return this.numberFrom;
    }

    /**
     * Set the numberFrom property: The numberFrom property of the masking rule. Required if maskingFunction is set to
     * Number, otherwise this parameter will be ignored.
     *
     * @param numberFrom the numberFrom value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withNumberFrom(String numberFrom) {
        this.numberFrom = numberFrom;
        return this;
    }

    /**
     * Get the numberTo property: The numberTo property of the data masking rule. Required if maskingFunction is set to
     * Number, otherwise this parameter will be ignored.
     *
     * @return the numberTo value.
     */
    public String numberTo() {
        return this.numberTo;
    }

    /**
     * Set the numberTo property: The numberTo property of the data masking rule. Required if maskingFunction is set to
     * Number, otherwise this parameter will be ignored.
     *
     * @param numberTo the numberTo value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withNumberTo(String numberTo) {
        this.numberTo = numberTo;
        return this;
    }

    /**
     * Get the prefixSize property: If maskingFunction is set to Text, the number of characters to show unmasked in the
     * beginning of the string. Otherwise, this parameter will be ignored.
     *
     * @return the prefixSize value.
     */
    public String prefixSize() {
        return this.prefixSize;
    }

    /**
     * Set the prefixSize property: If maskingFunction is set to Text, the number of characters to show unmasked in the
     * beginning of the string. Otherwise, this parameter will be ignored.
     *
     * @param prefixSize the prefixSize value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withPrefixSize(String prefixSize) {
        this.prefixSize = prefixSize;
        return this;
    }

    /**
     * Get the suffixSize property: If maskingFunction is set to Text, the number of characters to show unmasked at the
     * end of the string. Otherwise, this parameter will be ignored.
     *
     * @return the suffixSize value.
     */
    public String suffixSize() {
        return this.suffixSize;
    }

    /**
     * Set the suffixSize property: If maskingFunction is set to Text, the number of characters to show unmasked at the
     * end of the string. Otherwise, this parameter will be ignored.
     *
     * @param suffixSize the suffixSize value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withSuffixSize(String suffixSize) {
        this.suffixSize = suffixSize;
        return this;
    }

    /**
     * Get the replacementString property: If maskingFunction is set to Text, the character to use for masking the
     * unexposed part of the string. Otherwise, this parameter will be ignored.
     *
     * @return the replacementString value.
     */
    public String replacementString() {
        return this.replacementString;
    }

    /**
     * Set the replacementString property: If maskingFunction is set to Text, the character to use for masking the
     * unexposed part of the string. Otherwise, this parameter will be ignored.
     *
     * @param replacementString the replacementString value to set.
     * @return the DataMaskingRuleProperties object itself.
     */
    public DataMaskingRuleProperties withReplacementString(String replacementString) {
        this.replacementString = replacementString;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schemaName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property schemaName in model DataMaskingRuleProperties"));
        }
        if (tableName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property tableName in model DataMaskingRuleProperties"));
        }
        if (columnName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property columnName in model DataMaskingRuleProperties"));
        }
        if (maskingFunction() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property maskingFunction in model DataMaskingRuleProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataMaskingRuleProperties.class);
}
