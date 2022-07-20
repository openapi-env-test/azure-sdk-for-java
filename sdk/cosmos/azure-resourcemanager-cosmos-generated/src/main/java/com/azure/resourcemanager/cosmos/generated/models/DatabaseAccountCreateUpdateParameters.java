// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseAccountCreateUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Parameters to create and update Cosmos DB database accounts. */
@Fluent
public final class DatabaseAccountCreateUpdateParameters extends ArmResourceProperties {
    /*
     * Indicates the type of database account. This can only be set at database
     * account creation.
     */
    @JsonProperty(value = "kind")
    private DatabaseAccountKind kind;

    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Properties to create and update Azure Cosmos DB database accounts.
     */
    @JsonProperty(value = "properties", required = true)
    private DatabaseAccountCreateUpdateProperties innerProperties = new DatabaseAccountCreateUpdateProperties();

    /**
     * Get the kind property: Indicates the type of database account. This can only be set at database account creation.
     *
     * @return the kind value.
     */
    public DatabaseAccountKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Indicates the type of database account. This can only be set at database account creation.
     *
     * @param kind the kind value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withKind(DatabaseAccountKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     *
     * @param identity the identity value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: Properties to create and update Azure Cosmos DB database accounts.
     *
     * @return the innerProperties value.
     */
    private DatabaseAccountCreateUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DatabaseAccountCreateUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabaseAccountCreateUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the consistencyPolicy property: The consistency policy for the Cosmos DB account.
     *
     * @return the consistencyPolicy value.
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().consistencyPolicy();
    }

    /**
     * Set the consistencyPolicy property: The consistency policy for the Cosmos DB account.
     *
     * @param consistencyPolicy the consistencyPolicy value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withConsistencyPolicy(consistencyPolicy);
        return this;
    }

    /**
     * Get the locations property: An array that contains the georeplication locations enabled for the Cosmos DB
     * account.
     *
     * @return the locations value.
     */
    public List<Location> locations() {
        return this.innerProperties() == null ? null : this.innerProperties().locations();
    }

