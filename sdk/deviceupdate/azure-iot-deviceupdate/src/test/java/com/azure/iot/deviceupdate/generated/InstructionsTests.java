package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.Instructions;
import com.azure.iot.deviceupdate.models.StepType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InstructionsTests {
    @Test
    public void testDeserialize() {
        Instructions model =
                BinaryData.fromString(
                                "{\"steps\":[{\"type\":\"Inline\",\"description\":\"vtz\",\"handler\":\"ufubl\",\"files\":[\"qeof\",\"aeqjhqjbasvms\",\"jqul\",\"gsntnbybkzgcwr\"],\"updateId\":{\"provider\":\"lxxwrljdouskc\",\"name\":\"vkocrcjdkwtn\",\"version\":\"xbnjbiksq\"}},{\"type\":\"Inline\",\"description\":\"sainqpjwnzl\",\"handler\":\"fmppe\",\"files\":[\"gxsabkyq\",\"uujitcjc\"],\"updateId\":{\"provider\":\"zevndhkrwpdappds\",\"name\":\"dkvwrwjfe\",\"version\":\"snhu\"}},{\"type\":\"Reference\",\"description\":\"tmrldhugjzzdatq\",\"handler\":\"oc\",\"files\":[\"blgphuticn\",\"vkaozwyiftyhxhur\",\"k\",\"tyxolniwpwc\"],\"updateId\":{\"provider\":\"jfkgiawxk\",\"name\":\"ryplwckbasyypn\",\"version\":\"dhsgcba\"}}]}")
                        .toObject(Instructions.class);
        Assertions.assertEquals(StepType.INLINE, model.getSteps().get(0).getType());
        Assertions.assertEquals("vtz", model.getSteps().get(0).getDescription());
        Assertions.assertEquals("ufubl", model.getSteps().get(0).getHandler());
        Assertions.assertEquals("qeof", model.getSteps().get(0).getFiles().get(0));
        Assertions.assertEquals("lxxwrljdouskc", model.getSteps().get(0).getUpdateId().getProvider());
        Assertions.assertEquals("vkocrcjdkwtn", model.getSteps().get(0).getUpdateId().getName());
        Assertions.assertEquals("xbnjbiksq", model.getSteps().get(0).getUpdateId().getVersion());
    }
}
