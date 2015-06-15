;Multiplicacion

    ORG 1000h
    ;suponemos que nuestros operandos estan almacenados
    ;en AX y BX
    ;y que debemos resolver AX*BX
    MOV CX, AX ;guardamos una copia
    MOV DX, BX
loop:
    ADD AX, CX
    DEC BX
    JNZ loop

    ;termino el loop
    ;sumamos AX a si mismo, BX veces.
    HLT
    END
