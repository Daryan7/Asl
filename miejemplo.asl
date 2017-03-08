func hola(A, n)
    write A[n];
    write "%n";
    A[n] = -45456;
    return A;
endfunc

func main()
    A[3] = 3;
    A[4] = true;
    write hola(A, 4)[4];
endfunc