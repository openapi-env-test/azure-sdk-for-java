// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.TaskInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Task. */
public interface Task {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the task.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the creationDate property: The creation date of task.
     *
     * @return the creationDate value.
     */
    OffsetDateTime creationDate();

    /**
     * Gets the status property: The current status of task.
     *
     * @return the status value.
     */
    TaskStatus status();

    /**
     * Gets the platform property: The platform properties against which the run has to happen.
     *
     * @return the platform value.
     */
    PlatformProperties platform();

    /**
     * Gets the agentConfiguration property: The machine configuration of the run agent.
     *
     * @return the agentConfiguration value.
     */
    AgentProperties agentConfiguration();

    /**
     * Gets the agentPoolName property: The dedicated agent pool for the task.
     *
     * @return the agentPoolName value.
     */
    String agentPoolName();

    /**
     * Gets the timeout property: Run timeout in seconds.
     *
     * @return the timeout value.
     */
    Integer timeout();

    /**
     * Gets the step property: The properties of a task step.
     *
     * @return the step value.
     */
    TaskStepProperties step();

    /**
     * Gets the trigger property: The properties that describe all triggers for the task.
     *
     * @return the trigger value.
     */
    TriggerProperties trigger();

    /**
     * Gets the credentials property: The properties that describes a set of credentials that will be used when this run
     * is invoked.
     *
     * @return the credentials value.
     */
    Credentials credentials();

    /**
     * Gets the logTemplate property: The template that describes the repository and tag information for run log
     * artifact.
     *
     * @return the logTemplate value.
     */
    String logTemplate();

    /**
     * Gets the isSystemTask property: The value of this property indicates whether the task resource is system task or
     * not.
     *
     * @return the isSystemTask value.
     */
    Boolean isSystemTask();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.containerregistry.generated.fluent.models.TaskInner object.
     *
     * @return the inner object.
     */
    TaskInner innerModel();

