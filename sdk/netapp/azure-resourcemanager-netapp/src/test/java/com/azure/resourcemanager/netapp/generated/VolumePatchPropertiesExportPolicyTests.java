// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.ChownMode;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesExportPolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VolumePatchPropertiesExportPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumePatchPropertiesExportPolicy model = BinaryData.fromString(
            "{\"rules\":[{\"ruleIndex\":369562825,\"unixReadOnly\":true,\"unixReadWrite\":true,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":false,\"cifs\":false,\"nfsv3\":false,\"nfsv41\":false,\"allowedClients\":\"uxvypomgkopkwh\",\"hasRootAccess\":false,\"chownMode\":\"Restricted\"},{\"ruleIndex\":996289807,\"unixReadOnly\":false,\"unixReadWrite\":false,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":true,\"cifs\":false,\"nfsv3\":true,\"nfsv41\":true,\"allowedClients\":\"elxprglyatddck\",\"hasRootAccess\":true,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":41792863,\"unixReadOnly\":false,\"unixReadWrite\":true,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":true,\"cifs\":true,\"nfsv3\":false,\"nfsv41\":false,\"allowedClients\":\"bmrqyibahwfl\",\"hasRootAccess\":true,\"chownMode\":\"Unrestricted\"}]}")
            .toObject(VolumePatchPropertiesExportPolicy.class);
        Assertions.assertEquals(369562825, model.rules().get(0).ruleIndex());
        Assertions.assertEquals(true, model.rules().get(0).unixReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).unixReadWrite());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).cifs());
        Assertions.assertEquals(false, model.rules().get(0).nfsv3());
        Assertions.assertEquals(false, model.rules().get(0).nfsv41());
        Assertions.assertEquals("uxvypomgkopkwh", model.rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.RESTRICTED, model.rules().get(0).chownMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumePatchPropertiesExportPolicy model = new VolumePatchPropertiesExportPolicy().withRules(Arrays.asList(
            new ExportPolicyRule().withRuleIndex(369562825).withUnixReadOnly(true).withUnixReadWrite(true)
                .withKerberos5ReadOnly(true).withKerberos5ReadWrite(false).withKerberos5IReadOnly(true)
                .withKerberos5IReadWrite(true).withKerberos5PReadOnly(false).withKerberos5PReadWrite(false)
                .withCifs(false).withNfsv3(false).withNfsv41(false).withAllowedClients("uxvypomgkopkwh")
                .withHasRootAccess(false).withChownMode(ChownMode.RESTRICTED),
            new ExportPolicyRule().withRuleIndex(996289807).withUnixReadOnly(false).withUnixReadWrite(false)
                .withKerberos5ReadOnly(true).withKerberos5ReadWrite(false).withKerberos5IReadOnly(false)
                .withKerberos5IReadWrite(false).withKerberos5PReadOnly(true).withKerberos5PReadWrite(true)
                .withCifs(false).withNfsv3(true).withNfsv41(true).withAllowedClients("elxprglyatddck")
                .withHasRootAccess(true).withChownMode(ChownMode.UNRESTRICTED),
            new ExportPolicyRule().withRuleIndex(41792863).withUnixReadOnly(false).withUnixReadWrite(true)
                .withKerberos5ReadOnly(true).withKerberos5ReadWrite(false).withKerberos5IReadOnly(false)
                .withKerberos5IReadWrite(true).withKerberos5PReadOnly(true).withKerberos5PReadWrite(true).withCifs(true)
                .withNfsv3(false).withNfsv41(false).withAllowedClients("bmrqyibahwfl").withHasRootAccess(true)
                .withChownMode(ChownMode.UNRESTRICTED)));
        model = BinaryData.fromObject(model).toObject(VolumePatchPropertiesExportPolicy.class);
        Assertions.assertEquals(369562825, model.rules().get(0).ruleIndex());
        Assertions.assertEquals(true, model.rules().get(0).unixReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).unixReadWrite());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).cifs());
        Assertions.assertEquals(false, model.rules().get(0).nfsv3());
        Assertions.assertEquals(false, model.rules().get(0).nfsv41());
        Assertions.assertEquals("uxvypomgkopkwh", model.rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.RESTRICTED, model.rules().get(0).chownMode());
    }
}
