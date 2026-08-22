class polynomial:
    def __init__(self, coefficient=None, power=None):
        self.coefficient = coefficient
        self.power = power
        self.head = None
        self.next = None

    def append(self, coefficient, power):
        newNode = polynomial(coefficient, power)

        if self.head is None:
            self.head = newNode
        else:
            current = self.head
            while current:
                if current.next is None:
                    current.next = newNode
                    return
                current = current.next

    def display(self):
        current = self.head

        while current is not None:
            print(f"{current.coefficient} x^ {current.power}", end="")

            if current.next is not None:
                print(" + ", end="")

            current = current.next
        print()

    # @title
# Function to add two polynomials
def addPolynomial(poly1, poly2):

    result = polynomial()

    first = poly1.head
    second = poly2.head

    while first is not None and second is not None:

        if first.power == second.power:
            result.append(first.coefficient + second.coefficient, first.power)
            first = first.next
            second = second.next

        elif first.power > second.power:
            result.append(first.coefficient, first.power)
            first = first.next

        else:
            result.append(second.coefficient, second.power)
            second = second.next

    while first is not None:
        result.append(first.coefficient, first.power)
        first = first.next

    while second is not None:
        result.append(second.coefficient, second.power)
        second = second.next

    return result

    

p1 = polynomial()

p1.append(5,3)
p1.append(2,1)
p1.append(3,0)

p2 = polynomial()

p2.append(4,2)
p2.append(3,2)
p2.append(2,1)

print("First Polynomial: ")
p1.display()

print("Second Polynomial: ")
p2.display()

result = addPolynomial(p1, p2)
print("\nResultant Polynomial:")
result.display()
