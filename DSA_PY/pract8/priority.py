class PriorityQueue:
    def __init__(self):
        self.queue = []

    def insert(self, value, priority):
        self.queue.append((priority, value))
        self.heapify_up(len(self.queue) - 1)

    def heapify_up(self, index):
        while index > 0:
            parent = (index - 1) // 2
            if self.queue[parent][0] >= self.queue[index][0]:
                break
            self.queue[parent], self.queue[index] = \
                self.queue[index], self.queue[parent]
            index = parent

    def remove(self):
        if len(self.queue) == 0:
            print("Priority Queue is empty")
            return None
        highest = self.queue[0]
        self.queue[0] = self.queue[-1]
        self.queue.pop()
        if self.queue:
            self.heapify_down(0)
        return highest

    def heapify_down(self, index):
        size = len(self.queue)
        while True:
            largest = index
            left = 2 * index + 1
            right = 2 * index + 2

            if left < size and self.queue[left][0] > self.queue[largest][0]:
                largest = left

            if right < size and self.queue[right][0] > self.queue[largest][0]:
                largest = right

            if largest == index:
                break

            self.queue[index], self.queue[largest] = \
                self.queue[largest], self.queue[index]
            index = largest
            
    def display(self):
        print("Priority Queue:")
        for priority, value in self.queue:
            print("Value:", value, "Priority:", priority)

pq = PriorityQueue()

pq.insert("Task A", 2)
pq.insert("Task B", 5)
pq.insert("Task C", 1)
pq.insert("Task D", 4)
pq.insert("Task E", 3)

pq.display()

print("\nRemoving elements according to priority:")

while pq.queue:
    priority, value = pq.remove()
    print(value, "-> Priority:", priority)