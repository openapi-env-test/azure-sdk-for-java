# Code snippets and samples


## VirtualMachineExtensions

- [CreateOrUpdate](#virtualmachineextensions_createorupdate)
- [Delete](#virtualmachineextensions_delete)
- [Get](#virtualmachineextensions_get)
- [List](#virtualmachineextensions_list)
- [Update](#virtualmachineextensions_update)

## VirtualMachineRunCommands

- [CreateOrUpdate](#virtualmachineruncommands_createorupdate)
- [Delete](#virtualmachineruncommands_delete)
- [Get](#virtualmachineruncommands_get)
- [GetByVirtualMachine](#virtualmachineruncommands_getbyvirtualmachine)
- [List](#virtualmachineruncommands_list)
- [ListByVirtualMachine](#virtualmachineruncommands_listbyvirtualmachine)
- [Update](#virtualmachineruncommands_update)

## VirtualMachineScaleSetVMRunCommands

- [CreateOrUpdate](#virtualmachinescalesetvmruncommands_createorupdate)
- [Delete](#virtualmachinescalesetvmruncommands_delete)
- [Get](#virtualmachinescalesetvmruncommands_get)
- [List](#virtualmachinescalesetvmruncommands_list)
- [Update](#virtualmachinescalesetvmruncommands_update)

## VirtualMachineScaleSetVMs

- [RunCommand](#virtualmachinescalesetvms_runcommand)

## VirtualMachines

- [AssessPatches](#virtualmachines_assesspatches)
- [Capture](#virtualmachines_capture)
- [ConvertToManagedDisks](#virtualmachines_converttomanageddisks)
- [CreateOrUpdate](#virtualmachines_createorupdate)
- [Deallocate](#virtualmachines_deallocate)
- [Delete](#virtualmachines_delete)
- [Generalize](#virtualmachines_generalize)
- [GetByResourceGroup](#virtualmachines_getbyresourcegroup)
- [InstallPatches](#virtualmachines_installpatches)
- [InstanceView](#virtualmachines_instanceview)
- [List](#virtualmachines_list)
- [ListAvailableSizes](#virtualmachines_listavailablesizes)
- [ListByLocation](#virtualmachines_listbylocation)
- [ListByResourceGroup](#virtualmachines_listbyresourcegroup)
- [PerformMaintenance](#virtualmachines_performmaintenance)
- [PowerOff](#virtualmachines_poweroff)
- [Reapply](#virtualmachines_reapply)
- [Redeploy](#virtualmachines_redeploy)
- [Reimage](#virtualmachines_reimage)
- [Restart](#virtualmachines_restart)
- [RetrieveBootDiagnosticsData](#virtualmachines_retrievebootdiagnosticsdata)
- [RunCommand](#virtualmachines_runcommand)
- [SimulateEviction](#virtualmachines_simulateeviction)
- [Start](#virtualmachines_start)
- [Update](#virtualmachines_update)
### VirtualMachineExtensions_CreateOrUpdate

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatus;
import com.azure.resourcemanager.compute.generated.models.StatusLevelTypes;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionInstanceView;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualMachineExtensions CreateOrUpdate. */
public final class VirtualMachineExtensionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachineExtensions_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensions_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionsCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineExtensions()
            .define("aaaaaaaaaaaaaaaaaaaaaaaa")
            .withRegion("westus")
            .withExistingVirtualMachine("rgcompute", "aaaa")
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachineExtensions_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensions_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionsCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) throws IOException {
        manager
            .virtualMachineExtensions()
            .define("aaaaaaaaaaaaa")
            .withRegion("westus")
            .withExistingVirtualMachine("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaa")
            .withTags(mapOf("key9183", "aa"))
            .withForceUpdateTag("a")
            .withPublisher("extPublisher")
            .withTypePropertiesType("extType")
            .withTypeHandlerVersion("1.2")
            .withAutoUpgradeMinorVersion(true)
            .withEnableAutomaticUpgrade(true)
            .withSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
            .withProtectedSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
            .withInstanceView(
                new VirtualMachineExtensionInstanceView()
                    .withName("aaaaaaaaaaaaaaaaa")
                    .withType("aaaaaaaaa")
                    .withTypeHandlerVersion("aaaaaaaaaaaaaaaaaaaaaaaaaa")
                    .withSubstatuses(
                        Arrays
                            .asList(
                                new InstanceViewStatus()
                                    .withCode("aaaaaaaaaaaaaaaaaaaaaaa")
                                    .withLevel(StatusLevelTypes.INFO)
                                    .withDisplayStatus("aaaaaa")
                                    .withMessage("a")
                                    .withTime(OffsetDateTime.parse("2021-11-30T12:58:26.522Z"))))
                    .withStatuses(
                        Arrays
                            .asList(
                                new InstanceViewStatus()
                                    .withCode("aaaaaaaaaaaaaaaaaaaaaaa")
                                    .withLevel(StatusLevelTypes.INFO)
                                    .withDisplayStatus("aaaaaa")
                                    .withMessage("a")
                                    .withTime(OffsetDateTime.parse("2021-11-30T12:58:26.522Z")))))
            .withSuppressFailures(true)
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

### VirtualMachineExtensions_Delete

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineExtensions Delete. */
public final class VirtualMachineExtensionsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachineExtensions_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensions_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionsDeleteMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineExtensions()
            .delete("rgcompute", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachineExtensions_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensions_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionsDeleteMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineExtensions().delete("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aa", Context.NONE);
    }
}
```

### VirtualMachineExtensions_Get

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineExtensions Get. */
public final class VirtualMachineExtensionsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachineExtensions_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensions_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionsGetMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineExtensions()
            .getWithResponse("rgcompute", "a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachineExtensions_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensions_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionsGetMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineExtensions()
            .getWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaa", "aaaaaa", Context.NONE);
    }
}
```

### VirtualMachineExtensions_List

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineExtensions List. */
public final class VirtualMachineExtensionsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachineExtensions_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensions_List_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionsListMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineExtensions()
            .listWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachineExtensions_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensions_List_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionsListMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineExtensions()
            .listWithResponse("rgcompute", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", Context.NONE);
    }
}
```

### VirtualMachineExtensions_Update

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtension;
import java.io.IOException;

/** Samples for VirtualMachineExtensions Update. */
public final class VirtualMachineExtensionsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachineExtensions_Update.json
     */
    /**
     * Sample code: Update VM extension.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateVMExtension(com.azure.resourcemanager.compute.generated.ComputeManager manager)
        throws IOException {
        VirtualMachineExtension resource =
            manager
                .virtualMachineExtensions()
                .getWithResponse("myResourceGroup", "myVM", "myVMExtension", null, Context.NONE)
                .getValue();
        resource
            .update()
            .withPublisher("extPublisher")
            .withType("extType")
            .withTypeHandlerVersion("1.2")
            .withAutoUpgradeMinorVersion(true)
            .withSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{\"UserName\":\"xyz@microsoft.com\"}", Object.class, SerializerEncoding.JSON))
            .withSuppressFailures(true)
            .withProtectedSettingsFromKeyVault(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize(
                        "{\"secretUrl\":\"https://kvName.vault.azure.net/secrets/secretName/79b88b3a6f5440ffb2e73e44a0db712e\",\"sourceVault\":{\"id\":\"/subscriptions/a53f7094-a16c-47af-abe4-b05c05d0d79a/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/vaults/kvName\"}}",
                        Object.class,
                        SerializerEncoding.JSON))
            .apply();
    }
}
```

### VirtualMachineRunCommands_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.generated.models.RunCommandInputParameter;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandScriptSource;
import java.util.Arrays;

/** Samples for VirtualMachineRunCommands CreateOrUpdate. */
public final class VirtualMachineRunCommandsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineRunCommand_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateARunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineRunCommands()
            .define("myRunCommand")
            .withRegion("West US")
            .withExistingVirtualMachine("myResourceGroup", "myVM")
            .withSource(new VirtualMachineRunCommandScriptSource().withScript("Write-Host Hello World!"))
            .withParameters(
                Arrays
                    .asList(
                        new RunCommandInputParameter().withName("param1").withValue("value1"),
                        new RunCommandInputParameter().withName("param2").withValue("value2")))
            .withAsyncExecution(false)
            .withRunAsUser("user1")
            .withRunAsPassword("<runAsPassword>")
            .withTimeoutInSeconds(3600)
            .create();
    }
}
```

### VirtualMachineRunCommands_Delete

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineRunCommands Delete. */
public final class VirtualMachineRunCommandsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineRunCommand_Delete.json
     */
    /**
     * Sample code: Delete a run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteARunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineRunCommands().delete("myResourceGroup", "myVM", "myRunCommand", Context.NONE);
    }
}
```

### VirtualMachineRunCommands_Get

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineRunCommands Get. */
public final class VirtualMachineRunCommandsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/RunCommand_Get.json
     */
    /**
     * Sample code: VirtualMachineRunCommandGet.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineRunCommandGet(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineRunCommands().getWithResponse("SoutheastAsia", "RunPowerShellScript", Context.NONE);
    }
}
```

### VirtualMachineRunCommands_GetByVirtualMachine

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineRunCommands GetByVirtualMachine. */
public final class VirtualMachineRunCommandsGetByVirtualMachineSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineRunCommand_Get.json
     */
    /**
     * Sample code: Get a run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getARunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineRunCommands()
            .getByVirtualMachineWithResponse("myResourceGroup", "myVM", "myRunCommand", null, Context.NONE);
    }
}
```

### VirtualMachineRunCommands_List

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineRunCommands List. */
public final class VirtualMachineRunCommandsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/RunCommand_List.json
     */
    /**
     * Sample code: VirtualMachineRunCommandList.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineRunCommandList(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineRunCommands().list("SoutheastAsia", Context.NONE);
    }
}
```

### VirtualMachineRunCommands_ListByVirtualMachine

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineRunCommands ListByVirtualMachine. */
public final class VirtualMachineRunCommandsListByVirtualMachineSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineRunCommand_List.json
     */
    /**
     * Sample code: List run commands in a Virtual Machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listRunCommandsInAVirtualMachine(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineRunCommands().listByVirtualMachine("myResourceGroup", "myVM", null, Context.NONE);
    }
}
```

### VirtualMachineRunCommands_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommand;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandScriptSource;

/** Samples for VirtualMachineRunCommands Update. */
public final class VirtualMachineRunCommandsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineRunCommand_Update.json
     */
    /**
     * Sample code: Update a run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateARunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        VirtualMachineRunCommand resource =
            manager
                .virtualMachineRunCommands()
                .getByVirtualMachineWithResponse("myResourceGroup", "myVM", "myRunCommand", null, Context.NONE)
                .getValue();
        resource
            .update()
            .withSource(new VirtualMachineRunCommandScriptSource().withScript("Write-Host Script Source Updated!"))
            .apply();
    }
}
```

### VirtualMachineScaleSetVMRunCommands_CreateOrUpdate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineRunCommandInner;
import com.azure.resourcemanager.compute.generated.models.RunCommandInputParameter;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandScriptSource;
import java.util.Arrays;

/** Samples for VirtualMachineScaleSetVMRunCommands CreateOrUpdate. */
public final class VirtualMachineScaleSetVMRunCommandsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineScaleSetVMRunCommand_CreateOrUpdate.json
     */
    /**
     * Sample code: Create VirtualMachineScaleSet VM run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createVirtualMachineScaleSetVMRunCommand(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMRunCommands()
            .createOrUpdate(
                "myResourceGroup",
                "myvmScaleSet",
                "0",
                "myRunCommand",
                new VirtualMachineRunCommandInner()
                    .withLocation("West US")
                    .withSource(new VirtualMachineRunCommandScriptSource().withScript("Write-Host Hello World!"))
                    .withParameters(
                        Arrays
                            .asList(
                                new RunCommandInputParameter().withName("param1").withValue("value1"),
                                new RunCommandInputParameter().withName("param2").withValue("value2")))
                    .withAsyncExecution(false)
                    .withRunAsUser("user1")
                    .withRunAsPassword("<runAsPassword>")
                    .withTimeoutInSeconds(3600),
                Context.NONE);
    }
}
```

### VirtualMachineScaleSetVMRunCommands_Delete

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMRunCommands Delete. */
public final class VirtualMachineScaleSetVMRunCommandsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineScaleSetVMRunCommand_Delete.json
     */
    /**
     * Sample code: Delete VirtualMachineScaleSet VM run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteVirtualMachineScaleSetVMRunCommand(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMRunCommands()
            .delete("myResourceGroup", "myvmScaleSet", "0", "myRunCommand", Context.NONE);
    }
}
```

### VirtualMachineScaleSetVMRunCommands_Get

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMRunCommands Get. */
public final class VirtualMachineScaleSetVMRunCommandsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineScaleSetVMRunCommand_Get.json
     */
    /**
     * Sample code: Get VirtualMachineScaleSet VM run commands.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getVirtualMachineScaleSetVMRunCommands(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMRunCommands()
            .getWithResponse("myResourceGroup", "myvmScaleSet", "0", "myRunCommand", null, Context.NONE);
    }
}
```

### VirtualMachineScaleSetVMRunCommands_List

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMRunCommands List. */
public final class VirtualMachineScaleSetVMRunCommandsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineScaleSetVMRunCommand_List.json
     */
    /**
     * Sample code: List run commands in Vmss instance.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listRunCommandsInVmssInstance(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSetVMRunCommands().list("myResourceGroup", "myvmScaleSet", "0", null, Context.NONE);
    }
}
```

### VirtualMachineScaleSetVMRunCommands_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandScriptSource;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandUpdate;

/** Samples for VirtualMachineScaleSetVMRunCommands Update. */
public final class VirtualMachineScaleSetVMRunCommandsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineScaleSetVMRunCommand_Update.json
     */
    /**
     * Sample code: Update VirtualMachineScaleSet VM run command.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateVirtualMachineScaleSetVMRunCommand(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMRunCommands()
            .update(
                "myResourceGroup",
                "myvmScaleSet",
                "0",
                "myRunCommand",
                new VirtualMachineRunCommandUpdate()
                    .withSource(
                        new VirtualMachineRunCommandScriptSource().withScript("Write-Host Script Source Updated!")),
                Context.NONE);
    }
}
```

### VirtualMachineScaleSetVMs_RunCommand

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.RunCommandInput;
import java.util.Arrays;

/** Samples for VirtualMachineScaleSetVMs RunCommand. */
public final class VirtualMachineScaleSetVMsRunCommandSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineScaleSetVMRunCommand.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVMs_RunCommand.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetVMsRunCommand(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachineScaleSetVMs()
            .runCommand(
                "myResourceGroup",
                "myVirtualMachineScaleSet",
                "0",
                new RunCommandInput()
                    .withCommandId("RunPowerShellScript")
                    .withScript(Arrays.asList("Write-Host Hello World!")),
                Context.NONE);
    }
}
```

### VirtualMachines_AssessPatches

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines AssessPatches. */
public final class VirtualMachinesAssessPatchesSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_AssessPatches.json
     */
    /**
     * Sample code: Assess patch state of a virtual machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void assessPatchStateOfAVirtualMachine(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().assessPatches("myResourceGroupName", "myVMName", Context.NONE);
    }
}
```

### VirtualMachines_Capture

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineCaptureParameters;

/** Samples for VirtualMachines Capture. */
public final class VirtualMachinesCaptureSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_Capture_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Capture_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesCaptureMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .capture(
                "rgcompute",
                "aaaaaaaaaaaaaaaaaaaa",
                new VirtualMachineCaptureParameters()
                    .withVhdPrefix("aaaaaaaaa")
                    .withDestinationContainerName("aaaaaaa")
                    .withOverwriteVhds(true),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_Capture_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Capture_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesCaptureMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .capture(
                "rgcompute",
                "aaaaaaaaaaaaa",
                new VirtualMachineCaptureParameters()
                    .withVhdPrefix("aaaaaaaaa")
                    .withDestinationContainerName("aaaaaaa")
                    .withOverwriteVhds(true),
                Context.NONE);
    }
}
```

### VirtualMachines_ConvertToManagedDisks

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines ConvertToManagedDisks. */
public final class VirtualMachinesConvertToManagedDisksSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_ConvertToManagedDisks_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_ConvertToManagedDisks_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesConvertToManagedDisksMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().convertToManagedDisks("rgcompute", "aaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_ConvertToManagedDisks_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_ConvertToManagedDisks_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesConvertToManagedDisksMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().convertToManagedDisks("rgcompute", "aaaaaaa", Context.NONE);
    }
}
```

### VirtualMachines_CreateOrUpdate

```java
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.ApplicationProfile;
import com.azure.resourcemanager.compute.generated.models.BootDiagnostics;
import com.azure.resourcemanager.compute.generated.models.CachingTypes;
import com.azure.resourcemanager.compute.generated.models.CapacityReservationProfile;
import com.azure.resourcemanager.compute.generated.models.DataDisk;
import com.azure.resourcemanager.compute.generated.models.DeleteOptions;
import com.azure.resourcemanager.compute.generated.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.generated.models.DiffDiskOptions;
import com.azure.resourcemanager.compute.generated.models.DiffDiskPlacement;
import com.azure.resourcemanager.compute.generated.models.DiffDiskSettings;
import com.azure.resourcemanager.compute.generated.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetParameters;
import com.azure.resourcemanager.compute.generated.models.HardwareProfile;
import com.azure.resourcemanager.compute.generated.models.ImageReference;
import com.azure.resourcemanager.compute.generated.models.LinuxConfiguration;
import com.azure.resourcemanager.compute.generated.models.LinuxPatchAssessmentMode;
import com.azure.resourcemanager.compute.generated.models.LinuxPatchSettings;
import com.azure.resourcemanager.compute.generated.models.LinuxVMGuestPatchAutomaticByPlatformRebootSetting;
import com.azure.resourcemanager.compute.generated.models.LinuxVMGuestPatchAutomaticByPlatformSettings;
import com.azure.resourcemanager.compute.generated.models.LinuxVMGuestPatchMode;
import com.azure.resourcemanager.compute.generated.models.ManagedDiskParameters;
import com.azure.resourcemanager.compute.generated.models.NetworkApiVersion;
import com.azure.resourcemanager.compute.generated.models.NetworkInterfaceReference;
import com.azure.resourcemanager.compute.generated.models.NetworkProfile;
import com.azure.resourcemanager.compute.generated.models.OSDisk;
import com.azure.resourcemanager.compute.generated.models.OSProfile;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.PatchSettings;
import com.azure.resourcemanager.compute.generated.models.Plan;
import com.azure.resourcemanager.compute.generated.models.PublicIpAddressSku;
import com.azure.resourcemanager.compute.generated.models.PublicIpAddressSkuName;
import com.azure.resourcemanager.compute.generated.models.PublicIpAddressSkuTier;
import com.azure.resourcemanager.compute.generated.models.PublicIpAllocationMethod;
import com.azure.resourcemanager.compute.generated.models.ScheduledEventsProfile;
import com.azure.resourcemanager.compute.generated.models.SecurityEncryptionTypes;
import com.azure.resourcemanager.compute.generated.models.SecurityProfile;
import com.azure.resourcemanager.compute.generated.models.SecurityTypes;
import com.azure.resourcemanager.compute.generated.models.SshConfiguration;
import com.azure.resourcemanager.compute.generated.models.SshPublicKey;
import com.azure.resourcemanager.compute.generated.models.StorageAccountTypes;
import com.azure.resourcemanager.compute.generated.models.StorageProfile;
import com.azure.resourcemanager.compute.generated.models.TerminateNotificationProfile;
import com.azure.resourcemanager.compute.generated.models.UefiSettings;
import com.azure.resourcemanager.compute.generated.models.VMDiskSecurityProfile;
import com.azure.resourcemanager.compute.generated.models.VMGalleryApplication;
import com.azure.resourcemanager.compute.generated.models.VMSizeProperties;
import com.azure.resourcemanager.compute.generated.models.VirtualHardDisk;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineNetworkInterfaceConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineNetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachinePublicIpAddressConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineSizeTypes;
import com.azure.resourcemanager.compute.generated.models.WindowsConfiguration;
import com.azure.resourcemanager.compute.generated.models.WindowsPatchAssessmentMode;
import com.azure.resourcemanager.compute.generated.models.WindowsVMGuestPatchAutomaticByPlatformRebootSetting;
import com.azure.resourcemanager.compute.generated.models.WindowsVMGuestPatchAutomaticByPlatformSettings;
import com.azure.resourcemanager.compute.generated.models.WindowsVMGuestPatchMode;
import java.util.Arrays;

/** Samples for VirtualMachines CreateOrUpdate. */
public final class VirtualMachinesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_FromASharedGalleryImage.json
     */
    /**
     * Sample code: Create a VM from a shared gallery image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVMFromASharedGalleryImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withSharedGalleryImageId(
                                "/SharedGalleries/sharedGalleryName/Images/sharedGalleryImageName/Versions/sharedGalleryImageVersionName"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_CreateWithVMSizeProperties.json
     */
    /**
     * Sample code: Create a VM with VM Size Properties.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVMWithVMSizeProperties(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(
                new HardwareProfile()
                    .withVmSize(VirtualMachineSizeTypes.STANDARD_D4_V3)
                    .withVmSizeProperties(new VMSizeProperties().withVCpusAvailable(1).withVCpusPerCore(1)))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withDiagnosticsProfile(
                new DiagnosticsProfile()
                    .withBootDiagnostics(
                        new BootDiagnostics()
                            .withEnabled(true)
                            .withStorageUri("http://{existing-storage-account-name}.blob.core.windows.net")))
            .withUserData("U29tZSBDdXN0b20gRGF0YQ==")
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_PlatformImageVmWithUnmanagedOsAndDataDisks.json
     */
    /**
     * Sample code: Create a platform-image vm with unmanaged os and data disks.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAPlatformImageVmWithUnmanagedOsAndDataDisks(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("{vm-name}")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D2_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withVhd(
                                new VirtualHardDisk()
                                    .withUri(
                                        "http://{existing-storage-account-name}.blob.core.windows.net/{existing-container-name}/myDisk.vhd"))
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE))
                    .withDataDisks(
                        Arrays
                            .asList(
                                new DataDisk()
                                    .withLun(0)
                                    .withVhd(
                                        new VirtualHardDisk()
                                            .withUri(
                                                "http://{existing-storage-account-name}.blob.core.windows.net/{existing-container-name}/myDisk0.vhd"))
                                    .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                    .withDiskSizeGB(1023),
                                new DataDisk()
                                    .withLun(1)
                                    .withVhd(
                                        new VirtualHardDisk()
                                            .withUri(
                                                "http://{existing-storage-account-name}.blob.core.windows.net/{existing-container-name}/myDisk1.vhd"))
                                    .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                    .withDiskSizeGB(1023))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_LinuxVmWithPatchSettingModesOfAutomaticByPlatform.json
     */
    /**
     * Sample code: Create a Linux vm with a patch settings patchMode and assessmentMode set to AutomaticByPlatform.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createALinuxVmWithAPatchSettingsPatchModeAndAssessmentModeSetToAutomaticByPlatform(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D2S_V3))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("Canonical")
                            .withOffer("UbuntuServer")
                            .withSku("16.04-LTS")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}")
                    .withLinuxConfiguration(
                        new LinuxConfiguration()
                            .withProvisionVMAgent(true)
                            .withPatchSettings(
                                new LinuxPatchSettings()
                                    .withPatchMode(LinuxVMGuestPatchMode.AUTOMATIC_BY_PLATFORM)
                                    .withAssessmentMode(LinuxPatchAssessmentMode.AUTOMATIC_BY_PLATFORM))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithADiffOsDiskUsingDiffDiskPlacementAsCacheDisk.json
     */
    /**
     * Sample code: Create a vm with ephemeral os disk provisioning in Cache disk using placement property.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithEphemeralOsDiskProvisioningInCacheDiskUsingPlacementProperty(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withPlan(
                new Plan()
                    .withName("windows2016")
                    .withPublisher("microsoft-ads")
                    .withProduct("windows-data-science-vm"))
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_DS1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("microsoft-ads")
                            .withOffer("windows-data-science-vm")
                            .withSku("windows2016")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_ONLY)
                            .withDiffDiskSettings(
                                new DiffDiskSettings()
                                    .withOption(DiffDiskOptions.LOCAL)
                                    .withPlacement(DiffDiskPlacement.CACHE_DISK))
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithAMarketplaceImagePlan.json
     */
    /**
     * Sample code: Create a vm with a marketplace image plan.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithAMarketplaceImagePlan(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withPlan(
                new Plan()
                    .withName("windows2016")
                    .withPublisher("microsoft-ads")
                    .withProduct("windows-data-science-vm"))
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("microsoft-ads")
                            .withOffer("windows-data-science-vm")
                            .withSku("windows2016")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WindowsVmWithPatchSettingModeOfAutomaticByOS.json
     */
    /**
     * Sample code: Create a Windows vm with a patch setting patchMode of AutomaticByOS.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAWindowsVmWithAPatchSettingPatchModeOfAutomaticByOS(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}")
                    .withWindowsConfiguration(
                        new WindowsConfiguration()
                            .withProvisionVMAgent(true)
                            .withEnableAutomaticUpdates(true)
                            .withPatchSettings(
                                new PatchSettings().withPatchMode(WindowsVMGuestPatchMode.AUTOMATIC_BY_OS))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/nsgExistingNic")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WindowsVmWithPatchSettingModesOfAutomaticByPlatform.json
     */
    /**
     * Sample code: Create a Windows vm with patch settings patchMode and assessmentMode set to AutomaticByPlatform.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAWindowsVmWithPatchSettingsPatchModeAndAssessmentModeSetToAutomaticByPlatform(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}")
                    .withWindowsConfiguration(
                        new WindowsConfiguration()
                            .withProvisionVMAgent(true)
                            .withEnableAutomaticUpdates(true)
                            .withPatchSettings(
                                new PatchSettings()
                                    .withPatchMode(WindowsVMGuestPatchMode.AUTOMATIC_BY_PLATFORM)
                                    .withAssessmentMode(WindowsPatchAssessmentMode.AUTOMATIC_BY_PLATFORM))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WindowsVmWithPatchSettingAssessmentModeOfImageDefault.json
     */
    /**
     * Sample code: Create a Windows vm with a patch setting assessmentMode of ImageDefault.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAWindowsVmWithAPatchSettingAssessmentModeOfImageDefault(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}")
                    .withWindowsConfiguration(
                        new WindowsConfiguration()
                            .withProvisionVMAgent(true)
                            .withEnableAutomaticUpdates(true)
                            .withPatchSettings(
                                new PatchSettings().withAssessmentMode(WindowsPatchAssessmentMode.IMAGE_DEFAULT))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithPremiumStorage.json
     */
    /**
     * Sample code: Create a vm with premium storage.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithPremiumStorage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithCapacityReservation.json
     */
    /**
     * Sample code: Create or update a VM with capacity reservation.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateAVMWithCapacityReservation(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withPlan(
                new Plan()
                    .withName("windows2016")
                    .withPublisher("microsoft-ads")
                    .withProduct("windows-data-science-vm"))
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_DS1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("microsoft-ads")
                            .withOffer("windows-data-science-vm")
                            .withSku("windows2016")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_ONLY)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withCapacityReservation(
                new CapacityReservationProfile()
                    .withCapacityReservationGroup(
                        new SubResource()
                            .withId(
                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/CapacityReservationGroups/{crgName}")))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_LinuxVmWithPatchSettingAssessmentModeOfImageDefault.json
     */
    /**
     * Sample code: Create a Linux vm with a patch setting assessmentMode of ImageDefault.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createALinuxVmWithAPatchSettingAssessmentModeOfImageDefault(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D2S_V3))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("Canonical")
                            .withOffer("UbuntuServer")
                            .withSku("16.04-LTS")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}")
                    .withLinuxConfiguration(
                        new LinuxConfiguration()
                            .withProvisionVMAgent(true)
                            .withPatchSettings(
                                new LinuxPatchSettings().withAssessmentMode(LinuxPatchAssessmentMode.IMAGE_DEFAULT))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WindowsVmWithPatchSettingModeOfAutomaticByPlatformAndEnableHotPatchingTrue.json
     */
    /**
     * Sample code: Create a Windows vm with a patch setting patchMode of AutomaticByPlatform and enableHotpatching set
     * to true.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAWindowsVmWithAPatchSettingPatchModeOfAutomaticByPlatformAndEnableHotpatchingSetToTrue(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}")
                    .withWindowsConfiguration(
                        new WindowsConfiguration()
                            .withProvisionVMAgent(true)
                            .withEnableAutomaticUpdates(true)
                            .withPatchSettings(
                                new PatchSettings()
                                    .withPatchMode(WindowsVMGuestPatchMode.AUTOMATIC_BY_PLATFORM)
                                    .withEnableHotpatching(true))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithExtensionsTimeBudget.json
     */
    /**
     * Sample code: Create a vm with an extensions time budget.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithAnExtensionsTimeBudget(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withDiagnosticsProfile(
                new DiagnosticsProfile()
                    .withBootDiagnostics(
                        new BootDiagnostics()
                            .withEnabled(true)
                            .withStorageUri("http://{existing-storage-account-name}.blob.core.windows.net")))
            .withExtensionsTimeBudget("PT30M")
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_CustomImageVmFromAnUnmanagedGeneralizedOsImage.json
     */
    /**
     * Sample code: Create a custom-image vm from an unmanaged generalized os image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createACustomImageVmFromAnUnmanagedGeneralizedOsImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("{vm-name}")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withOsDisk(
                        new OSDisk()
                            .withOsType(OperatingSystemTypes.WINDOWS)
                            .withName("myVMosdisk")
                            .withVhd(
                                new VirtualHardDisk()
                                    .withUri(
                                        "http://{existing-storage-account-name}.blob.core.windows.net/{existing-container-name}/myDisk.vhd"))
                            .withImage(
                                new VirtualHardDisk()
                                    .withUri(
                                        "http://{existing-storage-account-name}.blob.core.windows.net/{existing-container-name}/{existing-generalized-os-image-blob-name}.vhd"))
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithEncryptionAtHost.json
     */
    /**
     * Sample code: Create a vm with Host Encryption using encryptionAtHost property.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithHostEncryptionUsingEncryptionAtHostProperty(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withPlan(
                new Plan()
                    .withName("windows2016")
                    .withPublisher("microsoft-ads")
                    .withProduct("windows-data-science-vm"))
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_DS1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("microsoft-ads")
                            .withOffer("windows-data-science-vm")
                            .withSku("windows2016")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_ONLY)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withSecurityProfile(new SecurityProfile().withEncryptionAtHost(true))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_InAnAvailabilitySet.json
     */
    /**
     * Sample code: Create a vm in an availability set.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmInAnAvailabilitySet(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withAvailabilitySet(
                new SubResource()
                    .withId(
                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/availabilitySets/{existing-availability-set-name}"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithEmptyDataDisks.json
     */
    /**
     * Sample code: Create a vm with empty data disks.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithEmptyDataDisks(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D2_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS)))
                    .withDataDisks(
                        Arrays
                            .asList(
                                new DataDisk()
                                    .withLun(0)
                                    .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                    .withDiskSizeGB(1023),
                                new DataDisk()
                                    .withLun(1)
                                    .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                    .withDiskSizeGB(1023))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithSecurityTypeConfidentialVM.json
     */
    /**
     * Sample code: Create a VM with securityType ConfidentialVM with Platform Managed Keys.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVMWithSecurityTypeConfidentialVMWithPlatformManagedKeys(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(
                new HardwareProfile().withVmSize(VirtualMachineSizeTypes.fromString("Standard_DC2as_v5")))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("2019-datacenter-cvm")
                            .withSku("windows-cvm")
                            .withVersion("17763.2183.2109130127"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_ONLY)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters()
                                    .withStorageAccountType(StorageAccountTypes.STANDARD_SSD_LRS)
                                    .withSecurityProfile(
                                        new VMDiskSecurityProfile()
                                            .withSecurityEncryptionType(
                                                SecurityEncryptionTypes.DISK_WITH_VMGUEST_STATE)))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withSecurityProfile(
                new SecurityProfile()
                    .withUefiSettings(new UefiSettings().withSecureBootEnabled(true).withVTpmEnabled(true))
                    .withSecurityType(SecurityTypes.CONFIDENTIAL_VM))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithNetworkInterfaceConfiguration.json
     */
    /**
     * Sample code: Create a VM with network interface configuration.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVMWithNetworkInterfaceConfiguration(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkApiVersion(NetworkApiVersion.TWO_ZERO_TWO_ZERO_ONE_ONE_ZERO_ONE)
                    .withNetworkInterfaceConfigurations(
                        Arrays
                            .asList(
                                new VirtualMachineNetworkInterfaceConfiguration()
                                    .withName("{nic-config-name}")
                                    .withPrimary(true)
                                    .withDeleteOption(DeleteOptions.DELETE)
                                    .withIpConfigurations(
                                        Arrays
                                            .asList(
                                                new VirtualMachineNetworkInterfaceIpConfiguration()
                                                    .withName("{ip-config-name}")
                                                    .withPrimary(true)
                                                    .withPublicIpAddressConfiguration(
                                                        new VirtualMachinePublicIpAddressConfiguration()
                                                            .withName("{publicIP-config-name}")
                                                            .withSku(
                                                                new PublicIpAddressSku()
                                                                    .withName(PublicIpAddressSkuName.BASIC)
                                                                    .withTier(PublicIpAddressSkuTier.GLOBAL))
                                                            .withDeleteOption(DeleteOptions.DETACH)
                                                            .withPublicIpAllocationMethod(
                                                                PublicIpAllocationMethod.STATIC)))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_FromACustomImage.json
     */
    /**
     * Sample code: Create a vm from a custom image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmFromACustomImage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withId(
                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/images/{existing-custom-image-name}"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithHibernationEnabled.json
     */
    /**
     * Sample code: Create a VM with HibernationEnabled.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVMWithHibernationEnabled(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("{vm-name}")
            .withRegion("eastus2euap")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D2S_V3))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2019-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("vmOSdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withAdditionalCapabilities(new AdditionalCapabilities().withHibernationEnabled(true))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("{vm-name}")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withDiagnosticsProfile(
                new DiagnosticsProfile()
                    .withBootDiagnostics(
                        new BootDiagnostics()
                            .withEnabled(true)
                            .withStorageUri("http://{existing-storage-account-name}.blob.core.windows.net")))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithUefiSettings.json
     */
    /**
     * Sample code: Create a VM with Uefi Settings of secureBoot and vTPM.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVMWithUefiSettingsOfSecureBootAndVTPM(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D2S_V3))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("windowsserver-gen2preview-preview")
                            .withSku("windows10-tvm")
                            .withVersion("18363.592.2001092016"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_ONLY)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters()
                                    .withStorageAccountType(StorageAccountTypes.STANDARD_SSD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withSecurityProfile(
                new SecurityProfile()
                    .withUefiSettings(new UefiSettings().withSecureBootEnabled(true).withVTpmEnabled(true))
                    .withSecurityType(SecurityTypes.TRUSTED_LAUNCH))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithApplicationProfile.json
     */
    /**
     * Sample code: Create a vm with Application Profile.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithApplicationProfile(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("{image_publisher}")
                            .withOffer("{image_offer}")
                            .withSku("{image_sku}")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withApplicationProfile(
                new ApplicationProfile()
                    .withGalleryApplications(
                        Arrays
                            .asList(
                                new VMGalleryApplication()
                                    .withTags("myTag1")
                                    .withOrder(1)
                                    .withPackageReferenceId(
                                        "/subscriptions/32c17a9e-aa7b-4ba5-a45b-e324116b6fdb/resourceGroups/myresourceGroupName2/providers/Microsoft.Compute/galleries/myGallery1/applications/MyApplication1/versions/1.0")
                                    .withConfigurationReference(
                                        "https://mystorageaccount.blob.core.windows.net/configurations/settings.config")
                                    .withTreatFailureAsDeploymentFailure(false)
                                    .withEnableAutomaticUpgrade(false),
                                new VMGalleryApplication()
                                    .withPackageReferenceId(
                                        "/subscriptions/32c17a9e-aa7b-4ba5-a45b-e324116b6fdg/resourceGroups/myresourceGroupName3/providers/Microsoft.Compute/galleries/myGallery2/applications/MyApplication2/versions/1.1"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_FromASpecializedSharedImage.json
     */
    /**
     * Sample code: Create a vm from a specialized shared image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmFromASpecializedSharedImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withId(
                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/galleries/mySharedGallery/images/mySharedImage"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithPasswordAuthentication.json
     */
    /**
     * Sample code: Create a vm with password authentication.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithPasswordAuthentication(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMacine_Create_InAVmssWithCustomerAssignedPlatformFaultDomain.json
     */
    /**
     * Sample code: Create a vm in a Virtual Machine Scale Set with customer assigned platformFaultDomain.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmInAVirtualMachineScaleSetWithCustomerAssignedPlatformFaultDomain(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withVirtualMachineScaleSet(
                new SubResource()
                    .withId(
                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachineScaleSets/{existing-flex-vmss-name-with-platformFaultDomainCount-greater-than-1}"))
            .withPlatformFaultDomain(1)
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithScheduledEventsProfile.json
     */
    /**
     * Sample code: Create a vm with Scheduled Events Profile.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithScheduledEventsProfile(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withDiagnosticsProfile(
                new DiagnosticsProfile()
                    .withBootDiagnostics(
                        new BootDiagnostics()
                            .withEnabled(true)
                            .withStorageUri("http://{existing-storage-account-name}.blob.core.windows.net")))
            .withScheduledEventsProfile(
                new ScheduledEventsProfile()
                    .withTerminateNotificationProfile(
                        new TerminateNotificationProfile().withNotBeforeTimeout("PT10M").withEnable(true)))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMacine_Create_WithBootDiagnostics.json
     */
    /**
     * Sample code: Create a vm with boot diagnostics.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithBootDiagnostics(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withDiagnosticsProfile(
                new DiagnosticsProfile()
                    .withBootDiagnostics(
                        new BootDiagnostics()
                            .withEnabled(true)
                            .withStorageUri("http://{existing-storage-account-name}.blob.core.windows.net")))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithSshAuthentication.json
     */
    /**
     * Sample code: Create a vm with ssh authentication.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithSshAuthentication(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("{image_publisher}")
                            .withOffer("{image_offer}")
                            .withSku("{image_sku}")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withLinuxConfiguration(
                        new LinuxConfiguration()
                            .withDisablePasswordAuthentication(true)
                            .withSsh(
                                new SshConfiguration()
                                    .withPublicKeys(
                                        Arrays
                                            .asList(
                                                new SshPublicKey()
                                                    .withPath("/home/{your-username}/.ssh/authorized_keys")
                                                    .withKeyData(
                                                        "ssh-rsa"
                                                            + " AAAAB3NzaC1yc2EAAAADAQABAAABAQCeClRAk2ipUs/l5voIsDC5q9RI+YSRd1Bvd/O+axgY4WiBzG+4FwJWZm/mLLe5DoOdHQwmU2FrKXZSW4w2sYE70KeWnrFViCOX5MTVvJgPE8ClugNl8RWth/tU849DvM9sT7vFgfVSHcAS2yDRyDlueii+8nF2ym8XWAPltFVCyLHRsyBp5YPqK8JFYIa1eybKsY3hEAxRCA+/7bq8et+Gj3coOsuRmrehav7rE6N12Pb80I6ofa6SM5XNYq4Xk0iYNx7R3kdz0Jj9XgZYWjAHjJmT0gTRoOnt6upOuxK7xI/ykWrllgpXrCPu3Ymz+c+ujaqcxDopnAl2lmf69/J1"))))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_FromACommunityGalleryImage.json
     */
    /**
     * Sample code: Create a VM from a community gallery image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVMFromACommunityGalleryImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withCommunityGalleryImageId(
                                "/CommunityGalleries/galleryPublicName/Images/communityGalleryImageName/Versions/communityGalleryImageVersionName"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithADiffOsDiskUsingDiffDiskPlacementAsResourceDisk.json
     */
    /**
     * Sample code: Create a vm with ephemeral os disk provisioning in Resource disk using placement property.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithEphemeralOsDiskProvisioningInResourceDiskUsingPlacementProperty(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withPlan(
                new Plan()
                    .withName("windows2016")
                    .withPublisher("microsoft-ads")
                    .withProduct("windows-data-science-vm"))
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_DS1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("microsoft-ads")
                            .withOffer("windows-data-science-vm")
                            .withSku("windows2016")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_ONLY)
                            .withDiffDiskSettings(
                                new DiffDiskSettings()
                                    .withOption(DiffDiskOptions.LOCAL)
                                    .withPlacement(DiffDiskPlacement.RESOURCE_DISK))
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithADiffOsDisk.json
     */
    /**
     * Sample code: Create a vm with ephemeral os disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithEphemeralOsDisk(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withPlan(
                new Plan()
                    .withName("windows2016")
                    .withPublisher("microsoft-ads")
                    .withProduct("windows-data-science-vm"))
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_DS1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("microsoft-ads")
                            .withOffer("windows-data-science-vm")
                            .withSku("windows2016")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_ONLY)
                            .withDiffDiskSettings(new DiffDiskSettings().withOption(DiffDiskOptions.LOCAL))
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithUserData.json
     */
    /**
     * Sample code: Create a VM with UserData.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVMWithUserData(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("{vm-name}")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("vmOSdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("{vm-name}")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withDiagnosticsProfile(
                new DiagnosticsProfile()
                    .withBootDiagnostics(
                        new BootDiagnostics()
                            .withEnabled(true)
                            .withStorageUri("http://{existing-storage-account-name}.blob.core.windows.net")))
            .withUserData("RXhhbXBsZSBVc2VyRGF0YQ==")
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_FromAGeneralizedSharedImage.json
     */
    /**
     * Sample code: Create a vm from a generalized shared image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmFromAGeneralizedSharedImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withId(
                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/galleries/mySharedGallery/images/mySharedImage"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_LinuxVmWithAutomaticByPlatformSettings.json
     */
    /**
     * Sample code: Create a Linux vm with a patch setting patchMode of AutomaticByPlatform and
     * AutomaticByPlatformSettings.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createALinuxVmWithAPatchSettingPatchModeOfAutomaticByPlatformAndAutomaticByPlatformSettings(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D2S_V3))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("Canonical")
                            .withOffer("UbuntuServer")
                            .withSku("16.04-LTS")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}")
                    .withLinuxConfiguration(
                        new LinuxConfiguration()
                            .withProvisionVMAgent(true)
                            .withPatchSettings(
                                new LinuxPatchSettings()
                                    .withPatchMode(LinuxVMGuestPatchMode.AUTOMATIC_BY_PLATFORM)
                                    .withAssessmentMode(LinuxPatchAssessmentMode.AUTOMATIC_BY_PLATFORM)
                                    .withAutomaticByPlatformSettings(
                                        new LinuxVMGuestPatchAutomaticByPlatformSettings()
                                            .withRebootSetting(
                                                LinuxVMGuestPatchAutomaticByPlatformRebootSetting.NEVER)))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WindowsVmWithPatchSettingModeOfManual.json
     */
    /**
     * Sample code: Create a Windows vm with a patch setting patchMode of Manual.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAWindowsVmWithAPatchSettingPatchModeOfManual(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}")
                    .withWindowsConfiguration(
                        new WindowsConfiguration()
                            .withProvisionVMAgent(true)
                            .withEnableAutomaticUpdates(true)
                            .withPatchSettings(new PatchSettings().withPatchMode(WindowsVMGuestPatchMode.MANUAL))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithSecurityTypeConfidentialVMWithCustomerManagedKeys.json
     */
    /**
     * Sample code: Create a VM with securityType ConfidentialVM with Customer Managed Keys.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVMWithSecurityTypeConfidentialVMWithCustomerManagedKeys(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(
                new HardwareProfile().withVmSize(VirtualMachineSizeTypes.fromString("Standard_DC2as_v5")))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("2019-datacenter-cvm")
                            .withSku("windows-cvm")
                            .withVersion("17763.2183.2109130127"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_ONLY)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters()
                                    .withStorageAccountType(StorageAccountTypes.STANDARD_SSD_LRS)
                                    .withSecurityProfile(
                                        new VMDiskSecurityProfile()
                                            .withSecurityEncryptionType(SecurityEncryptionTypes.DISK_WITH_VMGUEST_STATE)
                                            .withDiskEncryptionSet(
                                                new DiskEncryptionSetParameters()
                                                    .withId(
                                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withSecurityProfile(
                new SecurityProfile()
                    .withUefiSettings(new UefiSettings().withSecureBootEnabled(true).withVTpmEnabled(true))
                    .withSecurityType(SecurityTypes.CONFIDENTIAL_VM))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_LinuxVmWithPatchSettingModeOfImageDefault.json
     */
    /**
     * Sample code: Create a Linux vm with a patch setting patchMode of ImageDefault.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createALinuxVmWithAPatchSettingPatchModeOfImageDefault(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D2S_V3))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("Canonical")
                            .withOffer("UbuntuServer")
                            .withSku("16.04-LTS")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}")
                    .withLinuxConfiguration(
                        new LinuxConfiguration()
                            .withProvisionVMAgent(true)
                            .withPatchSettings(
                                new LinuxPatchSettings().withPatchMode(LinuxVMGuestPatchMode.IMAGE_DEFAULT))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithManagedBootDiagnostics.json
     */
    /**
     * Sample code: Create a vm with managed boot diagnostics.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithManagedBootDiagnostics(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .withDiagnosticsProfile(
                new DiagnosticsProfile().withBootDiagnostics(new BootDiagnostics().withEnabled(true)))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WithDiskEncryptionSetResource.json
     */
    /**
     * Sample code: Create a vm with DiskEncryptionSet resource id in the os disk and data disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVmWithDiskEncryptionSetResourceIdInTheOsDiskAndDataDisk(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withId(
                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/images/{existing-custom-image-name}"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters()
                                    .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                    .withDiskEncryptionSet(
                                        new DiskEncryptionSetParameters()
                                            .withId(
                                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))))
                    .withDataDisks(
                        Arrays
                            .asList(
                                new DataDisk()
                                    .withLun(0)
                                    .withCaching(CachingTypes.READ_WRITE)
                                    .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                    .withDiskSizeGB(1023)
                                    .withManagedDisk(
                                        new ManagedDiskParameters()
                                            .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                            .withDiskEncryptionSet(
                                                new DiskEncryptionSetParameters()
                                                    .withId(
                                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))),
                                new DataDisk()
                                    .withLun(1)
                                    .withCaching(CachingTypes.READ_WRITE)
                                    .withCreateOption(DiskCreateOptionTypes.ATTACH)
                                    .withDiskSizeGB(1023)
                                    .withManagedDisk(
                                        new ManagedDiskParameters()
                                            .withId(
                                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/{existing-managed-disk-name}")
                                            .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                            .withDiskEncryptionSet(
                                                new DiskEncryptionSetParameters()
                                                    .withId(
                                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Create_WindowsVmWithAutomaticByPlatformSettings.json
     */
    /**
     * Sample code: Create a Windows vm with a patch setting patchMode of AutomaticByPlatform and
     * AutomaticByPlatformSettings.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAWindowsVmWithAPatchSettingPatchModeOfAutomaticByPlatformAndAutomaticByPlatformSettings(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .define("myVM")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D1_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.PREMIUM_LRS))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}")
                    .withWindowsConfiguration(
                        new WindowsConfiguration()
                            .withProvisionVMAgent(true)
                            .withEnableAutomaticUpdates(true)
                            .withPatchSettings(
                                new PatchSettings()
                                    .withPatchMode(WindowsVMGuestPatchMode.AUTOMATIC_BY_PLATFORM)
                                    .withAssessmentMode(WindowsPatchAssessmentMode.AUTOMATIC_BY_PLATFORM)
                                    .withAutomaticByPlatformSettings(
                                        new WindowsVMGuestPatchAutomaticByPlatformSettings()
                                            .withRebootSetting(
                                                WindowsVMGuestPatchAutomaticByPlatformRebootSetting.NEVER)))))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .create();
    }
}
```

### VirtualMachines_Deallocate

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines Deallocate. */
public final class VirtualMachinesDeallocateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_Deallocate_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Deallocate_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesDeallocateMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().deallocate("rgcompute", "aaaaaaaaaaaaaaaa", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_Deallocate_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Deallocate_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesDeallocateMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().deallocate("rgcompute", "aaaaaaaaaa", true, Context.NONE);
    }
}
```

### VirtualMachines_Delete

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines Delete. */
public final class VirtualMachinesDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Delete_Force.json
     */
    /**
     * Sample code: Force delete a VM.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void forceDeleteAVM(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().delete("myResourceGroup", "myVM", true, Context.NONE);
    }
}
```

### VirtualMachines_Generalize

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines Generalize. */
public final class VirtualMachinesGeneralizeSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Generalize.json
     */
    /**
     * Sample code: Generalize a Virtual Machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void generalizeAVirtualMachine(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().generalizeWithResponse("myResourceGroup", "myVMName", Context.NONE);
    }
}
```

### VirtualMachines_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines GetByResourceGroup. */
public final class VirtualMachinesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Get_WithVMSizeProperties.json
     */
    /**
     * Sample code: Get a virtual machine with VM Size Properties.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAVirtualMachineWithVMSizeProperties(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().getByResourceGroupWithResponse("myResourceGroup", "myVM", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Get_AutoPlacedOnDedicatedHostGroup.json
     */
    /**
     * Sample code: Get a virtual machine placed on a dedicated host group through automatic placement.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAVirtualMachinePlacedOnADedicatedHostGroupThroughAutomaticPlacement(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().getByResourceGroupWithResponse("myResourceGroup", "myVM", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Get.json
     */
    /**
     * Sample code: Get a Virtual Machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAVirtualMachine(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().getByResourceGroupWithResponse("myResourceGroup", "myVM", null, Context.NONE);
    }
}
```

### VirtualMachines_InstallPatches

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.VMGuestPatchClassificationWindows;
import com.azure.resourcemanager.compute.generated.models.VMGuestPatchRebootSetting;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineInstallPatchesParameters;
import com.azure.resourcemanager.compute.generated.models.WindowsParameters;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for VirtualMachines InstallPatches. */
public final class VirtualMachinesInstallPatchesSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_InstallPatches.json
     */
    /**
     * Sample code: Install patch state of a virtual machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void installPatchStateOfAVirtualMachine(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .installPatches(
                "myResourceGroupName",
                "myVMName",
                new VirtualMachineInstallPatchesParameters()
                    .withMaximumDuration("PT4H")
                    .withRebootSetting(VMGuestPatchRebootSetting.IF_REQUIRED)
                    .withWindowsParameters(
                        new WindowsParameters()
                            .withClassificationsToInclude(
                                Arrays
                                    .asList(
                                        VMGuestPatchClassificationWindows.CRITICAL,
                                        VMGuestPatchClassificationWindows.SECURITY))
                            .withMaxPatchPublishDate(OffsetDateTime.parse("2020-11-19T02:36:43.0539904+00:00"))),
                Context.NONE);
    }
}
```

### VirtualMachines_InstanceView

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines InstanceView. */
public final class VirtualMachinesInstanceViewSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Get_InstanceView.json
     */
    /**
     * Sample code: Get Virtual Machine Instance View.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getVirtualMachineInstanceView(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().instanceViewWithResponse("myResourceGroup", "myVM", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Get_InstanceViewAutoPlacedOnDedicatedHostGroup.json
     */
    /**
     * Sample code: Get instance view of a virtual machine placed on a dedicated host group through automatic placement.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getInstanceViewOfAVirtualMachinePlacedOnADedicatedHostGroupThroughAutomaticPlacement(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().instanceViewWithResponse("myResourceGroup", "myVM", Context.NONE);
    }
}
```

### VirtualMachines_List

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines List. */
public final class VirtualMachinesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_ListAll_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_ListAll_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesListAllMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().list(null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_ListAll_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_ListAll_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesListAllMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().list("aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", Context.NONE);
    }
}
```

### VirtualMachines_ListAvailableSizes

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines ListAvailableSizes. */
public final class VirtualMachinesListAvailableSizesSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_ListAvailableVmSizes.json
     */
    /**
     * Sample code: Lists all available virtual machine sizes to which the specified virtual machine can be resized.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listsAllAvailableVirtualMachineSizesToWhichTheSpecifiedVirtualMachineCanBeResized(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().listAvailableSizes("myResourceGroup", "myVmName", Context.NONE);
    }
}
```

### VirtualMachines_ListByLocation

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines ListByLocation. */
public final class VirtualMachinesListByLocationSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_ListBySubscription_ByLocation.json
     */
    /**
     * Sample code: Lists all the virtual machines under the specified subscription for the specified location.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listsAllTheVirtualMachinesUnderTheSpecifiedSubscriptionForTheSpecifiedLocation(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().listByLocation("eastus", Context.NONE);
    }
}
```

### VirtualMachines_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines ListByResourceGroup. */
public final class VirtualMachinesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_List_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesListMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().listByResourceGroup("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_List_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesListMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().listByResourceGroup("rgcompute", null, Context.NONE);
    }
}
```

### VirtualMachines_PerformMaintenance

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines PerformMaintenance. */
public final class VirtualMachinesPerformMaintenanceSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_PerformMaintenance_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_PerformMaintenance_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesPerformMaintenanceMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().performMaintenance("rgcompute", "aaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_PerformMaintenance_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_PerformMaintenance_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesPerformMaintenanceMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().performMaintenance("rgcompute", "aaaaaaa", Context.NONE);
    }
}
```

### VirtualMachines_PowerOff

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines PowerOff. */
public final class VirtualMachinesPowerOffSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_PowerOff_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_PowerOff_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesPowerOffMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().powerOff("rgcompute", "aaaaaaaaaaaaaaaaaa", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_PowerOff_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_PowerOff_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesPowerOffMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().powerOff("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", true, Context.NONE);
    }
}
```

### VirtualMachines_Reapply

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines Reapply. */
public final class VirtualMachinesReapplySamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Reapply.json
     */
    /**
     * Sample code: Reapply the state of a virtual machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void reapplyTheStateOfAVirtualMachine(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().reapply("ResourceGroup", "VMName", Context.NONE);
    }
}
```

### VirtualMachines_Redeploy

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines Redeploy. */
public final class VirtualMachinesRedeploySamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_Redeploy_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Redeploy_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesRedeployMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().redeploy("rgcompute", "aaaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_Redeploy_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Redeploy_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesRedeployMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().redeploy("rgcompute", "a", Context.NONE);
    }
}
```

### VirtualMachines_Reimage

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineReimageParameters;

/** Samples for VirtualMachines Reimage. */
public final class VirtualMachinesReimageSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Reimage.json
     */
    /**
     * Sample code: Reimage a Virtual Machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void reimageAVirtualMachine(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .reimage(
                "myResourceGroup", "myVMName", new VirtualMachineReimageParameters().withTempDisk(true), Context.NONE);
    }
}
```

### VirtualMachines_Restart

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines Restart. */
public final class VirtualMachinesRestartSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_Restart_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Restart_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesRestartMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().restart("rgcompute", "aaaaaaaaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_Restart_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Restart_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesRestartMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().restart("rgcompute", "aaa", Context.NONE);
    }
}
```

### VirtualMachines_RetrieveBootDiagnosticsData

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines RetrieveBootDiagnosticsData. */
public final class VirtualMachinesRetrieveBootDiagnosticsDataSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_RetrieveBootDiagnosticsData.json
     */
    /**
     * Sample code: RetrieveBootDiagnosticsData of a virtual machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void retrieveBootDiagnosticsDataOfAVirtualMachine(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().retrieveBootDiagnosticsDataWithResponse("ResourceGroup", "VMName", 60, Context.NONE);
    }
}
```

### VirtualMachines_RunCommand

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.RunCommandInput;

/** Samples for VirtualMachines RunCommand. */
public final class VirtualMachinesRunCommandSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineRunCommand.json
     */
    /**
     * Sample code: VirtualMachineRunCommand.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineRunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .virtualMachines()
            .runCommand(
                "crptestar98131", "vm3036", new RunCommandInput().withCommandId("RunPowerShellScript"), Context.NONE);
    }
}
```

### VirtualMachines_SimulateEviction

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines SimulateEviction. */
public final class VirtualMachinesSimulateEvictionSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_SimulateEviction.json
     */
    /**
     * Sample code: Simulate Eviction a virtual machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void simulateEvictionAVirtualMachine(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().simulateEvictionWithResponse("ResourceGroup", "VMName", Context.NONE);
    }
}
```

### VirtualMachines_Start

```java
import com.azure.core.util.Context;

/** Samples for VirtualMachines Start. */
public final class VirtualMachinesStartSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_Start_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Start_MaximumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesStartMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().start("rgcompute", "aaaaaaaaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_Start_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_Start_MinimumSet_Gen.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachinesStartMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().start("rgcompute", "aaaaa", Context.NONE);
    }
}
```

### VirtualMachines_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.CachingTypes;
import com.azure.resourcemanager.compute.generated.models.DataDisk;
import com.azure.resourcemanager.compute.generated.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.compute.generated.models.DiskDetachOptionTypes;
import com.azure.resourcemanager.compute.generated.models.HardwareProfile;
import com.azure.resourcemanager.compute.generated.models.ImageReference;
import com.azure.resourcemanager.compute.generated.models.ManagedDiskParameters;
import com.azure.resourcemanager.compute.generated.models.NetworkInterfaceReference;
import com.azure.resourcemanager.compute.generated.models.NetworkProfile;
import com.azure.resourcemanager.compute.generated.models.OSDisk;
import com.azure.resourcemanager.compute.generated.models.OSProfile;
import com.azure.resourcemanager.compute.generated.models.StorageAccountTypes;
import com.azure.resourcemanager.compute.generated.models.StorageProfile;
import com.azure.resourcemanager.compute.generated.models.VirtualMachine;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineSizeTypes;
import java.util.Arrays;

/** Samples for VirtualMachines Update. */
public final class VirtualMachinesUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Update_DetachDataDiskUsingToBeDetachedProperty.json
     */
    /**
     * Sample code: Update a VM by detaching data disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateAVMByDetachingDataDisk(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        VirtualMachine resource =
            manager
                .virtualMachines()
                .getByResourceGroupWithResponse("myResourceGroup", "myVM", null, Context.NONE)
                .getValue();
        resource
            .update()
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D2_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS)))
                    .withDataDisks(
                        Arrays
                            .asList(
                                new DataDisk()
                                    .withLun(0)
                                    .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                    .withDiskSizeGB(1023)
                                    .withToBeDetached(true),
                                new DataDisk()
                                    .withLun(1)
                                    .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                    .withDiskSizeGB(1023)
                                    .withToBeDetached(false))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachine_Update_ForceDetachDataDisk.json
     */
    /**
     * Sample code: Update a VM by force-detaching data disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateAVMByForceDetachingDataDisk(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        VirtualMachine resource =
            manager
                .virtualMachines()
                .getByResourceGroupWithResponse("myResourceGroup", "myVM", null, Context.NONE)
                .getValue();
        resource
            .update()
            .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_D2_V2))
            .withStorageProfile(
                new StorageProfile()
                    .withImageReference(
                        new ImageReference()
                            .withPublisher("MicrosoftWindowsServer")
                            .withOffer("WindowsServer")
                            .withSku("2016-Datacenter")
                            .withVersion("latest"))
                    .withOsDisk(
                        new OSDisk()
                            .withName("myVMosdisk")
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withManagedDisk(
                                new ManagedDiskParameters().withStorageAccountType(StorageAccountTypes.STANDARD_LRS)))
                    .withDataDisks(
                        Arrays
                            .asList(
                                new DataDisk()
                                    .withLun(0)
                                    .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                    .withDiskSizeGB(1023)
                                    .withToBeDetached(true)
                                    .withDetachOption(DiskDetachOptionTypes.FORCE_DETACH),
                                new DataDisk()
                                    .withLun(1)
                                    .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                    .withDiskSizeGB(1023)
                                    .withToBeDetached(false))))
            .withOsProfile(
                new OSProfile()
                    .withComputerName("myVM")
                    .withAdminUsername("{your-username}")
                    .withAdminPassword("{your-password}"))
            .withNetworkProfile(
                new NetworkProfile()
                    .withNetworkInterfaces(
                        Arrays
                            .asList(
                                new NetworkInterfaceReference()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}")
                                    .withPrimary(true))))
            .apply();
    }
}
```

