class Cola:
    def __init__(self, n):
        self.n = n
        self.inicio = 0
        self.fin = 0
        self.array = [0] * n

    def insert(self, e):
        if not self.isFull():
            self.array[self.fin] = e
            self.fin += 1
        else:
            print("Cola Llena!!!")

    def remove(self):
        if not self.isEmpty():
            n = self.array[self.inicio]
            self.inicio += 1
            return n
        else:
            print("Cola Vacia!!!")
        return 0

    def peek(self):
        if not self.isEmpty():
            return self.array[self.inicio]
        else:
            print("Cola Vacia!!!")
        return 0

    def isEmpty(self):
        return self.fin == self.inicio

    def isFull(self):
        return self.fin == self.n

    def mostrar(self):
        for i in range(self.inicio, self.fin):
            print(self.array[i])

if __name__ == "__main__":
    c = Cola(3)
    c.insert(1)
    c.insert(2)
    c.insert(3)
    c.mostrar()
    print("")
    print(c.remove())
    print("")
    c.mostrar()
    print("")
    print(c.peek())
    print("")
    c.mostrar()
