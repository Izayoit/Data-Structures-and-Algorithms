CREATE PROCEDURE `sp_alumno_consultar_uno` (
	OUT dato1 VARCHAR(60), OUT dato2 VARCHAR(60), IN dato3 INT
)
BEGIN
	SELECT apellidos, nombres
    INTO dato1, dato2
    FROM alumno
    WHERE idalumno=dato3;
END
