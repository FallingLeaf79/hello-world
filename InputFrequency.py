def main():
    dict = {}

    while True:
        try:
            input_string = input()
        except EOFError:
            break

        if input_string not in dict:
            dict[input_string] = 1
        else:
            dict[input_string] += 1

    for i in iter(dict):
        print("Input '{}' appears {} time(s)".format(i, dict[i]))

if __name__ == '__main__':
    main()
