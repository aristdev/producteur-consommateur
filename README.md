# producteur-consommateur
Threads mettant en oeuvre la communication entre threads

# Sujet 

L’objectif de ce TP est de mettre en place une infrastructure de communication entre des threads.

Nous allons créer un système de type « producteurs - consommateurs » où un ensemble de threads produit des messages que consomme un autre ensemble. Chaque thread doit s’identifier par son numéro dans tous ses affichages (pour qu’on puisse suivre ce qu’il se passe).

1. Commencez par une version simple avec un seul producteur et un seul consommateur. Dans votre dossier, vous écrirez 4 classes:
    - la classe principale (publique) contenant la fonction `static main`;
    - une classe `Producteur` pour la thread productrice;
    - une classe `Consommateur` pour la thread consommatrice;
    - une classe `BAL` représentant la boite-aux-lettres, structure de communication entre le producteur et le consommateur. La boite aux lettres contient une file de message représentée par une LinkedList (si vous n’avez pas l’habitude de cette classe, vous pouvez utiliser ArrayList qui est moins complète).

    Le producteur affiche un message chaque fois qu’il poste dans le BAL et le consommateur affiche le message lu dans la BAL.

2. Modifiez le programme précédent de manière à pouvoir traiter le cas de plusieurs producteurs et plusieurs consommateurs échangeant à travers une seule boîtes à lettres.
3. Complétez ce code pour mettre en place une politique de terminaison propre : au bout d’un certain nombre de messages (aléatoire), un producteur se termine et poste un messagede fin dans la boite. Toutes les threads doivent alors arrêter de produire et se terminer proprement.
4. On rajoute un 3e type d’agent dans notre système: le `Perturbateur`, qui inverse tous les messages de la boite aux lettres. Retirer les instructions `sleep` et ajoutez une thread perturbatrice. Que se passe-t-il ? Expliquez.

# Travail à faire
Répondre aux différentes questions ci-dessus et envoyer le code sur le dépôt Github. Pour chaque question, créer un tag correspondant à la version du code à cette question. 

NB: Chaque étudiant devra envoyer son code sur une branche portant son nom.