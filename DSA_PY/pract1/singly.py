class SinglyLinkedList:
    def __init__(self, val=None):
        self.val = val
        self.next = None
        self.head = None
#append function
    def append(self, data):
      newnode = SinglyLinkedList(data)
      if self.head is None:
        self.head = newnode
      else:
        current = self.head
        while current:
            if current.next is None:
                current.next = newnode
                return
            current = current.next

#tracing linked list
    def traverse(self):
        if not self.head:
            print("Singly Linked List is empty")
        else:
            current = self.head
            while current is not None:
                print(current.val, end=" ")
                current = current.next
            print()
#add element as first node of linked list
    def prepend(self, data):
        newnode = SinglyLinkedList(data)
        if not self.head:
            self.head = newnode
        else:
            newnode.next = self.head
            self.head = newnode
#searching element by comparing values
    def search(self, key):
      current = self.head
      while current is not None:
        if current.val == key:
          print(key, "Found")
          return
        current = current.next
      print(key, "Not Found")
#removing node
    def delete(self, key):
      if not self.head:
        print("List is empty")
        return

      if self.head.val == key:
        self.head = self.head.next
        return

      current = self.head
      while current.next is not None:
        if current.next.val == key:
          current.next = current.next.next
          return
        current = current.next
      print(key, "Not Found")

sll = SinglyLinkedList()

# Append nodes
sll.append(100)
sll.append(200)
sll.append(50)
sll.append(20)

print("Original List:")
sll.traverse()

print("After Prepending 500:")
sll.prepend(500)
sll.traverse()

print("Searching:")
sll.search(200)
sll.search(300)

print("After Deleting 50:")
sll.delete(50)
sll.traverse()

print("After Deleting 500:")
sll.delete(500)
sll.traverse()