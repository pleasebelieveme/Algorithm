def solution(money):
    answer = []
    ice = int(money / 5500)
    charge = money - int(ice * 5500)
    answer.insert(0, ice)
    answer.insert(1, charge)
    return answer