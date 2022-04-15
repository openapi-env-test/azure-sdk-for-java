package com.azure.iot.deviceupdate.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ImportAction. */
public final class ImportAction extends ExpandableStringEnum<ImportAction> {
    /** Static value import for ImportAction. */
    public static final ImportAction IMPORT = fromString("import");

    /**
     * Creates or finds a ImportAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImportAction.
     */
    @JsonCreator
    public static ImportAction fromString(String name) {
        return fromString(name, ImportAction.class);
    }

    /** @return known ImportAction values. */
    public static Collection<ImportAction> values() {
        return values(ImportAction.class);
    }
}
