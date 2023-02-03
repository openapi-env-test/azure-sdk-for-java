# Code snippets and samples


## AvailableWorkloadProfiles

- [Get](#availableworkloadprofiles_get)

## BillingMeters

- [Get](#billingmeters_get)

## Certificates

- [CreateOrUpdate](#certificates_createorupdate)
- [Delete](#certificates_delete)
- [Get](#certificates_get)
- [List](#certificates_list)
- [Update](#certificates_update)

## ConnectedEnvironments

- [CheckNameAvailability](#connectedenvironments_checknameavailability)
- [CreateOrUpdate](#connectedenvironments_createorupdate)
- [Delete](#connectedenvironments_delete)
- [GetByResourceGroup](#connectedenvironments_getbyresourcegroup)
- [List](#connectedenvironments_list)
- [ListByResourceGroup](#connectedenvironments_listbyresourcegroup)
- [Update](#connectedenvironments_update)

## ConnectedEnvironmentsCertificates

- [CreateOrUpdate](#connectedenvironmentscertificates_createorupdate)
- [Delete](#connectedenvironmentscertificates_delete)
- [Get](#connectedenvironmentscertificates_get)
- [List](#connectedenvironmentscertificates_list)
- [Update](#connectedenvironmentscertificates_update)

## ConnectedEnvironmentsDaprComponents

- [CreateOrUpdate](#connectedenvironmentsdaprcomponents_createorupdate)
- [Delete](#connectedenvironmentsdaprcomponents_delete)
- [Get](#connectedenvironmentsdaprcomponents_get)
- [List](#connectedenvironmentsdaprcomponents_list)
- [ListSecrets](#connectedenvironmentsdaprcomponents_listsecrets)

## ConnectedEnvironmentsStorages

- [CreateOrUpdate](#connectedenvironmentsstorages_createorupdate)
- [Delete](#connectedenvironmentsstorages_delete)
- [Get](#connectedenvironmentsstorages_get)
- [List](#connectedenvironmentsstorages_list)

## ContainerApps

- [CreateOrUpdate](#containerapps_createorupdate)
- [Delete](#containerapps_delete)
- [GetAuthToken](#containerapps_getauthtoken)
- [GetByResourceGroup](#containerapps_getbyresourcegroup)
- [List](#containerapps_list)
- [ListByResourceGroup](#containerapps_listbyresourcegroup)
- [ListCustomHostnameAnalysis](#containerapps_listcustomhostnameanalysis)
- [ListSecrets](#containerapps_listsecrets)
- [Update](#containerapps_update)

## ContainerAppsAuthConfigs

- [CreateOrUpdate](#containerappsauthconfigs_createorupdate)
- [Delete](#containerappsauthconfigs_delete)
- [Get](#containerappsauthconfigs_get)
- [ListByContainerApp](#containerappsauthconfigs_listbycontainerapp)

## ContainerAppsDiagnostics

- [GetDetector](#containerappsdiagnostics_getdetector)
- [GetRevision](#containerappsdiagnostics_getrevision)
- [GetRoot](#containerappsdiagnostics_getroot)
- [ListDetectors](#containerappsdiagnostics_listdetectors)
- [ListRevisions](#containerappsdiagnostics_listrevisions)

## ContainerAppsRevisionReplicas

- [GetReplica](#containerappsrevisionreplicas_getreplica)
- [ListReplicas](#containerappsrevisionreplicas_listreplicas)

## ContainerAppsRevisions

- [ActivateRevision](#containerappsrevisions_activaterevision)
- [DeactivateRevision](#containerappsrevisions_deactivaterevision)
- [GetRevision](#containerappsrevisions_getrevision)
- [ListRevisions](#containerappsrevisions_listrevisions)
- [RestartRevision](#containerappsrevisions_restartrevision)

## ContainerAppsSourceControls

- [CreateOrUpdate](#containerappssourcecontrols_createorupdate)
- [Delete](#containerappssourcecontrols_delete)
- [Get](#containerappssourcecontrols_get)
- [ListByContainerApp](#containerappssourcecontrols_listbycontainerapp)

## DaprComponents

- [CreateOrUpdate](#daprcomponents_createorupdate)
- [Delete](#daprcomponents_delete)
- [Get](#daprcomponents_get)
- [List](#daprcomponents_list)
- [ListSecrets](#daprcomponents_listsecrets)

## ManagedEnvironmentDiagnostics

- [GetDetector](#managedenvironmentdiagnostics_getdetector)
- [ListDetectors](#managedenvironmentdiagnostics_listdetectors)

## ManagedEnvironments

- [CreateOrUpdate](#managedenvironments_createorupdate)
- [Delete](#managedenvironments_delete)
- [GetAuthToken](#managedenvironments_getauthtoken)
- [GetByResourceGroup](#managedenvironments_getbyresourcegroup)
- [List](#managedenvironments_list)
- [ListByResourceGroup](#managedenvironments_listbyresourcegroup)
- [ListWorkloadProfileStates](#managedenvironments_listworkloadprofilestates)
- [Update](#managedenvironments_update)

## ManagedEnvironmentsDiagnostics

- [GetRoot](#managedenvironmentsdiagnostics_getroot)

## ManagedEnvironmentsStorages

- [CreateOrUpdate](#managedenvironmentsstorages_createorupdate)
- [Delete](#managedenvironmentsstorages_delete)
- [Get](#managedenvironmentsstorages_get)
- [List](#managedenvironmentsstorages_list)

## Namespaces

- [CheckNameAvailability](#namespaces_checknameavailability)

## Operations

- [List](#operations_list)
### AvailableWorkloadProfiles_Get

```java
import com.azure.core.util.Context;

/** Samples for AvailableWorkloadProfiles Get. */
public final class AvailableWorkloadProfilesGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/AvailableWorkloadProfiles_Get.json
     */
    /**
     * Sample code: BillingMeters_Get.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void billingMetersGet(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.availableWorkloadProfiles().get("East US", Context.NONE);
    }
}
```

### BillingMeters_Get

```java
import com.azure.core.util.Context;

/** Samples for BillingMeters Get. */
public final class BillingMetersGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/BillingMeters_Get.json
     */
    /**
     * Sample code: BillingMeters_Get.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void billingMetersGet(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.billingMeters().getWithResponse("East US", Context.NONE);
    }
}
```

### Certificates_CreateOrUpdate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.CertificateInner;
import com.azure.resourcemanager.appcontainers.models.CertificateProperties;

/** Samples for Certificates CreateOrUpdate. */
public final class CertificatesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Certificate_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateCertificate(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .certificates()
            .createOrUpdateWithResponse(
                "examplerg",
                "testcontainerenv",
                "certificate-firendly-name",
                new CertificateInner()
                    .withLocation("East US")
                    .withProperties(
                        new CertificateProperties()
                            .withPassword("fakeTokenPlaceholder")
                            .withValue("Y2VydA==".getBytes())),
                Context.NONE);
    }
}
```

### Certificates_Delete

```java
import com.azure.core.util.Context;

/** Samples for Certificates Delete. */
public final class CertificatesDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Certificate_Delete.json
     */
    /**
     * Sample code: Delete Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteCertificate(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .certificates()
            .deleteWithResponse("examplerg", "testcontainerenv", "certificate-firendly-name", Context.NONE);
    }
}
```

### Certificates_Get

```java
import com.azure.core.util.Context;

/** Samples for Certificates Get. */
public final class CertificatesGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Certificate_Get.json
     */
    /**
     * Sample code: Get Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getCertificate(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .certificates()
            .getWithResponse("examplerg", "testcontainerenv", "certificate-firendly-name", Context.NONE);
    }
}
```

### Certificates_List

```java
import com.azure.core.util.Context;

/** Samples for Certificates List. */
public final class CertificatesListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Certificates_ListByManagedEnvironment.json
     */
    /**
     * Sample code: List Certificates by Managed Environment.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listCertificatesByManagedEnvironment(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.certificates().list("examplerg", "testcontainerenv", Context.NONE);
    }
}
```

### Certificates_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.models.CertificatePatch;
import java.util.HashMap;
import java.util.Map;

/** Samples for Certificates Update. */
public final class CertificatesUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Certificates_Patch.json
     */
    /**
     * Sample code: Patch Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void patchCertificate(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .certificates()
            .updateWithResponse(
                "examplerg",
                "testcontainerenv",
                "certificate-firendly-name",
                new CertificatePatch().withTags(mapOf("tag1", "value1", "tag2", "value2")),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### ConnectedEnvironments_CheckNameAvailability

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityRequest;

/** Samples for ConnectedEnvironments CheckNameAvailability. */
public final class ConnectedEnvironmentsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsCertificates_CheckNameAvailability.json
     */
    /**
     * Sample code: Certificates_CheckNameAvailability.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void certificatesCheckNameAvailability(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironments()
            .checkNameAvailabilityWithResponse(
                "examplerg",
                "testcontainerenv",
                new CheckNameAvailabilityRequest()
                    .withName("testcertificatename")
                    .withType("Microsoft.App/connectedEnvironments/certificates"),
                Context.NONE);
    }
}
```

### ConnectedEnvironments_CreateOrUpdate

```java
import com.azure.resourcemanager.appcontainers.models.CustomDomainConfiguration;
import com.azure.resourcemanager.appcontainers.models.ExtendedLocation;
import com.azure.resourcemanager.appcontainers.models.ExtendedLocationTypes;

/** Samples for ConnectedEnvironments CreateOrUpdate. */
public final class ConnectedEnvironmentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironments_CreateOrUpdate.json
     */
    /**
     * Sample code: Create kube environments.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createKubeEnvironments(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironments()
            .define("testenv")
            .withRegion("East US")
            .withExistingResourceGroup("examplerg")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withName(
                        "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/examplerg/providers/Microsoft.ExtendedLocation/customLocations/testcustomlocation")
                    .withType(ExtendedLocationTypes.CUSTOM_LOCATION))
            .withStaticIp("1.2.3.4")
            .withDaprAIConnectionString(
                "InstrumentationKey=00000000-0000-0000-0000-000000000000;IngestionEndpoint=https://northcentralus-0.in.applicationinsights.azure.com/")
            .withCustomDomainConfiguration(
                new CustomDomainConfiguration()
                    .withDnsSuffix("www.my-name.com")
                    .withCertificateValue("Y2VydA==".getBytes())
                    .withCertificatePassword("fakeTokenPlaceholder"))
            .create();
    }
}
```

### ConnectedEnvironments_Delete

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironments Delete. */
public final class ConnectedEnvironmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironments_Delete.json
     */
    /**
     * Sample code: Delete connected environment by connectedEnvironmentName.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteConnectedEnvironmentByConnectedEnvironmentName(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironments().delete("examplerg", "examplekenv", Context.NONE);
    }
}
```

### ConnectedEnvironments_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironments GetByResourceGroup. */
public final class ConnectedEnvironmentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironments_Get.json
     */
    /**
     * Sample code: Get connected environment by connectedEnvironmentName.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getConnectedEnvironmentByConnectedEnvironmentName(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironments().getByResourceGroupWithResponse("examplerg", "examplekenv", Context.NONE);
    }
}
```

### ConnectedEnvironments_List

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironments List. */
public final class ConnectedEnvironmentsListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironments_ListBySubscription.json
     */
    /**
     * Sample code: List connected environments by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listConnectedEnvironmentsBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironments().list(Context.NONE);
    }
}
```

### ConnectedEnvironments_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironments ListByResourceGroup. */
public final class ConnectedEnvironmentsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironments_ListByResourceGroup.json
     */
    /**
     * Sample code: List environments by resource group.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listEnvironmentsByResourceGroup(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironments().listByResourceGroup("examplerg", Context.NONE);
    }
}
```

### ConnectedEnvironments_Update

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironments Update. */
public final class ConnectedEnvironmentsUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironments_Patch.json
     */
    /**
     * Sample code: Patch Managed Environment.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void patchManagedEnvironment(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironments().updateWithResponse("examplerg", "testenv", Context.NONE);
    }
}
```

### ConnectedEnvironmentsCertificates_CreateOrUpdate

```java
import com.azure.resourcemanager.appcontainers.models.CertificateProperties;

/** Samples for ConnectedEnvironmentsCertificates CreateOrUpdate. */
public final class ConnectedEnvironmentsCertificatesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsCertificate_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateCertificate(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsCertificates()
            .define("certificate-firendly-name")
            .withRegion("East US")
            .withExistingConnectedEnvironment("examplerg", "testcontainerenv")
            .withProperties(
                new CertificateProperties().withPassword("fakeTokenPlaceholder").withValue("Y2VydA==".getBytes()))
            .create();
    }
}
```

### ConnectedEnvironmentsCertificates_Delete

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsCertificates Delete. */
public final class ConnectedEnvironmentsCertificatesDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsCertificate_Delete.json
     */
    /**
     * Sample code: Delete Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteCertificate(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsCertificates()
            .deleteWithResponse("examplerg", "testcontainerenv", "certificate-firendly-name", Context.NONE);
    }
}
```

### ConnectedEnvironmentsCertificates_Get

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsCertificates Get. */
public final class ConnectedEnvironmentsCertificatesGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsCertificate_Get.json
     */
    /**
     * Sample code: Get Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getCertificate(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsCertificates()
            .getWithResponse("examplerg", "testcontainerenv", "certificate-firendly-name", Context.NONE);
    }
}
```

### ConnectedEnvironmentsCertificates_List

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsCertificates List. */
public final class ConnectedEnvironmentsCertificatesListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsCertificates_ListByConnectedEnvironment.json
     */
    /**
     * Sample code: List Certificates by Connected Environment.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listCertificatesByConnectedEnvironment(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironmentsCertificates().list("examplerg", "testcontainerenv", Context.NONE);
    }
}
```

### ConnectedEnvironmentsCertificates_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.models.Certificate;
import java.util.HashMap;
import java.util.Map;

/** Samples for ConnectedEnvironmentsCertificates Update. */
public final class ConnectedEnvironmentsCertificatesUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsCertificates_Patch.json
     */
    /**
     * Sample code: Patch Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void patchCertificate(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        Certificate resource =
            manager
                .connectedEnvironmentsCertificates()
                .getWithResponse("examplerg", "testcontainerenv", "certificate-firendly-name", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### ConnectedEnvironmentsDaprComponents_CreateOrUpdate

```java
import com.azure.resourcemanager.appcontainers.models.DaprMetadata;
import com.azure.resourcemanager.appcontainers.models.Secret;
import java.util.Arrays;

/** Samples for ConnectedEnvironmentsDaprComponents CreateOrUpdate. */
public final class ConnectedEnvironmentsDaprComponentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsDaprComponents_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update dapr component.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateDaprComponent(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsDaprComponents()
            .define("reddog")
            .withExistingConnectedEnvironment("examplerg", "myenvironment")
            .withComponentType("state.azure.cosmosdb")
            .withVersion("v1")
            .withIgnoreErrors(false)
            .withInitTimeout("50s")
            .withSecrets(Arrays.asList(new Secret().withName("masterkey").withValue("keyvalue")))
            .withMetadata(
                Arrays
                    .asList(
                        new DaprMetadata().withName("url").withValue("<COSMOS-URL>"),
                        new DaprMetadata().withName("database").withValue("itemsDB"),
                        new DaprMetadata().withName("collection").withValue("items"),
                        new DaprMetadata().withName("masterkey").withSecretRef("fakeTokenPlaceholder")))
            .withScopes(Arrays.asList("container-app-1", "container-app-2"))
            .create();
    }
}
```

### ConnectedEnvironmentsDaprComponents_Delete

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsDaprComponents Delete. */
public final class ConnectedEnvironmentsDaprComponentsDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsDaprComponents_Delete.json
     */
    /**
     * Sample code: Delete dapr component.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteDaprComponent(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsDaprComponents()
            .deleteWithResponse("examplerg", "myenvironment", "reddog", Context.NONE);
    }
}
```

### ConnectedEnvironmentsDaprComponents_Get

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsDaprComponents Get. */
public final class ConnectedEnvironmentsDaprComponentsGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsDaprComponents_Get.json
     */
    /**
     * Sample code: Get Dapr Component.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getDaprComponent(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsDaprComponents()
            .getWithResponse("examplerg", "myenvironment", "reddog", Context.NONE);
    }
}
```

### ConnectedEnvironmentsDaprComponents_List

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsDaprComponents List. */
public final class ConnectedEnvironmentsDaprComponentsListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsDaprComponents_List.json
     */
    /**
     * Sample code: List Dapr Components.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listDaprComponents(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironmentsDaprComponents().list("examplerg", "myenvironment", Context.NONE);
    }
}
```

### ConnectedEnvironmentsDaprComponents_ListSecrets

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsDaprComponents ListSecrets. */
public final class ConnectedEnvironmentsDaprComponentsListSecretsSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsDaprComponents_ListSecrets.json
     */
    /**
     * Sample code: List Container Apps Secrets.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppsSecrets(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsDaprComponents()
            .listSecretsWithResponse("examplerg", "myenvironment", "reddog", Context.NONE);
    }
}
```

### ConnectedEnvironmentsStorages_CreateOrUpdate

```java
import com.azure.resourcemanager.appcontainers.models.AccessMode;
import com.azure.resourcemanager.appcontainers.models.AzureFileProperties;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentStorageProperties;

/** Samples for ConnectedEnvironmentsStorages CreateOrUpdate. */
public final class ConnectedEnvironmentsStoragesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsStorages_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update environments storage.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateEnvironmentsStorage(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsStorages()
            .define("jlaw-demo1")
            .withExistingConnectedEnvironment("examplerg", "env")
            .withProperties(
                new ConnectedEnvironmentStorageProperties()
                    .withAzureFile(
                        new AzureFileProperties()
                            .withAccountName("account1")
                            .withAccountKey("fakeTokenPlaceholder")
                            .withAccessMode(AccessMode.READ_ONLY)
                            .withShareName("share1")))
            .create();
    }
}
```

### ConnectedEnvironmentsStorages_Delete

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsStorages Delete. */
public final class ConnectedEnvironmentsStoragesDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsStorages_Delete.json
     */
    /**
     * Sample code: List environments storages by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listEnvironmentsStoragesBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironmentsStorages().deleteWithResponse("examplerg", "env", "jlaw-demo1", Context.NONE);
    }
}
```

### ConnectedEnvironmentsStorages_Get

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsStorages Get. */
public final class ConnectedEnvironmentsStoragesGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsStorages_Get.json
     */
    /**
     * Sample code: get a environments storage properties by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getAEnvironmentsStoragePropertiesBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironmentsStorages().getWithResponse("examplerg", "env", "jlaw-demo1", Context.NONE);
    }
}
```

### ConnectedEnvironmentsStorages_List

```java
import com.azure.core.util.Context;

/** Samples for ConnectedEnvironmentsStorages List. */
public final class ConnectedEnvironmentsStoragesListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ConnectedEnvironmentsStorages_List.json
     */
    /**
     * Sample code: List environments storages by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listEnvironmentsStoragesBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironmentsStorages().listWithResponse("examplerg", "managedEnv", Context.NONE);
    }
}
```

### ContainerApps_CreateOrUpdate

```java
import com.azure.resourcemanager.appcontainers.models.Action;
import com.azure.resourcemanager.appcontainers.models.AppProtocol;
import com.azure.resourcemanager.appcontainers.models.BindingType;
import com.azure.resourcemanager.appcontainers.models.Configuration;
import com.azure.resourcemanager.appcontainers.models.Container;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbe;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGet;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGetHttpHeadersItem;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeTcpSocket;
import com.azure.resourcemanager.appcontainers.models.ContainerResources;
import com.azure.resourcemanager.appcontainers.models.CorsPolicy;
import com.azure.resourcemanager.appcontainers.models.CustomDomain;
import com.azure.resourcemanager.appcontainers.models.CustomScaleRule;
import com.azure.resourcemanager.appcontainers.models.Dapr;
import com.azure.resourcemanager.appcontainers.models.Ingress;
import com.azure.resourcemanager.appcontainers.models.IngressClientCertificateMode;
import com.azure.resourcemanager.appcontainers.models.IngressTransportMethod;
import com.azure.resourcemanager.appcontainers.models.InitContainer;
import com.azure.resourcemanager.appcontainers.models.IpSecurityRestrictionRule;
import com.azure.resourcemanager.appcontainers.models.LogLevel;
import com.azure.resourcemanager.appcontainers.models.Scale;
import com.azure.resourcemanager.appcontainers.models.ScaleRule;
import com.azure.resourcemanager.appcontainers.models.TcpScaleRule;
import com.azure.resourcemanager.appcontainers.models.Template;
import com.azure.resourcemanager.appcontainers.models.TrafficWeight;
import com.azure.resourcemanager.appcontainers.models.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ContainerApps CreateOrUpdate. */
public final class ContainerAppsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Container App.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateContainerApp(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerApps()
            .define("testcontainerApp0")
            .withRegion("East US")
            .withExistingResourceGroup("rg")
            .withEnvironmentId(
                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/managedEnvironments/demokube")
            .withWorkloadProfileType("GeneralPurpose")
            .withConfiguration(
                new Configuration()
                    .withIngress(
                        new Ingress()
                            .withExternal(true)
                            .withTargetPort(3000)
                            .withTraffic(
                                Arrays
                                    .asList(
                                        new TrafficWeight()
                                            .withRevisionName("testcontainerApp0-ab1234")
                                            .withWeight(100)
                                            .withLabel("production")))
                            .withCustomDomains(
                                Arrays
                                    .asList(
                                        new CustomDomain()
                                            .withName("www.my-name.com")
                                            .withBindingType(BindingType.SNI_ENABLED)
                                            .withCertificateId(
                                                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/managedEnvironments/demokube/certificates/my-certificate-for-my-name-dot-com"),
                                        new CustomDomain()
                                            .withName("www.my-other-name.com")
                                            .withBindingType(BindingType.SNI_ENABLED)
                                            .withCertificateId(
                                                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/managedEnvironments/demokube/certificates/my-certificate-for-my-other-name-dot-com")))
                            .withIpSecurityRestrictions(
                                Arrays
                                    .asList(
                                        new IpSecurityRestrictionRule()
                                            .withName("Allow work IP A subnet")
                                            .withDescription(
                                                "Allowing all IP's within the subnet below to access containerapp")
                                            .withIpAddressRange("192.168.1.1/32")
                                            .withAction(Action.ALLOW),
                                        new IpSecurityRestrictionRule()
                                            .withName("Allow work IP B subnet")
                                            .withDescription(
                                                "Allowing all IP's within the subnet below to access containerapp")
                                            .withIpAddressRange("192.168.1.1/8")
                                            .withAction(Action.ALLOW)))
                            .withClientCertificateMode(IngressClientCertificateMode.ACCEPT)
                            .withCorsPolicy(
                                new CorsPolicy()
                                    .withAllowedOrigins(Arrays.asList("https://a.test.com", "https://b.test.com"))
                                    .withAllowedMethods(Arrays.asList("GET", "POST"))
                                    .withAllowedHeaders(Arrays.asList("HEADER1", "HEADER2"))
                                    .withExposeHeaders(Arrays.asList("HEADER3", "HEADER4"))
                                    .withMaxAge(1234)
                                    .withAllowCredentials(true)))
                    .withDapr(
                        new Dapr()
                            .withEnabled(true)
                            .withAppProtocol(AppProtocol.HTTP)
                            .withAppPort(3000)
                            .withHttpReadBufferSize(30)
                            .withHttpMaxRequestSize(10)
                            .withLogLevel(LogLevel.DEBUG)
                            .withEnableApiLogging(true))
                    .withMaxInactiveRevisions(10))
            .withTemplate(
                new Template()
                    .withInitContainers(
                        Arrays
                            .asList(
                                new InitContainer()
                                    .withImage("repo/testcontainerApp0:v4")
                                    .withName("testinitcontainerApp0")
                                    .withCommand(Arrays.asList("/bin/sh"))
                                    .withArgs(Arrays.asList("-c", "while true; do echo hello; sleep 10;done"))
                                    .withResources(new ContainerResources().withCpu(0.2D).withMemory("100Mi"))))
                    .withContainers(
                        Arrays
                            .asList(
                                new Container()
                                    .withImage("repo/testcontainerApp0:v1")
                                    .withName("testcontainerApp0")
                                    .withProbes(
                                        Arrays
                                            .asList(
                                                new ContainerAppProbe()
                                                    .withHttpGet(
                                                        new ContainerAppProbeHttpGet()
                                                            .withHttpHeaders(
                                                                Arrays
                                                                    .asList(
                                                                        new ContainerAppProbeHttpGetHttpHeadersItem()
                                                                            .withName("Custom-Header")
                                                                            .withValue("Awesome")))
                                                            .withPath("/health")
                                                            .withPort(8080))
                                                    .withInitialDelaySeconds(3)
                                                    .withPeriodSeconds(3)
                                                    .withType(Type.LIVENESS)))))
                    .withScale(
                        new Scale()
                            .withMinReplicas(1)
                            .withMaxReplicas(5)
                            .withRules(
                                Arrays
                                    .asList(
                                        new ScaleRule()
                                            .withName("httpscalingrule")
                                            .withCustom(
                                                new CustomScaleRule()
                                                    .withType("http")
                                                    .withMetadata(mapOf("concurrentRequests", "50")))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_TcpApp_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Tcp App.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateTcpApp(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerApps()
            .define("testcontainerAppTcp")
            .withRegion("East US")
            .withExistingResourceGroup("rg")
            .withEnvironmentId(
                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/managedEnvironments/demokube")
            .withConfiguration(
                new Configuration()
                    .withIngress(
                        new Ingress()
                            .withExternal(true)
                            .withTargetPort(3000)
                            .withExposedPort(4000)
                            .withTransport(IngressTransportMethod.TCP)
                            .withTraffic(
                                Arrays
                                    .asList(
                                        new TrafficWeight()
                                            .withRevisionName("testcontainerAppTcp-ab1234")
                                            .withWeight(100)))))
            .withTemplate(
                new Template()
                    .withContainers(
                        Arrays
                            .asList(
                                new Container()
                                    .withImage("repo/testcontainerAppTcp:v1")
                                    .withName("testcontainerAppTcp")
                                    .withProbes(
                                        Arrays
                                            .asList(
                                                new ContainerAppProbe()
                                                    .withInitialDelaySeconds(3)
                                                    .withPeriodSeconds(3)
                                                    .withTcpSocket(new ContainerAppProbeTcpSocket().withPort(8080))
                                                    .withType(Type.LIVENESS)))))
                    .withScale(
                        new Scale()
                            .withMinReplicas(1)
                            .withMaxReplicas(5)
                            .withRules(
                                Arrays
                                    .asList(
                                        new ScaleRule()
                                            .withName("tcpscalingrule")
                                            .withTcp(
                                                new TcpScaleRule()
                                                    .withMetadata(mapOf("concurrentConnections", "50")))))))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### ContainerApps_Delete

```java
import com.azure.core.util.Context;

/** Samples for ContainerApps Delete. */
public final class ContainerAppsDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_Delete.json
     */
    /**
     * Sample code: Delete Container App.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteContainerApp(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerApps().delete("rg", "testWorkerApp0", Context.NONE);
    }
}
```

### ContainerApps_GetAuthToken

```java
import com.azure.core.util.Context;

/** Samples for ContainerApps GetAuthToken. */
public final class ContainerAppsGetAuthTokenSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_GetAuthToken.json
     */
    /**
     * Sample code: Get Container App Auth Token.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerAppAuthToken(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerApps().getAuthTokenWithResponse("rg", "testcontainerApp0", Context.NONE);
    }
}
```

### ContainerApps_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ContainerApps GetByResourceGroup. */
public final class ContainerAppsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_Get.json
     */
    /**
     * Sample code: Get Container App.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerApp(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerApps().getByResourceGroupWithResponse("rg", "testcontainerApp0", Context.NONE);
    }
}
```

### ContainerApps_List

```java
import com.azure.core.util.Context;

/** Samples for ContainerApps List. */
public final class ContainerAppsListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_ListBySubscription.json
     */
    /**
     * Sample code: List Container Apps by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppsBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerApps().list(Context.NONE);
    }
}
```

### ContainerApps_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ContainerApps ListByResourceGroup. */
public final class ContainerAppsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_ListByResourceGroup.json
     */
    /**
     * Sample code: List Container Apps by resource group.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppsByResourceGroup(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerApps().listByResourceGroup("rg", Context.NONE);
    }
}
```

### ContainerApps_ListCustomHostnameAnalysis

```java
import com.azure.core.util.Context;

/** Samples for ContainerApps ListCustomHostnameAnalysis. */
public final class ContainerAppsListCustomHostnameAnalysisSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_ListCustomHostNameAnalysis.json
     */
    /**
     * Sample code: Analyze Custom Hostname.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void analyzeCustomHostname(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerApps()
            .listCustomHostnameAnalysisWithResponse("rg", "testcontainerApp0", "my.name.corp", Context.NONE);
    }
}
```

### ContainerApps_ListSecrets

```java
import com.azure.core.util.Context;

/** Samples for ContainerApps ListSecrets. */
public final class ContainerAppsListSecretsSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_ListSecrets.json
     */
    /**
     * Sample code: List Container Apps Secrets.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppsSecrets(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerApps().listSecretsWithResponse("rg", "testcontainerApp0", Context.NONE);
    }
}
```

### ContainerApps_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.models.Action;
import com.azure.resourcemanager.appcontainers.models.AppProtocol;
import com.azure.resourcemanager.appcontainers.models.BindingType;
import com.azure.resourcemanager.appcontainers.models.Configuration;
import com.azure.resourcemanager.appcontainers.models.Container;
import com.azure.resourcemanager.appcontainers.models.ContainerApp;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbe;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGet;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGetHttpHeadersItem;
import com.azure.resourcemanager.appcontainers.models.ContainerResources;
import com.azure.resourcemanager.appcontainers.models.CustomDomain;
import com.azure.resourcemanager.appcontainers.models.CustomScaleRule;
import com.azure.resourcemanager.appcontainers.models.Dapr;
import com.azure.resourcemanager.appcontainers.models.Ingress;
import com.azure.resourcemanager.appcontainers.models.InitContainer;
import com.azure.resourcemanager.appcontainers.models.IpSecurityRestrictionRule;
import com.azure.resourcemanager.appcontainers.models.LogLevel;
import com.azure.resourcemanager.appcontainers.models.Scale;
import com.azure.resourcemanager.appcontainers.models.ScaleRule;
import com.azure.resourcemanager.appcontainers.models.Template;
import com.azure.resourcemanager.appcontainers.models.TrafficWeight;
import com.azure.resourcemanager.appcontainers.models.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ContainerApps Update. */
public final class ContainerAppsUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_Patch.json
     */
    /**
     * Sample code: Patch Container App.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void patchContainerApp(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        ContainerApp resource =
            manager.containerApps().getByResourceGroupWithResponse("rg", "testcontainerApp0", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withConfiguration(
                new Configuration()
                    .withIngress(
                        new Ingress()
                            .withExternal(true)
                            .withTargetPort(3000)
                            .withTraffic(
                                Arrays
                                    .asList(
                                        new TrafficWeight()
                                            .withRevisionName("testcontainerApp0-ab1234")
                                            .withWeight(100)
                                            .withLabel("production")))
                            .withCustomDomains(
                                Arrays
                                    .asList(
                                        new CustomDomain()
                                            .withName("www.my-name.com")
                                            .withBindingType(BindingType.SNI_ENABLED)
                                            .withCertificateId(
                                                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/managedEnvironments/demokube/certificates/my-certificate-for-my-name-dot-com"),
                                        new CustomDomain()
                                            .withName("www.my-other-name.com")
                                            .withBindingType(BindingType.SNI_ENABLED)
                                            .withCertificateId(
                                                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/managedEnvironments/demokube/certificates/my-certificate-for-my-other-name-dot-com")))
                            .withIpSecurityRestrictions(
                                Arrays
                                    .asList(
                                        new IpSecurityRestrictionRule()
                                            .withName("Allow work IP A subnet")
                                            .withDescription(
                                                "Allowing all IP's within the subnet below to access containerapp")
                                            .withIpAddressRange("192.168.1.1/32")
                                            .withAction(Action.ALLOW),
                                        new IpSecurityRestrictionRule()
                                            .withName("Allow work IP B subnet")
                                            .withDescription(
                                                "Allowing all IP's within the subnet below to access containerapp")
                                            .withIpAddressRange("192.168.1.1/8")
                                            .withAction(Action.ALLOW))))
                    .withDapr(
                        new Dapr()
                            .withEnabled(true)
                            .withAppProtocol(AppProtocol.HTTP)
                            .withAppPort(3000)
                            .withHttpReadBufferSize(30)
                            .withHttpMaxRequestSize(10)
                            .withLogLevel(LogLevel.DEBUG)
                            .withEnableApiLogging(true))
                    .withMaxInactiveRevisions(10))
            .withTemplate(
                new Template()
                    .withInitContainers(
                        Arrays
                            .asList(
                                new InitContainer()
                                    .withImage("repo/testcontainerApp0:v4")
                                    .withName("testinitcontainerApp0")
                                    .withResources(new ContainerResources().withCpu(0.2D).withMemory("100Mi"))))
                    .withContainers(
                        Arrays
                            .asList(
                                new Container()
                                    .withImage("repo/testcontainerApp0:v1")
                                    .withName("testcontainerApp0")
                                    .withProbes(
                                        Arrays
                                            .asList(
                                                new ContainerAppProbe()
                                                    .withHttpGet(
                                                        new ContainerAppProbeHttpGet()
                                                            .withHttpHeaders(
                                                                Arrays
                                                                    .asList(
                                                                        new ContainerAppProbeHttpGetHttpHeadersItem()
                                                                            .withName("Custom-Header")
                                                                            .withValue("Awesome")))
                                                            .withPath("/health")
                                                            .withPort(8080))
                                                    .withInitialDelaySeconds(3)
                                                    .withPeriodSeconds(3)
                                                    .withType(Type.LIVENESS)))))
                    .withScale(
                        new Scale()
                            .withMinReplicas(1)
                            .withMaxReplicas(5)
                            .withRules(
                                Arrays
                                    .asList(
                                        new ScaleRule()
                                            .withName("httpscalingrule")
                                            .withCustom(
                                                new CustomScaleRule()
                                                    .withType("http")
                                                    .withMetadata(mapOf("concurrentRequests", "50")))))))
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### ContainerAppsAuthConfigs_CreateOrUpdate

```java
import com.azure.resourcemanager.appcontainers.models.AppRegistration;
import com.azure.resourcemanager.appcontainers.models.AuthPlatform;
import com.azure.resourcemanager.appcontainers.models.Facebook;
import com.azure.resourcemanager.appcontainers.models.GlobalValidation;
import com.azure.resourcemanager.appcontainers.models.IdentityProviders;
import com.azure.resourcemanager.appcontainers.models.UnauthenticatedClientActionV2;

/** Samples for ContainerAppsAuthConfigs CreateOrUpdate. */
public final class ContainerAppsAuthConfigsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/AuthConfigs_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Container App AuthConfig.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateContainerAppAuthConfig(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsAuthConfigs()
            .define("current")
            .withExistingContainerApp("workerapps-rg-xj", "testcanadacentral")
            .withPlatform(new AuthPlatform().withEnabled(true))
            .withGlobalValidation(
                new GlobalValidation().withUnauthenticatedClientAction(UnauthenticatedClientActionV2.ALLOW_ANONYMOUS))
            .withIdentityProviders(
                new IdentityProviders()
                    .withFacebook(
                        new Facebook()
                            .withRegistration(
                                new AppRegistration()
                                    .withAppId("123")
                                    .withAppSecretSettingName("fakeTokenPlaceholder"))))
            .create();
    }
}
```

### ContainerAppsAuthConfigs_Delete

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsAuthConfigs Delete. */
public final class ContainerAppsAuthConfigsDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/AuthConfigs_Delete.json
     */
    /**
     * Sample code: Delete Container App AuthConfig.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteContainerAppAuthConfig(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsAuthConfigs()
            .deleteWithResponse("workerapps-rg-xj", "testcanadacentral", "current", Context.NONE);
    }
}
```

### ContainerAppsAuthConfigs_Get

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsAuthConfigs Get. */
public final class ContainerAppsAuthConfigsGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/AuthConfigs_Get.json
     */
    /**
     * Sample code: Get Container App's AuthConfig.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerAppSAuthConfig(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsAuthConfigs()
            .getWithResponse("workerapps-rg-xj", "testcanadacentral", "current", Context.NONE);
    }
}
```

### ContainerAppsAuthConfigs_ListByContainerApp

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsAuthConfigs ListByContainerApp. */
public final class ContainerAppsAuthConfigsListByContainerAppSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/AuthConfigs_ListByContainer.json
     */
    /**
     * Sample code: List Auth Configs by Container Apps.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listAuthConfigsByContainerApps(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerAppsAuthConfigs().listByContainerApp("workerapps-rg-xj", "testcanadacentral", Context.NONE);
    }
}
```

### ContainerAppsDiagnostics_GetDetector

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsDiagnostics GetDetector. */
public final class ContainerAppsDiagnosticsGetDetectorSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerAppsDiagnostics_Get.json
     */
    /**
     * Sample code: Get Container App's diagnostics info.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerAppSDiagnosticsInfo(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsDiagnostics()
            .getDetectorWithResponse(
                "mikono-workerapp-test-rg", "mikono-capp-stage1", "cappcontainerappnetworkIO", Context.NONE);
    }
}
```

### ContainerAppsDiagnostics_GetRevision

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsDiagnostics GetRevision. */
public final class ContainerAppsDiagnosticsGetRevisionSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Revisions_Get.json
     */
    /**
     * Sample code: Get Container App's revision.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerAppSRevision(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsDiagnostics()
            .getRevisionWithResponse("rg", "testcontainerApp0", "testcontainerApp0-pjxhsye", Context.NONE);
    }
}
```

### ContainerAppsDiagnostics_GetRoot

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsDiagnostics GetRoot. */
public final class ContainerAppsDiagnosticsGetRootSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_Get.json
     */
    /**
     * Sample code: Get Container App.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerApp(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerAppsDiagnostics().getRootWithResponse("rg", "testcontainerApp0", Context.NONE);
    }
}
```

### ContainerAppsDiagnostics_ListDetectors

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsDiagnostics ListDetectors. */
public final class ContainerAppsDiagnosticsListDetectorsSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerAppsDiagnostics_List.json
     */
    /**
     * Sample code: Get the list of available diagnostics for a given Container App.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getTheListOfAvailableDiagnosticsForAGivenContainerApp(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsDiagnostics()
            .listDetectors("mikono-workerapp-test-rg", "mikono-capp-stage1", Context.NONE);
    }
}
```

### ContainerAppsDiagnostics_ListRevisions

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsDiagnostics ListRevisions. */
public final class ContainerAppsDiagnosticsListRevisionsSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Revisions_List.json
     */
    /**
     * Sample code: List Container App's revisions.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppSRevisions(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerAppsDiagnostics().listRevisions("rg", "testcontainerApp0", null, Context.NONE);
    }
}
```

### ContainerAppsRevisionReplicas_GetReplica

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsRevisionReplicas GetReplica. */
public final class ContainerAppsRevisionReplicasGetReplicaSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Replicas_Get.json
     */
    /**
     * Sample code: Get Container App's revision replica.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerAppSRevisionReplica(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsRevisionReplicas()
            .getReplicaWithResponse(
                "workerapps-rg-xj", "myapp", "myapp--0wlqy09", "myapp--0wlqy09-5d9774cff-5wnd8", Context.NONE);
    }
}
```

### ContainerAppsRevisionReplicas_ListReplicas

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsRevisionReplicas ListReplicas. */
public final class ContainerAppsRevisionReplicasListReplicasSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Replicas_List.json
     */
    /**
     * Sample code: List Container App's replicas.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppSReplicas(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsRevisionReplicas()
            .listReplicasWithResponse("workerapps-rg-xj", "myapp", "myapp--0wlqy09", Context.NONE);
    }
}
```

### ContainerAppsRevisions_ActivateRevision

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsRevisions ActivateRevision. */
public final class ContainerAppsRevisionsActivateRevisionSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Revisions_Activate.json
     */
    /**
     * Sample code: Activate Container App's revision.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void activateContainerAppSRevision(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsRevisions()
            .activateRevisionWithResponse("rg", "testcontainerApp0", "testcontainerApp0-pjxhsye", Context.NONE);
    }
}
```

### ContainerAppsRevisions_DeactivateRevision

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsRevisions DeactivateRevision. */
public final class ContainerAppsRevisionsDeactivateRevisionSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Revisions_Deactivate.json
     */
    /**
     * Sample code: Deactivate Container App's revision.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deactivateContainerAppSRevision(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsRevisions()
            .deactivateRevisionWithResponse("rg", "testcontainerApp0", "testcontainerApp0-pjxhsye", Context.NONE);
    }
}
```

### ContainerAppsRevisions_GetRevision

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsRevisions GetRevision. */
public final class ContainerAppsRevisionsGetRevisionSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Revisions_Get.json
     */
    /**
     * Sample code: Get Container App's revision.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerAppSRevision(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsRevisions()
            .getRevisionWithResponse("rg", "testcontainerApp0", "testcontainerApp0-pjxhsye", Context.NONE);
    }
}
```

### ContainerAppsRevisions_ListRevisions

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsRevisions ListRevisions. */
public final class ContainerAppsRevisionsListRevisionsSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Revisions_List.json
     */
    /**
     * Sample code: List Container App's revisions.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppSRevisions(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerAppsRevisions().listRevisions("rg", "testcontainerApp0", null, Context.NONE);
    }
}
```

### ContainerAppsRevisions_RestartRevision

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsRevisions RestartRevision. */
public final class ContainerAppsRevisionsRestartRevisionSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Revisions_Restart.json
     */
    /**
     * Sample code: Restart Container App's revision.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void restartContainerAppSRevision(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsRevisions()
            .restartRevisionWithResponse("rg", "testStaticSite0", "testcontainerApp0-pjxhsye", Context.NONE);
    }
}
```

### ContainerAppsSourceControls_CreateOrUpdate

```java
import com.azure.resourcemanager.appcontainers.models.AzureCredentials;
import com.azure.resourcemanager.appcontainers.models.GithubActionConfiguration;
import com.azure.resourcemanager.appcontainers.models.RegistryInfo;

/** Samples for ContainerAppsSourceControls CreateOrUpdate. */
public final class ContainerAppsSourceControlsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/SourceControls_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Container App SourceControl.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateContainerAppSourceControl(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsSourceControls()
            .define("current")
            .withExistingContainerApp("workerapps-rg-xj", "testcanadacentral")
            .withRepoUrl("https://github.com/xwang971/ghatest")
            .withBranch("master")
            .withGithubActionConfiguration(
                new GithubActionConfiguration()
                    .withRegistryInfo(
                        new RegistryInfo()
                            .withRegistryUrl("xwang971reg.azurecr.io")
                            .withRegistryUsername("xwang971reg")
                            .withRegistryPassword("fakeTokenPlaceholder"))
                    .withAzureCredentials(
                        new AzureCredentials()
                            .withClientId("<clientid>")
                            .withClientSecret("fakeTokenPlaceholder")
                            .withTenantId("<tenantid>"))
                    .withContextPath("./")
                    .withImage("image/tag"))
            .create();
    }
}
```

### ContainerAppsSourceControls_Delete

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsSourceControls Delete. */
public final class ContainerAppsSourceControlsDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/SourceControls_Delete.json
     */
    /**
     * Sample code: Delete Container App SourceControl.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteContainerAppSourceControl(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerAppsSourceControls().delete("workerapps-rg-xj", "testcanadacentral", "current", Context.NONE);
    }
}
```

### ContainerAppsSourceControls_Get

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsSourceControls Get. */
public final class ContainerAppsSourceControlsGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/SourceControls_Get.json
     */
    /**
     * Sample code: Get Container App's SourceControl.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerAppSSourceControl(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsSourceControls()
            .getWithResponse("workerapps-rg-xj", "testcanadacentral", "current", Context.NONE);
    }
}
```

### ContainerAppsSourceControls_ListByContainerApp

```java
import com.azure.core.util.Context;

/** Samples for ContainerAppsSourceControls ListByContainerApp. */
public final class ContainerAppsSourceControlsListByContainerAppSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/SourceControls_ListByContainer.json
     */
    /**
     * Sample code: List App's Source Controls.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listAppSSourceControls(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerAppsSourceControls().listByContainerApp("workerapps-rg-xj", "testcanadacentral", Context.NONE);
    }
}
```

### DaprComponents_CreateOrUpdate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprComponentInner;
import com.azure.resourcemanager.appcontainers.models.DaprMetadata;
import com.azure.resourcemanager.appcontainers.models.Secret;
import java.util.Arrays;

/** Samples for DaprComponents CreateOrUpdate. */
public final class DaprComponentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/DaprComponents_CreateOrUpdate_Secrets.json
     */
    /**
     * Sample code: Create or update dapr component with secrets.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateDaprComponentWithSecrets(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .daprComponents()
            .createOrUpdateWithResponse(
                "examplerg",
                "myenvironment",
                "reddog",
                new DaprComponentInner()
                    .withComponentType("state.azure.cosmosdb")
                    .withVersion("v1")
                    .withIgnoreErrors(false)
                    .withInitTimeout("50s")
                    .withSecrets(Arrays.asList(new Secret().withName("masterkey").withValue("keyvalue")))
                    .withMetadata(
                        Arrays
                            .asList(
                                new DaprMetadata().withName("url").withValue("<COSMOS-URL>"),
                                new DaprMetadata().withName("database").withValue("itemsDB"),
                                new DaprMetadata().withName("collection").withValue("items"),
                                new DaprMetadata().withName("masterkey").withSecretRef("fakeTokenPlaceholder")))
                    .withScopes(Arrays.asList("container-app-1", "container-app-2")),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/DaprComponents_CreateOrUpdate_SecretStoreComponent.json
     */
    /**
     * Sample code: Create or update dapr component with secret store component.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateDaprComponentWithSecretStoreComponent(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .daprComponents()
            .createOrUpdateWithResponse(
                "examplerg",
                "myenvironment",
                "reddog",
                new DaprComponentInner()
                    .withComponentType("state.azure.cosmosdb")
                    .withVersion("v1")
                    .withIgnoreErrors(false)
                    .withInitTimeout("50s")
                    .withSecretStoreComponent("fakeTokenPlaceholder")
                    .withMetadata(
                        Arrays
                            .asList(
                                new DaprMetadata().withName("url").withValue("<COSMOS-URL>"),
                                new DaprMetadata().withName("database").withValue("itemsDB"),
                                new DaprMetadata().withName("collection").withValue("items"),
                                new DaprMetadata().withName("masterkey").withSecretRef("fakeTokenPlaceholder")))
                    .withScopes(Arrays.asList("container-app-1", "container-app-2")),
                Context.NONE);
    }
}
```

### DaprComponents_Delete

```java
import com.azure.core.util.Context;

/** Samples for DaprComponents Delete. */
public final class DaprComponentsDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/DaprComponents_Delete.json
     */
    /**
     * Sample code: Delete dapr component.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteDaprComponent(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.daprComponents().deleteWithResponse("examplerg", "myenvironment", "reddog", Context.NONE);
    }
}
```

### DaprComponents_Get

```java
import com.azure.core.util.Context;

/** Samples for DaprComponents Get. */
public final class DaprComponentsGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/DaprComponents_Get_SecretStoreComponent.json
     */
    /**
     * Sample code: Get Dapr Component with secret store component.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getDaprComponentWithSecretStoreComponent(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.daprComponents().getWithResponse("examplerg", "myenvironment", "reddog", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/DaprComponents_Get_Secrets.json
     */
    /**
     * Sample code: Get Dapr Component with secrets.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getDaprComponentWithSecrets(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.daprComponents().getWithResponse("examplerg", "myenvironment", "reddog", Context.NONE);
    }
}
```

### DaprComponents_List

```java
import com.azure.core.util.Context;

/** Samples for DaprComponents List. */
public final class DaprComponentsListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/DaprComponents_List.json
     */
    /**
     * Sample code: List Dapr Components.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listDaprComponents(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.daprComponents().list("examplerg", "myenvironment", Context.NONE);
    }
}
```

### DaprComponents_ListSecrets

```java
import com.azure.core.util.Context;

/** Samples for DaprComponents ListSecrets. */
public final class DaprComponentsListSecretsSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/DaprComponents_ListSecrets.json
     */
    /**
     * Sample code: List Container Apps Secrets.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppsSecrets(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.daprComponents().listSecretsWithResponse("examplerg", "myenvironment", "reddog", Context.NONE);
    }
}
```

### ManagedEnvironmentDiagnostics_GetDetector

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironmentDiagnostics GetDetector. */
public final class ManagedEnvironmentDiagnosticsGetDetectorSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironmentDiagnostics_Get.json
     */
    /**
     * Sample code: Get diagnostic data for a managed environments.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getDiagnosticDataForAManagedEnvironments(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .managedEnvironmentDiagnostics()
            .getDetectorWithResponse(
                "mikono-workerapp-test-rg", "mikonokubeenv", "ManagedEnvAvailabilityMetrics", Context.NONE);
    }
}
```

### ManagedEnvironmentDiagnostics_ListDetectors

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironmentDiagnostics ListDetectors. */
public final class ManagedEnvironmentDiagnosticsListDetectorsSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironmentDiagnostics_List.json
     */
    /**
     * Sample code: Get the list of available diagnostic data for a managed environments.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getTheListOfAvailableDiagnosticDataForAManagedEnvironments(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .managedEnvironmentDiagnostics()
            .listDetectorsWithResponse("mikono-workerapp-test-rg", "mikonokubeenv", Context.NONE);
    }
}
```

### ManagedEnvironments_CreateOrUpdate

```java
import com.azure.resourcemanager.appcontainers.models.AppLogsConfiguration;
import com.azure.resourcemanager.appcontainers.models.CustomDomainConfiguration;
import com.azure.resourcemanager.appcontainers.models.EnvironmentSkuProperties;
import com.azure.resourcemanager.appcontainers.models.LogAnalyticsConfiguration;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentOutBoundType;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentOutboundSettings;
import com.azure.resourcemanager.appcontainers.models.SkuName;
import com.azure.resourcemanager.appcontainers.models.VnetConfiguration;
import com.azure.resourcemanager.appcontainers.models.WorkloadProfile;
import java.util.Arrays;

/** Samples for ManagedEnvironments CreateOrUpdate. */
public final class ManagedEnvironmentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironments_CreateOrUpdate.json
     */
    /**
     * Sample code: Create environments.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createEnvironments(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .managedEnvironments()
            .define("testcontainerenv")
            .withRegion("East US")
            .withExistingResourceGroup("examplerg")
            .withKind("serverless")
            .withSku(new EnvironmentSkuProperties().withName(SkuName.PREMIUM))
            .withDaprAIConnectionString(
                "InstrumentationKey=00000000-0000-0000-0000-000000000000;IngestionEndpoint=https://northcentralus-0.in.applicationinsights.azure.com/")
            .withVnetConfiguration(
                new VnetConfiguration()
                    .withOutboundSettings(
                        new ManagedEnvironmentOutboundSettings()
                            .withOutBoundType(ManagedEnvironmentOutBoundType.USER_DEFINED_ROUTING)
                            .withVirtualNetworkApplianceIp("192.168.1.20")))
            .withAppLogsConfiguration(
                new AppLogsConfiguration()
                    .withLogAnalyticsConfiguration(
                        new LogAnalyticsConfiguration().withCustomerId("string").withSharedKey("fakeTokenPlaceholder")))
            .withZoneRedundant(true)
            .withCustomDomainConfiguration(
                new CustomDomainConfiguration()
                    .withDnsSuffix("www.my-name.com")
                    .withCertificateValue("Y2VydA==".getBytes())
                    .withCertificatePassword("fakeTokenPlaceholder"))
            .withWorkloadProfiles(
                Arrays
                    .asList(
                        new WorkloadProfile()
                            .withWorkloadProfileType("GeneralPurpose")
                            .withMinimumCount(3)
                            .withMaximumCount(12),
                        new WorkloadProfile()
                            .withWorkloadProfileType("MemoryOptimized")
                            .withMinimumCount(3)
                            .withMaximumCount(6),
                        new WorkloadProfile()
                            .withWorkloadProfileType("ComputeOptimized")
                            .withMinimumCount(3)
                            .withMaximumCount(6)))
            .create();
    }
}
```

### ManagedEnvironments_Delete

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironments Delete. */
public final class ManagedEnvironmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironments_Delete.json
     */
    /**
     * Sample code: Delete environment by name.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteEnvironmentByName(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironments().delete("examplerg", "examplekenv", Context.NONE);
    }
}
```

### ManagedEnvironments_GetAuthToken

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironments GetAuthToken. */
public final class ManagedEnvironmentsGetAuthTokenSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironments_GetAuthToken.json
     */
    /**
     * Sample code: Get Managed Environment Auth Token.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getManagedEnvironmentAuthToken(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironments().getAuthTokenWithResponse("rg", "testenv", Context.NONE);
    }
}
```

### ManagedEnvironments_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironments GetByResourceGroup. */
public final class ManagedEnvironmentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironments_Get.json
     */
    /**
     * Sample code: Get environments by name.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getEnvironmentsByName(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironments().getByResourceGroupWithResponse("examplerg", "jlaw-demo1", Context.NONE);
    }
}
```

### ManagedEnvironments_List

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironments List. */
public final class ManagedEnvironmentsListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironments_ListBySubscription.json
     */
    /**
     * Sample code: List environments by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listEnvironmentsBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironments().list(Context.NONE);
    }
}
```

### ManagedEnvironments_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironments ListByResourceGroup. */
public final class ManagedEnvironmentsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironments_ListByResourceGroup.json
     */
    /**
     * Sample code: List environments by resource group.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listEnvironmentsByResourceGroup(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironments().listByResourceGroup("examplerg", Context.NONE);
    }
}
```

### ManagedEnvironments_ListWorkloadProfileStates

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironments ListWorkloadProfileStates. */
public final class ManagedEnvironmentsListWorkloadProfileStatesSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironments_ListWorkloadProfileStates.json
     */
    /**
     * Sample code: List environments by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listEnvironmentsBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironments().listWorkloadProfileStates("examplerg", "jlaw-demo1", Context.NONE);
    }
}
```

### ManagedEnvironments_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironment;
import java.util.HashMap;
import java.util.Map;

/** Samples for ManagedEnvironments Update. */
public final class ManagedEnvironmentsUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironments_Patch.json
     */
    /**
     * Sample code: Patch Managed Environment.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void patchManagedEnvironment(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        ManagedEnvironment resource =
            manager
                .managedEnvironments()
                .getByResourceGroupWithResponse("examplerg", "testcontainerenv", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### ManagedEnvironmentsDiagnostics_GetRoot

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironmentsDiagnostics GetRoot. */
public final class ManagedEnvironmentsDiagnosticsGetRootSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironments_Get.json
     */
    /**
     * Sample code: Get environments by name.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getEnvironmentsByName(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentsDiagnostics().getRootWithResponse("examplerg", "jlaw-demo1", Context.NONE);
    }
}
```

### ManagedEnvironmentsStorages_CreateOrUpdate

```java
import com.azure.resourcemanager.appcontainers.models.AccessMode;
import com.azure.resourcemanager.appcontainers.models.AzureFileProperties;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentStorageProperties;

/** Samples for ManagedEnvironmentsStorages CreateOrUpdate. */
public final class ManagedEnvironmentsStoragesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironmentsStorages_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update environments storage.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateEnvironmentsStorage(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .managedEnvironmentsStorages()
            .define("jlaw-demo1")
            .withExistingManagedEnvironment("examplerg", "managedEnv")
            .withProperties(
                new ManagedEnvironmentStorageProperties()
                    .withAzureFile(
                        new AzureFileProperties()
                            .withAccountName("account1")
                            .withAccountKey("fakeTokenPlaceholder")
                            .withAccessMode(AccessMode.READ_ONLY)
                            .withShareName("share1")))
            .create();
    }
}
```

### ManagedEnvironmentsStorages_Delete

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironmentsStorages Delete. */
public final class ManagedEnvironmentsStoragesDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironmentsStorages_Delete.json
     */
    /**
     * Sample code: List environments storages by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listEnvironmentsStoragesBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentsStorages().deleteWithResponse("examplerg", "managedEnv", "jlaw-demo1", Context.NONE);
    }
}
```

### ManagedEnvironmentsStorages_Get

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironmentsStorages Get. */
public final class ManagedEnvironmentsStoragesGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironmentsStorages_Get.json
     */
    /**
     * Sample code: get a environments storage properties by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getAEnvironmentsStoragePropertiesBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentsStorages().getWithResponse("examplerg", "managedEnv", "jlaw-demo1", Context.NONE);
    }
}
```

### ManagedEnvironmentsStorages_List

```java
import com.azure.core.util.Context;

/** Samples for ManagedEnvironmentsStorages List. */
public final class ManagedEnvironmentsStoragesListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ManagedEnvironmentsStorages_List.json
     */
    /**
     * Sample code: List environments storages by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listEnvironmentsStoragesBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentsStorages().listWithResponse("examplerg", "managedEnv", Context.NONE);
    }
}
```

### Namespaces_CheckNameAvailability

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityRequest;

/** Samples for Namespaces CheckNameAvailability. */
public final class NamespacesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Certificates_CheckNameAvailability.json
     */
    /**
     * Sample code: Certificates_CheckNameAvailability.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void certificatesCheckNameAvailability(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .namespaces()
            .checkNameAvailabilityWithResponse(
                "examplerg",
                "testcontainerenv",
                new CheckNameAvailabilityRequest()
                    .withName("testcertificatename")
                    .withType("Microsoft.App/managedEnvironments/certificates"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerApps_CheckNameAvailability.json
     */
    /**
     * Sample code: ContainerApps_CheckNameAvailability.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void containerAppsCheckNameAvailability(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .namespaces()
            .checkNameAvailabilityWithResponse(
                "examplerg",
                "testcontainerenv",
                new CheckNameAvailabilityRequest().withName("testcappname").withType("Microsoft.App/containerApps"),
                Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/Operations_List.json
     */
    /**
     * Sample code: List all operations.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listAllOperations(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

