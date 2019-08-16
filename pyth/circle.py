'''This is a "shebang"'''
#!/usr/bin/python3
import sys
import os
#input value 
def circle_info(radius):
    pi = 3.14
    r = float(radius)
    area = pi*(r**2)
    perim = 2.0*pi*r

    print("Given r: ",r)
    print("Area is: ",area)
    print("perimeter is: ",perim)

def say_something(something):
    print(str(something))

if __name__ == "__main__":

    circle_info(sys.argv[1])

    say_something(sys.argv[2])
