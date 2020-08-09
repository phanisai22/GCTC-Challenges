no_of_stocks, upper_limit, amount = list(map(int, input().split()))
prices = list(map(float, input().split()))
profits = list(map(float, input().split()))

# no_of_stocks = 6
# upper_limit = 3
# amount = 200
# prices =[ 90, 25.5, 15.5, 30.8, 18.8, 15.3]
# profits = [5, 10, 20, 5.5, 2.5, 5.5]
stocks_prices = dict(zip(prices, profits))
stocks_prices = list(sorted(stocks_prices.items(),
                             key=lambda x: x[1], reverse=True))

you_can_buy = 0
profit = 0

for item in stocks_prices:
    for i in range(upper_limit, 0, -1):
        if (item[0]*i <= amount):
            you_can_buy = i
            break
    profit += you_can_buy * ((item[0]*item[1])/100)
    amount -= item[0]*you_can_buy
    you_can_buy = 0

print(round(profit))
