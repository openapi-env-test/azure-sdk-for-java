// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.generated.models.DnsSettings;
import com.azure.resourcemanager.network.generated.models.ExplicitProxy;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyInsights;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyIntrusionDetection;
import com.azure.resourcemanager.network.generated.models.FirewallPolicySku;
import com.azure.resourcemanager.network.generated.models.FirewallPolicySnat;
import com.azure.resourcemanager.network.generated.models.FirewallPolicySql;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyThreatIntelWhitelist;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyTransportSecurity;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Firewall Policy definition. */
@Fluent
public final class FirewallPolicyPropertiesFormat {
    /*
     * List of references to FirewallPolicyRuleCollectionGroups.
     */
    @JsonProperty(value = "ruleCollectionGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> ruleCollectionGroups;

    /*
     * The provisioning state of the firewall policy resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The parent firewall policy from which rules are inherited.
     */
    @JsonProperty(value = "basePolicy")
    private SubResource basePolicy;

    /*
     * List of references to Azure Firewalls that this Firewall Policy is associated with.
     */
    @JsonProperty(value = "firewalls", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> firewalls;

    /*
     * List of references to Child Firewall Policies.
     */
    @JsonProperty(value = "childPolicies", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> childPolicies;

    /*
     * The operation mode for Threat Intelligence.
     */
    @JsonProperty(value = "threatIntelMode")
    private AzureFirewallThreatIntelMode threatIntelMode;

    /*
     * ThreatIntel Whitelist for Firewall Policy.
     */
    @JsonProperty(value = "threatIntelWhitelist")
    private FirewallPolicyThreatIntelWhitelist threatIntelWhitelist;

    /*
     * Insights on Firewall Policy.
     */
    @JsonProperty(value = "insights")
    private FirewallPolicyInsights insights;

    /*
     * The private IP addresses/IP ranges to which traffic will not be SNAT.
     */
    @JsonProperty(value = "snat")
    private FirewallPolicySnat snat;

    /*
     * SQL Settings definition.
     */
    @JsonProperty(value = "sql")
    private FirewallPolicySql sql;

    /*
     * DNS Proxy Settings definition.
     */
    @JsonProperty(value = "dnsSettings")
    private DnsSettings dnsSettings;

    /*
     * Explicit Proxy Settings definition.
     */
    @JsonProperty(value = "explicitProxy")
    private ExplicitProxy explicitProxy;

    /*
     * The configuration for Intrusion detection.
     */
    @JsonProperty(value = "intrusionDetection")
    private FirewallPolicyIntrusionDetection intrusionDetection;

    /*
     * TLS Configuration definition.
     */
    @JsonProperty(value = "transportSecurity")
    private FirewallPolicyTransportSecurity transportSecurity;

    /*
     * The Firewall Policy SKU.
     */
    @JsonProperty(value = "sku")
    private FirewallPolicySku sku;

    /** Creates an instance of FirewallPolicyPropertiesFormat class. */
    public FirewallPolicyPropertiesFormat() {
    }

    /**
     * Get the ruleCollectionGroups property: List of references to FirewallPolicyRuleCollectionGroups.
     *
     * @return the ruleCollectionGroups value.
     */
    public List<SubResource> ruleCollectionGroups() {
        return this.ruleCollectionGroups;
    }

    /**
     * Get the provisioningState property: The provisioning state of the firewall policy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the basePolicy property: The parent firewall policy from which rules are inherited.
     *
     * @return the basePolicy value.
     */
    public SubResource basePolicy() {
        return this.basePolicy;
    }

    /**
     * Set the basePolicy property: The parent firewall policy from which rules are inherited.
     *
     * @param basePolicy the basePolicy value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withBasePolicy(SubResource basePolicy) {
        this.basePolicy = basePolicy;
        return this;
    }

    /**
     * Get the firewalls property: List of references to Azure Firewalls that this Firewall Policy is associated with.
     *
     * @return the firewalls value.
     */
    public List<SubResource> firewalls() {
        return this.firewalls;
    }

    /**
     * Get the childPolicies property: List of references to Child Firewall Policies.
     *
     * @return the childPolicies value.
     */
    public List<SubResource> childPolicies() {
        return this.childPolicies;
    }

    /**
     * Get the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @return the threatIntelMode value.
     */
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.threatIntelMode;
    }

    /**
     * Set the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @param threatIntelMode the threatIntelMode value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.threatIntelMode = threatIntelMode;
        return this;
    }

    /**
     * Get the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     *
     * @return the threatIntelWhitelist value.
     */
    public FirewallPolicyThreatIntelWhitelist threatIntelWhitelist() {
        return this.threatIntelWhitelist;
    }

    /**
     * Set the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     *
     * @param threatIntelWhitelist the threatIntelWhitelist value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withThreatIntelWhitelist(
        FirewallPolicyThreatIntelWhitelist threatIntelWhitelist) {
        this.threatIntelWhitelist = threatIntelWhitelist;
        return this;
    }

    /**
     * Get the insights property: Insights on Firewall Policy.
     *
     * @return the insights value.
     */
    public FirewallPolicyInsights insights() {
        return this.insights;
    }

    /**
     * Set the insights property: Insights on Firewall Policy.
     *
     * @param insights the insights value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withInsights(FirewallPolicyInsights insights) {
        this.insights = insights;
        return this;
    }

    /**
     * Get the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT.
     *
     * @return the snat value.
     */
    public FirewallPolicySnat snat() {
        return this.snat;
    }

    /**
     * Set the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT.
     *
     * @param snat the snat value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withSnat(FirewallPolicySnat snat) {
        this.snat = snat;
        return this;
    }

    /**
     * Get the sql property: SQL Settings definition.
     *
     * @return the sql value.
     */
    public FirewallPolicySql sql() {
        return this.sql;
    }

    /**
     * Set the sql property: SQL Settings definition.
     *
     * @param sql the sql value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withSql(FirewallPolicySql sql) {
        this.sql = sql;
        return this;
    }

    /**
     * Get the dnsSettings property: DNS Proxy Settings definition.
     *
     * @return the dnsSettings value.
     */
    public DnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: DNS Proxy Settings definition.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withDnsSettings(DnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the explicitProxy property: Explicit Proxy Settings definition.
     *
     * @return the explicitProxy value.
     */
    public ExplicitProxy explicitProxy() {
        return this.explicitProxy;
    }

    /**
     * Set the explicitProxy property: Explicit Proxy Settings definition.
     *
     * @param explicitProxy the explicitProxy value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withExplicitProxy(ExplicitProxy explicitProxy) {
        this.explicitProxy = explicitProxy;
        return this;
    }

    /**
     * Get the intrusionDetection property: The configuration for Intrusion detection.
     *
     * @return the intrusionDetection value.
     */
    public FirewallPolicyIntrusionDetection intrusionDetection() {
        return this.intrusionDetection;
    }

    /**
     * Set the intrusionDetection property: The configuration for Intrusion detection.
     *
     * @param intrusionDetection the intrusionDetection value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withIntrusionDetection(FirewallPolicyIntrusionDetection intrusionDetection) {
        this.intrusionDetection = intrusionDetection;
        return this;
    }

    /**
     * Get the transportSecurity property: TLS Configuration definition.
     *
     * @return the transportSecurity value.
     */
    public FirewallPolicyTransportSecurity transportSecurity() {
        return this.transportSecurity;
    }

    /**
     * Set the transportSecurity property: TLS Configuration definition.
     *
     * @param transportSecurity the transportSecurity value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withTransportSecurity(FirewallPolicyTransportSecurity transportSecurity) {
        this.transportSecurity = transportSecurity;
        return this;
    }

    /**
     * Get the sku property: The Firewall Policy SKU.
     *
     * @return the sku value.
     */
    public FirewallPolicySku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The Firewall Policy SKU.
     *
     * @param sku the sku value to set.
     * @return the FirewallPolicyPropertiesFormat object itself.
     */
    public FirewallPolicyPropertiesFormat withSku(FirewallPolicySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (threatIntelWhitelist() != null) {
            threatIntelWhitelist().validate();
        }
        if (insights() != null) {
            insights().validate();
        }
        if (snat() != null) {
            snat().validate();
        }
        if (sql() != null) {
            sql().validate();
        }
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
        if (explicitProxy() != null) {
            explicitProxy().validate();
        }
        if (intrusionDetection() != null) {
            intrusionDetection().validate();
        }
        if (transportSecurity() != null) {
            transportSecurity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
