#!/bin/bash

API_SERVER=http://localhost:8080

requestUrlParam="'${API_SERVER}/urls'
			--form 'url=http://www.sina.com.cn/'
			-X POST \
			-u $USER:$passw \
			-H 'Date: $DATE' \
			-H 'Accept: application/xml'
            -H 'mw-access:17'"

api_domainDetails="curl -s --url ${requestUrlParam}"

echo $api_domainDetails
eval $api_domainDetails
echo " "
#echo "Above is the result of:"
#echo $api_domainDetails
#echo " "

