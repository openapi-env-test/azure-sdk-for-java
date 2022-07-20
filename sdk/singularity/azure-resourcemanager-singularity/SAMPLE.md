# Code snippets and samples


## Account

- [CreateOrUpdate](#account_createorupdate)
- [Delete](#account_delete)
- [GetByResourceGroup](#account_getbyresourcegroup)
- [List](#account_list)
- [ListByResourceGroup](#account_listbyresourcegroup)
- [Update](#account_update)

## AccountQuotaPolicy

- [CreateOrUpdate](#accountquotapolicy_createorupdate)
- [Get](#accountquotapolicy_get)
- [ListByAccount](#accountquotapolicy_listbyaccount)
- [Update](#accountquotapolicy_update)

## GroupPolicy

- [CreateOrUpdate](#grouppolicy_createorupdate)
- [Delete](#grouppolicy_delete)
- [Get](#grouppolicy_get)
- [ListByAccount](#grouppolicy_listbyaccount)
- [Update](#grouppolicy_update)

## Images

- [List](#images_list)

## InstanceTypeSeries

- [List](#instancetypeseries_list)
- [ListInstanceType](#instancetypeseries_listinstancetype)

## Job

- [Approve](#job_approve)
- [Cancel](#job_cancel)
- [CreateOrUpdate](#job_createorupdate)
- [CreateSasToken](#job_createsastoken)
- [Delete](#job_delete)
- [Get](#job_get)
- [ListByAccount](#job_listbyaccount)
- [Remove](#job_remove)
- [RenewKey](#job_renewkey)
- [Resume](#job_resume)
- [Suspend](#job_suspend)
- [Update](#job_update)

## Model

- [CreateOrUpdate](#model_createorupdate)
- [Delete](#model_delete)
- [Get](#model_get)
- [ListByAccount](#model_listbyaccount)
- [Update](#model_update)
- [Validate](#model_validate)

## Network

- [CreateOrUpdate](#network_createorupdate)
- [Delete](#network_delete)
- [Get](#network_get)
- [ListByAccount](#network_listbyaccount)
- [Update](#network_update)

## StorageCache

- [CreateOrUpdate](#storagecache_createorupdate)
- [Delete](#storagecache_delete)
- [Get](#storagecache_get)
- [GetDiagnostics](#storagecache_getdiagnostics)
- [ListByAccount](#storagecache_listbyaccount)
- [Resume](#storagecache_resume)
- [Suspend](#storagecache_suspend)
- [Update](#storagecache_update)

## SubscriptionQuota

- [Get](#subscriptionquota_get)
### Account_CreateOrUpdate

```java
/** Samples for Account CreateOrUpdate. */
public final class AccountCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/createorupdate.json
     */
    /**
     * Sample code: AccountCreateOrUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void accountCreateOrUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .accounts()
            .define("myaccountName")
            .withRegion((String) null)
            .withExistingResourceGroup("myresourceGroupName")
            .create();
    }
}
```

### Account_Delete

```java
import com.azure.core.util.Context;

/** Samples for Account Delete. */
public final class AccountDeleteSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/delete.json
     */
    /**
     * Sample code: AccountDelete.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void accountDelete(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.accounts().delete("myresourceGroupName", "myaccountName", Context.NONE);
    }
}
```

### Account_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Account GetByResourceGroup. */
public final class AccountGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/get.json
     */
    /**
     * Sample code: AccountGet.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void accountGet(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.accounts().getByResourceGroupWithResponse("myresourceGroupName", "myaccountName", Context.NONE);
    }
}
```

### Account_List

```java
import com.azure.core.util.Context;

/** Samples for Account List. */
public final class AccountListSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/listbysubscription.json
     */
    /**
     * Sample code: AccountListBySubscription.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void accountListBySubscription(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.accounts().list(Context.NONE);
    }
}
```

### Account_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Account ListByResourceGroup. */
public final class AccountListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/listbyresourcegroup.json
     */
    /**
     * Sample code: AccountListByResourceGroup.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void accountListByResourceGroup(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.accounts().listByResourceGroup("myresourceGroupName", Context.NONE);
    }
}
```

### Account_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.AccountResourceDescription;

/** Samples for Account Update. */
public final class AccountUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/update.json
     */
    /**
     * Sample code: AccountUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void accountUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        AccountResourceDescription resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("myresourceGroupName", "myaccountName", Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### AccountQuotaPolicy_CreateOrUpdate

```java
/** Samples for AccountQuotaPolicy CreateOrUpdate. */
public final class AccountQuotaPolicyCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/accountQuotaPolicies/createorupdate.json
     */
    /**
     * Sample code: AccountQuotaPolicyCreateOrUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void accountQuotaPolicyCreateOrUpdate(
        com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .accountQuotaPolicies()
            .define("mypolicyName")
            .withExistingAccount("myresourceGroupName", "myaccountName")
            .create();
    }
}
```

### AccountQuotaPolicy_Get

```java
import com.azure.core.util.Context;

/** Samples for AccountQuotaPolicy Get. */
public final class AccountQuotaPolicyGetSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/accountQuotaPolicies/get.json
     */
    /**
     * Sample code: AccountQuotaPolicyGet.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void accountQuotaPolicyGet(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .accountQuotaPolicies()
            .getWithResponse("myresourceGroupName", "myaccountName", "mypolicyName", Context.NONE);
    }
}
```

### AccountQuotaPolicy_ListByAccount

```java
import com.azure.core.util.Context;

/** Samples for AccountQuotaPolicy ListByAccount. */
public final class AccountQuotaPolicyListByAccountSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/accountQuotaPolicies/listbyaccount.json
     */
    /**
     * Sample code: AccountQuotaPolicyListByAccount.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void accountQuotaPolicyListByAccount(
        com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .accountQuotaPolicies()
            .listByAccount("myresourceGroupName", "myaccountName", "mycontinuationToken", Context.NONE);
    }
}
```

### AccountQuotaPolicy_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.AccountQuotaPolicyResourceDescription;

/** Samples for AccountQuotaPolicy Update. */
public final class AccountQuotaPolicyUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/accountQuotaPolicies/update.json
     */
    /**
     * Sample code: AccountQuotaPolicyUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void accountQuotaPolicyUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        AccountQuotaPolicyResourceDescription resource =
            manager
                .accountQuotaPolicies()
                .getWithResponse("myresourceGroupName", "myaccountName", "mypolicyName", Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### GroupPolicy_CreateOrUpdate

```java
/** Samples for GroupPolicy CreateOrUpdate. */
public final class GroupPolicyCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/groupPolicies/createorupdate.json
     */
    /**
     * Sample code: GroupPolicyCreateOrUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void groupPolicyCreateOrUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .groupPolicies()
            .define("mypolicyName")
            .withExistingAccount("myresourceGroupName", "myaccountName")
            .create();
    }
}
```

### GroupPolicy_Delete

```java
import com.azure.core.util.Context;

/** Samples for GroupPolicy Delete. */
public final class GroupPolicyDeleteSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/groupPolicies/delete.json
     */
    /**
     * Sample code: GroupPolicyDelete.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void groupPolicyDelete(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.groupPolicies().delete("myresourceGroupName", "myaccountName", "mypolicyName", Context.NONE);
    }
}
```

### GroupPolicy_Get

```java
import com.azure.core.util.Context;

/** Samples for GroupPolicy Get. */
public final class GroupPolicyGetSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/groupPolicies/get.json
     */
    /**
     * Sample code: GroupPolicyGet.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void groupPolicyGet(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.groupPolicies().getWithResponse("myresourceGroupName", "myaccountName", "mypolicyName", Context.NONE);
    }
}
```

### GroupPolicy_ListByAccount

```java
import com.azure.core.util.Context;

/** Samples for GroupPolicy ListByAccount. */
public final class GroupPolicyListByAccountSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/groupPolicies/listbyaccount.json
     */
    /**
     * Sample code: GroupPolicyListByAccount.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void groupPolicyListByAccount(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .groupPolicies()
            .listByAccount("myresourceGroupName", "myaccountName", "mycontinuationToken", Context.NONE);
    }
}
```

### GroupPolicy_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.GroupPolicyResourceDescription;

/** Samples for GroupPolicy Update. */
public final class GroupPolicyUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/groupPolicies/update.json
     */
    /**
     * Sample code: GroupPolicyUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void groupPolicyUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        GroupPolicyResourceDescription resource =
            manager
                .groupPolicies()
                .getWithResponse("myresourceGroupName", "myaccountName", "mypolicyName", Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### Images_List

```java
import com.azure.core.util.Context;

/** Samples for Images List. */
public final class ImagesListSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/list.json
     */
    /**
     * Sample code: ImagesList.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void imagesList(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.images().list(Context.NONE);
    }
}
```

### InstanceTypeSeries_List

```java
import com.azure.core.util.Context;

/** Samples for InstanceTypeSeries List. */
public final class InstanceTypeSeriesListSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/instancetypeseries/list.json
     */
    /**
     * Sample code: InstanceTypeSeriesList.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void instanceTypeSeriesList(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.instanceTypeSeries().list("mylocation", Context.NONE);
    }
}
```

### InstanceTypeSeries_ListInstanceType

```java
import com.azure.core.util.Context;

/** Samples for InstanceTypeSeries ListInstanceType. */
public final class InstanceTypeSeriesListInstanceTypeSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/instancetypeseries/listinstancetype.json
     */
    /**
     * Sample code: InstanceTypeSeriesListInstanceType.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void instanceTypeSeriesListInstanceType(
        com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.instanceTypeSeries().listInstanceType("mylocation", "myinstanceTypeSeriesId", Context.NONE);
    }
}
```

### Job_Approve

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.JobUserActionDescription;

/** Samples for Job Approve. */
public final class JobApproveSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/approve.json
     */
    /**
     * Sample code: JobApprove.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobApprove(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .jobs()
            .approve(
                "myresourceGroupName",
                "myaccountName",
                "myjobName",
                new JobUserActionDescription().withGroupPolicyName("The name of the group policy."),
                Context.NONE);
    }
}
```

### Job_Cancel

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.JobUserActionDescription;

/** Samples for Job Cancel. */
public final class JobCancelSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/cancel.json
     */
    /**
     * Sample code: JobCancel.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobCancel(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .jobs()
            .cancel(
                "myresourceGroupName",
                "myaccountName",
                "myjobName",
                new JobUserActionDescription().withGroupPolicyName("The name of the group policy."),
                Context.NONE);
    }
}
```

### Job_CreateOrUpdate

```java
/** Samples for Job CreateOrUpdate. */
public final class JobCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/createorupdate.json
     */
    /**
     * Sample code: JobCreateOrUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobCreateOrUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.jobs().define("myjobName").withExistingAccount("myresourceGroupName", "myaccountName").create();
    }
}
```

### Job_CreateSasToken

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.fluent.models.JobSasTokenDescriptionInner;
import com.azure.resourcemanager.singularity.models.ProtocolType;
import java.time.OffsetDateTime;

/** Samples for Job CreateSasToken. */
public final class JobCreateSasTokenSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/createsastoken.json
     */
    /**
     * Sample code: JobCreateSasToken.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobCreateSasToken(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .jobs()
            .createSasToken(
                "myresourceGroupName",
                "myaccountName",
                "myjobName",
                new JobSasTokenDescriptionInner()
                    .withStartTime(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .withExpirationTime(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .withProtocol(ProtocolType.HTTPS)
                    .withGroupPolicyName("The name of the group policy."),
                Context.NONE);
    }
}
```

### Job_Delete

```java
import com.azure.core.util.Context;

/** Samples for Job Delete. */
public final class JobDeleteSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/delete.json
     */
    /**
     * Sample code: JobDelete.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobDelete(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.jobs().delete("myresourceGroupName", "myaccountName", "myjobName", Context.NONE);
    }
}
```

### Job_Get

```java
import com.azure.core.util.Context;

/** Samples for Job Get. */
public final class JobGetSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/get.json
     */
    /**
     * Sample code: JobGet.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobGet(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.jobs().getWithResponse("myresourceGroupName", "myaccountName", "myjobName", Context.NONE);
    }
}
```

### Job_ListByAccount

```java
import com.azure.core.util.Context;

/** Samples for Job ListByAccount. */
public final class JobListByAccountSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/listbyaccount.json
     */
    /**
     * Sample code: JobListByAccount.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobListByAccount(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.jobs().listByAccount("myresourceGroupName", "myaccountName", "mycontinuationToken", Context.NONE);
    }
}
```

### Job_Remove

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.JobUserActionDescription;

/** Samples for Job Remove. */
public final class JobRemoveSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/remove.json
     */
    /**
     * Sample code: JobRemove.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobRemove(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .jobs()
            .remove(
                "myresourceGroupName",
                "myaccountName",
                "myjobName",
                new JobUserActionDescription().withGroupPolicyName("The name of the group policy."),
                Context.NONE);
    }
}
```

### Job_RenewKey

```java
import com.azure.core.util.Context;

/** Samples for Job RenewKey. */
public final class JobRenewKeySamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/renewkey.json
     */
    /**
     * Sample code: JobRenewKey.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobRenewKey(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.jobs().renewKeyWithResponse("myresourceGroupName", "myaccountName", "myjobName", Context.NONE);
    }
}
```

### Job_Resume

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.JobUserActionDescription;

/** Samples for Job Resume. */
public final class JobResumeSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/resume.json
     */
    /**
     * Sample code: JobResume.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobResume(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .jobs()
            .resume(
                "myresourceGroupName",
                "myaccountName",
                "myjobName",
                new JobUserActionDescription().withGroupPolicyName("The name of the group policy."),
                Context.NONE);
    }
}
```

### Job_Suspend

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.JobUserActionDescription;

/** Samples for Job Suspend. */
public final class JobSuspendSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/suspend.json
     */
    /**
     * Sample code: JobSuspend.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobSuspend(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .jobs()
            .suspend(
                "myresourceGroupName",
                "myaccountName",
                "myjobName",
                new JobUserActionDescription().withGroupPolicyName("The name of the group policy."),
                Context.NONE);
    }
}
```

### Job_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.JobResourceDescription;

/** Samples for Job Update. */
public final class JobUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/jobs/update.json
     */
    /**
     * Sample code: JobUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void jobUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        JobResourceDescription resource =
            manager
                .jobs()
                .getWithResponse("myresourceGroupName", "myaccountName", "myjobName", Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### Model_CreateOrUpdate

```java
/** Samples for Model CreateOrUpdate. */
public final class ModelCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/models/createorupdate.json
     */
    /**
     * Sample code: ModelCreateOrUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void modelCreateOrUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.models().define("mymodelName").withExistingAccount("myresourceGroupName", "myaccountName").create();
    }
}
```

### Model_Delete

```java
import com.azure.core.util.Context;

/** Samples for Model Delete. */
public final class ModelDeleteSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/models/delete.json
     */
    /**
     * Sample code: ModelDelete.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void modelDelete(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.models().delete("myresourceGroupName", "myaccountName", "mymodelName", Context.NONE);
    }
}
```

### Model_Get

```java
import com.azure.core.util.Context;

/** Samples for Model Get. */
public final class ModelGetSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/models/get.json
     */
    /**
     * Sample code: ModelGet.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void modelGet(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.models().getWithResponse("myresourceGroupName", "myaccountName", "mymodelName", Context.NONE);
    }
}
```

### Model_ListByAccount

```java
import com.azure.core.util.Context;

/** Samples for Model ListByAccount. */
public final class ModelListByAccountSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/models/listbyaccount.json
     */
    /**
     * Sample code: ModelListByAccount.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void modelListByAccount(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.models().listByAccount("myresourceGroupName", "myaccountName", "mycontinuationToken", Context.NONE);
    }
}
```

### Model_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.ModelResourceDescription;

/** Samples for Model Update. */
public final class ModelUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/models/update.json
     */
    /**
     * Sample code: ModelUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void modelUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        ModelResourceDescription resource =
            manager
                .models()
                .getWithResponse("myresourceGroupName", "myaccountName", "mymodelName", Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### Model_Validate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.fluent.models.ModelResourceDescriptionInner;

/** Samples for Model Validate. */
public final class ModelValidateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/models/validate.json
     */
    /**
     * Sample code: ModelValidate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void modelValidate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .models()
            .validate(
                "myresourceGroupName",
                "myaccountName",
                "mymodelName",
                new ModelResourceDescriptionInner(),
                Context.NONE);
    }
}
```

### Network_CreateOrUpdate

```java
import com.azure.resourcemanager.singularity.models.NetworkPropertiesBase;

/** Samples for Network CreateOrUpdate. */
public final class NetworkCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/createorupdate.json
     */
    /**
     * Sample code: NetworkCreateOrUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void networkCreateOrUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .networks()
            .define("mynetworkResourceName")
            .withExistingAccount("myresourceGroupName", "myaccountName")
            .withProperties(new NetworkPropertiesBase())
            .create();
    }
}
```

### Network_Delete

```java
import com.azure.core.util.Context;

/** Samples for Network Delete. */
public final class NetworkDeleteSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/delete.json
     */
    /**
     * Sample code: NetworkDelete.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void networkDelete(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.networks().delete("myresourceGroupName", "myaccountName", "mynetworkResourceName", Context.NONE);
    }
}
```

### Network_Get

```java
import com.azure.core.util.Context;

/** Samples for Network Get. */
public final class NetworkGetSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/get.json
     */
    /**
     * Sample code: NetworkGet.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void networkGet(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .networks()
            .getWithResponse("myresourceGroupName", "myaccountName", "mynetworkResourceName", Context.NONE);
    }
}
```

### Network_ListByAccount

```java
import com.azure.core.util.Context;

/** Samples for Network ListByAccount. */
public final class NetworkListByAccountSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/listbyaccount.json
     */
    /**
     * Sample code: NetworkListByAccount.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void networkListByAccount(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.networks().listByAccount("myresourceGroupName", "myaccountName", "mycontinuationToken", Context.NONE);
    }
}
```

### Network_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.NetworkPropertiesBase;
import com.azure.resourcemanager.singularity.models.NetworkResourceDescription;

/** Samples for Network Update. */
public final class NetworkUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/update.json
     */
    /**
     * Sample code: NetworkUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void networkUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        NetworkResourceDescription resource =
            manager
                .networks()
                .getWithResponse("myresourceGroupName", "myaccountName", "mynetworkResourceName", Context.NONE)
                .getValue();
        resource.update().withProperties(new NetworkPropertiesBase()).apply();
    }
}
```

### StorageCache_CreateOrUpdate

```java
import com.azure.resourcemanager.singularity.models.StorageCachePropertiesBase;

/** Samples for StorageCache CreateOrUpdate. */
public final class StorageCacheCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/storagecontainers/createorupdate.json
     */
    /**
     * Sample code: StorageCacheCreateOrUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void storageCacheCreateOrUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .storageCaches()
            .define("mystorageCacheResourceName")
            .withExistingAccount("myresourceGroupName", "myaccountName")
            .withProperties(new StorageCachePropertiesBase())
            .create();
    }
}
```

### StorageCache_Delete

```java
import com.azure.core.util.Context;

/** Samples for StorageCache Delete. */
public final class StorageCacheDeleteSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/storagecontainers/delete.json
     */
    /**
     * Sample code: StorageCacheDelete.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void storageCacheDelete(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .storageCaches()
            .delete("myresourceGroupName", "myaccountName", "mystorageCacheResourceName", Context.NONE);
    }
}
```

### StorageCache_Get

```java
import com.azure.core.util.Context;

/** Samples for StorageCache Get. */
public final class StorageCacheGetSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/storagecontainers/get.json
     */
    /**
     * Sample code: StorageCacheGet.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void storageCacheGet(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .storageCaches()
            .getWithResponse("myresourceGroupName", "myaccountName", "mystorageCacheResourceName", Context.NONE);
    }
}
```

### StorageCache_GetDiagnostics

```java
import com.azure.core.util.Context;

/** Samples for StorageCache GetDiagnostics. */
public final class StorageCacheGetDiagnosticsSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/storagecontainers/getdiagnostics.json
     */
    /**
     * Sample code: StorageCacheGetDiagnostics.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void storageCacheGetDiagnostics(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .storageCaches()
            .getDiagnosticsWithResponse(
                "myresourceGroupName", "myaccountName", "mystorageCacheResourceName", Context.NONE);
    }
}
```

### StorageCache_ListByAccount

```java
import com.azure.core.util.Context;

/** Samples for StorageCache ListByAccount. */
public final class StorageCacheListByAccountSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/storagecontainers/listbyaccount.json
     */
    /**
     * Sample code: StorageCacheListByAccount.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void storageCacheListByAccount(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .storageCaches()
            .listByAccount("myresourceGroupName", "myaccountName", "mycontinuationToken", Context.NONE);
    }
}
```

### StorageCache_Resume

```java
import com.azure.core.util.Context;

/** Samples for StorageCache Resume. */
public final class StorageCacheResumeSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/storagecontainers/resume.json
     */
    /**
     * Sample code: StorageCacheResume.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void storageCacheResume(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .storageCaches()
            .resume("myresourceGroupName", "myaccountName", "mystorageCacheResourceName", Context.NONE);
    }
}
```

### StorageCache_Suspend

```java
import com.azure.core.util.Context;

/** Samples for StorageCache Suspend. */
public final class StorageCacheSuspendSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/storagecontainers/suspend.json
     */
    /**
     * Sample code: StorageCacheSuspend.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void storageCacheSuspend(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager
            .storageCaches()
            .suspend("myresourceGroupName", "myaccountName", "mystorageCacheResourceName", Context.NONE);
    }
}
```

### StorageCache_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.models.StorageCachePropertiesBase;
import com.azure.resourcemanager.singularity.models.StorageCacheResourceDescription;

/** Samples for StorageCache Update. */
public final class StorageCacheUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/storagecontainers/update.json
     */
    /**
     * Sample code: StorageCacheUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void storageCacheUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        StorageCacheResourceDescription resource =
            manager
                .storageCaches()
                .getWithResponse("myresourceGroupName", "myaccountName", "mystorageCacheResourceName", Context.NONE)
                .getValue();
        resource.update().withProperties(new StorageCachePropertiesBase()).apply();
    }
}
```

### SubscriptionQuota_Get

```java
import com.azure.core.util.Context;

/** Samples for SubscriptionQuota Get. */
public final class SubscriptionQuotaGetSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/get.json
     */
    /**
     * Sample code: SubscriptionQuotaGet.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void subscriptionQuotaGet(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.subscriptionQuotas().getWithResponse("myownerSubscriptionId", Context.NONE);
    }
}
```

