def solution(n, k):
    answer = 0
    sheep = n * 12000
    baverage = k * 2000
    if sheep > 10:
        sale = int(n / 10) * 2000
    answer = sheep + baverage - sale    
    
    return answer