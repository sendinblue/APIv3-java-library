
# UpdateWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | URL of the webhook |  [optional]
**description** | **String** | Description of the webhook |  [optional]
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | Events triggering the webhook. Possible values for Transactional type webhook – request, delivered, hardBounce, softBounce, blocked, spam, invalid, deferred, click, opened, uniqueOpened and unsubscribed and possible values for Marketing type webhook – spam, opened, click, hardBounce, softBounce, unsubscribed, listAddition and delivered |  [optional]


<a name="List<EventsEnum>"></a>
## Enum: List&lt;EventsEnum&gt;
Name | Value
---- | -----
HARDBOUNCE | &quot;hardBounce&quot;
SOFTBOUNCE | &quot;softBounce&quot;
BLOCKED | &quot;blocked&quot;
SPAM | &quot;spam&quot;
DELIVERED | &quot;delivered&quot;
REQUEST | &quot;request&quot;
CLICK | &quot;click&quot;
INVALID | &quot;invalid&quot;
DEFERRED | &quot;deferred&quot;
OPENED | &quot;opened&quot;
UNIQUEOPENED | &quot;uniqueOpened&quot;
UNSUBSCRIBED | &quot;unsubscribed&quot;
LISTADDITION | &quot;listAddition&quot;



