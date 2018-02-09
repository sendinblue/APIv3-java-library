
# GetAttributesAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the attribute | 
**category** | [**CategoryEnum**](#CategoryEnum) | Category of the attribute | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the attribute |  [optional]
**enumeration** | [**List&lt;GetAttributesEnumeration&gt;**](GetAttributesEnumeration.md) | Parameter only available for \&quot;category\&quot; type attributes. |  [optional]
**calculatedValue** | **String** | Calculated value formula |  [optional]


<a name="CategoryEnum"></a>
## Enum: CategoryEnum
Name | Value
---- | -----
NORMAL | &quot;normal&quot;
TRANSACTIONAL | &quot;transactional&quot;
CATEGORY | &quot;category&quot;
CALCULATED | &quot;calculated&quot;
GLOBAL | &quot;global&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TEXT | &quot;text&quot;
DATE | &quot;date&quot;
FLOAT | &quot;float&quot;
ID | &quot;id&quot;



