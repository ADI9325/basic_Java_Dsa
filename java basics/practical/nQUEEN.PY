def solve_nqueens(n):
    def is_safe(queens, row, col):
        return all(col != qcol and abs(row - i) != abs(col - qcol) for i, qcol in enumerate(queens))

    def place_queens(n, queens=[]):
        if len(queens) == n:
            yield queens
            return
        for col in range(n):
            if is_safe(queens, len(queens), col):
               for solution in place_queens(n, queens + [col]):
                    yield solution

    for solution in place_queens(n):
        print("\n".join(" ".join("Q" if solution[i] == j else "." for j in range(n)) for i in range(n)))
        print()

n = 4  
solve_nqueens(n)
