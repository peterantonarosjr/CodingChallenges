def solve(a,b,x,y):
    #(a+b,b)|(a,b+a)|(a-b,b)|(a,b-a)
    #GCD(a,b), GCD(x,y)
    if(gcd(a,b)==gcd(x,y)):
        return "YES"
    else:
        return "NO"

def gcd(x,y):
    while y != 0:
        (x, y) = (y, x % y)
    return x
