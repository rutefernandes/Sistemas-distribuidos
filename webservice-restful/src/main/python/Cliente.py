import requests
import json


#put
r = requests.put('http://localhost:8080/WSRestful/rest/paises/1', data = {'id': 1, 'nome': 'Argentina', 'populacao': 2})

#get
reqg = requests.get('http://localhost:8080/WSRestful/rest/paises/1')

#delete 

#post
#r = requests.post('http://127.0.0.1/api/v1/add_item', data = {'task':'Shopping'})


json_data = json.loads(reqg.text)
print(json_data)
