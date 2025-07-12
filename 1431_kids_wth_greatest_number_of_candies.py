candies1 = [2,3,5,1,3]
extraCandies1 = 3
candies2 = [4,2,1,1,2]
extraCandies2 = 1
candies3 = [12,1,12]
extraCandies3 = 10

def kidsWithCandies(candies, extraCandies):
    arr = []
    max_candy = max(candies)
    for i in range(len(candies)):
        arr.append(candies[i] + extraCandies >= max_candy)
    return arr

print("Output Boolean Array: ", kidsWithCandies(candies1, extraCandies1))
print("Output Boolean Array: ", kidsWithCandies(candies2, extraCandies2))
print("Output Boolean Array: ", kidsWithCandies(candies3, extraCandies3))