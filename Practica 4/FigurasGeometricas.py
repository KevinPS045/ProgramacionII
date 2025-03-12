import math

class FiguraGeometrica:
    
    def area(self, *args):
        if len(args) == 2 and isinstance(args[1], str):  # Círculo
            radio, figura = args
            if figura.lower() == "circulo":
                return math.pi * radio * radio
            return 0
        
        elif len(args) == 2:  # Rectángulo
            base, altura = args
            return base * altura
        
        elif len(args) == 3 and isinstance(args[2], str):  # Triángulo
            base, altura, figura = args
            if figura.lower() == "triangulo":
                return (base * altura) / 2
            return base * altura
        
        elif len(args) == 4 and isinstance(args[3], str):  # Trapecio
            B, b, h, figura = args
            if figura.lower() == "trapecio":
                return ((B + b) / 2) * h
            return 0
        
        elif len(args) == 1:  # Pentágono
            L = args[0]
            return (1 / 4) * math.sqrt(5 * (5 + 2 * math.sqrt(5))) * L * L

        return 0

figura = FiguraGeometrica()
print("Círculo:", figura.area(3, "circulo"))
print("Rectángulo:", figura.area(2, 3))
print("Triángulo rectángulo:", figura.area(2, 4, "triangulo"))
print("Trapecio:", figura.area(5, 3, 2, "trapecio"))
print("Pentágono:", figura.area(5))