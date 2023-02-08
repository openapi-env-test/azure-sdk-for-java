// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyClearKeyConfiguration;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyOpenRestriction;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyOption;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyPlayReadyConfiguration;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyPlayReadyContentType;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyPlayReadyLicense;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyPlayReadyLicenseType;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyPlayReadyPlayRight;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyPlayReadyUnknownOutputPassingOption;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyRestrictionTokenType;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyRsaTokenKey;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicySymmetricTokenKey;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyTokenRestriction;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyWidevineConfiguration;
import com.azure.resourcemanager.mediaservices.models.SecurityLevel;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for ContentKeyPolicies CreateOrUpdate. */
public final class ContentKeyPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/content-key-policies-create-multiple-options.json
     */
    /**
     * Sample code: Creates a Content Key Policy with multiple options.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void createsAContentKeyPolicyWithMultipleOptions(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .contentKeyPolicies()
            .define("PolicyCreatedWithMultipleOptions")
            .withExistingMediaService("contosorg", "contosomedia")
            .withDescription("ArmPolicyDescription")
            .withOptions(
                Arrays
                    .asList(
                        new ContentKeyPolicyOption()
                            .withName("ClearKeyOption")
                            .withConfiguration(new ContentKeyPolicyClearKeyConfiguration())
                            .withRestriction(
                                new ContentKeyPolicyTokenRestriction()
                                    .withIssuer("urn:issuer")
                                    .withAudience("urn:audience")
                                    .withPrimaryVerificationKey(
                                        new ContentKeyPolicySymmetricTokenKey()
                                            .withKeyValue("AAAAAAAAAAAAAAAAAAAAAA==".getBytes()))
                                    .withRestrictionTokenType(ContentKeyPolicyRestrictionTokenType.SWT)),
                        new ContentKeyPolicyOption()
                            .withName("widevineoption")
                            .withConfiguration(
                                new ContentKeyPolicyWidevineConfiguration()
                                    .withWidevineTemplate(
                                        "{\"allowed_track_types\":\"SD_HD\",\"content_key_specs\":[{\"track_type\":\"SD\",\"security_level\":1,\"required_output_protection\":{\"hdcp\":\"HDCP_V2\"}}],\"policy_overrides\":{\"can_play\":true,\"can_persist\":true,\"can_renew\":false}}"))
                            .withRestriction(new ContentKeyPolicyOpenRestriction())))
            .create();
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/content-key-policies-create-nodrm-token.json
     */
    /**
     * Sample code: Creates a Content Key Policy with ClearKey option and Token Restriction.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void createsAContentKeyPolicyWithClearKeyOptionAndTokenRestriction(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .contentKeyPolicies()
            .define("PolicyWithClearKeyOptionAndSwtTokenRestriction")
            .withExistingMediaService("contosorg", "contosomedia")
            .withDescription("ArmPolicyDescription")
            .withOptions(
                Arrays
                    .asList(
                        new ContentKeyPolicyOption()
                            .withName("ClearKeyOption")
                            .withConfiguration(new ContentKeyPolicyClearKeyConfiguration())
                            .withRestriction(
                                new ContentKeyPolicyTokenRestriction()
                                    .withIssuer("urn:issuer")
                                    .withAudience("urn:audience")
                                    .withPrimaryVerificationKey(
                                        new ContentKeyPolicySymmetricTokenKey()
                                            .withKeyValue("AAAAAAAAAAAAAAAAAAAAAA==".getBytes()))
                                    .withRestrictionTokenType(ContentKeyPolicyRestrictionTokenType.SWT))))
            .create();
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/content-key-policies-create-playready-open.json
     */
    /**
     * Sample code: Creates a Content Key Policy with PlayReady option and Open Restriction.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void createsAContentKeyPolicyWithPlayReadyOptionAndOpenRestriction(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .contentKeyPolicies()
            .define("PolicyWithPlayReadyOptionAndOpenRestriction")
            .withExistingMediaService("contosorg", "contosomedia")
            .withDescription("ArmPolicyDescription")
            .withOptions(
                Arrays
                    .asList(
                        new ContentKeyPolicyOption()
                            .withName("ArmPolicyOptionName")
                            .withConfiguration(
                                new ContentKeyPolicyPlayReadyConfiguration()
                                    .withLicenses(
                                        Arrays
                                            .asList(
                                                new ContentKeyPolicyPlayReadyLicense()
                                                    .withAllowTestDevices(true)
                                                    .withSecurityLevel(SecurityLevel.SL150)
                                                    .withBeginDate(OffsetDateTime.parse("2017-10-16T18:22:53.46Z"))
                                                    .withPlayRight(
                                                        new ContentKeyPolicyPlayReadyPlayRight()
                                                            .withScmsRestriction(2)
                                                            .withDigitalVideoOnlyContentRestriction(false)
                                                            .withImageConstraintForAnalogComponentVideoRestriction(true)
                                                            .withImageConstraintForAnalogComputerMonitorRestriction(
                                                                false)
                                                            .withAllowPassingVideoContentToUnknownOutput(
                                                                ContentKeyPolicyPlayReadyUnknownOutputPassingOption
                                                                    .NOT_ALLOWED))
                                                    .withLicenseType(ContentKeyPolicyPlayReadyLicenseType.PERSISTENT)
                                                    .withContentKeyLocation(
                                                        new ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader())
                                                    .withContentType(
                                                        ContentKeyPolicyPlayReadyContentType.ULTRA_VIOLET_DOWNLOAD))))
                            .withRestriction(new ContentKeyPolicyOpenRestriction())))
            .create();
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/content-key-policies-create-widevine-token.json
     */
    /**
     * Sample code: Creates a Content Key Policy with Widevine option and Token Restriction.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void createsAContentKeyPolicyWithWidevineOptionAndTokenRestriction(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .contentKeyPolicies()
            .define("PolicyWithWidevineOptionAndJwtTokenRestriction")
            .withExistingMediaService("contosorg", "contosomedia")
            .withDescription("ArmPolicyDescription")
            .withOptions(
                Arrays
                    .asList(
                        new ContentKeyPolicyOption()
                            .withName("widevineoption")
                            .withConfiguration(
                                new ContentKeyPolicyWidevineConfiguration()
                                    .withWidevineTemplate(
                                        "{\"allowed_track_types\":\"SD_HD\",\"content_key_specs\":[{\"track_type\":\"SD\",\"security_level\":1,\"required_output_protection\":{\"hdcp\":\"HDCP_V2\"}}],\"policy_overrides\":{\"can_play\":true,\"can_persist\":true,\"can_renew\":false}}"))
                            .withRestriction(
                                new ContentKeyPolicyTokenRestriction()
                                    .withIssuer("urn:issuer")
                                    .withAudience("urn:audience")
                                    .withPrimaryVerificationKey(
                                        new ContentKeyPolicyRsaTokenKey()
                                            .withExponent("AQAB".getBytes())
                                            .withModulus("AQAD".getBytes()))
                                    .withAlternateVerificationKeys(
                                        Arrays
                                            .asList(
                                                new ContentKeyPolicySymmetricTokenKey()
                                                    .withKeyValue("AAAAAAAAAAAAAAAAAAAAAA==".getBytes())))
                                    .withRestrictionTokenType(ContentKeyPolicyRestrictionTokenType.JWT))))
            .create();
    }
}
