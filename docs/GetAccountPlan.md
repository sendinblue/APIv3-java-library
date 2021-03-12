
# GetAccountPlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Displays the plan type of the user | 
**creditsType** | [**CreditsTypeEnum**](#CreditsTypeEnum) | This is the type of the credit, &quot;Send Limit&quot; is one of the possible types of credit of a user. &quot;Send Limit&quot; implies the total number of emails you can send to the subscribers in your account. | 
**credits** | **Float** | Remaining credits of the user | 
**startDate** |  [**LocalDate**] | Date of the period from which the plan will start (only available for &quot;subscription&quot; and &quot;reseller&quot; plan type) |  [optional]
**endDate** |  [**LocalDate**] | Date of the period from which the plan will end (only available for &quot;subscription&quot; and &quot;reseller&quot; plan type) |  [optional]
**userLimit** | **Integer** | Only in case of reseller account. It implies the total number of child accounts you can add to your account. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PAYASYOUGO | &quot;payAsYouGo&quot;
FREE | &quot;free&quot;
SUBSCRIPTION | &quot;subscription&quot;
SMS | &quot;sms&quot;
RESELLER | &quot;reseller&quot;


<a name="CreditsTypeEnum"></a>
## Enum: CreditsTypeEnum
Name | Value
---- | -----
SENDLIMIT | &quot;sendLimit&quot;



