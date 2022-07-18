// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** Store the fabric details specific to the VMware fabric. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMware")
@Fluent
public final class VMwareDetails extends FabricSpecificDetails {
    /*
     * The list of Process Servers associated with the fabric.
     */
    @JsonProperty(value = "processServers")
    private List<ProcessServer> processServers;

    /*
     * The list of Master Target servers associated with the fabric.
     */
    @JsonProperty(value = "masterTargetServers")
    private List<MasterTargetServer> masterTargetServers;

    /*
     * The list of run as accounts created on the server.
     */
    @JsonProperty(value = "runAsAccounts")
    private List<RunAsAccount> runAsAccounts;

    /*
     * The number of replication pairs configured in this CS.
     */
    @JsonProperty(value = "replicationPairCount")
    private String replicationPairCount;

    /*
     * The number of process servers.
     */
    @JsonProperty(value = "processServerCount")
    private String processServerCount;

    /*
     * The number of source and target servers configured to talk to this CS.
     */
    @JsonProperty(value = "agentCount")
    private String agentCount;

    /*
     * The number of protected servers.
     */
    @JsonProperty(value = "protectedServers")
    private String protectedServers;

    /*
     * The percentage of the system load.
     */
    @JsonProperty(value = "systemLoad")
    private String systemLoad;

    /*
     * The system load status.
     */
    @JsonProperty(value = "systemLoadStatus")
    private String systemLoadStatus;

    /*
     * The percentage of the CPU load.
     */
    @JsonProperty(value = "cpuLoad")
    private String cpuLoad;

    /*
     * The CPU load status.
     */
    @JsonProperty(value = "cpuLoadStatus")
    private String cpuLoadStatus;

    /*
     * The total memory.
     */
    @JsonProperty(value = "totalMemoryInBytes")
    private Long totalMemoryInBytes;

    /*
     * The available memory.
     */
    @JsonProperty(value = "availableMemoryInBytes")
    private Long availableMemoryInBytes;

    /*
     * The memory usage status.
     */
    @JsonProperty(value = "memoryUsageStatus")
    private String memoryUsageStatus;

    /*
     * The total space.
     */
    @JsonProperty(value = "totalSpaceInBytes")
    private Long totalSpaceInBytes;

    /*
     * The available space.
     */
    @JsonProperty(value = "availableSpaceInBytes")
    private Long availableSpaceInBytes;

    /*
     * The space usage status.
     */
    @JsonProperty(value = "spaceUsageStatus")
    private String spaceUsageStatus;

    /*
     * The web load.
     */
    @JsonProperty(value = "webLoad")
    private String webLoad;

    /*
     * The web load status.
     */
    @JsonProperty(value = "webLoadStatus")
    private String webLoadStatus;

    /*
     * The database server load.
     */
    @JsonProperty(value = "databaseServerLoad")
    private String databaseServerLoad;

    /*
     * The database server load status.
     */
    @JsonProperty(value = "databaseServerLoadStatus")
    private String databaseServerLoadStatus;

    /*
     * The CS service status.
     */
    @JsonProperty(value = "csServiceStatus")
    private String csServiceStatus;

    /*
     * The IP address.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * The agent Version.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /*
     * The host name.
     */
    @JsonProperty(value = "hostName")
    private String hostname;

    /*
     * The last heartbeat received from CS server.
     */
    @JsonProperty(value = "lastHeartbeat")
    private OffsetDateTime lastHeartbeat;

    /*
     * Version status.
     */
    @JsonProperty(value = "versionStatus")
    private String versionStatus;

    /*
     * CS SSL cert expiry date.
     */
    @JsonProperty(value = "sslCertExpiryDate")
    private OffsetDateTime sslCertExpiryDate;

    /*
     * CS SSL cert expiry date.
     */
    @JsonProperty(value = "sslCertExpiryRemainingDays")
    private Integer sslCertExpiryRemainingDays;

    /*
     * PS template version.
     */
    @JsonProperty(value = "psTemplateVersion")
    private String psTemplateVersion;

