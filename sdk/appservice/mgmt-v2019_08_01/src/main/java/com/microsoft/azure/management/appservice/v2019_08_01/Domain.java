/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.CertificateRegistrationManager;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.DomainInner;

/**
 * Type representing Domain.
 */
public interface Domain extends HasInner<DomainInner>, Resource, GroupableResourceCore<CertificateRegistrationManager, DomainInner>, HasResourceGroup, Refreshable<Domain>, Updatable<Domain.Update>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the authCode value.
     */
    String authCode();

    /**
     * @return the autoRenew value.
     */
    Boolean autoRenew();

    /**
     * @return the consent value.
     */
    DomainPurchaseConsent consent();

    /**
     * @return the contactAdmin value.
     */
    Contact contactAdmin();

    /**
     * @return the contactBilling value.
     */
    Contact contactBilling();

    /**
     * @return the contactRegistrant value.
     */
    Contact contactRegistrant();

    /**
     * @return the contactTech value.
     */
    Contact contactTech();

    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the dnsType value.
     */
    DnsType dnsType();

    /**
     * @return the dnsZoneId value.
     */
    String dnsZoneId();

    /**
     * @return the domainNotRenewableReasons value.
     */
    List<String> domainNotRenewableReasons();

    /**
     * @return the expirationTime value.
     */
    DateTime expirationTime();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastRenewedTime value.
     */
    DateTime lastRenewedTime();

    /**
     * @return the managedHostNames value.
     */
    List<HostName> managedHostNames();

    /**
     * @return the nameServers value.
     */
    List<String> nameServers();

    /**
     * @return the privacy value.
     */
    Boolean privacy();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the readyForDnsRecordManagement value.
     */
    Boolean readyForDnsRecordManagement();

    /**
     * @return the registrationStatus value.
     */
    DomainStatus registrationStatus();

    /**
     * @return the targetDnsType value.
     */
    DnsType targetDnsType();

    /**
     * The entirety of the Domain definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithConsent, DefinitionStages.WithContactAdmin, DefinitionStages.WithContactBilling, DefinitionStages.WithContactRegistrant, DefinitionStages.WithContactTech, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Domain definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Domain definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Domain definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithConsent> {
        }

        /**
         * The stage of the domain definition allowing to specify Consent.
         */
        interface WithConsent {
           /**
            * Specifies consent.
            * @param consent Legal agreement consent
            * @return the next definition stage
*/
            WithContactAdmin withConsent(DomainPurchaseConsent consent);
        }

        /**
         * The stage of the domain definition allowing to specify ContactAdmin.
         */
        interface WithContactAdmin {
           /**
            * Specifies contactAdmin.
            * @param contactAdmin Administrative contact
            * @return the next definition stage
*/
            WithContactBilling withContactAdmin(Contact contactAdmin);
        }

        /**
         * The stage of the domain definition allowing to specify ContactBilling.
         */
        interface WithContactBilling {
           /**
            * Specifies contactBilling.
            * @param contactBilling Billing contact
            * @return the next definition stage
*/
            WithContactRegistrant withContactBilling(Contact contactBilling);
        }

        /**
         * The stage of the domain definition allowing to specify ContactRegistrant.
         */
        interface WithContactRegistrant {
           /**
            * Specifies contactRegistrant.
            * @param contactRegistrant Registrant contact
            * @return the next definition stage
*/
            WithContactTech withContactRegistrant(Contact contactRegistrant);
        }

        /**
         * The stage of the domain definition allowing to specify ContactTech.
         */
        interface WithContactTech {
           /**
            * Specifies contactTech.
            * @param contactTech Technical contact
            * @return the next definition stage
*/
            WithCreate withContactTech(Contact contactTech);
        }

        /**
         * The stage of the domain definition allowing to specify AuthCode.
         */
        interface WithAuthCode {
            /**
             * Specifies authCode.
             * @param authCode the authCode parameter value
             * @return the next definition stage
             */
            WithCreate withAuthCode(String authCode);
        }

        /**
         * The stage of the domain definition allowing to specify AutoRenew.
         */
        interface WithAutoRenew {
            /**
             * Specifies autoRenew.
             * @param autoRenew &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed; otherwise, &lt;code&gt;false&lt;/code&gt;
             * @return the next definition stage
             */
            WithCreate withAutoRenew(Boolean autoRenew);
        }

        /**
         * The stage of the domain definition allowing to specify DnsType.
         */
        interface WithDnsType {
            /**
             * Specifies dnsType.
             * @param dnsType Current DNS type. Possible values include: 'AzureDns', 'DefaultDomainRegistrarDns'
             * @return the next definition stage
             */
            WithCreate withDnsType(DnsType dnsType);
        }

        /**
         * The stage of the domain definition allowing to specify DnsZoneId.
         */
        interface WithDnsZoneId {
            /**
             * Specifies dnsZoneId.
             * @param dnsZoneId Azure DNS Zone to use
             * @return the next definition stage
             */
            WithCreate withDnsZoneId(String dnsZoneId);
        }

        /**
         * The stage of the domain definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the domain definition allowing to specify Privacy.
         */
        interface WithPrivacy {
            /**
             * Specifies privacy.
             * @param privacy &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise, &lt;code&gt;false&lt;/code&gt;
             * @return the next definition stage
             */
            WithCreate withPrivacy(Boolean privacy);
        }

        /**
         * The stage of the domain definition allowing to specify TargetDnsType.
         */
        interface WithTargetDnsType {
            /**
             * Specifies targetDnsType.
             * @param targetDnsType Target DNS type (would be used for migration). Possible values include: 'AzureDns', 'DefaultDomainRegistrarDns'
             * @return the next definition stage
             */
            WithCreate withTargetDnsType(DnsType targetDnsType);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Domain>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAuthCode, DefinitionStages.WithAutoRenew, DefinitionStages.WithDnsType, DefinitionStages.WithDnsZoneId, DefinitionStages.WithKind, DefinitionStages.WithPrivacy, DefinitionStages.WithTargetDnsType {
        }
    }
    /**
     * The template for a Domain update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Domain>, Resource.UpdateWithTags<Update>, UpdateStages.WithAuthCode, UpdateStages.WithAutoRenew, UpdateStages.WithDnsType, UpdateStages.WithDnsZoneId, UpdateStages.WithKind, UpdateStages.WithPrivacy, UpdateStages.WithTargetDnsType {
    }

    /**
     * Grouping of Domain update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the domain update allowing to specify AuthCode.
         */
        interface WithAuthCode {
            /**
             * Specifies authCode.
             * @param authCode the authCode parameter value
             * @return the next update stage
             */
            Update withAuthCode(String authCode);
        }

        /**
         * The stage of the domain update allowing to specify AutoRenew.
         */
        interface WithAutoRenew {
            /**
             * Specifies autoRenew.
             * @param autoRenew &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed; otherwise, &lt;code&gt;false&lt;/code&gt;
             * @return the next update stage
             */
            Update withAutoRenew(Boolean autoRenew);
        }

        /**
         * The stage of the domain update allowing to specify DnsType.
         */
        interface WithDnsType {
            /**
             * Specifies dnsType.
             * @param dnsType Current DNS type. Possible values include: 'AzureDns', 'DefaultDomainRegistrarDns'
             * @return the next update stage
             */
            Update withDnsType(DnsType dnsType);
        }

        /**
         * The stage of the domain update allowing to specify DnsZoneId.
         */
        interface WithDnsZoneId {
            /**
             * Specifies dnsZoneId.
             * @param dnsZoneId Azure DNS Zone to use
             * @return the next update stage
             */
            Update withDnsZoneId(String dnsZoneId);
        }

        /**
         * The stage of the domain update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the domain update allowing to specify Privacy.
         */
        interface WithPrivacy {
            /**
             * Specifies privacy.
             * @param privacy &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise, &lt;code&gt;false&lt;/code&gt;
             * @return the next update stage
             */
            Update withPrivacy(Boolean privacy);
        }

        /**
         * The stage of the domain update allowing to specify TargetDnsType.
         */
        interface WithTargetDnsType {
            /**
             * Specifies targetDnsType.
             * @param targetDnsType Target DNS type (would be used for migration). Possible values include: 'AzureDns', 'DefaultDomainRegistrarDns'
             * @return the next update stage
             */
            Update withTargetDnsType(DnsType targetDnsType);
        }

    }
}
