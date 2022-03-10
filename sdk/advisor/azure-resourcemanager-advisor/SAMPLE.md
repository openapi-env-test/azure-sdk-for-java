# Code snippets and samples


## AdvisorScores

- [Get](#advisorscores_get)
- [List](#advisorscores_list)
### AdvisorScores_Get

```java
import com.azure.core.util.Context;

/** Samples for AdvisorScores Get. */
public final class AdvisorScoresGetSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/stable/2022-07-01/examples/GetAdvisorScoreDetail.json
     */
    /**
     * Sample code: GetAdvisorScoreDetail.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void getAdvisorScoreDetail(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.advisorScores().getWithResponse("Cost", Context.NONE);
    }
}
```

### AdvisorScores_List

```java
import com.azure.core.util.Context;

/** Samples for AdvisorScores List. */
public final class AdvisorScoresListSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/stable/2022-07-01/examples/ListAdvisorScore.json
     */
    /**
     * Sample code: ListAdvisorScore.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void listAdvisorScore(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.advisorScores().listWithResponse(Context.NONE);
    }
}
```

