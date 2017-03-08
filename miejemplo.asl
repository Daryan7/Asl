func hola(A, n)
    write A[n];
    write "%n";
    A[n] = -45456;
endfunc

func main()
    A[3] = 3;
    A[4] = true;
    hola(A, 4);
    write A[4];
endfunc