Feature: Verite méconnue sur certains evenements
  On ne connait pas forcement toute les verités sur des phénomenes courant, d'ou il faut
  remettre en question certaines croyances sur les des objets celstes tq les etoiles ou
  les météores

 Scenario Outline: Devenir supernova
    Given lorsque un astre de type étoile a une durée de vie assez grande par rapport a sa taille
    When l'astre <etoile> atteint son age maximum  et se raproche de sa fin de vie et sa taille est assez grande
    Then l'astre <etoile> explose et devient supernova et peut meme creer des trous noirs

 Scenario Outline: une etoile ne peut etre fillante
    Given lorsque un astre de type meteore est en mouvement en direction la planete terre
    When un meteore entre en conatact avec notre athmosphere et s'enflamme
    Then le météore devient visible
