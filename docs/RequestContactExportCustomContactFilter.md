
# RequestContactExportCustomContactFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionForContacts** | [**ActionForContactsEnum**](#ActionForContactsEnum) | Mandatory if neither actionForEmailCampaigns nor actionForSmsCampaigns is passed. This will export the contacts on the basis of provided action applied on contacts as per the list id. * allContacts - Fetch the list of all contacts for a particular list. * subscribed &amp; unsubscribed - Fetch the list of subscribed / unsubscribed (blacklisted via any means) contacts for a particular list. * unsubscribedPerList - Fetch the list of contacts that are unsubscribed from a particular list only.  |  [optional]
**actionForEmailCampaigns** | [**ActionForEmailCampaignsEnum**](#ActionForEmailCampaignsEnum) | Mandatory if neither actionForContacts nor actionForSmsCampaigns is passed. This will export the contacts on the basis of provided action applied on email campaigns. * openers &amp; nonOpeners - emailCampaignId is mandatory. Fetch the list of readers / non-readers for a particular email campaign. * clickers &amp; nonClickers - emailCampaignId is mandatory. Fetch the list of clickers / non-clickers for a particular email campaign. * unsubscribed - emailCampaignId is mandatory. Fetch the list of all unsubscribed (blacklisted via any means) contacts for a particular email campaign. * hardBounces &amp; softBounces - emailCampaignId is optional. Fetch the list of hard bounces / soft bounces for a particular / all email campaign(s).  |  [optional]
**actionForSmsCampaigns** | [**ActionForSmsCampaignsEnum**](#ActionForSmsCampaignsEnum) | Mandatory if neither actionForContacts nor actionForEmailCampaigns is passed. This will export the contacts on the basis of provided action applied on sms campaigns. * unsubscribed - Fetch the list of all unsubscribed (blacklisted via any means) contacts for all / particular sms campaigns. * hardBounces &amp; softBounces - Fetch the list of hard bounces / soft bounces for all / particular sms campaigns.  |  [optional]
**listId** | **Long** | Mandatory if actionForContacts is passed, ignored otherwise. Id of the list for which the corresponding action shall be applied in the filter. |  [optional]
**emailCampaignId** | **Long** | Considered only if actionForEmailCampaigns is passed, ignored otherwise. Mandatory if action is one of the following - openers, nonOpeners, clickers, nonClickers, unsubscribed. The id of the email campaign for which the corresponding action shall be applied in the filter. |  [optional]
**smsCampaignId** | **Long** | Considered only if actionForSmsCampaigns is passed, ignored otherwise. The id of sms campaign for which the corresponding action shall be applied in the filter. |  [optional]


<a name="ActionForContactsEnum"></a>
## Enum: ActionForContactsEnum
Name | Value
---- | -----
ALLCONTACTS | &quot;allContacts&quot;
SUBSCRIBED | &quot;subscribed&quot;
UNSUBSCRIBED | &quot;unsubscribed&quot;
UNSUBSCRIBEDPERLIST | &quot;unsubscribedPerList&quot;


<a name="ActionForEmailCampaignsEnum"></a>
## Enum: ActionForEmailCampaignsEnum
Name | Value
---- | -----
OPENERS | &quot;openers&quot;
NONOPENERS | &quot;nonOpeners&quot;
CLICKERS | &quot;clickers&quot;
NONCLICKERS | &quot;nonClickers&quot;
UNSUBSCRIBED | &quot;unsubscribed&quot;
HARDBOUNCES | &quot;hardBounces&quot;
SOFTBOUNCES | &quot;softBounces&quot;


<a name="ActionForSmsCampaignsEnum"></a>
## Enum: ActionForSmsCampaignsEnum
Name | Value
---- | -----
HARDBOUNCES | &quot;hardBounces&quot;
SOFTBOUNCES | &quot;softBounces&quot;
UNSUBSCRIBED | &quot;unsubscribed&quot;



