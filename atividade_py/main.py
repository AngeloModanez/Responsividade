from program import function as func

try:
    while True:
        choice = int(
            input(
                "\n+-+-+-+-+-+-+-+-+"
                + "\n| Funções:      |"
                + "\n| 1 > Factorial |"
                + "\n| 2 > Fibonacci |"
                + "\n| 3 > Produto   |"
                + "\n| 4 > Soma      |"
                + "\n+-+-+-+-+-+-+-+-+"
                + "\n»»» "
            )
        )
        match choice:
            case 1:
                num = int(input("\nDigite o número para calcular o fatorial: "))
                if num > 0:
                    func.factorial(num)
                    

            case 2:
                num = int(input("\nInforme uma sequência desejada: "))
                func.fibonacci(num)
            case 3:
                num1 = int(input("\nDigite o primeiro valor: "))
                num2 = int(input("Digite o segundo valor: "))
                func.product(num1, num2)
            case 4:
                num = int(input("\nInforme o valor da soma: "))
                func.sum(num)
            case _:
                print(f"\nOpção {choice} é inexistente...")
except ValueError:
    print("Tipo de valor inválido...")
