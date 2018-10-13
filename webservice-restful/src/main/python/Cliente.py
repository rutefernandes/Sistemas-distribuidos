import requests
import json

headers = { 'Content-Type': 'application/json'}
payload = {'id': 1, 'nome': 'teste2', 'populacao': 1}
url = 'http://localhost:8080/WSRestful/rest/paises/6'

#GET
#get = requests.get(url)

#POST
#post = requests.post(url, headers= headers, data=json.dumps(payload))

#DELETE 
#delete = requests.delete(url, headers= headers)

#PUT
#put = requests.put(url, headers= headers, data=json.dumps(payload))
#print(get.text)
