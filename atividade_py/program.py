class function:
    def factorial(factorial, count=1, result=1):
        result *= count
        if count >= factorial:
            return print(f"{count}! = {result}")
        print(f"{count}! = {result}")
        return function.factorial(factorial, count + 1, result)

    def fibonacci(count, first=1, second=1):
        if count == 1:
            return print(first)
        print(first, end=", ")
        return function.fibonacci(count - 1, second, first + second)

    def product(p1, p2, result=0):
        if p2 == 0:
            return print(result)
        if result == 0:
            print(f"P({p1},{p2})", end=" = ")
        else:
            print(result, end=", ")
        return function.product(p1, p2 - 1, result + p1)

    def sum(count, result=0):
        if count == 1:
            return print(count, "=", result + 1)
        print(count, end=" + ")
        return function.sum(count - 1, result + count)


### Fatorial, Sequencia de Fibonacci, Produto de dois números, Soma Recursiva