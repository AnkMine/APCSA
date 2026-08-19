number = int(input("Enter a number between 0 and 127 to convert to binary:\n"))

print("Binary: ", end="")

power = 6
while power >= 0:
    divisor = 2**power

    if number >= divisor:
        print("1", end="")
        number = number - divisor
    else:
        print("0", end="")

    power = power - 1

print()