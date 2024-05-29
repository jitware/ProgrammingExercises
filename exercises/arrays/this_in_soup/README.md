Implementare il metodo thisInSoup(char [][] soup, string word) che determina se una parola 
è nella zuppa.

Nota: solo parole che se leggeno da sinistra a destra, dall'alto in basso e la diagonale corrispondente

Esempio 1
````
word = "pelo" 
soup = [
['a', 'a', 'f', 't', 'j', 'q', 'w', 'e', 'r', 'o', 'p' ], 
['g', 'j', 'p', 'b', 'j', 'e', 'r', 'o', 'a', 's', 'k' ], 
['l', 'x', 'c', 'e', 't', 'y', 'e', 'r', 'a', 'o', 'n' ], 
['b', 'g', 'j', 'f', 'l', 'd', 'e', 'r', 's', 't', 'o' ], 
['q', 'u', 'e', 'r', 't', 'o', 'g', 's', 'e', 'm', 't' ] ];   
````

C#
````
bool thisInSoup(char [,] soup, string word)
````
Java
````
bool thisInSoup(char [,] soup, string word)
````
Python
````
this_in_soup(soup: list[list[str]], word: str) -> bool
````