    /*
     * Agent expiry date.
     */
    @JsonProperty(value = "agentExpiryDate")
    private OffsetDateTime agentExpiryDate;

    /*
     * The agent version details.
     */
    @JsonProperty(value = "agentVersionDetails")
    private VersionDetails agentVersionDetails;

    /*
     * The switch provider blocking error information.
     */
    @JsonProperty(value = "switchProviderBlockingErrorDetails")
    private List<InMageFabricSwitchProviderBlockingErrorDetails> switchProviderBlockingErrorDetails;

    /**
     * Get the processServers property: The list of Process Servers associated with the fabric.
     *
     * @return the processServers value.
     */
    public List<ProcessServer> processServers() {
        return this.processServers;
    }

    /**
     * Set the processServers property: The list of Process Servers associated with the fabric.
     *
     * @param processServers the processServers value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withProcessServers(List<ProcessServer> processServers) {
        this.processServers = processServers;
        return this;
    }

    /**
     * Get the masterTargetServers property: The list of Master Target servers associated with the fabric.
     *
     * @return the masterTargetServers value.
     */
    public List<MasterTargetServer> masterTargetServers() {
        return this.masterTargetServers;
    }

    /**
     * Set the masterTargetServers property: The list of Master Target servers associated with the fabric.
     *
     * @param masterTargetServers the masterTargetServers value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withMasterTargetServers(List<MasterTargetServer> masterTargetServers) {
        this.masterTargetServers = masterTargetServers;
        return this;
    }

    /**
     * Get the runAsAccounts property: The list of run as accounts created on the server.
     *
     * @return the runAsAccounts value.
     */
    public List<RunAsAccount> runAsAccounts() {
        return this.runAsAccounts;
    }

    /**
     * Set the runAsAccounts property: The list of run as accounts created on the server.
     *
     * @param runAsAccounts the runAsAccounts value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withRunAsAccounts(List<RunAsAccount> runAsAccounts) {
        this.runAsAccounts = runAsAccounts;
        return this;
    }

    /**
     * Get the replicationPairCount property: The number of replication pairs configured in this CS.
     *
     * @return the replicationPairCount value.
     */
    public String replicationPairCount() {
        return this.replicationPairCount;
    }

    /**
     * Set the replicationPairCount property: The number of replication pairs configured in this CS.
     *
     * @param replicationPairCount the replicationPairCount value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withReplicationPairCount(String replicationPairCount) {
        this.replicationPairCount = replicationPairCount;
        return this;
    }

    /**
     * Get the processServerCount property: The number of process servers.
     *
     * @return the processServerCount value.
     */
    public String processServerCount() {
        return this.processServerCount;
    }

    /**
     * Set the processServerCount property: The number of process servers.
     *
     * @param processServerCount the processServerCount value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withProcessServerCount(String processServerCount) {
        this.processServerCount = processServerCount;
        return this;
    }

    /**
     * Get the agentCount property: The number of source and target servers configured to talk to this CS.
     *
     * @return the agentCount value.
     */
    public String agentCount() {
        return this.agentCount;
    }

    /**
     * Set the agentCount property: The number of source and target servers configured to talk to this CS.
     *
     * @param agentCount the agentCount value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withAgentCount(String agentCount) {
        this.agentCount = agentCount;
        return this;
    }

    /**
     * Get the protectedServers property: The number of protected servers.
     *
     * @return the protectedServers value.
     */
    public String protectedServers() {
        return this.protectedServers;
    }

    /**
     * Set the protectedServers property: The number of protected servers.
     *
     * @param protectedServers the protectedServers value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withProtectedServers(String protectedServers) {
        this.protectedServers = protectedServers;
        return this;
    }

    /**
     * Get the systemLoad property: The percentage of the system load.
     *
     * @return the systemLoad value.
     */
    public String systemLoad() {
        return this.systemLoad;
    }

