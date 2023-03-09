# AbTestCampaignResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**winningVersion** | [**
WinningVersionEnum**](#WinningVersionEnum) | Winning Campaign Info. pending &#x3D; Campaign has been picked for sending and winning version is yet to be decided, tie &#x3D; A tie happened between both the versions, notAvailable &#x3D; Campaign has not yet been picked for sending. |  [optional]
**winningCriteria** | [**
WinningCriteriaEnum**](#WinningCriteriaEnum) | Criteria choosen for winning version (Open/Click) |  [optional]
**winningSubjectLine** | **String** | Subject Line of current winning version |  [optional]
**openRate** | **String** | Open rate for current winning version |  [optional]
**clickRate** | **String** | Click rate for current winning version |  [optional]
**winningVersionRate** | **String** | Open/Click rate for the winner version |  [optional]
**statistics** | [**AbTestCampaignResultStatistics**](AbTestCampaignResultStatistics.md) |  |  [optional]
**clickedLinks** | [**AbTestCampaignResultClickedLinks**](AbTestCampaignResultClickedLinks.md) |  |  [optional]

<a name="WinningVersionEnum"></a>

## Enum: WinningVersionEnum

Name | Value
---- | -----
NOTAVAILABLE | &quot;notAvailable&quot;
PENDING | &quot;pending&quot;
TIE | &quot;tie&quot;
A | &quot;A&quot;
B | &quot;B&quot;

<a name="WinningCriteriaEnum"></a>

## Enum: WinningCriteriaEnum

Name | Value
---- | -----
OPEN | &quot;Open&quot;
CLICK | &quot;Click&quot;



