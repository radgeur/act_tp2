TP2 ACT --
COJEZ Arnaud
LEPRETRE Rémy

1) 
-pas une ligne de toit, (2,5) ligne verticale relier à rien du tout
-ceci est une ligne de toit
-ceci n'est une ligne de toit, (6,7) ligne horizontale qui dépasse du toit
-ceci n'est pas une ligne de toit, (4,8) ligne verticale qui dépasse du toit

2) La liste de couple doit être former de la façon suivante : 
- Le premier couple sera de la forme suivante (x,0),
- le couple suivant sera de la forme (x, y),
- le couple d'après sera de la forme (z,y)
- celui encore après de la forme (z,a)
et ainsi de suite pour toute la liste.
x, y, z et a étant des nombres quelconques.

3) (1,0)(1,1)(5,1)(5,13)(9,13)(9,20)(12,20)(12,27)(16,27)(16,3)(19,3)(19,0)(22,0)(22,3)(25,3)(25,0)


4) n étant le nombre d'immeubles (liste de triplets d'entiers (g,h,d))
et t un tableau à 2 dimensions de booléens

pour i=0 à n
	pour j=gi à di
		pour k=gi à hi
			t[j][k] = true

i,j=0

tant que i<t.size 
	si t[i][j] == true
		on écrit le sommet
		si t[i][j+1] == true
			tant que t[i][j+1] == true
				on écrit le sommet
				j++ 
		sinon si t[i][j-1] == true
			tant que t[i][j-1] == true
				on écrit le sommet
				j-- 
	sinon
		i++
		
	

En supposant n la taille du tableau de booléens, la complexité serait en O(n3).

5)


6) voir méthode fusionList
