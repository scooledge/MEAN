#Samuel Cooledge
#June 3rd
#CSC 110 sec 08
#hw 7

def backwards(mystr):
    newstr = ""
    for i in range(len(mystr)-1,-1,-1):
        newstr = newstr + mystr[i]
        print(newstr)
    return newstr
    
# 2:
def finiteSum(n):
    newSum = 0
    for i in range(1,n+1):
        newSum = newSum + (1/(i**2))
    return newSum

# 3:
def fizzbuzz(n):
    for i in range(1,n+1):
        if (i%3 == 0) and (i%5 == 0):
            word = "FizzBuzz"
            print(word)
        elif (i%3 == 0):
            word = "Fizz"
            print(word)
        elif (i%5 == 0):
            word = "Buzz"
            print(word)
        else:
            print(i)
    return word

# 4:
def xyBalance(myStr):
    x = 0
    y = 0
    for i in range(0,len(myStr)):
        if (myStr[i]=="x") or (myStr[i]=="X"):
            x = x + 1
        elif (myStr[i]=="y") or (myStr[i]=="Y"):
            y = y + 1
    if (x == y):
        return True
    else:
        return False

# 5:
def pluses(inputStr,searchChar):
    newStr = ""
    for i in range(0,len(inputStr)):
        if (inputStr[i] == searchChar):
            newStr = newStr + searchChar
        else:
            newStr = newStr + "+"
    return newStr

# 6:
def sumDigits(n):
    if (n < 0):
        print("Please input a positive value: ")
    else:
        strN = str(n)
        total = 0
        for i in range(0,len(strN)):
            total = total + int(strN[i])
        return total
