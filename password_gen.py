import random

letters = "zaqxswcdefvrbgtnhymjukilop"
upper = "ZAQXSWCDEVFRBGTNHYJMUKILOP"
symbols = "{}[]!&^%$#@&*(-_=+)\|~`"
numbers = "0123456789"
length = 16

all = letters + upper + symbols + numbers

password = "".join(random.sample(all, length))

print(password)