    /** The entirety of the Task definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The Task definition stages. */
    interface DefinitionStages {
        /** The first stage of the Task definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Task definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the Task definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, registryName.
             *
             * @param resourceGroupName The name of the resource group to which the container registry belongs.
             * @param registryName The name of the container registry.
             * @return the next definition stage.
             */
            WithCreate withExistingRegistry(String resourceGroupName, String registryName);
        }
        /**
         * The stage of the Task definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithStatus,
                DefinitionStages.WithPlatform,
                DefinitionStages.WithAgentConfiguration,
                DefinitionStages.WithAgentPoolName,
                DefinitionStages.WithTimeout,
                DefinitionStages.WithStep,
                DefinitionStages.WithTrigger,
                DefinitionStages.WithCredentials,
                DefinitionStages.WithLogTemplate,
                DefinitionStages.WithIsSystemTask {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Task create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Task create(Context context);
        }
        /** The stage of the Task definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Task definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityProperties identity);
        }
        /** The stage of the Task definition allowing to specify status. */
        interface WithStatus {
            /**
             * Specifies the status property: The current status of task..
             *
             * @param status The current status of task.
             * @return the next definition stage.
             */
            WithCreate withStatus(TaskStatus status);
        }
        /** The stage of the Task definition allowing to specify platform. */
        interface WithPlatform {
            /**
             * Specifies the platform property: The platform properties against which the run has to happen..
             *
             * @param platform The platform properties against which the run has to happen.
             * @return the next definition stage.
             */
            WithCreate withPlatform(PlatformProperties platform);
        }
        /** The stage of the Task definition allowing to specify agentConfiguration. */
        interface WithAgentConfiguration {
            /**
             * Specifies the agentConfiguration property: The machine configuration of the run agent..
             *
             * @param agentConfiguration The machine configuration of the run agent.
             * @return the next definition stage.
             */
            WithCreate withAgentConfiguration(AgentProperties agentConfiguration);
        }
        /** The stage of the Task definition allowing to specify agentPoolName. */
        interface WithAgentPoolName {
            /**
             * Specifies the agentPoolName property: The dedicated agent pool for the task..
             *
             * @param agentPoolName The dedicated agent pool for the task.
             * @return the next definition stage.
             */
            WithCreate withAgentPoolName(String agentPoolName);
        }
        /** The stage of the Task definition allowing to specify timeout. */
        interface WithTimeout {
            /**
             * Specifies the timeout property: Run timeout in seconds..
             *
             * @param timeout Run timeout in seconds.
             * @return the next definition stage.
             */
            WithCreate withTimeout(Integer timeout);
        }
        /** The stage of the Task definition allowing to specify step. */
        interface WithStep {
            /**
             * Specifies the step property: The properties of a task step..
             *
             * @param step The properties of a task step.
             * @return the next definition stage.
             */
            WithCreate withStep(TaskStepProperties step);
        }
        /** The stage of the Task definition allowing to specify trigger. */
        interface WithTrigger {
            /**
             * Specifies the trigger property: The properties that describe all triggers for the task..
             *
             * @param trigger The properties that describe all triggers for the task.
             * @return the next definition stage.
             */
            WithCreate withTrigger(TriggerProperties trigger);
        }
        /** The stage of the Task definition allowing to specify credentials. */
        interface WithCredentials {
            /**
             * Specifies the credentials property: The properties that describes a set of credentials that will be used
             * when this run is invoked..
             *
             * @param credentials The properties that describes a set of credentials that will be used when this run is
             *     invoked.
             * @return the next definition stage.
             */
            WithCreate withCredentials(Credentials credentials);
        }
        /** The stage of the Task definition allowing to specify logTemplate. */
        interface WithLogTemplate {
            /**
             * Specifies the logTemplate property: The template that describes the repository and tag information for
             * run log artifact..
             *
             * @param logTemplate The template that describes the repository and tag information for run log artifact.
             * @return the next definition stage.
             */
            WithCreate withLogTemplate(String logTemplate);
        }
        /** The stage of the Task definition allowing to specify isSystemTask. */
        interface WithIsSystemTask {
            /**
             * Specifies the isSystemTask property: The value of this property indicates whether the task resource is
             * system task or not..
             *
             * @param isSystemTask The value of this property indicates whether the task resource is system task or not.
             * @return the next definition stage.
             */
            WithCreate withIsSystemTask(Boolean isSystemTask);
        }
    }
    /**
     * Begins update for the Task resource.
     *
     * @return the stage of resource update.
     */
    Task.Update update();

    /** The template for Task update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithStatus,
            UpdateStages.WithPlatform,
            UpdateStages.WithAgentConfiguration,
            UpdateStages.WithAgentPoolName,
            UpdateStages.WithTimeout,
            UpdateStages.WithStep,
            UpdateStages.WithTrigger,
            UpdateStages.WithCredentials,
            UpdateStages.WithLogTemplate {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Task apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Task apply(Context context);
    }
    /** The Task update stages. */
    interface UpdateStages {
        /** The stage of the Task update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The ARM resource tags..
             *
             * @param tags The ARM resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Task update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityProperties identity);
        }
        /** The stage of the Task update allowing to specify status. */
        interface WithStatus {
            /**
             * Specifies the status property: The current status of task..
             *
             * @param status The current status of task.
             * @return the next definition stage.
             */
            Update withStatus(TaskStatus status);
        }
        /** The stage of the Task update allowing to specify platform. */
        interface WithPlatform {
            /**
             * Specifies the platform property: The platform properties against which the run has to happen..
             *
             * @param platform The platform properties against which the run has to happen.
             * @return the next definition stage.
             */
            Update withPlatform(PlatformUpdateParameters platform);
        }
        /** The stage of the Task update allowing to specify agentConfiguration. */
        interface WithAgentConfiguration {
            /**
             * Specifies the agentConfiguration property: The machine configuration of the run agent..
             *
             * @param agentConfiguration The machine configuration of the run agent.
             * @return the next definition stage.
             */
            Update withAgentConfiguration(AgentProperties agentConfiguration);
        }
        /** The stage of the Task update allowing to specify agentPoolName. */
        interface WithAgentPoolName {
            /**
             * Specifies the agentPoolName property: The dedicated agent pool for the task..
             *
             * @param agentPoolName The dedicated agent pool for the task.
             * @return the next definition stage.
             */
            Update withAgentPoolName(String agentPoolName);
        }
        /** The stage of the Task update allowing to specify timeout. */
        interface WithTimeout {
            /**
             * Specifies the timeout property: Run timeout in seconds..
             *
             * @param timeout Run timeout in seconds.
             * @return the next definition stage.
             */
            Update withTimeout(Integer timeout);
        }
        /** The stage of the Task update allowing to specify step. */
        interface WithStep {
            /**
             * Specifies the step property: The properties for updating a task step..
             *
             * @param step The properties for updating a task step.
             * @return the next definition stage.
             */
            Update withStep(TaskStepUpdateParameters step);
        }
        /** The stage of the Task update allowing to specify trigger. */
        interface WithTrigger {
            /**
             * Specifies the trigger property: The properties for updating trigger properties..
             *
             * @param trigger The properties for updating trigger properties.
             * @return the next definition stage.
             */
            Update withTrigger(TriggerUpdateParameters trigger);
        }
        /** The stage of the Task update allowing to specify credentials. */
        interface WithCredentials {
            /**
             * Specifies the credentials property: The parameters that describes a set of credentials that will be used
             * when this run is invoked..
             *
             * @param credentials The parameters that describes a set of credentials that will be used when this run is
             *     invoked.
             * @return the next definition stage.
             */
            Update withCredentials(Credentials credentials);
        }
        /** The stage of the Task update allowing to specify logTemplate. */
        interface WithLogTemplate {
            /**
             * Specifies the logTemplate property: The template that describes the repository and tag information for
             * run log artifact..
             *
             * @param logTemplate The template that describes the repository and tag information for run log artifact.
             * @return the next definition stage.
             */
            Update withLogTemplate(String logTemplate);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Task refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Task refresh(Context context);

    /**
     * Returns a task with extended information that includes all secrets.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the task that has the ARM resource and task properties along with {@link Response}.
     */
    Response<Task> getDetailsWithResponse(Context context);

    /**
     * Returns a task with extended information that includes all secrets.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the task that has the ARM resource and task properties.
     */
    Task getDetails();
}
