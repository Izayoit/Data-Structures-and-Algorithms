delimiter &&
CREATE PROCEDURE `sp_alumno_actualizar` (
	IN dato1 VARCHAR(60), IN dato2 VARCHAR(60), IN dato3 INT
)
BEGIN
	UPDATE alumno
    SET apellidos=dato1, nombres=dato2
    WHERE idalumno=dato3;
END
