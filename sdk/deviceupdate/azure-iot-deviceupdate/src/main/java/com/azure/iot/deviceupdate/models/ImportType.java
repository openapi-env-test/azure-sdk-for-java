package com.azure.iot.deviceupdate.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ImportType. */
public final class ImportType extends ExpandableStringEnum<ImportType> {
    /** Static value Devices for ImportType. */
    public static final ImportType DEVICES = fromString("Devices");

    /** Static value Modules for ImportType. */
    public static final ImportType MODULES = fromString("Modules");

    /** Static value All for ImportType. */
    public static final ImportType ALL = fromString("All");

    /**
     * Creates or finds a ImportType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImportType.
     */
    @JsonCreator
    public static ImportType fromString(String name) {
        return fromString(name, ImportType.class);
    }

    /** @return known ImportType values. */
    public static Collection<ImportType> values() {
        return values(ImportType.class);
    }
}
