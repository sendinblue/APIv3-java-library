
# GetScheduledEmailByBatchIdBatches

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduledAt** | [**OffsetDateTime**] | Datetime for which the batch was scheduled | 
**createdAt** | [**OffsetDateTime**] | Datetime on which the batch was scheduled | 
**status** | [**StatusEnum**](#StatusEnum) | Current status of the scheduled batch | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INPROGRESS | &quot;inProgress&quot;
QUEUED | &quot;queued&quot;
PROCESSED | &quot;processed&quot;
ERROR | &quot;error&quot;



