// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.InstructionInner;

/** An instance of this class provides access to all the operations defined in InstructionsClient. */
public interface InstructionsClient {
    /**
     * Lists the instructions by billing profile id.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing instructions used during invoice generation as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InstructionInner> listByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Lists the instructions by billing profile id.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing instructions used during invoice generation as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InstructionInner> listByBillingProfile(
        String billingAccountName, String billingProfileName, Context context);

    /**
     * Get the instruction by name. These are custom billing instructions and are only applicable for certain customers.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param instructionName Instruction Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the instruction by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InstructionInner get(String billingAccountName, String billingProfileName, String instructionName);

    /**
     * Get the instruction by name. These are custom billing instructions and are only applicable for certain customers.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param instructionName Instruction Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the instruction by name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<InstructionInner> getWithResponse(
        String billingAccountName, String billingProfileName, String instructionName, Context context);

    /**
     * Creates or updates an instruction. These are custom billing instructions and are only applicable for certain
     * customers.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param instructionName Instruction Name.
     * @param parameters The new instruction.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instruction.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InstructionInner put(
        String billingAccountName, String billingProfileName, String instructionName, InstructionInner parameters);

    /**
     * Creates or updates an instruction. These are custom billing instructions and are only applicable for certain
     * customers.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param instructionName Instruction Name.
     * @param parameters The new instruction.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instruction along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<InstructionInner> putWithResponse(
        String billingAccountName,
        String billingProfileName,
        String instructionName,
        InstructionInner parameters,
        Context context);
}
