import math
import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return f"({self.x}, {self.y})"

    def coord_polares(self):
        r = math.sqrt(self.x**2 + self.y**2)
        a = math.atan2(self.y, self.x)
        return f"(r: {r}, θ: {a})"

    def __str__(self):
        return f"Punto: {self.coord_cartesianas()}"

class Linea:
    def __init__(self, p1: Punto, p2: Punto):
        self.p1 = p1
        self.p2 = p2
    
    def __str__(self):
        return f"Línea de {self.p1} a {self.p2}"
    
    def dibujaLinea(self):
        plt.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], marker='o', linestyle='-')
        plt.xlim(min(self.p1.x, self.p2.x) - 1, max(self.p1.x, self.p2.x) + 1)
        plt.ylim(min(self.p1.y, self.p2.y) - 1, max(self.p1.y, self.p2.y) + 1)
        plt.axhline(0, color='black', linewidth=0.5)
        plt.axvline(0, color='black', linewidth=0.5)
        plt.grid(True, linestyle='--', linewidth=0.5)
        plt.xlabel("X")
        plt.ylabel("Y")
        plt.title("Gráfica de la Línea")
        plt.show()

class Circulo:
    def __init__(self, centro: Punto, radio: float):
        self.centro = centro
        self.radio = radio
    
    def __str__(self):
        return f"Círculo con centro en {self.centro} y radio {self.radio}"
    
    def dibujaCirculo(self):
        fig, ax = plt.subplots()
        circulo = plt.Circle((self.centro.x, self.centro.y), self.radio, color='blue', fill=False)
        ax.add_patch(circulo)
        ax.set_xlim(self.centro.x - self.radio - 1, self.centro.x + self.radio + 1)
        ax.set_ylim(self.centro.y - self.radio - 1, self.centro.y + self.radio + 1)
        plt.axhline(0, color='black', linewidth=0.5)
        plt.axvline(0, color='black', linewidth=0.5)
        plt.grid(True, linestyle='--', linewidth=0.5)
        plt.xlabel("X")
        plt.ylabel("Y")
        plt.title("Gráfica del Círculo")
        plt.gca().set_aspect('equal', adjustable='box')
        plt.show()

p1 = Punto(1, 2)
p2 = Punto(4, 6)
linea = Linea(p1, p2)
print(linea)
linea.dibujaLinea()

centro = Punto(3, 3)
circulo = Circulo(centro, 2)
print(circulo)
circulo.dibujaCirculo()