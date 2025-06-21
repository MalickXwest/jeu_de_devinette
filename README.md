#Jeu de devinette
Ce projet implémente un simple jeu de devinettes en Java, où l'utilisateur doit deviner un nombre aléatoire choisi par l'ordinateur dans une plage donnée, et ce, en un nombre limité d'essais.
````
#fonctionalités
````
-Génération aléatoire : L'ordinateur choisit un nombre entier aléatoire entre 1 et 100 au début de chaque partie.
-Nombre d'essais limité : L'utilisateur dispose de 10 tentatives pour deviner le nombre correct.
-Indices : Après chaque tentative, le joueur reçoit un indice lui indiquant si le nombre deviné est trop haut ou trop bas.
-Validation de l'entrée : Le jeu gère les entrées non numériques de l'utilisateur, évitant les erreurs de programme et ne décompte pas ces tentatives comme des essais valides.
-Résultat de la partie : Le jeu annonce si l'utilisateur a gagné (en combien d'essais) ou perdu (en révélant le nombre secret).
````
##Structure du projet
````
-Main.java : Contient la logique principale du jeu, incluant la génération du nombre aléatoire, la boucle de jeu, la gestion des entrées utilisateur et l'affichage des résultats.
````
# Comment Exécuter le Projet
````
1.  Cloner le dépôt :
git clone [https://github.com/MalickXwest/jeu_de_devinette.git](https://github.com/MalickXwest/jeu_de_devinette.git)
    
2.  Naviguer vers le répertoire du projet :
    cd ContactsManager

3.  Compiler les fichiers Java :
    javac  Main.java


4. Exécuter l'application :
  
    java Main
   
