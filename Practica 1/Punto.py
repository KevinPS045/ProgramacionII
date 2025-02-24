import math
class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return f"({self.x}, {self.y})"

    def coord_polares(self):
        r = math.sqrt(self.x**2 + self.y**2)
        a = math.atan(self.y / self.x)
        return f"(r: {r}, θ: {a})"

    def __str__(self):
        return f"Punto: {self.coord_cartesianas()}"

p = Punto(3, 4)
print(p)
print("Coordenadas polares:", p.coord_polares())