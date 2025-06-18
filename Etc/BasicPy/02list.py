# 리스트       0         1       2
icecream = ['바닐라', '딸기', '초코']
print(icecream)
print(icecream[2])

# 리스트 수정
icecream[2] = '민트초코'
print(icecream.pop())

# 리스트 추가
icecream.append('망고')
icecream.insert(0, '피스타치오')

# 삭제
del icecream[1]
icecream.pop(2)
icecream.remove('피스타치오')

# 정렬
icecream.sort()
icecream.reverse()

# 길이
print("아이스크림의 수 : ", len(icecream))