    /**
     * Set the locations property: An array that contains the georeplication locations enabled for the Cosmos DB
     * account.
     *
     * @param locations the locations value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withLocations(List<Location> locations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withLocations(locations);
        return this;
    }

    /**
     * Get the databaseAccountOfferType property: The offer type for the database.
     *
     * @return the databaseAccountOfferType value.
     */
    public String databaseAccountOfferType() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseAccountOfferType();
    }

    /**
     * Set the databaseAccountOfferType property: The offer type for the database.
     *
     * @param databaseAccountOfferType the databaseAccountOfferType value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withDatabaseAccountOfferType(String databaseAccountOfferType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withDatabaseAccountOfferType(databaseAccountOfferType);
        return this;
    }

    /**
     * Get the ipRules property: List of IpRules.
     *
     * @return the ipRules value.
     */
    public List<IpAddressOrRange> ipRules() {
        return this.innerProperties() == null ? null : this.innerProperties().ipRules();
    }

    /**
     * Set the ipRules property: List of IpRules.
     *
     * @param ipRules the ipRules value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withIpRules(List<IpAddressOrRange> ipRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withIpRules(ipRules);
        return this;
    }

    /**
     * Get the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @return the isVirtualNetworkFilterEnabled value.
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isVirtualNetworkFilterEnabled();
    }

    /**
     * Set the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withIsVirtualNetworkFilterEnabled(
        Boolean isVirtualNetworkFilterEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withIsVirtualNetworkFilterEnabled(isVirtualNetworkFilterEnabled);
        return this;
    }

    /**
     * Get the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @return the enableAutomaticFailover value.
     */
    public Boolean enableAutomaticFailover() {
        return this.innerProperties() == null ? null : this.innerProperties().enableAutomaticFailover();
    }

    /**
     * Set the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @param enableAutomaticFailover the enableAutomaticFailover value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withEnableAutomaticFailover(enableAutomaticFailover);
        return this;
    }

    /**
     * Get the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @return the capabilities value.
     */
    public List<Capability> capabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().capabilities();
    }

    /**
     * Set the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @param capabilities the capabilities value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withCapabilities(List<Capability> capabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withCapabilities(capabilities);
        return this;
    }

    /**
     * Get the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkRules();
    }

    /**
     * Set the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withVirtualNetworkRules(virtualNetworkRules);
        return this;
    }

    /**
     * Get the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @return the enableMultipleWriteLocations value.
     */
    public Boolean enableMultipleWriteLocations() {
        return this.innerProperties() == null ? null : this.innerProperties().enableMultipleWriteLocations();
    }

    /**
     * Set the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @param enableMultipleWriteLocations the enableMultipleWriteLocations value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withEnableMultipleWriteLocations(
        Boolean enableMultipleWriteLocations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withEnableMultipleWriteLocations(enableMultipleWriteLocations);
        return this;
    }

    /**
     * Get the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @return the enableCassandraConnector value.
     */
    public Boolean enableCassandraConnector() {
        return this.innerProperties() == null ? null : this.innerProperties().enableCassandraConnector();
    }

    /**
     * Set the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @param enableCassandraConnector the enableCassandraConnector value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withEnableCassandraConnector(Boolean enableCassandraConnector) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withEnableCassandraConnector(enableCassandraConnector);
        return this;
    }

    /**
     * Get the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @return the connectorOffer value.
     */
    public ConnectorOffer connectorOffer() {
        return this.innerProperties() == null ? null : this.innerProperties().connectorOffer();
    }

    /**
     * Set the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @param connectorOffer the connectorOffer value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withConnectorOffer(ConnectorOffer connectorOffer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withConnectorOffer(connectorOffer);
        return this;
    }

    /**
     * Get the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @return the disableKeyBasedMetadataWriteAccess value.
     */
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().disableKeyBasedMetadataWriteAccess();
    }

    /**
     * Set the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @param disableKeyBasedMetadataWriteAccess the disableKeyBasedMetadataWriteAccess value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withDisableKeyBasedMetadataWriteAccess(
        Boolean disableKeyBasedMetadataWriteAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withDisableKeyBasedMetadataWriteAccess(disableKeyBasedMetadataWriteAccess);
        return this;
    }

    /**
     * Get the keyVaultKeyUri property: The URI of the key vault.
     *
     * @return the keyVaultKeyUri value.
     */
    public String keyVaultKeyUri() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultKeyUri();
    }

    /**
     * Set the keyVaultKeyUri property: The URI of the key vault.
     *
     * @param keyVaultKeyUri the keyVaultKeyUri value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withKeyVaultKeyUri(String keyVaultKeyUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withKeyVaultKeyUri(keyVaultKeyUri);
        return this;
    }

    /**
     * Get the defaultIdentity property: The default identity for accessing key vault used in features like customer
     * managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity",
     * "SystemAssignedIdentity" and more.
     *
     * @return the defaultIdentity value.
     */
    public String defaultIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultIdentity();
    }

    /**
     * Set the defaultIdentity property: The default identity for accessing key vault used in features like customer
     * managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity",
     * "SystemAssignedIdentity" and more.
     *
     * @param defaultIdentity the defaultIdentity value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withDefaultIdentity(String defaultIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withDefaultIdentity(defaultIdentity);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @return the enableFreeTier value.
     */
    public Boolean enableFreeTier() {
        return this.innerProperties() == null ? null : this.innerProperties().enableFreeTier();
    }

    /**
     * Set the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @param enableFreeTier the enableFreeTier value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withEnableFreeTier(Boolean enableFreeTier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withEnableFreeTier(enableFreeTier);
        return this;
    }

    /**
     * Get the apiProperties property: API specific properties. Currently, supported only for MongoDB API.
     *
     * @return the apiProperties value.
     */
    public ApiProperties apiProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().apiProperties();
    }

    /**
     * Set the apiProperties property: API specific properties. Currently, supported only for MongoDB API.
     *
     * @param apiProperties the apiProperties value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withApiProperties(ApiProperties apiProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withApiProperties(apiProperties);
        return this;
    }

    /**
     * Get the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @return the enableAnalyticalStorage value.
     */
    public Boolean enableAnalyticalStorage() {
        return this.innerProperties() == null ? null : this.innerProperties().enableAnalyticalStorage();
    }

    /**
     * Set the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @param enableAnalyticalStorage the enableAnalyticalStorage value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withEnableAnalyticalStorage(Boolean enableAnalyticalStorage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withEnableAnalyticalStorage(enableAnalyticalStorage);
        return this;
    }

    /**
     * Get the analyticalStorageConfiguration property: Analytical storage specific properties.
     *
     * @return the analyticalStorageConfiguration value.
     */
    public AnalyticalStorageConfiguration analyticalStorageConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().analyticalStorageConfiguration();
    }

    /**
     * Set the analyticalStorageConfiguration property: Analytical storage specific properties.
     *
     * @param analyticalStorageConfiguration the analyticalStorageConfiguration value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withAnalyticalStorageConfiguration(
        AnalyticalStorageConfiguration analyticalStorageConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withAnalyticalStorageConfiguration(analyticalStorageConfiguration);
        return this;
    }

    /**
     * Get the createMode property: Enum to indicate the mode of account creation.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.innerProperties() == null ? null : this.innerProperties().createMode();
    }

    /**
     * Set the createMode property: Enum to indicate the mode of account creation.
     *
     * @param createMode the createMode value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withCreateMode(CreateMode createMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withCreateMode(createMode);
        return this;
    }

    /**
     * Get the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @return the backupPolicy value.
     */
    public BackupPolicy backupPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().backupPolicy();
    }

    /**
     * Set the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @param backupPolicy the backupPolicy value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withBackupPolicy(BackupPolicy backupPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withBackupPolicy(backupPolicy);
        return this;
    }

    /**
     * Get the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @return the cors value.
     */
    public List<CorsPolicy> cors() {
        return this.innerProperties() == null ? null : this.innerProperties().cors();
    }

    /**
     * Set the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @param cors the cors value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withCors(List<CorsPolicy> cors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withCors(cors);
        return this;
    }

    /**
     * Get the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     *
     * @return the networkAclBypass value.
     */
    public NetworkAclBypass networkAclBypass() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAclBypass();
    }

    /**
     * Set the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     *
     * @param networkAclBypass the networkAclBypass value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withNetworkAclBypass(NetworkAclBypass networkAclBypass) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withNetworkAclBypass(networkAclBypass);
        return this;
    }

    /**
     * Get the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     *
     * @return the networkAclBypassResourceIds value.
     */
    public List<String> networkAclBypassResourceIds() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAclBypassResourceIds();
    }

    /**
     * Set the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     *
     * @param networkAclBypassResourceIds the networkAclBypassResourceIds value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withNetworkAclBypassResourceIds(
        List<String> networkAclBypassResourceIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withNetworkAclBypassResourceIds(networkAclBypassResourceIds);
        return this;
    }

    /**
     * Get the disableLocalAuth property: Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAuth();
    }

    /**
     * Set the disableLocalAuth property: Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Get the restoreParameters property: Parameters to indicate the information about the restore.
     *
     * @return the restoreParameters value.
     */
    public RestoreParameters restoreParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().restoreParameters();
    }

    /**
     * Set the restoreParameters property: Parameters to indicate the information about the restore.
     *
     * @param restoreParameters the restoreParameters value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withRestoreParameters(RestoreParameters restoreParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withRestoreParameters(restoreParameters);
        return this;
    }

    /**
     * Get the capacity property: The object that represents all properties related to capacity enforcement on an
     * account.
     *
     * @return the capacity value.
     */
    public Capacity capacity() {
        return this.innerProperties() == null ? null : this.innerProperties().capacity();
    }

    /**
     * Set the capacity property: The object that represents all properties related to capacity enforcement on an
     * account.
     *
     * @param capacity the capacity value to set.
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withCapacity(Capacity capacity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseAccountCreateUpdateProperties();
        }
        this.innerProperties().withCapacity(capacity);
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
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model DatabaseAccountCreateUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabaseAccountCreateUpdateParameters.class);
}
