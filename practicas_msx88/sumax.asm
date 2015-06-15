    ORG 1000h
DW  op1 85
DW  op2 50

    ORG 2000h
    ;Sumamos los valores
    MOV AX, op1
    ADD AX, op2
    ;Comparamos con 100 (decimal)
comp:
    CMP AX, 100
    JZ fin
    JC loop
    JMP fin ;por las dudas

loop:
    DEC AX
    JMP comp

fin:
    HLT
    END
