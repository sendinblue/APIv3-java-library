
# CreateWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | URL of the webhook | 
**description** | **String** | Description of the webhook |  [optional]
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | - Events triggering the webhook. Possible values for **Transactional** type webhook: #### &#x60;sent&#x60; OR &#x60;request&#x60;, &#x60;delivered&#x60;, &#x60;hardBounce&#x60;, &#x60;softBounce&#x60;, &#x60;blocked&#x60;, &#x60;spam&#x60;, &#x60;invalid&#x60;, &#x60;deferred&#x60;, &#x60;click&#x60;, &#x60;opened&#x60;, &#x60;uniqueOpened&#x60; and &#x60;unsubscribed&#x60; - Possible values for **Marketing** type webhook: #### &#x60;spam&#x60;, &#x60;opened&#x60;, &#x60;click&#x60;, &#x60;hardBounce&#x60;, &#x60;softBounce&#x60;, &#x60;unsubscribed&#x60;, &#x60;listAddition&#x60; &amp; &#x60;delivered&#x60; - Possible values for **Inbound** type webhook: #### &#x60;inboundEmailProcessed&#x60;  | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the webhook |  [optional]
**domain** | **String** | Inbound domain of webhook, required in case of event type &#x60;inbound&#x60; |  [optional]


<a name="List<EventsEnum>"></a>
## Enum: List&lt;EventsEnum&gt;
Name | Value
---- | -----
SENT | &quot;sent&quot;
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
CONTACTUPDATED | &quot;contactUpdated&quot;
CONTACTDELETED | &quot;contactDeleted&quot;
INBOUNDEMAILPROCESSED | &quot;inboundEmailProcessed&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRANSACTIONAL | &quot;transactional&quot;
MARKETING | &quot;marketing&quot;
INBOUND | &quot;inbound&quot;



