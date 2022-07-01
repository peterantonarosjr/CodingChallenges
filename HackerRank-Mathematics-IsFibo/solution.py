import math
def isSquare(tests):
    return tests[0] % math.sqrt(tests[0]) == 0 or  tests[1] % math.sqrt(tests[1]) == 0

def isFibo(n):
    tests = [5*n**2+4, 5*n**2-4]
    if(isSquare(tests)):
        return "IsFibo"
    else:
        return "IsNotFibo"
