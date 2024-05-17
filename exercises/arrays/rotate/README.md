Implementare un metodo che modifichi **l'array a** in modo che al termine 
dell'esecuzione del metodo l'array a contenga **gli stessi elementi** 
che conteneva originalmente ma **ruotati** nelle loro posizioni tante volte 
quante indicate dal parametro volte, se volte è positivo a destra 
e se il parametro è negativo, allora a sinistra. 
Nota che se il parametro volte è 0 allora l'array non viene modificato. 

Ad esempio, se ruotiamo l'array [25, 40, 17, 83, 9]  2 times, 
otteniamo l'array [83, 9, 25, 40, 17] e se lo ruotiamo -2 times 
otteniamo [17, 83, 9, 25, 40]. 

Java / C#
````
int[] rotate(int[] a, int times)
````

Python
````
rotate(a:list[int], times: int)
````

