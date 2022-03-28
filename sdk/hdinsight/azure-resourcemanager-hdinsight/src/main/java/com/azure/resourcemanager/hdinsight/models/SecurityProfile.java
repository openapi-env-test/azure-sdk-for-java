// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The security profile which contains Ssh public key for the HDInsight cluster. */
@Fluent
public final class SecurityProfile {
    /*
     * The directory type.
     */
    @JsonProperty(value = "directoryType")
    private DirectoryType directoryType;

    /*
     * The organization's active directory domain.
     */
    @JsonProperty(value = "domain")
    private String domain;

    /*
     * The organizational unit within the Active Directory to place the cluster
     * and service accounts.
     */
    @JsonProperty(value = "organizationalUnitDN")
    private String organizationalUnitDN;

    /*
     * The LDAPS protocol URLs to communicate with the Active Directory.
     */
    @JsonProperty(value = "ldapsUrls")
    private List<String> ldapsUrls;

    /*
     * The domain user account that will have admin privileges on the cluster.
     */
    @JsonProperty(value = "domainUsername")
    private String domainUsername;

    /*
     * The domain admin password.
     */
    @JsonProperty(value = "domainUserPassword")
    private String domainUserPassword;

    /*
     * Optional. The Distinguished Names for cluster user groups
     */
    @JsonProperty(value = "clusterUsersGroupDNs")
    private List<String> clusterUsersGroupDNs;

    /*
     * The resource ID of the user's Azure Active Directory Domain Service.
     */
    @JsonProperty(value = "aaddsResourceId")
    private String aaddsResourceId;

    /*
     * User assigned identity that has permissions to read and create
     * cluster-related artifacts in the user's AADDS.
     */
    @JsonProperty(value = "msiResourceId")
    private String msiResourceId;

    /**
     * Get the directoryType property: The directory type.
     *
     * @return the directoryType value.
     */
    public DirectoryType directoryType() {
        return this.directoryType;
    }

    /**
     * Set the directoryType property: The directory type.
     *
     * @param directoryType the directoryType value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withDirectoryType(DirectoryType directoryType) {
        this.directoryType = directoryType;
        return this;
    }

    /**
     * Get the domain property: The organization's active directory domain.
     *
     * @return the domain value.
     */
    public String domain() {
        return this.domain;
    }

    /**
     * Set the domain property: The organization's active directory domain.
     *
     * @param domain the domain value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the organizationalUnitDN property: The organizational unit within the Active Directory to place the cluster
     * and service accounts.
     *
     * @return the organizationalUnitDN value.
     */
    public String organizationalUnitDN() {
        return this.organizationalUnitDN;
    }

    /**
     * Set the organizationalUnitDN property: The organizational unit within the Active Directory to place the cluster
     * and service accounts.
     *
     * @param organizationalUnitDN the organizationalUnitDN value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withOrganizationalUnitDN(String organizationalUnitDN) {
        this.organizationalUnitDN = organizationalUnitDN;
        return this;
    }

    /**
     * Get the ldapsUrls property: The LDAPS protocol URLs to communicate with the Active Directory.
     *
     * @return the ldapsUrls value.
     */
    public List<String> ldapsUrls() {
        return this.ldapsUrls;
    }

    /**
     * Set the ldapsUrls property: The LDAPS protocol URLs to communicate with the Active Directory.
     *
     * @param ldapsUrls the ldapsUrls value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withLdapsUrls(List<String> ldapsUrls) {
        this.ldapsUrls = ldapsUrls;
        return this;
    }

    /**
     * Get the domainUsername property: The domain user account that will have admin privileges on the cluster.
     *
     * @return the domainUsername value.
     */
    public String domainUsername() {
        return this.domainUsername;
    }

    /**
     * Set the domainUsername property: The domain user account that will have admin privileges on the cluster.
     *
     * @param domainUsername the domainUsername value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withDomainUsername(String domainUsername) {
        this.domainUsername = domainUsername;
        return this;
    }

    /**
     * Get the domainUserPassword property: The domain admin password.
     *
     * @return the domainUserPassword value.
     */
    public String domainUserPassword() {
        return this.domainUserPassword;
    }

    /**
     * Set the domainUserPassword property: The domain admin password.
     *
     * @param domainUserPassword the domainUserPassword value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withDomainUserPassword(String domainUserPassword) {
        this.domainUserPassword = domainUserPassword;
        return this;
    }

    /**
     * Get the clusterUsersGroupDNs property: Optional. The Distinguished Names for cluster user groups.
     *
     * @return the clusterUsersGroupDNs value.
     */
    public List<String> clusterUsersGroupDNs() {
        return this.clusterUsersGroupDNs;
    }

    /**
     * Set the clusterUsersGroupDNs property: Optional. The Distinguished Names for cluster user groups.
     *
     * @param clusterUsersGroupDNs the clusterUsersGroupDNs value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withClusterUsersGroupDNs(List<String> clusterUsersGroupDNs) {
        this.clusterUsersGroupDNs = clusterUsersGroupDNs;
        return this;
    }

    /**
     * Get the aaddsResourceId property: The resource ID of the user's Azure Active Directory Domain Service.
     *
     * @return the aaddsResourceId value.
     */
    public String aaddsResourceId() {
        return this.aaddsResourceId;
    }

    /**
     * Set the aaddsResourceId property: The resource ID of the user's Azure Active Directory Domain Service.
     *
     * @param aaddsResourceId the aaddsResourceId value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withAaddsResourceId(String aaddsResourceId) {
        this.aaddsResourceId = aaddsResourceId;
        return this;
    }

    /**
     * Get the msiResourceId property: User assigned identity that has permissions to read and create cluster-related
     * artifacts in the user's AADDS.
     *
     * @return the msiResourceId value.
     */
    public String msiResourceId() {
        return this.msiResourceId;
    }

    /**
     * Set the msiResourceId property: User assigned identity that has permissions to read and create cluster-related
     * artifacts in the user's AADDS.
     *
     * @param msiResourceId the msiResourceId value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withMsiResourceId(String msiResourceId) {
        this.msiResourceId = msiResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
