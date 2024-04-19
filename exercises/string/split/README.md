# Split
La funzione split suddivide una stringa in sottostringhe utilizzando un delimitatore definito utilizzando un'espressione regolare
- Il metodo restituisce un array di stringhe.
- Il metodo ha un parametro di input di stringa chiamato regex .
- Il valore predefinito è spazi


    >>> split("mela#banana#ciliegia#arancia",regex='#')
    ['mela', 'banana', 'ciliegia', 'arancia']

    >>> split("Ciao a tutti")
    ['Ciao', 'a','tutti']

    >>> split("22/11/63",regex = '/')
    ['11', '22', '63']

    >>> split("12:43:39",regex = ":")
    ['12', '43', '39']
    