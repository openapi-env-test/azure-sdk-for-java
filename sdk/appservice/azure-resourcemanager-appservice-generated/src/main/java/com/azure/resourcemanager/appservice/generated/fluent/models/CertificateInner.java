// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** App certificate. */
@JsonFlatten
@Fluent
public class CertificateInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateInner.class);

    /*
     * Friendly name of the certificate
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /*
     * Subject name of the certificate
     */
    @JsonProperty(value = "properties.subjectName")
    private String subjectName;

    /*
     * Host names the certificate applies to
     */
    @JsonProperty(value = "properties.hostNames")
    private List<String> hostNames;

    /*
     * Pfx blob
     */
    @JsonProperty(value = "properties.pfxBlob")
    private String pfxBlob;

    /*
     * App name
     */
    @JsonProperty(value = "properties.siteName")
    private String siteName;

    /*
     * Self link
     */
    @JsonProperty(value = "properties.selfLink")
    private String selfLink;

    /*
     * Certificate issuer
     */
    @JsonProperty(value = "properties.issuer")
    private String issuer;

    /*
     * Certificate issue Date
     */
    @JsonProperty(value = "properties.issueDate")
    private OffsetDateTime issueDate;

    /*
     * Certificate expiration date
     */
    @JsonProperty(value = "properties.expirationDate")
    private OffsetDateTime expirationDate;

    /*
     * Certificate password
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /*
     * Certificate thumbprint
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /*
     * Is the certificate valid?
     */
    @JsonProperty(value = "properties.valid")
    private Boolean valid;

    /*
     * Raw bytes of .cer file
     */
    @JsonProperty(value = "properties.cerBlob")
    private String cerBlob;

    /*
     * Public key hash
     */
    @JsonProperty(value = "properties.publicKeyHash")
    private String publicKeyHash;

    /*
     * Specification for the hosting environment (App Service Environment) to
     * use for the certificate
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /*
     * Kind of resource
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * Resource Id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Resource Name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the friendlyName property: Friendly name of the certificate.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of the certificate.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the subjectName property: Subject name of the certificate.
     *
     * @return the subjectName value.
     */
    public String subjectName() {
        return this.subjectName;
    }

    /**
     * Set the subjectName property: Subject name of the certificate.
     *
     * @param subjectName the subjectName value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withSubjectName(String subjectName) {
        this.subjectName = subjectName;
        return this;
    }

    /**
     * Get the hostNames property: Host names the certificate applies to.
     *
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Set the hostNames property: Host names the certificate applies to.
     *
     * @param hostNames the hostNames value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Get the pfxBlob property: Pfx blob.
     *
     * @return the pfxBlob value.
     */
    public String pfxBlob() {
        return this.pfxBlob;
    }

    /**
     * Set the pfxBlob property: Pfx blob.
     *
     * @param pfxBlob the pfxBlob value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withPfxBlob(String pfxBlob) {
        this.pfxBlob = pfxBlob;
        return this;
    }

    /**
     * Get the siteName property: App name.
     *
     * @return the siteName value.
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName property: App name.
     *
     * @param siteName the siteName value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Get the selfLink property: Self link.
     *
     * @return the selfLink value.
     */
    public String selfLink() {
        return this.selfLink;
    }

    /**
     * Set the selfLink property: Self link.
     *
     * @param selfLink the selfLink value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withSelfLink(String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    /**
     * Get the issuer property: Certificate issuer.
     *
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Set the issuer property: Certificate issuer.
     *
     * @param issuer the issuer value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get the issueDate property: Certificate issue Date.
     *
     * @return the issueDate value.
     */
    public OffsetDateTime issueDate() {
        return this.issueDate;
    }

    /**
     * Set the issueDate property: Certificate issue Date.
     *
     * @param issueDate the issueDate value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withIssueDate(OffsetDateTime issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Get the expirationDate property: Certificate expiration date.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate property: Certificate expiration date.
     *
     * @param expirationDate the expirationDate value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get the password property: Certificate password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Certificate password.
     *
     * @param password the password value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: Certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the valid property: Is the certificate valid?.
     *
     * @return the valid value.
     */
    public Boolean valid() {
        return this.valid;
    }

    /**
     * Set the valid property: Is the certificate valid?.
     *
     * @param valid the valid value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withValid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * Get the cerBlob property: Raw bytes of .cer file.
     *
     * @return the cerBlob value.
     */
    public String cerBlob() {
        return this.cerBlob;
    }

    /**
     * Set the cerBlob property: Raw bytes of .cer file.
     *
     * @param cerBlob the cerBlob value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withCerBlob(String cerBlob) {
        this.cerBlob = cerBlob;
        return this;
    }

    /**
     * Get the publicKeyHash property: Public key hash.
     *
     * @return the publicKeyHash value.
     */
    public String publicKeyHash() {
        return this.publicKeyHash;
    }

    /**
     * Set the publicKeyHash property: Public key hash.
     *
     * @param publicKeyHash the publicKeyHash value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withPublicKeyHash(String publicKeyHash) {
        this.publicKeyHash = publicKeyHash;
        return this;
    }

    /**
     * Get the hostingEnvironmentProfile property: Specification for the hosting environment (App Service Environment)
     * to use for the certificate.
     *
     * @return the hostingEnvironmentProfile value.
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile property: Specification for the hosting environment (App Service Environment)
     * to use for the certificate.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        return this;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource Id.
     *
     * @param id the id value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Resource Name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource Name.
     *
     * @param name the name value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     *
     * @param type the type value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withType(String type) {
        this.type = type;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostingEnvironmentProfile() != null) {
            hostingEnvironmentProfile().validate();
        }
    }
}
