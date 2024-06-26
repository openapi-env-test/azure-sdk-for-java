// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.IfConditionActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IfConditionActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IfConditionActivityTypeProperties model = BinaryData.fromString(
            "{\"expression\":{\"value\":\"fjwm\"},\"ifTrueActivities\":[{\"type\":\"Activity\",\"name\":\"gjihnxoxjghumv\",\"description\":\"bhogllvfealcju\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"crnovbg\",\"dependencyConditions\":[\"Succeeded\",\"Completed\"],\"\":{\"pzzq\":\"dataxsyhpilqojdmzej\",\"rcivxaq\":\"datainrymzlq\"}}],\"userProperties\":[{\"name\":\"gxqtkcvnyiky\",\"value\":\"dataxwfsivgxelzu\"},{\"name\":\"dyztnsutes\",\"value\":\"datakklz\"},{\"name\":\"h\",\"value\":\"datavtivefsr\"}],\"\":{\"vsidmcoxobrvzder\":\"dataxhpntewv\",\"aqbv\":\"datannfi\"}}],\"ifFalseActivities\":[{\"type\":\"Activity\",\"name\":\"hggee\",\"description\":\"brslbzcyubqemrxm\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"u\",\"dependencyConditions\":[\"Failed\",\"Skipped\",\"Failed\"],\"\":{\"bmvg\":\"datao\"}},{\"activity\":\"gdnzvohrnqn\",\"dependencyConditions\":[\"Completed\",\"Failed\",\"Skipped\"],\"\":{\"cyyicascvcmthu\":\"datazcpifasifdtiocsf\",\"phoem\":\"databorynmadtyhm\"}},{\"activity\":\"vnqwd\",\"dependencyConditions\":[\"Skipped\"],\"\":{\"xhmtxpxdtmrwjk\":\"datatbqijeqfoatqnhr\",\"bkdhwadnccunrviq\":\"datatiznvijdtmjy\",\"sliou\":\"dataz\"}}],\"userProperties\":[{\"name\":\"xqnpnpggbu\",\"value\":\"datajw\"},{\"name\":\"rgq\",\"value\":\"datadnmuirtkqztkx\"},{\"name\":\"hixfuuzaczmejf\",\"value\":\"dataiegpdhityt\"}],\"\":{\"chbvejgfx\":\"datawdskocmqhzys\",\"cyngdgka\":\"datajqevmzhk\",\"hrlb\":\"datanxy\"}},{\"type\":\"Activity\",\"name\":\"hd\",\"description\":\"ndlvcbcxbi\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"aedgwghqqiuuet\",\"dependencyConditions\":[\"Succeeded\"],\"\":{\"pksmjpopib\":\"datanbllqvro\",\"rcuvlfzdkpf\":\"dataxkywqsp\"}},{\"activity\":\"upacahlsavin\",\"dependencyConditions\":[\"Succeeded\",\"Failed\",\"Completed\",\"Completed\"],\"\":{\"qgmhfvlbd\":\"datainyijm\"}},{\"activity\":\"dhedmfidro\",\"dependencyConditions\":[\"Completed\",\"Completed\",\"Failed\"],\"\":{\"xccxeusioawro\":\"datadmbysvqbgndfzhe\",\"icwbquppkzuxsbbm\":\"datae\",\"y\":\"datafut\",\"l\":\"datahelyopobg\"}},{\"activity\":\"ukiwjezadkfmp\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\",\"Completed\"],\"\":{\"erxhucxmybuqj\":\"dataghygzayazrgml\",\"axga\":\"datagbi\",\"pvbmbf\":\"datazfyin\"}}],\"userProperties\":[{\"name\":\"uamdydkdcvowasl\",\"value\":\"datawwgzyvo\"},{\"name\":\"otief\",\"value\":\"datahaqqavhfdezom\"}],\"\":{\"ymfaiwxlrphadds\":\"datablmypuonuv\",\"yzd\":\"datasqcva\",\"zziavguskvvnzn\":\"dataroedwipauclety\"}},{\"type\":\"Activity\",\"name\":\"hboqeue\",\"description\":\"fldjkkva\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"n\",\"dependencyConditions\":[\"Skipped\"],\"\":{\"frb\":\"datafuqqb\"}},{\"activity\":\"rspzkvoknmeredn\",\"dependencyConditions\":[\"Skipped\",\"Failed\"],\"\":{\"decxbiknf\":\"datakcn\",\"fxdntpksb\":\"datapixfdojxby\",\"svahbqoojdnmrxj\":\"dataigegwaidqzfl\"}}],\"userProperties\":[{\"name\":\"rzfdbotnkad\",\"value\":\"datan\"}],\"\":{\"ozvcxxezur\":\"datalrmbgiaoxpf\",\"pbleazvyftklbb\":\"datagucns\",\"rl\":\"dataibgczkk\",\"xlhec\":\"datatdkwibdrivedsh\"}},{\"type\":\"Activity\",\"name\":\"tmwwmybviw\",\"description\":\"jey\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"krhp\",\"dependencyConditions\":[\"Skipped\"],\"\":{\"kcad\":\"datad\",\"rbfa\":\"datayoouvqpc\",\"wzufmyanectf\":\"dataduzzyxlyuw\"}},{\"activity\":\"bfgmgho\",\"dependencyConditions\":[\"Completed\"],\"\":{\"rvqcxr\":\"datant\"}},{\"activity\":\"kcvclq\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\",\"Succeeded\",\"Succeeded\"],\"\":{\"hkkktlodsyyzmf\":\"datazs\",\"ejmzbasxapcegtc\":\"datagzljgrtfic\",\"kttjnneynm\":\"dataufet\",\"xgxqdmvfdocjaf\":\"datavqysghk\"}},{\"activity\":\"fiddnktutwcz\",\"dependencyConditions\":[\"Completed\",\"Failed\",\"Skipped\",\"Skipped\"],\"\":{\"mobsjudpeed\":\"dataqhyq\",\"igtsrrlelpobm\":\"dataowverhtyc\"}}],\"userProperties\":[{\"name\":\"sisll\",\"value\":\"dataqgluhr\"}],\"\":{\"bzcmwnyudcv\":\"dataojozhdcptxxbuf\",\"rngiffsnt\":\"dataeowepv\",\"zagurgur\":\"datapfqguovqqrcyeumw\"}}]}")
            .toObject(IfConditionActivityTypeProperties.class);
        Assertions.assertEquals("fjwm", model.expression().value());
        Assertions.assertEquals("gjihnxoxjghumv", model.ifTrueActivities().get(0).name());
        Assertions.assertEquals("bhogllvfealcju", model.ifTrueActivities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.ifTrueActivities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.ifTrueActivities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("crnovbg", model.ifTrueActivities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED,
            model.ifTrueActivities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("gxqtkcvnyiky", model.ifTrueActivities().get(0).userProperties().get(0).name());
        Assertions.assertEquals("hggee", model.ifFalseActivities().get(0).name());
        Assertions.assertEquals("brslbzcyubqemrxm", model.ifFalseActivities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.ifFalseActivities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.ifFalseActivities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("u", model.ifFalseActivities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED,
            model.ifFalseActivities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("xqnpnpggbu", model.ifFalseActivities().get(0).userProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IfConditionActivityTypeProperties model
            = new IfConditionActivityTypeProperties().withExpression(new Expression().withValue("fjwm"))
                .withIfTrueActivities(
                    Arrays.asList(new Activity().withName("gjihnxoxjghumv").withDescription("bhogllvfealcju")
                        .withState(ActivityState.ACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                        .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("crnovbg")
                            .withDependencyConditions(
                                Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.COMPLETED))
                            .withAdditionalProperties(mapOf())))
                        .withUserProperties(
                            Arrays.asList(new UserProperty().withName("gxqtkcvnyiky").withValue("dataxwfsivgxelzu"),
                                new UserProperty().withName("dyztnsutes").withValue("datakklz"),
                                new UserProperty().withName("h").withValue("datavtivefsr")))
                        .withAdditionalProperties(mapOf("type", "Activity"))))
                .withIfFalseActivities(Arrays.asList(
                    new Activity().withName("hggee").withDescription("brslbzcyubqemrxm").withState(ActivityState.ACTIVE)
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                        .withDependsOn(Arrays.asList(
                            new ActivityDependency().withActivity("u")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED,
                                    DependencyCondition.SKIPPED, DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("gdnzvohrnqn")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED,
                                    DependencyCondition.FAILED, DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("vnqwd")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf())))
                        .withUserProperties(Arrays.asList(new UserProperty().withName("xqnpnpggbu").withValue("datajw"),
                            new UserProperty().withName("rgq").withValue("datadnmuirtkqztkx"),
                            new UserProperty().withName("hixfuuzaczmejf").withValue("dataiegpdhityt")))
                        .withAdditionalProperties(mapOf("type", "Activity")),
                    new Activity().withName("hd").withDescription("ndlvcbcxbi").withState(ActivityState.ACTIVE)
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                        .withDependsOn(Arrays.asList(
                            new ActivityDependency().withActivity("aedgwghqqiuuet")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("upacahlsavin")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.FAILED,
                                        DependencyCondition.COMPLETED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("dhedmfidro")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED,
                                    DependencyCondition.COMPLETED, DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("ukiwjezadkfmp")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED,
                                    DependencyCondition.SUCCEEDED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                        .withUserProperties(Arrays.asList(
                            new UserProperty().withName("uamdydkdcvowasl").withValue("datawwgzyvo"), new UserProperty()
                                .withName("otief").withValue("datahaqqavhfdezom")))
                        .withAdditionalProperties(mapOf("type", "Activity")),
                    new Activity().withName("hboqeue").withDescription("fldjkkva").withState(ActivityState.ACTIVE)
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                        .withDependsOn(Arrays.asList(
                            new ActivityDependency().withActivity("n")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("rspzkvoknmeredn")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf())))
                        .withUserProperties(Arrays.asList(new UserProperty().withName("rzfdbotnkad")
                            .withValue("datan")))
                        .withAdditionalProperties(mapOf("type", "Activity")),
                    new Activity().withName("tmwwmybviw").withDescription("jey").withState(ActivityState.INACTIVE)
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                        .withDependsOn(
                            Arrays.asList(
                                new ActivityDependency().withActivity("krhp")
                                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED))
                                    .withAdditionalProperties(mapOf()),
                                new ActivityDependency().withActivity("bfgmgho")
                                    .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED))
                                    .withAdditionalProperties(mapOf()),
                                new ActivityDependency().withActivity("kcvclq")
                                    .withDependencyConditions(Arrays.asList(
                                        DependencyCondition.SUCCEEDED, DependencyCondition.SUCCEEDED,
                                        DependencyCondition.SUCCEEDED, DependencyCondition.SUCCEEDED))
                                    .withAdditionalProperties(mapOf()),
                                new ActivityDependency().withActivity("fiddnktutwcz")
                                    .withDependencyConditions(
                                        Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.FAILED,
                                            DependencyCondition.SKIPPED, DependencyCondition.SKIPPED))
                                    .withAdditionalProperties(mapOf())))
                        .withUserProperties(Arrays.asList(new UserProperty().withName("sisll").withValue("dataqgluhr")))
                        .withAdditionalProperties(mapOf("type", "Activity"))));
        model = BinaryData.fromObject(model).toObject(IfConditionActivityTypeProperties.class);
        Assertions.assertEquals("fjwm", model.expression().value());
        Assertions.assertEquals("gjihnxoxjghumv", model.ifTrueActivities().get(0).name());
        Assertions.assertEquals("bhogllvfealcju", model.ifTrueActivities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.ifTrueActivities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.ifTrueActivities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("crnovbg", model.ifTrueActivities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED,
            model.ifTrueActivities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("gxqtkcvnyiky", model.ifTrueActivities().get(0).userProperties().get(0).name());
        Assertions.assertEquals("hggee", model.ifFalseActivities().get(0).name());
        Assertions.assertEquals("brslbzcyubqemrxm", model.ifFalseActivities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.ifFalseActivities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.ifFalseActivities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("u", model.ifFalseActivities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED,
            model.ifFalseActivities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("xqnpnpggbu", model.ifFalseActivities().get(0).userProperties().get(0).name());
    }

    // Use "Map.of" if available
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
