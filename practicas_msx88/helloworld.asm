; hello world!
; intento de hacer algo con MSX88

; mem. datos
org 1000h
test DB 1Fh

; mem. programa
org 2000h
mov BL, 0
mov AL, 9
suma:	 add BL, AL
 	 dec AL
 	 jnz suma
hlt
end
; la suma de todos estos numeros está en BL