    /**
     * Set the systemLoad property: The percentage of the system load.
     *
     * @param systemLoad the systemLoad value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withSystemLoad(String systemLoad) {
        this.systemLoad = systemLoad;
        return this;
    }

    /**
     * Get the systemLoadStatus property: The system load status.
     *
     * @return the systemLoadStatus value.
     */
    public String systemLoadStatus() {
        return this.systemLoadStatus;
    }

    /**
     * Set the systemLoadStatus property: The system load status.
     *
     * @param systemLoadStatus the systemLoadStatus value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withSystemLoadStatus(String systemLoadStatus) {
        this.systemLoadStatus = systemLoadStatus;
        return this;
    }

    /**
     * Get the cpuLoad property: The percentage of the CPU load.
     *
     * @return the cpuLoad value.
     */
    public String cpuLoad() {
        return this.cpuLoad;
    }

    /**
     * Set the cpuLoad property: The percentage of the CPU load.
     *
     * @param cpuLoad the cpuLoad value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withCpuLoad(String cpuLoad) {
        this.cpuLoad = cpuLoad;
        return this;
    }

    /**
     * Get the cpuLoadStatus property: The CPU load status.
     *
     * @return the cpuLoadStatus value.
     */
    public String cpuLoadStatus() {
        return this.cpuLoadStatus;
    }

    /**
     * Set the cpuLoadStatus property: The CPU load status.
     *
     * @param cpuLoadStatus the cpuLoadStatus value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withCpuLoadStatus(String cpuLoadStatus) {
        this.cpuLoadStatus = cpuLoadStatus;
        return this;
    }

    /**
     * Get the totalMemoryInBytes property: The total memory.
     *
     * @return the totalMemoryInBytes value.
     */
    public Long totalMemoryInBytes() {
        return this.totalMemoryInBytes;
    }

    /**
     * Set the totalMemoryInBytes property: The total memory.
     *
     * @param totalMemoryInBytes the totalMemoryInBytes value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withTotalMemoryInBytes(Long totalMemoryInBytes) {
        this.totalMemoryInBytes = totalMemoryInBytes;
        return this;
    }

    /**
     * Get the availableMemoryInBytes property: The available memory.
     *
     * @return the availableMemoryInBytes value.
     */
    public Long availableMemoryInBytes() {
        return this.availableMemoryInBytes;
    }

    /**
     * Set the availableMemoryInBytes property: The available memory.
     *
     * @param availableMemoryInBytes the availableMemoryInBytes value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withAvailableMemoryInBytes(Long availableMemoryInBytes) {
        this.availableMemoryInBytes = availableMemoryInBytes;
        return this;
    }

    /**
     * Get the memoryUsageStatus property: The memory usage status.
     *
     * @return the memoryUsageStatus value.
     */
    public String memoryUsageStatus() {
        return this.memoryUsageStatus;
    }

    /**
     * Set the memoryUsageStatus property: The memory usage status.
     *
     * @param memoryUsageStatus the memoryUsageStatus value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withMemoryUsageStatus(String memoryUsageStatus) {
        this.memoryUsageStatus = memoryUsageStatus;
        return this;
    }

    /**
     * Get the totalSpaceInBytes property: The total space.
     *
     * @return the totalSpaceInBytes value.
     */
    public Long totalSpaceInBytes() {
        return this.totalSpaceInBytes;
    }

    /**
     * Set the totalSpaceInBytes property: The total space.
     *
     * @param totalSpaceInBytes the totalSpaceInBytes value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withTotalSpaceInBytes(Long totalSpaceInBytes) {
        this.totalSpaceInBytes = totalSpaceInBytes;
        return this;
    }

    /**
     * Get the availableSpaceInBytes property: The available space.
     *
     * @return the availableSpaceInBytes value.
     */
    public Long availableSpaceInBytes() {
        return this.availableSpaceInBytes;
    }

