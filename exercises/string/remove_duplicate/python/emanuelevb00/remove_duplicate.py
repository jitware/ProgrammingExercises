def remove_duplicate(s):
    
    caratteri_unici = set()
    
    risultato = ""

    
    for char in s:
        
        if char not in caratteri_unici:
            caratteri_unici.add(char)
            risultato += char

    return risultato
