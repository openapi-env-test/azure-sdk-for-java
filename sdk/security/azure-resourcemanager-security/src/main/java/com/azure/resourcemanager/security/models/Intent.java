// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Intent. */
public final class Intent extends ExpandableStringEnum<Intent> {
    /** Static value Unknown for Intent. */
    public static final Intent UNKNOWN = fromString("Unknown");

    /** Static value PreAttack for Intent. */
    public static final Intent PRE_ATTACK = fromString("PreAttack");

    /** Static value InitialAccess for Intent. */
    public static final Intent INITIAL_ACCESS = fromString("InitialAccess");

    /** Static value Persistence for Intent. */
    public static final Intent PERSISTENCE = fromString("Persistence");

    /** Static value PrivilegeEscalation for Intent. */
    public static final Intent PRIVILEGE_ESCALATION = fromString("PrivilegeEscalation");

    /** Static value DefenseEvasion for Intent. */
    public static final Intent DEFENSE_EVASION = fromString("DefenseEvasion");

    /** Static value CredentialAccess for Intent. */
    public static final Intent CREDENTIAL_ACCESS = fromString("CredentialAccess");

    /** Static value Discovery for Intent. */
    public static final Intent DISCOVERY = fromString("Discovery");

    /** Static value LateralMovement for Intent. */
    public static final Intent LATERAL_MOVEMENT = fromString("LateralMovement");

    /** Static value Execution for Intent. */
    public static final Intent EXECUTION = fromString("Execution");

    /** Static value Collection for Intent. */
    public static final Intent COLLECTION = fromString("Collection");

    /** Static value Exfiltration for Intent. */
    public static final Intent EXFILTRATION = fromString("Exfiltration");

    /** Static value CommandAndControl for Intent. */
    public static final Intent COMMAND_AND_CONTROL = fromString("CommandAndControl");

    /** Static value Impact for Intent. */
    public static final Intent IMPACT = fromString("Impact");

    /** Static value Probing for Intent. */
    public static final Intent PROBING = fromString("Probing");

    /** Static value Exploitation for Intent. */
    public static final Intent EXPLOITATION = fromString("Exploitation");

    /**
     * Creates or finds a Intent from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Intent.
     */
    @JsonCreator
    public static Intent fromString(String name) {
        return fromString(name, Intent.class);
    }

    /**
     * Gets known Intent values.
     *
     * @return known Intent values.
     */
    public static Collection<Intent> values() {
        return values(Intent.class);
    }
}
