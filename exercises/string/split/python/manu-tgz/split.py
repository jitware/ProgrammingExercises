def split(string, regex=' '):
    """
    :param regex:
    :param string: a string
    :return: a list after breaking string on regex match
    """
    result_list = []
    if not string:
        return [string]
    start = 0
    for index, char in enumerate(string):
        if char == regex:
            result_list.append(string[start:index])
            start = index + 1
    if start == 0:
        return [string]
    result_list.append(string[start:index + 1])

    return result_list
