class polynomial:
    def __init__(self, coefficient = None, power=None):
        self.coefficient = coefficient
        self.power = power
        self.next = None
        self.head = None

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
                current - current.next
                 