    /**
     * Set the availableSpaceInBytes property: The available space.
     *
     * @param availableSpaceInBytes the availableSpaceInBytes value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withAvailableSpaceInBytes(Long availableSpaceInBytes) {
        this.availableSpaceInBytes = availableSpaceInBytes;
        return this;
    }

    /**
     * Get the spaceUsageStatus property: The space usage status.
     *
     * @return the spaceUsageStatus value.
     */
    public String spaceUsageStatus() {
        return this.spaceUsageStatus;
    }

    /**
     * Set the spaceUsageStatus property: The space usage status.
     *
     * @param spaceUsageStatus the spaceUsageStatus value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withSpaceUsageStatus(String spaceUsageStatus) {
        this.spaceUsageStatus = spaceUsageStatus;
        return this;
    }

    /**
     * Get the webLoad property: The web load.
     *
     * @return the webLoad value.
     */
    public String webLoad() {
        return this.webLoad;
    }

    /**
     * Set the webLoad property: The web load.
     *
     * @param webLoad the webLoad value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withWebLoad(String webLoad) {
        this.webLoad = webLoad;
        return this;
    }

    /**
     * Get the webLoadStatus property: The web load status.
     *
     * @return the webLoadStatus value.
     */
    public String webLoadStatus() {
        return this.webLoadStatus;
    }

    /**
     * Set the webLoadStatus property: The web load status.
     *
     * @param webLoadStatus the webLoadStatus value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withWebLoadStatus(String webLoadStatus) {
        this.webLoadStatus = webLoadStatus;
        return this;
    }

    /**
     * Get the databaseServerLoad property: The database server load.
     *
     * @return the databaseServerLoad value.
     */
    public String databaseServerLoad() {
        return this.databaseServerLoad;
    }

    /**
     * Set the databaseServerLoad property: The database server load.
     *
     * @param databaseServerLoad the databaseServerLoad value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withDatabaseServerLoad(String databaseServerLoad) {
        this.databaseServerLoad = databaseServerLoad;
        return this;
    }

    /**
     * Get the databaseServerLoadStatus property: The database server load status.
     *
     * @return the databaseServerLoadStatus value.
     */
    public String databaseServerLoadStatus() {
        return this.databaseServerLoadStatus;
    }

    /**
     * Set the databaseServerLoadStatus property: The database server load status.
     *
     * @param databaseServerLoadStatus the databaseServerLoadStatus value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withDatabaseServerLoadStatus(String databaseServerLoadStatus) {
        this.databaseServerLoadStatus = databaseServerLoadStatus;
        return this;
    }

    /**
     * Get the csServiceStatus property: The CS service status.
     *
     * @return the csServiceStatus value.
     */
    public String csServiceStatus() {
        return this.csServiceStatus;
    }

    /**
     * Set the csServiceStatus property: The CS service status.
     *
     * @param csServiceStatus the csServiceStatus value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withCsServiceStatus(String csServiceStatus) {
        this.csServiceStatus = csServiceStatus;
        return this;
    }

    /**
     * Get the ipAddress property: The IP address.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The IP address.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the agentVersion property: The agent Version.
     *
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the agentVersion property: The agent Version.
     *
     * @param agentVersion the agentVersion value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get the hostname property: The host name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name.
     *
     * @param hostname the hostname value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the lastHeartbeat property: The last heartbeat received from CS server.
     *
     * @return the lastHeartbeat value.
     */
    public OffsetDateTime lastHeartbeat() {
        return this.lastHeartbeat;
    }

    /**
     * Set the lastHeartbeat property: The last heartbeat received from CS server.
     *
     * @param lastHeartbeat the lastHeartbeat value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withLastHeartbeat(OffsetDateTime lastHeartbeat) {
        this.lastHeartbeat = lastHeartbeat;
        return this;
    }

    /**
     * Get the versionStatus property: Version status.
     *
     * @return the versionStatus value.
     */
    public String versionStatus() {
        return this.versionStatus;
    }

