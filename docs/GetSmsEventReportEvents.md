
# GetSmsEventReportEvents

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | Phone number which has generated the event | 
**date** | **LocalDate** | Date on which the event has been generated | 
**messageId** | **String** | Message ID which generated the event | 
**event** | [**EventEnum**](#EventEnum) | Event which occurred | 
**reason** | **String** | Reason of bounce (only available if the event is hardbounce or softbounce) |  [optional]
**reply** | **String** |  |  [optional]
**tag** | **String** | Tag of the SMS which generated the event |  [optional]


<a name="EventEnum"></a>
## Enum: EventEnum
Name | Value
---- | -----
BOUNCES | &quot;bounces&quot;
HARDBOUNCES | &quot;hardBounces&quot;
SOFTBOUNCES | &quot;softBounces&quot;
DELIVERED | &quot;delivered&quot;
SENT | &quot;sent&quot;
ACCEPTED | &quot;accepted&quot;
UNSUBSCRIPTION | &quot;unsubscription&quot;
REPLIES | &quot;replies&quot;
BLOCKED | &quot;blocked&quot;



