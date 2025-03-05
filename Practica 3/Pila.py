class Pila:
    def __init__(self, n):
        self.n = n
        self.top = -1
        self.array = [0] * n

    def push(self, e):
        if not self.isFull():
            self.top += 1
            self.array[self.top] = e
        else:
            print("Pila Llena!!!")

    def pop(self):
        if not self.isEmpty():
            n = self.array[self.top]
            self.top -= 1
            return n
        else:
            print("Pila Vacia!!!")
        return 0

    def peek(self):
        if not self.isEmpty():
            return self.array[self.top]
        else:
            print("Pila Vacia!!!")
        return 0

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1

    def mostrar(self):
        for i in range(self.top, -1, -1):
            print(self.array[i])

if __name__ == "__main__":
    p = Pila(3)
    p.push(1)
    p.push(2)
    p.push(3)
    p.mostrar()
    print("")
    print(p.pop())
    print("")
    p.mostrar()
    print("")
    print(p.peek())
    print("")
    p.mostrar()
