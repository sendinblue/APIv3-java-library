
# GetScheduledEmailByMessageId

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduledAt** | [**OffsetDateTime**] | Datetime for which the email was scheduled | 
**createdAt** | [**OffsetDateTime**] | Datetime on which the email was scheduled | 
**status** | [**StatusEnum**](#StatusEnum) | Current status of the scheduled email | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INPROGRESS | &quot;inProgress&quot;
QUEUED | &quot;queued&quot;
PROCESSED | &quot;processed&quot;
ERROR | &quot;error&quot;



