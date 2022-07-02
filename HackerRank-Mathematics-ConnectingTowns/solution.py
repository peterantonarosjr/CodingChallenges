def connectingTowns(n, routes):
    routeCount = 1
    for route in routes:
        routeCount*=route
        routeCount%=1234567
    return routeCount
