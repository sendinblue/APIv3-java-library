
# GetEmailEventReportEvents

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Email address which generates the event | 
**date** | [**OffsetDateTime**](OffsetDateTime.md) | UTC date-time on which the event has been generated | 
**subject** | **String** | Subject of the event |  [optional]
**messageId** | **String** | Message ID which generated the event | 
**event** | [**EventEnum**](#EventEnum) | Event which occurred | 
**reason** | **String** | Reason of bounce (only available if the event is hardbounce or softbounce) |  [optional]
**tag** | **String** | Tag of the email which generated the event | 
**ip** | **String** | IP from which the user has opened the email or clicked on the link (only available if the event is opened or clicks) |  [optional]
**link** | **String** | The link which is sent to the user (only available if the event is requests or opened or clicks) |  [optional]
**from** | **String** | Sender email from which the emails are sent | 


<a name="EventEnum"></a>
## Enum: EventEnum
Name | Value
---- | -----
BOUNCES | &quot;bounces&quot;
HARDBOUNCES | &quot;hardBounces&quot;
SOFTBOUNCES | &quot;softBounces&quot;
DELIVERED | &quot;delivered&quot;
SPAM | &quot;spam&quot;
REQUESTS | &quot;requests&quot;
OPENED | &quot;opened&quot;
CLICKS | &quot;clicks&quot;
INVALID | &quot;invalid&quot;
DEFERRED | &quot;deferred&quot;
BLOCKED | &quot;blocked&quot;



