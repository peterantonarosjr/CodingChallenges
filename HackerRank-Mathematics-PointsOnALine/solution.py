xSet = set()
ySet = set()
for n_itr in range(n):
    xy = input().split()

    x = int(xy[0])
    xSet.add(x)

    y = int(xy[1])
    ySet.add(y)

if(len(xSet)==1 or len(ySet)==1):
    print("YES")
else:
    print("NO")
