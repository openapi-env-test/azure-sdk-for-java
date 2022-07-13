# Code snippets and samples


## Recommendations

- [Generate](#recommendations_generate)
- [Get](#recommendations_get)
- [GetGenerateRecommendationsStatus](#recommendations_getgeneraterecommendationsstatus)
- [List](#recommendations_list)

## Suppressions

- [Create](#suppressions_create)
- [Delete](#suppressions_delete)
- [Get](#suppressions_get)
- [List](#suppressions_list)
### Recommendations_Generate

```java
import com.azure.core.util.Context;

/** Samples for Recommendations Generate. */
public final class RecommendationsGenerateSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/preview/2022-06-01/examples/GenerateRecommendations.json
     */
    /**
     * Sample code: GenerateRecommendations.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void generateRecommendations(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.recommendations().generateWithResponse(Context.NONE);
    }
}
```

### Recommendations_Get

```java
import com.azure.core.util.Context;

/** Samples for Recommendations Get. */
public final class RecommendationsGetSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/preview/2022-06-01/examples/GetRecommendationDetail.json
     */
    /**
     * Sample code: GetRecommendationDetail.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void getRecommendationDetail(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.recommendations().getWithResponse("resourceUri", "recommendationId", Context.NONE);
    }
}
```

### Recommendations_GetGenerateRecommendationsStatus

```java
import com.azure.core.util.Context;
import java.util.UUID;

/** Samples for Recommendations GetGenerateRecommendationsStatus. */
public final class RecommendationsGetGenerateRecommendationsStatusSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/preview/2022-06-01/examples/PollGenerateRecommendationsStatus.json
     */
    /**
     * Sample code: PollGenerateRecommendationsStatus.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void pollGenerateRecommendationsStatus(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager
            .recommendations()
            .getGenerateRecommendationsStatusWithResponse(UUID.fromString("operationGUID"), Context.NONE);
    }
}
```

### Recommendations_List

```java
import com.azure.core.util.Context;

/** Samples for Recommendations List. */
public final class RecommendationsListSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/preview/2022-06-01/examples/ListRecommendations.json
     */
    /**
     * Sample code: ListRecommendations.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void listRecommendations(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.recommendations().list(null, 10, null, Context.NONE);
    }
}
```

### Suppressions_Create

```java
/** Samples for Suppressions Create. */
public final class SuppressionsCreateSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/preview/2022-06-01/examples/CreateSuppression.json
     */
    /**
     * Sample code: CreateSuppression.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void createSuppression(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager
            .suppressions()
            .define("suppressionName1")
            .withRegion((String) null)
            .withExistingRecommendation("resourceUri", "recommendationId")
            .withTtl("07:00:00:00")
            .create();
    }
}
```

### Suppressions_Delete

```java
import com.azure.core.util.Context;

/** Samples for Suppressions Delete. */
public final class SuppressionsDeleteSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/preview/2022-06-01/examples/DeleteSuppression.json
     */
    /**
     * Sample code: DeleteSuppression.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void deleteSuppression(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.suppressions().deleteWithResponse("resourceUri", "recommendationId", "suppressionName1", Context.NONE);
    }
}
```

### Suppressions_Get

```java
import com.azure.core.util.Context;

/** Samples for Suppressions Get. */
public final class SuppressionsGetSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/preview/2022-06-01/examples/GetSuppressionDetail.json
     */
    /**
     * Sample code: GetSuppressionDetail.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void getSuppressionDetail(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.suppressions().getWithResponse("resourceUri", "recommendationId", "suppressionName1", Context.NONE);
    }
}
```

### Suppressions_List

```java
import com.azure.core.util.Context;

/** Samples for Suppressions List. */
public final class SuppressionsListSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/preview/2022-06-01/examples/ListSuppressions.json
     */
    /**
     * Sample code: ListSuppressions.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void listSuppressions(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.suppressions().listWithResponse(Context.NONE);
    }
}
```

