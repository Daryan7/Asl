func main()
    A[4], A[5], A[0] = 1,2,3;
    count = 0;
    write "Array has ";
    write A.size;
    write " elements%n";
    while (count < A.size) do
        write A[count];
        write "%n";
        count = count+1;
    endwhile
endfunc
