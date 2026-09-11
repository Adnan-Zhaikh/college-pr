def bfs(graph, start):

    visited = []
    queue = []

    visited.append(start)
    queue.append(start)

    while queue:

        vertex = queue.pop(0)

        print(vertex, end=" ")

        for neighbour in graph[vertex]:

            if neighbour not in visited:

                visited.append(neighbour)
                queue.append(neighbour)


graph = {
    0: [1, 2],
    1: [2],
    2: [3],
    3: [1, 2]
}

print("\nBreadth First Traversal:")
bfs(graph, 0)

def dfs(graph, start):

    visited = []
    stack = []

    stack.append(start)

    while stack:

        vertex = stack.pop()

        if vertex not in visited:

            visited.append(vertex)

            print(vertex, end=" ")

            for neighbour in graph[vertex]:

                if neighbour not in visited:

                    stack.append(neighbour)


graph = {
    0: [1, 2],
    1: [2],
    2: [3],
    3: [1, 2]
}

print("\nDepth First Traversal:")
dfs(graph, 0)