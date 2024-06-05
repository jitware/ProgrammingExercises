def this_in_soup(soup: list[list[str]], word: str) -> bool:
    for i in range(0, len(soup)):
        for j in range(0, len(soup[i])):
            if soup[i][j] == word[0]:
                if neighbors(soup, len(word), i, j, 0, 1) == word:
                    return True
                elif neighbors(soup, len(word), i, j, 1, 1) == word:
                    return True
                elif neighbors(soup, len(word), i, j, 1, 0) == word:
                    return True
    return False


def neighbors(soup: list[list[str]], lenght: int, coor_x, coor_y, x, y):
    string = ''
    if x == 0:
        if coor_y + lenght-1 > len(soup[0]) - 1:
            return None
        for i in range(0, lenght):
            string += soup[coor_x][coor_y + i]

    elif x == 1 and y == 0:
        if coor_x + lenght-1 > len(soup) - 1:
            return None
        for i in range(0, lenght):
            string += soup[coor_x + i][coor_y]

    elif x == 1 and y == 1:
        if coor_x + lenght-1 > len(soup) - 1 or coor_y + lenght-1 > len(soup[0]) - 1:
            return None
        for i in range(0, lenght):
            string += soup[coor_x + i][coor_y + i]
    return string
