    ORG 1000h
    MOV AL, 0
    MOV CL, 1
comp:
    CMP CL, 10
    JNZ suma
    JMP cont

suma:
    ADD AL, AL
    JMP comp

cont:
    HLT
    END
