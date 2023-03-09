
# UpdateEmailCampaignRecipients

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exclusionListIds** | **List&lt;Long&gt;** | List ids which have to be excluded from a campaign |  [optional]
**listIds** | **List&lt;Long&gt;** | Lists Ids to send the campaign to. Campaign should only be updated with listIds if listIds were used to create it. REQUIRED if already not present in campaign and scheduledAt is not empty |  [optional]
**segmentIds** | **List&lt;Long&gt;** | Mandatory if listIds are not used. Campaign should only be updated with segmentIds if segmentIds were used to create it. Segment ids to send the campaign to. |  [optional]



