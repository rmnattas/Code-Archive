
def CountingSort(A):
    counter = [0] * (max(A) + 1)
    
    # fill counter array
    for x in A:
        counter[x] += 1


    # retrieve sorted array
    Ci = 0  # counter array index
    Ai = 0  # A array index
    while Ci < len(counter):
        if counter[Ci]:
            counter[Ci] -= 1
            A[Ai] = Ci
            Ai += 1
        else:
            Ci += 1



def EqualArray(A,B):
    for i in range(len(A)):
        if A[i] != B[i]: return False
    return True


def test_CountingSort():
    A = [2,5,7,3,8]
    B = [2,3,5,7,8]
    CountingSort(A)
    return ( EqualArray(A,B) )


def main():
    print(test_CountingSort())

main()

