# TP_WebService

1- Creer un Web service:

- Tout d'abord , on a creer un Web service qui permet de:
  - Convertir un montant de l'auro en DH
  - Consulter un Compte
  - Consulter une liste de comptes
  
- Puis , on a creer le serveur jaxWS qui deployer le web service on utilisant une classe qui appeler Endpoint  qui fait partie de jaxws et appeler à un methode qui appeler publish qui contient deux parametre (url,web service)

![image](https://user-images.githubusercontent.com/102295113/163217224-411add62-6afc-4c10-9d4e-d8a280a9cb7c.png)

- L'execution de ce code permet de demarer un serveur http en localhost sur le porte 8080

![image](https://user-images.githubusercontent.com/102295113/163218245-130c61cf-730f-4cd6-b232-2e1d466445a1.png)

- Apres , on consulter et analyser leWSDL avec un Browser HTTP.
Le WSDL  est un document xml qui contient les interface de web service dans le wsdl en trouve quel sont les methode et pour chaque methode quel sont les parametre d'entrie et  de sortie.

![image](https://user-images.githubusercontent.com/102295113/163219411-bfe4b4d1-e83e-4fcf-b4d2-198713fbef7c.png)

- Et finalement , on va tester les methode d'un web service on utilisant SaopUI
il vous analyser le wsdl et il vous dit quel sont les methode qui se trouve dans le web service

![image](https://user-images.githubusercontent.com/102295113/163220308-dfbf7606-cc77-467a-9f0e-86055b539f26.png)

- Dans cette etape on va tester la methode conversionEuroToDH :on va envoyer un requet(le montant Euro ) vers le Web service:

![image](https://user-images.githubusercontent.com/102295113/163221562-b0f6e77b-0c80-4065-b748-25a5c75e72e4.png)

- Il a fait le traitement il ma rendu le resultat(le montant DH) au format xml

![image](https://user-images.githubusercontent.com/102295113/163222061-b74c3fa4-3415-4af9-b37d-d0d540297752.png)

2- Creer un client SOAP java:

- Tout d'abord , je vais utiliser le wsdl pour generer ce qu'on appelle un proxy cote client (STUP) , à partir de proxy en peut gerer des methode et des classes et des interfaces que je vais utiliser pour communiquer avec le coté serveur(SKELETON)

![image](https://user-images.githubusercontent.com/102295113/163222538-578cd53b-fd1c-4140-8dd1-646b79c0ea55.png)

- Genere un proxy par une linge de commande:

![image](https://user-images.githubusercontent.com/102295113/163222683-a45605ab-6914-4d54-9ca8-5b31f2e81291.png)

- Si executer votre application client :

![image](https://user-images.githubusercontent.com/102295113/163222813-4bf26026-03f3-48af-964f-94b8893cf79e.png)

2- Creer un client SOAP Dot Net :

 - Un otile qui permet a partir de wsdl de me genere le proxy 

![image](https://user-images.githubusercontent.com/102295113/163467577-4b185963-762c-4a75-a0d6-7c6732457c62.png)

- L'execution de notre application c# donne :

![image](https://user-images.githubusercontent.com/102295113/163468244-d4e39f34-ffcc-4bf1-8a92-7f577be1c121.png)








 
