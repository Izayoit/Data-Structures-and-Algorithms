delimiter &&
CREATE PROCEDURE `sp_alumno_eliminar` (
	IN dato1 INT
)
BEGIN
	DELETE FROM alumno
    WHERE idalumno=dato1;
END
