from numpy import array, zeros


def rotate(a: list[int], times: int):
    arr: array = zeros(len(a))

    for i in range(0, len(a)):
        num = (i + times + len(a)) % (len(a))
        arr[num] = a[i]

    return arr


b = [25, 40, 17, 83, 9]
d = [83, 9, 25, 40, 17]
b1 = rotate(b, 2)
print(b1 == d, b1)

d2 = [17, 83, 9, 25, 40]
b1= rotate(b, -2)
print(b1 == d2,b1 )

# c = True
# for i in range(len(a)):
#     if a[i] != d[i]:
#         c = False
# print(c, a)
