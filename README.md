# Projet-4-2019-DP-Visitor-Pattern
 ## Description
Le Design Pattern Visiteur appartient à la famille des patterns comportementaux. Cette famille s'intéresse principalement aux    comportements entre différents objets, en effet le visiteur est une interface définissant de nouvelles opérations sur une autre classe.

Dans notre cas le patron visiteur est réalisé de la façon suivante : chaque classe pouvant être « visitée » doit mettre à disposition une méthode publique « accepter » prenant comme argument un objet du type « visiteur ». La méthode « accepter » appellera la méthode « visite » de l'objet du type « visiteur » avec pour argument l'objet visité. De cette manière, un objet visiteur pourra connaître la référence de l'objet visité et appeler ses méthodes publiques pour obtenir les données nécessaires au traitement à effectuer (calcul, affichage).
le diagramme suivant illustre ces propos.

## Diagramme de Classe

![Diagramme de classe](https://user-images.githubusercontent.com/48572427/56297676-4c644c00-6120-11e9-82e3-9aea2063169a.PNG)
