
# GetTransacBlockedContactsReason

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | Reason code for blocking / unsubscribing (This code is safe for comparison) |  [optional]
**message** | **String** | Reason for blocking / unsubscribing (This string is not safe for comparison) |  [optional]


<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
UNSUBSCRIBEDVIAMA | &quot;unsubscribedViaMA&quot;
UNSUBSCRIBEDVIAEMAIL | &quot;unsubscribedViaEmail&quot;
ADMINBLOCKED | &quot;adminBlocked&quot;
UNSUBSCRIBEDVIAAPI | &quot;unsubscribedViaApi&quot;
HARDBOUNCE | &quot;hardBounce&quot;
CONTACTFLAGGEDASSPAM | &quot;contactFlaggedAsSpam&quot;



