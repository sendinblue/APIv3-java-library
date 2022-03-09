
# MasterDetailsResponsePlanInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyCode** | **String** | Plan currency |  [optional]
**nextBillingAt** | **Long** | Timestamp of next billing date |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) | Plan amount |  [optional]
**planPeriod** | [**PlanPeriodEnum**](#PlanPeriodEnum) | Plan period type |  [optional]
**subAccounts** | **Integer** | Number of sub-accounts |  [optional]
**features** | [**List&lt;MasterDetailsResponsePlanInfoFeatures&gt;**](MasterDetailsResponsePlanInfoFeatures.md) | List of provided features in the plan |  [optional]


<a name="PlanPeriodEnum"></a>
## Enum: PlanPeriodEnum
Name | Value
---- | -----
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;



