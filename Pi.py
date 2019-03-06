import random

def in_circle(x, y):
    if 1 >= x**2 + y**2:
        return True
    return False

def main():
    inside, all = 0, 0

    while True:
        x, y = random.random(), random.random()

        if in_circle(x, y):
            inside += 1

        all += 1
        pi = (inside/all) * 4
        print("Pi = {:10.10f} Data points = {}".format(pi, all), end='\r')

if __name__ == '__main__':
    main()
