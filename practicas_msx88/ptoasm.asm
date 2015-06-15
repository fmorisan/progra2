;Convertir el sig. codigo de pascal a Assembly

;IF AL=4 THEN
;BEGIN
;   BL:=1;
;   CL:=CL+1;
;END
;ELSE BEGIN
;   BL:=2;
;   CL:=CL-1;
;END;
    ;if
    ORG 1000h
    MOV AL, 5
if:
    CMP AL, 4
    JZ cuatro   ;then
else:
    MOV BL, 2
    DEC CL
    JMP endif
cuatro:
    MOV BL, 1
    INC CL

endif:
    CMP AL, 0
    JZ end
    DEC AL
    JMP if

end:
    HLT
    END
