delimiter &&
CREATE PROCEDURE `sp_alumno_insertar` (
	IN dato1 VARCHAR(60), IN dato2 VARCHAR(60)
)
BEGIN
	INSERT INTO alumno(apellidos,nombres)
    VALUE(dato1,dato2);
END