    /**
     * Set the versionStatus property: Version status.
     *
     * @param versionStatus the versionStatus value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }

    /**
     * Get the sslCertExpiryDate property: CS SSL cert expiry date.
     *
     * @return the sslCertExpiryDate value.
     */
    public OffsetDateTime sslCertExpiryDate() {
        return this.sslCertExpiryDate;
    }

    /**
     * Set the sslCertExpiryDate property: CS SSL cert expiry date.
     *
     * @param sslCertExpiryDate the sslCertExpiryDate value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withSslCertExpiryDate(OffsetDateTime sslCertExpiryDate) {
        this.sslCertExpiryDate = sslCertExpiryDate;
        return this;
    }

    /**
     * Get the sslCertExpiryRemainingDays property: CS SSL cert expiry date.
     *
     * @return the sslCertExpiryRemainingDays value.
     */
    public Integer sslCertExpiryRemainingDays() {
        return this.sslCertExpiryRemainingDays;
    }

    /**
     * Set the sslCertExpiryRemainingDays property: CS SSL cert expiry date.
     *
     * @param sslCertExpiryRemainingDays the sslCertExpiryRemainingDays value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withSslCertExpiryRemainingDays(Integer sslCertExpiryRemainingDays) {
        this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
        return this;
    }

    /**
     * Get the psTemplateVersion property: PS template version.
     *
     * @return the psTemplateVersion value.
     */
    public String psTemplateVersion() {
        return this.psTemplateVersion;
    }

    /**
     * Set the psTemplateVersion property: PS template version.
     *
     * @param psTemplateVersion the psTemplateVersion value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withPsTemplateVersion(String psTemplateVersion) {
        this.psTemplateVersion = psTemplateVersion;
        return this;
    }

    /**
     * Get the agentExpiryDate property: Agent expiry date.
     *
     * @return the agentExpiryDate value.
     */
    public OffsetDateTime agentExpiryDate() {
        return this.agentExpiryDate;
    }

    /**
     * Set the agentExpiryDate property: Agent expiry date.
     *
     * @param agentExpiryDate the agentExpiryDate value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withAgentExpiryDate(OffsetDateTime agentExpiryDate) {
        this.agentExpiryDate = agentExpiryDate;
        return this;
    }

    /**
     * Get the agentVersionDetails property: The agent version details.
     *
     * @return the agentVersionDetails value.
     */
    public VersionDetails agentVersionDetails() {
        return this.agentVersionDetails;
    }

    /**
     * Set the agentVersionDetails property: The agent version details.
     *
     * @param agentVersionDetails the agentVersionDetails value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withAgentVersionDetails(VersionDetails agentVersionDetails) {
        this.agentVersionDetails = agentVersionDetails;
        return this;
    }

    /**
     * Get the switchProviderBlockingErrorDetails property: The switch provider blocking error information.
     *
     * @return the switchProviderBlockingErrorDetails value.
     */
    public List<InMageFabricSwitchProviderBlockingErrorDetails> switchProviderBlockingErrorDetails() {
        return this.switchProviderBlockingErrorDetails;
    }

    /**
     * Set the switchProviderBlockingErrorDetails property: The switch provider blocking error information.
     *
     * @param switchProviderBlockingErrorDetails the switchProviderBlockingErrorDetails value to set.
     * @return the VMwareDetails object itself.
     */
    public VMwareDetails withSwitchProviderBlockingErrorDetails(
        List<InMageFabricSwitchProviderBlockingErrorDetails> switchProviderBlockingErrorDetails) {
        this.switchProviderBlockingErrorDetails = switchProviderBlockingErrorDetails;
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
        if (processServers() != null) {
            processServers().forEach(e -> e.validate());
        }
        if (masterTargetServers() != null) {
            masterTargetServers().forEach(e -> e.validate());
        }
        if (runAsAccounts() != null) {
            runAsAccounts().forEach(e -> e.validate());
        }
        if (agentVersionDetails() != null) {
            agentVersionDetails().validate();
        }
        if (switchProviderBlockingErrorDetails() != null) {
            switchProviderBlockingErrorDetails().forEach(e -> e.validate());
        }
    }
}
