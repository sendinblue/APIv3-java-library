
# GetAccountPlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Displays the plan type of the user | 
**creditsType** | [**CreditsTypeEnum**](#CreditsTypeEnum) | This is the type of the credit, \&quot;User Limit\&quot; or \&quot;Send Limit\&quot; are two possible types of credit of a user. \&quot;User Limit\&quot; implies the total number of subscribers you can add to your account, and \&quot;Send Limit\&quot; implies the total number of emails you can send to the subscribers in your account. | 
**credits** | **Float** | Remaining credits of the user. This can either be \&quot;User Limit\&quot; or \&quot;Send Limit\&quot; depending on the plan. | 
**startDate** | **LocalDate** | Date of the period from which the plan will start (only available for \&quot;subscription\&quot;, \&quot;unlimited\&quot; and \&quot;reseller\&quot; plan type) |  [optional]
**endDate** | **LocalDate** | Date of the period from which the plan will end (only available for \&quot;subscription\&quot;, \&quot;unlimited\&quot; and \&quot;reseller\&quot; plan type) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PAYASYOUGO | &quot;payAsYouGo&quot;
UNLIMITED | &quot;unlimited&quot;
FREE | &quot;free&quot;
SUBSCRIPTION | &quot;subscription&quot;
SMS | &quot;sms&quot;
RESELLER | &quot;reseller&quot;


<a name="CreditsTypeEnum"></a>
## Enum: CreditsTypeEnum
Name | Value
---- | -----
USERLIMIT | &quot;userLimit&quot;
SENDLIMIT | &quot;sendLimit&quot;



