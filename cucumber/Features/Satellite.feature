Feature: distinguer les sattelites
  En astronomie, qui est l'etude des astres,on souhaite definir pour un très grand nombre de
  lecteurs, des informations capitales et basiques sur l'astornomie afin que ça soit difuser
  comme verité générale. Ces informations seront tout aussi evidentes et comprehensible par
  tout utilisateur que les 'users stories'

 Scenario Outline: confusion planete/satellite naturel
    Given apparition d'un nouvel astre1  dans le Sys.Solaire qui orbite autour d'un autre astre2
    When Le nom de astre2 coorespond à "Soleil"
    Then L'astre astre1 est effectivement une planete parmi les autres planetes du Sys.Solaire

 Scenario Outline: confirmer à quelle planete appartient un satellite naturel du Sys.Solaire
    Given un satellite naturel du Sys.solaire est donné par son nom
    When on utilise la méthode qui permet de recuperer la planete mere d'un satellite naturel
    Then on obtient le nom de la planete mere

 Scenario Outline: Nom d'un astre astreExterne non connu du Sys.Solaire
    Given Découvert ou reception d'un nom de planete non contenu du Sys.Solaire
    When une méthode verifie si le nom est un nom d'une planete ou peut etre parmis les satellte naturels renvoie 'faux'
    Then Le systeme confirme que <astreExterne> et affiche que cet astre n'appartient pas au sys.Solaire
