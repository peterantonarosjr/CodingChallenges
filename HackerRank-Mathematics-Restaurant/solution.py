def restaurant(l, b):
    max = gcd(l,b)
    return int((l*b)/(max**2))

def gcd(x,y):
    while y != 0:
        (x, y) = (y, x % y)
    return x
